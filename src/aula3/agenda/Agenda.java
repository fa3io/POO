package aula3.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Contato> contatos;
	
	public Agenda() {
		contatos = new ArrayList<Contato>();
	}
	
	public void addContato(Contato contato){
		contatos.add(contato);
	}
	
	public void delContatoByIndex(int index){
		contatos.remove(index);
	}

	public void delContatoById(int id){
		contatos.remove(id);
	}
	
	public List<Contato> getContatos(){
		return contatos;
	}
	
	//Efetuar Implementação
	public String mostrarContatos(){
		return "";
	}
}
