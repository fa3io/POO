package aula3.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends ArrayList<Contato>{

	private List<Contato> contatos;

	public Agenda() {
		contatos = new ArrayList<Contato>();
	}

	public void addContato(Contato contato) {
		contatos.add(contato);
	}

	public void delContatoByIndex(int index) {
		contatos.remove(index);
	}

	public void delContatoById(int id) {
		contatos.remove(id);
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	// Efetuar Implementacao
	public String mostrarContatos() {
		return "";
	}

	public Contato getContatoById(int id) {
		Contato contato = null;

		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(1).getId().equals(id)) {
				contato = contatos.get(i);
			}
		}

		return contato;
	}

	public Contato getContatoByName(String nome) {
		Contato contato = null;

		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(1).getNome().equals(nome)) {
				contato = contatos.get(i);
			}
		}

		return contato;
	}
}
