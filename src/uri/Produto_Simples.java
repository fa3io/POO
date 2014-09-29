package uri;

import java.util.Scanner;

public class Produto_Simples {
	
	public static void main(String[] args) {
		int a ,b, prod ;
		Scanner teclado = new Scanner (System.in);
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		prod = a * b;
		
		System.out.printf("PROD = "+prod+"\n");
		

	}

}
