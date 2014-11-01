
package aula4.cdvideo.heranca;

public class Video extends Item{
    
    private String diretor;

    public Video(String diretor, String titulo, String comentario, Boolean emprestado, Integer tempoDuracao) {
        super(titulo, comentario, emprestado, tempoDuracao);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
     @Override
    public String toString() {
       return getTitulo()+" - "+ getDiretor()+" - "+getComentario();
    }
    
}
