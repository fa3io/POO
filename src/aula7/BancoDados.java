package aula7;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {
	
	private List<Exemplar> exemplares = new ArrayList<Exemplar>();
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private List<Livro> livros = new ArrayList<Livro>();
	
	public BancoDados() {
		dadosPessoas();
		dadosLivros();
	}
	
	private void dadosLivros() {
		
		livros.add(new Livro(01, "191012", "Java como Programar", "Deitel", "Informatica"));
		livros.add(new Livro(02, "200987", "Como se fosse a primeira vez", "Robert", "Romance"));
		livros.add(new Livro(03, "444567", "Senhor dos Aneis", "Jr Junior", "Aventura"));
		livros.add(new Livro(04, "538904", "Hobbit", "Carlos wek", "Aventura"));
		
	}

	private void dadosPessoas() {

		pessoas.add(new Pessoa(1, "Fabio Santos", "074.851.996-33", 24));
		pessoas.add(new Pessoa(2, "Flavio Santos", "188.236.661-45", 21));
		pessoas.add(new Pessoa(3, "Rosalina Silva", "450.903.889-40", 51));
		pessoas.add(new Pessoa(4, "Luiz Silva", "500.887.456-11", 48));
		
	}
	
	public void addExemplar(Exemplar exemplar){
		exemplares.add(exemplar);
	}
	
	public void addPessoa(Pessoa pessoa){
		pessoas.add(pessoa);
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}
	
	public void addLivro(Livro livro){
		livros.add(livro);
	}
	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
