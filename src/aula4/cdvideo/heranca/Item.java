
package aula4.cdvideo.heranca;

public abstract class Item {
    
    private String titulo;
    private String comentario;
    private Boolean emprestado;
    private Integer tempoDuracao;

    public Item() {
    }

    public Item(String titulo, String comentario, Boolean emprestado, Integer tempoDuracao) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.emprestado = emprestado;
        this.tempoDuracao = tempoDuracao;
    }

    
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    
    
    
    
}
