package aula1;

import java.util.Scanner;

public class ExercicioSimples03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double numero1, numero2, resultado;
		String operacao;
		System.out.println("Digite a opera��o que deseja realizar: ");
		System.out.println("+ = Adi��o");
		System.out.println("- = Subtra��o");
		System.out.println("* = Muntiplica��o");
		System.out.println("/ = Divis�o ");
		System.out.println("_______________________________________");
		operacao = scanner.nextLine();
		System.out.println("Digite o 1� Numero:");
		numero1 = scanner.nextDouble();
		System.out.println("Digite o 2� Numero:");
		numero2 = scanner.nextDouble();
		System.out.println("_______________________________________");
		
		if(operacao.equals("+")){
			resultado = numero1 + numero2;
			System.out.println("Resultado da adi��o � : "+ resultado);
		}else if(operacao.equals("-")){
			resultado = numero1 - numero2;
			System.out.println("Resultado da subtra��o � : "+ resultado);
		}else if(operacao.equals("*")){
			resultado = numero1 * numero2;
			System.out.println("Resultado da multiplica��o � : "+ resultado);
		}else if(operacao.equals("/")){
			resultado = numero1 / numero2;
			System.out.println("Resultado da divis�o � : "+ resultado);
		}else{
			System.out.println("Opera��o escolhida � inv�lida!");
		}
		
		
		
		
		
		
		
	}

}
