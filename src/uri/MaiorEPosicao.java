package uri;

import java.util.Scanner;

public class MaiorEPosicao {

	public static void main(String[] args) {
		
		int n, p = 0, maior = 0;
		Scanner teclado = new Scanner(System.in);
		

		
		for (int i = 1; i <= 10; i++) {
			

			n = teclado.nextInt();
			if(n >  maior){
				maior = n;
				p = i;
			}
			
		}
		System.out.println(maior);
		System.out.println(p);
		

	}

}
