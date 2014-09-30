package uri;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int a;
		double  b,c, total;
		Scanner teclado = new Scanner(System.in);

		a = teclado.nextInt();
		
		if(a == 1){
			c = 4.00;
		}else if(a==2){
			c = 4.50;
		}else if(a ==3){
			c = 5.00;
		}else if(a == 4){
			c = 2.00;
		}else if(a ==5){
			c =1.50;
		}else{
			c = 0;
		}
		b = teclado.nextDouble();

		total = c * b ;
		System.out.printf("Total: R$ %.2f\n", total);
	}

}
