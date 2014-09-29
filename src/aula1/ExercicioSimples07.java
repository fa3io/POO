package aula1;

import java.util.Scanner;

public class ExercicioSimples07 {

	static long fibo(int n) {
		
		int nAtual = 0; // atual
		int antnAnterior = 0; // anterior
		
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				nAtual = 1;
				antnAnterior = 0;
			} else {
				nAtual += antnAnterior;
				antnAnterior = nAtual - antnAnterior;
			}
		}
		return nAtual;
	}

	public static void main(String[] args) { // teste do programa. Imprime os 30 primeiros termos
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o Numero para descobrir a seguencia: ");
		numero = scanner.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.print("(" + i + "):" + ExercicioSimples07.fibo(i) + "\t");
		}
	}
}