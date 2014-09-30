package uri;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		int a ,b, soma ;
		Scanner teclado = new Scanner (System.in);
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		soma = a +b;
		
		System.out.printf("SOMA = "+soma+"\n");
		

	}

}
