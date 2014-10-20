package aula3.agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgendaController {

    private final Principal view;
    private final CadContato cadContato;
    private final CadTelefone cadTelefone;
    private final Agenda agenda;
    private final String[] colunas = new String[]{"Tipo", "Numero"};

    public AgendaController(Principal view, CadContato cadContato, CadTelefone cadTelefone) {
        agenda = new Agenda();
        this.view = view;
        this.cadContato = cadContato;
        this.cadTelefone = cadTelefone;

        view.addAdcionarContatoListener(new AddContatoListener());
        view.addRemoverContatoListener(new RemoveContatoListener());
        view.addListaListener(new ClickList());
        view.addAdcionarTelefoneListener(new AddTelefoneListener());
        view.addRemoveTelefoneListener(new RemoveTelefoneListener());
        view.addEditarEnderecoListener(new EditarEnderecoListener());
        view.addSalvarEnderecoListener(new SalvarEnderecoListener());
        view.addPesquisaListener(new AddPesquisarListener());

        this.cadTelefone.addTelefoneListener(new TelefoneListener());

        this.cadContato.addCadastarContatoListener(new CadastrarContato());
        this.cadContato.addLimparContatoListener(new LimpaCampos());
    }

    //---------------------------- Metodos da Classe ---------------------------------
    public String[][] listar(List<Telefone> telefones) {
        int numeroColunas = 2;
        String[][] matrizRetorno = new String[telefones.size()][numeroColunas];

        for (int i = 0; i < telefones.size(); i++) {

            Telefone telefone = telefones.get(i);

            matrizRetorno[i][0] = telefone.getTipo();
            matrizRetorno[i][1] = telefone.getTelefone();
        }
        return matrizRetorno;
    }

    //---------------------------- Listener do Main.java ------------------------------

    class AddContatoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cadContato.setVisible(true);
        }

    }

    class AddTelefoneListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int indice = view.getListSelect();
            if (indice != -1) {
                cadTelefone.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um contato para incluir telefone", "Erro de Seleção", JOptionPane.CANCEL_OPTION);
            }

        }
    }

    class RemoveTelefoneListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int indiceLista = view.getListSelect();
            int indiceTabela = view.getTable().getSelectedRow();

            if (indiceTabela != -1) {

                DefaultTableModel model = view.getTableModel();

                model.removeRow(indiceTabela);

                //agenda.getContato(indiceLista).getTelefones().remove(indiceTabela);
                view.getListContatoSelected().getTelefones().remove(indiceTabela);

                view.getTable().setModel(new DefaultTableModel(listar(agenda.getContato(indiceLista).getTelefones()), colunas));

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um contato para incluir telefone", "Erro de Seleção", JOptionPane.CANCEL_OPTION);
            }

        }
    }

    class RemoveContatoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int indice = view.getListSelect();
            DefaultListModel model = view.getListModel();

            if (indice != -1) {
                model.remove(indice);
                agenda.RemoveContato(indice);
                view.limparCampos(colunas);
            } else {
                JOptionPane.showMessageDialog(null, "Não é possivel Remover", "Erro em Remoção", JOptionPane.CANCEL_OPTION);
            }
        }
    }

    class ClickList extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            int indice = view.getListSelect();
            DefaultListModel model = view.getListModel();

            if (indice != -1) {
                view.habilitacaoDeCampos(false);
                 //Mudando o modo de pegar contato selecionado na lista
                //view.setEndereco(agenda.getContato(indice).getEndereco());

                view.setEndereco(view.getListContatoSelected().getEndereco());

                //Mudando o modo de pegar contato selecionado na lista
                //view.getTable().setModel(new DefaultTableModel(listar(agenda.getContato(indice).getTelefones()), colunas));
                view.getTable().setModel(new DefaultTableModel(listar(view.getListContatoSelected().getTelefones()), colunas));

            } else {
                JOptionPane.showMessageDialog(null, "Nada seleciona!", "Erro", JOptionPane.CANCEL_OPTION);
            }

        }

    }

    class EditarEnderecoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.habilitacaoDeCampos(true);
        }
    }

    class SalvarEnderecoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int indiceLista = view.getListSelect();
            Endereco endereco = view.getEndereco();

             //Mudando o modo de pegar contato selecionado na lista
            //agenda.getContato(indiceLista).setEndereco(endereco);
            view.getListContatoSelected().setEndereco(endereco);
            view.habilitacaoDeCampos(false);
        }

    }

    class AddPesquisarListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
            System.out.println("Pressionado!");
            
            if (view.tipoPesquisa().equals("nome")) {

                String busca = view.getPesquisa();
                System.out.println(busca);

                List retorno = agenda.getContatoByName(busca);
                System.out.println(retorno);

                if (!retorno.isEmpty()) {
                    view.setListModel(retorno);
                } else {
                    view.setListModel(agenda.getContatos());
                }

            } else if (view.tipoPesquisa().equals("id")) {
                
                if(!view.getPesquisa().equals("")){
                Integer busca = Integer.parseInt(view.getPesquisa());
                System.out.println(busca);
                List retorno = agenda.getContatoById(busca);
                System.out.println(retorno);
                if (!retorno.isEmpty()) {
                    view.setListModel(retorno);
                } else {
                    view.setListModel(agenda.getContatos());
                }
                }   

               

            }

        }

    }
    //---------------------------- Listener do Contato.java ------------------------------

    class CadastrarContato implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Contato contato = cadContato.getContato();

            contato.setId(agenda.getContatos().size() + 1);

            agenda.addContato(contato);
            view.setListModel(agenda.getContatos());
            cadContato.setVisible(false);
            cadContato.limparCampos();
        }
    }

    class LimpaCampos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cadContato.limparCampos();
        }

    }

    //---------------------------- Listener do Telefone.java ------------------------------
    class TelefoneListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int indice = view.getListSelect();
            Telefone telefone = cadTelefone.getTelefone();

            //Mudando o modo de pegar contato selecionado na lista
            //agenda.getContato(indice).addTelefone(telefone);
            view.getListContatoSelected().addTelefone(telefone);

            //Mudando o modo de pegar contato selecionado na lista
            // view.getTable().setModel(new DefaultTableModel(listar(agenda.getContato(indice).getTelefones()), colunas));
            view.getTable().setModel(new DefaultTableModel(listar(view.getListContatoSelected().getTelefones()), colunas));
            cadTelefone.setVisible(false);
            cadTelefone.limpar();
        }

    }

}
