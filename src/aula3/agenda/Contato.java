package aula3.agenda;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	private Integer id;
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones;
	
	public Contato() {
		telefones = new ArrayList<Telefone>();
	}
	
	public void addTelefone(Telefone telefone){
		telefones.add(telefone);
	}
	
	public void delTelefoneByIndex(int index){
		telefones.remove(index);
	}
	
	public List<Telefone> getTelefones(){
		return telefones;
	}
	
	
	public void mostrarTelefones(){
		for (int i = 0; i < telefones.size(); i++) {
			System.out.println(telefones.get(i));
		}

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
