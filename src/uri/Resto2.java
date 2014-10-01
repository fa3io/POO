package uri;

import java.util.Scanner;

public class Resto2 {
	public static void main(String[] args) {
		
		int n;
		Scanner teclado = new Scanner(System.in);
		
		n = teclado.nextInt();
		
		for (int i = 1; i < 10000; i++) {
			
			if (i % n == 2) {
				System.out.println(i);
			}
		}
		
	}
}
