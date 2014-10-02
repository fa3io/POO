package uri;

import java.util.Scanner;

public class Main {

static long fibo(int numero) {
		
		int nAtual = 0; // atual
		int antnAnterior = 0; // anterior
		
		for (int i = 1; i <= numero; i++) {
			if (i == 1) {
				nAtual = 1;
				antnAnterior = 0;
			} else {
				nAtual += antnAnterior;
				antnAnterior = nAtual - antnAnterior;
			}
		}
		return nAtual;
	}

	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		int numero;

		numero = scanner.nextInt();

		for (int i = 0; i < numero; i++) {
			if(i == (numero-1)){
			System.out.print(Main.fibo(i));
			}else{
				System.out.print(Main.fibo(i)+" ");	
			}
			}
		}
	}


