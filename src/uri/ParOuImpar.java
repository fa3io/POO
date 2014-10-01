package uri;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {

		int n,v;
		Scanner teclado = new Scanner(System.in);
		
		n = teclado.nextInt();
		
		for (int i = 0; i < n; i++) {
			v = teclado.nextInt();
			
			if(v == 0){
				System.out.println("NULL");
			}else if(v%2 == 0){
				if(v > 0 ){
					System.out.println("EVEN POSITIVE");
				}else{
					System.out.println("EVEN NEGATIVE");
				}
			}else {
				if(v > 0 ){
					System.out.println("ODD POSITIVE");
				}else{
					System.out.println("ODD NEGATIVE");
				}
			}
			
		}
		
		
	}
}
