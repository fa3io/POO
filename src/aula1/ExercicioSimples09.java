package aula1;

import java.util.Scanner;

public class ExercicioSimples09 {

	public static void main(String[] args) {

		int numero, fatorial = 1;
		int cont = 1;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out
					.println("Digite o numero do qual deseja obter o fatorial: ");
			numero = scanner.nextInt();

			for (int i = 0; i <= numero; i++) {
				fatorial = ExercicioSimples09.calculaFatorial(i);
				System.out.println("!" + i + " = " + fatorial);
			}

			cont++;

		} while (cont < 2);
	}

	private static int calculaFatorial(int numero) {

		if (numero == 0) {
			return 1;
		} else {
			return numero * calculaFatorial(numero - 1);
		}
	}

}
