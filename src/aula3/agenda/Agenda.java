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
        public Contato RemoveContato(int index){
            return contatos.remove(index);
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
	public List getContatoByName(String nome) {
		List retorno = new ArrayList<>();

		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().equals(nome)) {
				Contato contato = contatos.get(i);
                                retorno.add(contato);
			}
		}
		return retorno;
	}
        
        public Contato getContato(int index){
           return contatos.get(index);
        }
}
