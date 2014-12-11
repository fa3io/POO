package aula7;

import java.util.List;
import java.util.Scanner;

public class Sistema {

	private static BancoDados bancoDados = new BancoDados();
	public static Scanner sc = new Scanner(System.in);
	static String opcao = "";
	static int idLivro, idPessoa;
	
	public static void main(String[] args) {
		
		do {
			System.out.println("\nMENU");
			System.out.println("1 - Cadastrar empréstimo de livro.");
			System.out.println("2 - Listagem de exemplares.");
			System.out.println("3 - Listagem de alunos.");
			System.out.println("4 - Listagem de Livros.");
			System.out.println("5 - Cadastrar Pessoa.");
			System.out.println("6 - Cadastrar Livro.");
			System.out.println("9 - Sair");
			System.out.println("\nOpção: ");
			opcao = sc.nextLine();

			if (opcao.equals("1")) {
				cadEmprestimo();
			} else if (opcao.equals("2")) {
				listExemplares();
			} else if (opcao.equals("3")) {
				listAlunos();
			} else if (opcao.equals("4")) {
				listarLivros();
			}else if (opcao.equals("5")) {
				cadPessoa();
			}else if (opcao.equals("6")) {
				listarLivros();
			}
			// adicionar as demais opções aqui!!!

		} while (!opcao.equals("9"));

		System.out.println("ATÉ!!!");
	}

	private static void cadPessoa() {
		
		
	}

	private static void cadEmprestimo() {
		System.out.println("Digite o ID da Pessoa: \n");
		idPessoa = sc.nextInt();
		System.out.println("Digite o ID do Livro: \n");
		idLivro = sc.nextInt();
		Pessoa pessoa = bancoDados.getPessoas().get(idPessoa);
		Livro livro = bancoDados.getLivros().get(idLivro);
		int id = bancoDados.getExemplares().size() + 1;
		
		Exemplar exemplar = new Exemplar(id, livro, pessoa, true);
		pessoa.getEmprestimos().add(exemplar);
		bancoDados.addExemplar(exemplar);
		
		System.out.println("Exemplares Emprestados foram Atualizados: ");
		listExemplares();
		
	}

	private static void listExemplares() {
		System.out.println("Lista de Exemplares /n");
		List<Exemplar> exemplares = bancoDados.getExemplares();
		for (Exemplar exemplar : exemplares) {
			System.out.println(exemplar);
		}
	}

	private static void listAlunos() {
		System.out.println("Lista de Alunos /n");
		List<Pessoa> pessoas = bancoDados.getPessoas();
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

	private static void listarLivros() {
		System.out.println("Lista de Livros /n");
		List<Livro> livros = bancoDados.getLivros();
		for (Livro livro : livros) {
			System.out.println(livro);
		}

	}

}
