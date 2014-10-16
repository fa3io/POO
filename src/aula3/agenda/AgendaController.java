package aula3.agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AgendaController {

    private final Principal view;
    private final CadContato cadContato;
    private final CadTelefone cadTelefone;
    private final Agenda contatos;
    private final String[] colunas = new String[]{"Tipo","Numero"};

    public AgendaController(Principal view, CadContato cadContato, CadTelefone cadTelefone) {
        contatos = new Agenda();
        this.view = view;
        this.cadContato = cadContato;
        this.cadTelefone = cadTelefone;

        view.addAdcionarContatoListener(new AddContatoListener());
        view.addRemoverContatoListener(new RemoveContatoListener());
        view.addListaListener(new ClickList() );
        view.addAdcionarTelefoneListener(new AddTelefoneListener());
        view.addRemoveTelefoneListener(new RemoveTelefoneListener());

        this.cadTelefone.addTelefoneListener(new TelefoneListener());

        this.cadContato.addCadastarContatoListener(new CadastrarContato());
        this.cadContato.addLimparContatoListener(new LimpaCampos());
    }
    
    //---------------------------- Metodos da Classe ---------------------------------
    
    public String[][] listar(List<Telefone> telefones){
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
            }else{
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
               view.getTableModel().removeRow(indiceTabela);
               contatos.get(indiceLista).getTelefones().remove(indiceTabela);
               view.setTableModel(listar(contatos.get(indiceLista).getTelefones()),colunas);
                
            }else{
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
                contatos.remove(indice);
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

            if (indice != -1) {
                view.setEndereco(contatos.get(indice).getEndereco());
                view.setTableModel(listar(contatos.get(indice).getTelefones()),colunas);
            } else {
                JOptionPane.showMessageDialog(null, "Nada seleciona!", "Erro", JOptionPane.CANCEL_OPTION);
            }

        }

    }
    //---------------------------- Listener do Contato.java ------------------------------

    class CadastrarContato implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Contato contato = cadContato.getContato();
            contatos.add(contato);
            view.setListModel(contatos);
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
            contatos.get(indice).addTelefone(telefone);
            view.setTableModel(listar(contatos.get(indice).getTelefones()),colunas);
            cadTelefone.setVisible(false);
            cadTelefone.limpar();
        }

    }
    
}
