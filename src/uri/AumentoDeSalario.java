
package uri;

import java.util.Locale;
import java.util.Scanner;


public class AumentoDeSalario {
    
    
    
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
        Double salario, salarioNovo = 0.0;
        int reajuste = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        
        salario = teclado.nextDouble();
        

        
        if(salario > 0 || salario < 400.00 ){
            reajuste = 15;
            salarioNovo = salario + ((salario *reajuste)/ 100);
        }else if(salario > 400.01 || salario < 800.00 ){
            reajuste = 12;
            salarioNovo = salario + ((salario *reajuste)/ 100);
        }else if(salario > 800.01 || salario < 1200.00 ){
            reajuste = 10;
            salarioNovo = salario + ((salario *reajuste)/ 100);
        }else if (salario > 1200.01 || salario < 2000.00 ) {
            reajuste = 7;
            salarioNovo = salario + ((salario *reajuste)/ 100);
        }else if(salario > 2000.00){
            reajuste = 4;
            salarioNovo = salario + ((salario *reajuste)/ 100);
        }
        

        System.out.printf("Novo salario: %.2f\n",salarioNovo);
        System.out.printf("Reajuste ganho:  %.2f\n", ((salario*reajuste)/100));
        System.out.println("Em percentual:  "+reajuste+"%\n");
    }
    
}
