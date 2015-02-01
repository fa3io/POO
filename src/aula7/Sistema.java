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
			System.out.println("1 - Cadastrar empr�stimo de livro.");
			System.out.println("2 - Listagem de exemplares.");
			System.out.println("3 - Listagem de alunos.");
			System.out.println("4 - Listagem de Livros.");
			System.out.println("5 - Cadastrar Pessoa.");
			System.out.println("6 - Cadastrar Livro.");
			System.out.println("9 - Sair");
			System.out.println("\nOpcaoo: ");
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
				cadLivros();
			}
			

		} while (!opcao.equals("9"));

		System.out.println("ATEH!!!");
	}

	private static void cadLivros() {
		Livro livro = new Livro();
		
		livro.setId(bancoDados.getLivros().size()+1);
		System.out.println("Digite o Isbn :");
		livro.setIsbn(sc.nextLine());
		System.out.println("Digite o Nome :");
		livro.setTitulo(sc.nextLine());
		System.out.println("Digite o Autor :");
		livro.setAutor(sc.nextLine());
		System.out.println("Digite a Categoria :");
		livro.setCategoria(sc.nextLine());
		
		bancoDados.getLivros().add(livro);
		
		
	}

	private static void cadPessoa() {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(bancoDados.getPessoas().size()+1);
		System.out.println("Digite o Nome :");
		pessoa.setNome(sc.nextLine());
		System.out.println("Digite o CPF :");
		pessoa.setCPF(sc.nextLine());
		System.out.println("Digite a idade :");
		pessoa.setIdade(sc.nextInt());
		
		bancoDados.getPessoas().add(pessoa);
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
		System.out.println("Lista de Exemplares \n");
		List<Exemplar> exemplares = bancoDados.getExemplares();
		
		if (exemplares.isEmpty()) {
			System.out.println("Lista Vazia");
		}else{
			for (Exemplar exemplar : exemplares) {
				System.out.println(exemplar);
			}
		}
	}

	private static void listAlunos() {
		System.out.println("Lista de Alunos \n");
		List<Pessoa> pessoas = bancoDados.getPessoas();
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

	private static void listarLivros() {
		System.out.println("Lista de Livros \n");
		List<Livro> livros = bancoDados.getLivros();
		for (Livro livro : livros) {
			System.out.println(livro);
		}

	}

}
