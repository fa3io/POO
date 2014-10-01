package uri;

import java.util.Scanner;

public class SequenciaLogica {

	public static void main(String[] args) {
		
		int n, m=1;
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println((+i)+" "+(i*i)+" "+(i*i*i));
			System.out.println((i)+" "+((i*i)+m)+" "+((i*i*i)+m));
			}
	}
}
