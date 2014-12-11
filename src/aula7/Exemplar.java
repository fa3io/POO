package aula7;

public class Exemplar {
	
	private long id;
	private Livro livro;
	private Pessoa quemTomouEmprestado;
	private boolean emprestado;
	
	

	public Exemplar(long id, Livro livro, Pessoa quemTomouEmprestado,
			boolean emprestado) {
		super();
		this.id = id;
		this.livro = livro;
		this.quemTomouEmprestado = quemTomouEmprestado;
		this.emprestado = emprestado;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Pessoa getQuemTomouEmprestado() {
		return quemTomouEmprestado;
	}
	public void setQuemTomouEmprestado(Pessoa quemTomouEmprestado) {
		this.quemTomouEmprestado = quemTomouEmprestado;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	@Override
	public String toString() {
		return getId()+" - "+getLivro().getTitulo() +" emprestado para:"+ getQuemTomouEmprestado().getNome();
	}
}
