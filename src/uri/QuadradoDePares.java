package uri;

import java.util.Scanner;

public class QuadradoDePares {

	public static void main(String[] args) {
		
		int n;
		Scanner teclado = new Scanner(System.in);
		
		n = teclado.nextInt();
		
		for (int i = 2; i <= n; i+=2) {
			System.out.println(i+"^2 = "+ (i * i));
		}
		
	}
}
