package aula7.exe1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestePessoas {
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();

	static {
		pessoas.add(new Pessoa(1, "Fulano de Tal", "111.222", "Rua Teste, 45"));
		pessoas.add(new Pessoa(2, "Beltrano", "333.444", "Rua Bla, 89"));
		pessoas.add(new Pessoa(3, "Fulano de Tal", "111.222", "Rua Teste, 45"));
		pessoas.add(new Pessoa(4, "Beltrano", "333.444", "Rua Bla, 89"));
		pessoas.add(new Pessoa(5, "Mais Um", "555.666", "Rua Final, 56"));
		pessoas.add(new Pessoa(6, "Mais Um", "555.666", "Rua Final, 56"));
		pessoas.add(new Pessoa(7, "Mais Um", "555.666", "Rua Final, 56"));
	}

	public static void main(String[] args) {
		System.out.println("Lista Completa: ");
		mostrar(pessoas);
		System.out.println("\nLista Restrita: ");
		List<Pessoa> distinctList = listDistinctByCpf(pessoas);
		mostrar(distinctList);
	}

	private static List<Pessoa> listDistinctByCpf(List<Pessoa> pessoas) {
		List<Pessoa> selecionados = new ArrayList<Pessoa>();

		for (Pessoa p1 : pessoas) {
			Boolean ehIgual = false;
			for (Pessoa p2 : selecionados) {
				if (p1.getCpf().equals(p2.getCpf())) {
					ehIgual = true;
					break;
				}
			}
			if (ehIgual == false) {
				selecionados.add(p1);
			}
			ehIgual = false;
		}

		return selecionados;
	}
	
	private static List<Pessoa> list2DistinctByCpf(List<Pessoa> pessoas){
		List<Pessoa> selecionados = new ArrayList<Pessoa>();
		
		return selecionados ;
		
	}
	
	private static Set<Pessoa> setDistinctByCpf(List<Pessoa> pessoas){
		Set selecionados = new HashSet<>();
		
		return selecionados;
		
	}

	private static void mostrar(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		System.out.println( );
	}
}