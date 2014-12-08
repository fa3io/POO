package uri;

import java.util.Scanner;

public class Aritmetica_Primaria {
	
	public static void main(String[] args) {
		
		String numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		int[] a, b;
		char[] c,d;
		int cont = 0;
		
		
		numero1 = teclado.next();
		numero2 = teclado.next();
		
		
		System.out.println("Indice vazio: " + numero1.lastIndexOf(" "));	
		
		
		if(numero1.length() > numero2.length()){
			a = new int[numero1.length()];
			b = new int[numero1.length()];
		}else {
			a = new int[numero2.length()];
			b = new int[numero2.length()];
		}
		
		c = numero1.toCharArray();
		d = numero2.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			a[i] = Integer.parseInt(String.valueOf(c[i])); ;
			b[i] = Integer.parseInt(String.valueOf(d[i]));
			
			System.out.println(a[i]);
			System.out.println(b[i]);

			if((a[i] + b[i]) > 9){
				cont +=1;
				
			}
		}
		System.out.println("--------------");
		System.out.println(cont);
		
		
	}

}
