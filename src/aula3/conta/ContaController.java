package aula3.conta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ContaController {

    private CadContaCorrente cadContaCorrente;
    private CadAgencia cadAgencia;
    private LoginConta loginConta;
    private Principal principal;
    private TelaConta telaConta;
    private RelatorioGUI relatorio;
    private List<ContaCorrente> contas = new ArrayList<>();
    private List<Agencia> agencias = new ArrayList<>();
    private ContaCorrente ContaManipulada;
    public static final String[] COLUNAS = { "Agencia", "Num Conta", "Correntista"};

    public ContaController(CadContaCorrente cadContaCorrente, CadAgencia cadAgencia, LoginConta loginConta, Principal priciPrincipal, TelaConta telaConta, RelatorioGUI relatorio) {
        this.cadContaCorrente = cadContaCorrente;
        this.cadAgencia = cadAgencia;
        this.loginConta = loginConta;
        this.principal = priciPrincipal;
        this.telaConta = telaConta;
        this.relatorio = relatorio;

        this.principal.addCadastrarContaListener(new CadastrarContaLister());
        this.principal.addCadastrarAgenciaListener(new CadastrarAgenciaLister());
        this.principal.addAcessoListener(new AcessoLister());
        this.principal.addRelatorioListener(new RelatorioLister());

        this.cadContaCorrente.addSalvarListener(new ContaCorrenteSalvarListener());
        this.cadContaCorrente.addCancelarListener(new ContaCorrenteCancelarListener());

        this.cadAgencia.addSalvarListener(new AgenciaSalvarListener());
        this.cadAgencia.addCancelarListener(new AgenciaCancelarListener());

        this.loginConta.addEntrarListener(new LoginEntrarListener());
        this.loginConta.addCancelarListener(new LoginCancelarListener());

        this.telaConta.addDepositarListener(new ContaDepositarListener());
        this.telaConta.addSacarListener(new ContaSacarListener());
        this.telaConta.addSaldoListener(new ContaSaldoListener());

        if (agencias.size() == 0) {
            this.principal.setButton(false);
        }

    }

    //----------------------------------------Metodos Classe.java--------------------
    private void logar(Login login) {

        for (ContaCorrente conta : contas) {
            if (conta.getNumero().equals(login.getNumero())) {
                if (conta.getSenha().equals(login.getSenha())) {
                    loginConta.setVisible(true);
                    ContaManipulada = conta;
                    telaConta.setBoasVindas(conta.getCorrentista().getNome());
                    System.out.println("Bem Vindo " + conta.getCorrentista().getNome());
                    telaConta.setVisible(true);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Agencia e Contas Invalidos", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencheComboBox(JComboBox combobox, List<Agencia> lista) {
        for (int i = 0; i < lista.size(); i++) {
            combobox.addItem(lista.get(i));
        }
    }

    private void preencherTabela(JTable tableRelatorio, List<ContaCorrente> contas) {

        DefaultTableModel model = new DefaultTableModel(convertLista(contas), COLUNAS);
        tableRelatorio.setModel(model);
         
    }

    private String[][] convertLista(List<ContaCorrente> lista) {
        String[][] dados = new String[lista.size()][COLUNAS.length];

        for (int i = 0; i < lista.size(); i++) {

            dados[i][0] = lista.get(i).getAgencia().getNome();
            dados[i][1] = String.valueOf(lista.get(i).getNumero());
            dados[i][2] = lista.get(i).getCorrentista().getNome();
        }
        return dados;

    }

        //----------------------------------------Principal.java--------------------
    public class CadastrarContaLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JComboBox combo = cadContaCorrente.getCbAgecia();
            combo.removeAllItems();
            preencheComboBox(combo, agencias);
            cadContaCorrente.setVisible(true);
        }

    }

    public class CadastrarAgenciaLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cadAgencia.setVisible(true);
        }

    }

    public class AcessoLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            loginConta.setVisible(true);
        }

    }

    public class RelatorioLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            preencherTabela(relatorio.getTableRelatorio(), contas);
            relatorio.setVisible(true);

        }

    }

         //----------------------------------------CadContaCorrente.java--------------------
    public class ContaCorrenteSalvarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            contas.add(cadContaCorrente.getContaCorrente());
            cadContaCorrente.setVisible(false);
            cadContaCorrente.limparCampos();
        }

    }

    public class ContaCorrenteCancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cadContaCorrente.setVisible(false);
            cadContaCorrente.limparCampos();
        }

    }
         //----------------------------------------CadAgencia.java--------------------

    public class AgenciaSalvarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            agencias.add(cadAgencia.getAgencia());
            principal.setButton(true);
            cadAgencia.setVisible(false);
            cadAgencia.limparCampos();
        }

    }

    public class AgenciaCancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cadAgencia.setVisible(false);
            cadAgencia.limparCampos();
        }

    }
      //----------------------------------------Login.java--------------------

    public class LoginEntrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Login login = loginConta.getLogin();
            logar(login);
        }

    }

    public class LoginCancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            loginConta.setVisible(false);
            loginConta.limparCampos();
        }

    }

        //----------------------------------------TelaConta.java--------------------
    public class ContaSaldoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, ContaManipulada.getSaldo(), "Saldo em Conta", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public class ContaSacarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String valor = JOptionPane.showInputDialog(null, "Valor a Sacar: ", "Saque", JOptionPane.QUESTION_MESSAGE);
            Boolean realizado = ContaManipulada.sacar(new BigDecimal(valor));

            if (realizado) {
                JOptionPane.showMessageDialog(null, "Saque Efetuado con Sucesso ", "Saque Efetuado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Saque não pode ser realizado", "Erro ao Sacar", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public class ContaDepositarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String valor = JOptionPane.showInputDialog(null, "Valor a Depositar: ", "Deposito", JOptionPane.QUESTION_MESSAGE);
            Boolean realizado = ContaManipulada.depositar(new BigDecimal(valor));

            if (realizado) {
                JOptionPane.showMessageDialog(null, "Deposito Efetuado con Sucesso ", "Deposito Efetuado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Deposito não pode ser realizado", "Erro ao Deposiar", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
