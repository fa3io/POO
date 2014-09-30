package uri;

import java.util.Locale;
import java.util.Scanner;

public class Media_1 {
	
	public static void main(String[] args) {
		
		 Locale.setDefault(Locale.US);
		
		double a ,b, media ;
		Scanner teclado = new Scanner (System.in);
		
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		
		 media = ((a * 3.5f) + (b * 7.5f)) / 11;
         
         System.out.printf("MEDIA = %.5f\n", media);
		
		
	}

}
