package aula1;

import java.util.Scanner;

public class ExercicioSimples06 {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		int numero, fatorial = 1;

		System.out.println("Digite um numero");
		numero = Scanner.nextInt();

		for (int i = 0; i <=numero; i++) {
			
			if(i == 0){
				System.out.println(i+"! ="+fatorial);
			}else{
				fatorial = fatorial * i;
				System.out.println(i+"! ="+fatorial);
			}	
		}

	}
}
