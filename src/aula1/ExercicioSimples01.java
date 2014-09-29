package aula1;

import java.util.Scanner;

public class ExercicioSimples01 {
	
	public static void main(String[] args) {
		String nome1, nome2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o 1º nome: ");
		nome1 = scanner.nextLine();

		System.out.println("Digite o 2º nome: ");
		nome2 = scanner.nextLine();
		
		System.out.println("Primeiro nome digitado: " +nome1+ ", Segundo nome digitado: "+ nome2);
		
	}

}
