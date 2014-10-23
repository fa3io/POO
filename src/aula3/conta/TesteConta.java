
package aula3.conta;


public class TesteConta {
    
    public static void main(String[] args) {
        
        CadAgencia cadAgencia = new CadAgencia(null, true);
        CadContaCorrente conta = new CadContaCorrente(null, true);
        LoginConta login = new LoginConta(null, true);
        Principal principal = new Principal();
        RelatorioGUI relatorios = new RelatorioGUI(null, true);
        TelaConta telaConta = new TelaConta(null, true);
        
        ContaController controler = new ContaController(conta, cadAgencia, login, principal, telaConta, relatorios);
        
        principal.setVisible(true);
       
        
        
    }
    
}
