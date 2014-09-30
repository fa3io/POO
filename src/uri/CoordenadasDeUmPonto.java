package uri;

import java.util.Locale;
import java.util.Scanner;

public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double x ,y;
		Scanner teclado = new Scanner (System.in);
		
		x = teclado.nextDouble();
		y = teclado.nextDouble();
		
		if(x == 0){
			if(y == 0){
				System.out.printf("Origem\n");
			}else{
				System.out.printf("Eixo Y\n");
			}
			
		}else if(x > 0){
			if(y == 0){
				System.out.printf("Eixo X\n");
			}else if(y > 0){
				System.out.printf("Q1\n");
			}else{
				System.out.printf("Q4\n");
			}
		}else{
			if(y == 0){
				System.out.printf("Eixo X\n");
			}else if(y > 0){
				System.out.printf("Q2\n");
			}else{
				System.out.printf("Q3\n");
			}
		}
	}
}
