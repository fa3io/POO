package uri;

import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		
		int[] n = new int[3];
		int[] n1 = new int[3];
		int a, b,c;
		int aux;
		Scanner teclado = new Scanner(System.in);

		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		
		n[0] = a ;
		n[1] = b;
		n[2] = c;
		n1[0] = a;
		n1[1] = b;
		n1[2] = c;

		if(n[2] < n[1]){
			aux = n[1];
			n[1] = n[2];
			n[2] = aux;
		}
		if(n[1] < n[0]){
			aux = n[0];
			n[0] = n[1];
			n[1] = aux;
		}
		if(n[2] < n[1]){
			aux = n[1];
			n[1] = n[2];
			n[2] = aux;
		}
		for (int i = 0; i < n.length; i++) {
			System.out.printf(n[i]+"\n");
		}
		System.out.println();
		for (int i = 0; i < n.length; i++) {
			System.out.printf(n1[i]+"\n");
		}
	}
}
