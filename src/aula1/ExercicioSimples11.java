package aula1;

import java.util.Scanner;

public class ExercicioSimples11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2, resultado;
		String operacao;

		System.out.println("Digite a opera��o que deseja realizar: ");
		System.out.println("+ = Adi��o");
		System.out.println("- = Subtra��o");
		System.out.println("* = Muntiplica��o");
		System.out.println("/ = Divis�o ");
		System.out.println("_______________________________________");
		operacao = scanner.nextLine();
		System.out.println("Digite o 1� Numero:");
		numero1 = scanner.nextInt();
		System.out.println("Digite o 2� Numero:");
		numero2 = scanner.nextInt();
		System.out.println("_______________________________________");

		if (operacao.equals("+")) {
			soma(numero1, numero2);
		} else if (operacao.equals("-")) {
			subtracao(numero1, numero2);
		} else if (operacao.equals("*")) {
			multiplicacao(numero1, numero2);
		} else if (operacao.equals("/")) {
			divisao(numero1, numero2);
		} else {
			System.out.println("Opera��o escolhida � inv�lida!");
		}
	}

	private static int divisao(int numero1, int numero2) {
		return 0;
	}

	private static int multiplicacao(int numero1, int numero2) {
		return 0;

	}

	private static int subtracao(int numero1, int numero2) {
		return 0;
	}

	private static int soma(int numero1, int numero2) {
		if((numero1 == 1)){
			return numero2;
		}else if((numero2 == 1)){
			return numero1;
		}else{
			return 0;
		}
		
	}
}
