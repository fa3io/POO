
package uri;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {
    
    public static void main(String[] args) {
                Locale.setDefault(Locale.US);
		
		int a, b,c,d, dif;
                
		Scanner teclado = new Scanner(System.in);
                
                a = teclado.nextInt();
                b = teclado.nextInt();
                c = teclado.nextInt();
                d = teclado.nextInt();
           
                dif = ((a*b)-(c*d));
               
                System.out.printf("DIFERENCA = %d\n", dif);
    }  
}
