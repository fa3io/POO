
package aula3.conta;

public class Login {
    
    private Integer numero;
    private String senha;

    public Login() {
    }

    public Login(Integer numero, String senha) {
        this.numero = numero;
        this.senha = senha;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
