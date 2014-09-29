package aula1;

import java.util.Scanner;

public class ExercicioSimples05 {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		int num, fat = 1;

		System.out.println("Digite um nº");
		num = Scanner.nextInt();

		for (int i = num; i > 0 ; i--) {
			fat = fat * i;	
		}

		System.out.println("!" + num + " = " + fat);
		

	}

}
