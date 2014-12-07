package aula7;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	long id;
	String nome;
	String CPF;
	int idade;
	List<Exemplar> emprestimos = new ArrayList<Exemplar>();
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(long id, String nome, String cPF, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public List<Exemplar> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(List<Exemplar> emprestimos) {
		this.emprestimos = emprestimos;
	} 

}
