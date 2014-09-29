package aula1;

import java.util.Scanner;

public class ExercicioSimples10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		System.out.println("Fatorial de " + numero + " = " + fat(numero));
		System.out.println("Seq. de Fibonacci, até: " + numero + " ");
		for (int i = 1; i <= numero; i++) {
			System.out.print(i + "º - " + fib(i) + " | ");
		}
	}

	public static long fat(int n) {
		if (n == 0)
			return (1);
		else
			return (n * fat(n - 1));
	}

	public static int fib(int n) {
		if ((n == 1) || (n == 2))
			return (1);
		else
			return (fib(n - 1) + fib(n - 2));

	}
}
