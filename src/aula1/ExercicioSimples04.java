package aula1;

import java.util.Scanner;

public class ExercicioSimples04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeroAluno = 1;
		double notas = 0;
		String digitada = "";
		
		System.out.println("Lan�amento de Notas");
		System.out.println("Digite M para exibir media");
		while (!digitada.equalsIgnoreCase("m")) {
			System.out.println("Digite a nota do " + numeroAluno + "� Aluno: ");
			digitada = scanner.nextLine();
			
			if(!digitada.equalsIgnoreCase("m")){
				notas = notas + Double.parseDouble(digitada);
				numeroAluno++;
			}
			
		}
		if(numeroAluno == 0){
			System.out.println("N�o foram inseridas notas!!!");
		}else{
			System.out.println("Media dos Alunos � : "+ notas / (numeroAluno - 1));
		}
		
	}
}
