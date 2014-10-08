package uri;

import java.util.Scanner;


public class MenorEPosicao {

	public static void main(String[] args) throws Exception {
		
		Scanner teclado = new Scanner(System.in);
		int tamanho,numero, posicao = 0;
		int menor = 0;
		
		tamanho = teclado.nextInt();
		
		int[] vetor = new int[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			
			vetor [i] = teclado.nextInt();

			if(i == 0){
				menor = vetor[i];
			}else if(vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			}
			
		}
		System.out.printf("Menor valor: %d\n", menor);
		System.out.printf("Posicao: %d\n",posicao);
	}

}
