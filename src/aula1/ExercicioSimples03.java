package aula1;

import java.util.Scanner;

public class ExercicioSimples03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double numero1, numero2, resultado;
		String operacao;
		System.out.println("Digite a operação que deseja realizar: ");
		System.out.println("+ = Adição");
		System.out.println("- = Subtração");
		System.out.println("* = Muntiplicação");
		System.out.println("/ = Divisão ");
		System.out.println("_______________________________________");
		operacao = scanner.nextLine();
		System.out.println("Digite o 1º Numero:");
		numero1 = scanner.nextDouble();
		System.out.println("Digite o 2º Numero:");
		numero2 = scanner.nextDouble();
		System.out.println("_______________________________________");
		
		if(operacao.equals("+")){
			resultado = numero1 + numero2;
			System.out.println("Resultado da adição é : "+ resultado);
		}else if(operacao.equals("-")){
			resultado = numero1 - numero2;
			System.out.println("Resultado da subtração é : "+ resultado);
		}else if(operacao.equals("*")){
			resultado = numero1 * numero2;
			System.out.println("Resultado da multiplicação é : "+ resultado);
		}else if(operacao.equals("/")){
			resultado = numero1 / numero2;
			System.out.println("Resultado da divisão é : "+ resultado);
		}else{
			System.out.println("Operação escolhida é inválida!");
		}
		
		
		
		
		
		
		
	}

}
