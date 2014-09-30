package uri;

import java.util.Locale;
import java.util.Scanner;

public class Media_2 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
			
			double a ,b, c, media ;
			Scanner teclado = new Scanner (System.in);
			
			a = teclado.nextDouble();
			b = teclado.nextDouble();
			c = teclado.nextDouble();
			
			 media = ((a * 2f) + (b * 3f) + (c * 5f)) / 10;
	         
	         System.out.printf("MEDIA = %.1f\n", media);
			

	}

}
