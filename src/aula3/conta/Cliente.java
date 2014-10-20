
package aula3.conta;

class Cliente {
    
    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return getNome();
    }

    
    
    
}
