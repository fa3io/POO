
package aula4.cdvideo.heranca;

public class Cd extends Item{
    
  private Integer numeroMusicas;
  private String artista;


    public Cd() {
    }

    public Cd(Integer numeroMusicas, String artista, String titulo, String comentario, Boolean emprestado, Integer tempoDuracao) {
        super(titulo, comentario, emprestado, tempoDuracao);
        this.numeroMusicas = numeroMusicas;
        this.artista = artista;
    }

     


    public Integer getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(Integer numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
      return getTitulo()+" - "+ getArtista()+" - "+getComentario();
    }
    
    
    
    
    
}
