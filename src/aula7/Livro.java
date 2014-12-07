package aula7;

public class Livro {
	
	private long id;
	private String isbn;
	private String titulo;
	private String autor;
	private String categoria;
	
	public Livro() {
		
	}
	

	public Livro(long id, String isbn, String titulo, String autor, String categoria) {
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
