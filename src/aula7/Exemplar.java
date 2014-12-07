package aula7;

public class Exemplar {
	
	private long id;
	private Livro livro;
	private Pessoa quemTomouEmprestado;
	private boolean emprestado;

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
}
