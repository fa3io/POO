package aula7;

import java.util.Scanner;

public class Sistema {

	/*
	 * (non-javadoc)
	 */
	private BancoDados bancoDados;

	/**
	 * Getter of the property <tt>bancoDados1</tt>
	 * 
	 * @return Returns the bancoDados1.
	 * 
	 */
	public BancoDados getBancoDados() {
		return bancoDados;
	}

	/**
	 * Setter of the property <tt>bancoDados1</tt>
	 * 
	 * @param bancoDados1
	 *            The bancoDados1 to set.
	 * 
	 */
	public void setBancoDados(BancoDados bancoDados) {
		this.bancoDados = bancoDados;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		do{
			System.out.println("\nMENU");
			System.out.println("1 - Cadastrar empréstimo de livro.");
			System.out.println("2 - Listagem de exemplares.");
			System.out.println("3 - Listagem de alunos.");
			System.out.println("9 - Sair");
			System.out.println("\nOpção: ");
			opcao = sc.nextLine();
			
			if(opcao.equals("1")){
				//cadEmprestimo();
			} else if(opcao.equals("2")){
				//listExemplares();
			} else if(opcao.equals("3")){
				//listAlunos();
			}
			//adicionar as demais opções aqui!!!
			
		} while(! opcao.equals("9"));
		
		System.out.println("ATÉ!!!");
	}

}
