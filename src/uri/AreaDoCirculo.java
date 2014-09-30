package uri;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
		double pi =  3.14159;
		double raio = teclado.nextDouble();
		double area;
		
		area = pi * (raio * raio);
		System.out.printf("A=%.4f\n",area);
		 

	
	}

}
