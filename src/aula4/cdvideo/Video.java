
package aula4.cdvideo;


public class Video {
    
    private String diretor;
    private String comentario;
    private Boolean emprestado;
    private Integer tempoDuracao;
    private String titulo;

    public Video() {
    }

    public Video(String diretor, String comentario, Boolean emprestado, Integer tempoDuracao, String titulo) {
        this.diretor = diretor;
        this.comentario = comentario;
        this.emprestado = emprestado;
        this.tempoDuracao = tempoDuracao;
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
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
       return getTitulo()+" - "+ getDiretor()+" - "+getComentario();
    }
    
    
    
}
