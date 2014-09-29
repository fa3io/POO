package aula1;

import java.util.Scanner;

public class ExercicioSimples02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double numero1, numero2;
		
		
		System.out.println("Digite o primeiro numero para soma:");
		numero1 = scanner.nextDouble();
		
		System.out.println("Digite o Segundo numero:");
		numero2 = scanner.nextDouble();
		
		System.out.println("Resultado da Soma: "+ (numero1 + numero2));
		
		
	}
}
