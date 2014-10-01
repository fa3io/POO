package uri;

import java.util.Scanner;

public class SequenciaLogica2 {
	
	public static void main(String[] args) {
		
		int x,y;
		Scanner teclado = new Scanner(System.in);
		x = teclado.nextInt();
		y = teclado.nextInt();
		
	for (int i = 1; i <=y; i+=x) {
		for (int j = 0; j < x; j++) {
			if(j == (x-1)){
			System.out.print((i+j));
			}else{
				System.out.print((i+j)+" ");
			}
			}
		System.out.println();
	}
	}

}
