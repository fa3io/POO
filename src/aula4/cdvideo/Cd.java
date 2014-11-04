
package aula4.cdvideo;


public class Cd {

    
    private String artista;
    private String comentario;
    private Boolean emprestado;
    private Integer numeroMusicas;
    private Integer tempoDuracao;
    private String titulo;

    public Cd() {
    }

    public Cd(String artista, String comentario, Boolean emprestado, Integer numeroMusicas, Integer tempoDuracao, String titulo) {
        this.artista = artista;
        this.comentario = comentario;
        this.emprestado = emprestado;
        this.numeroMusicas = numeroMusicas;
        this.tempoDuracao = tempoDuracao;
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean IsEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Integer getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(Integer numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }

    public Integer getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(Integer tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
      return getTitulo()+" - "+ getArtista()+" - "+getComentario();
    }
    
    
    
    
    
    
    
    
}
