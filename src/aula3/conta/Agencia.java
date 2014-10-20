
package aula3.conta;



class Agencia {

    private String numero;
    private String nome;

    public Agencia() {
    
    }

    public Agencia(String numero, String nome) {
        this.numero = numero;

        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getNumero()+" - "+ getNome();
    }
    
    
}
