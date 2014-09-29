package aula1;

import java.util.Scanner;

public class ExercicioSimples04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeroAluno = 1;
		double notas = 0;
		String digitada = "";
		
		System.out.println("Lançamento de Notas");
		System.out.println("Digite M para exibir media");
		while (!digitada.equalsIgnoreCase("m")) {
			System.out.println("Digite a nota do " + numeroAluno + "º Aluno: ");
			digitada = scanner.nextLine();
			
			if(!digitada.equalsIgnoreCase("m")){
				notas = notas + Double.parseDouble(digitada);
				numeroAluno++;
			}
			
		}
		if(numeroAluno == 0){
			System.out.println("Não foram inseridas notas!!!");
		}else{
			System.out.println("Media dos Alunos é : "+ notas / (numeroAluno - 1));
		}
		
	}
}
