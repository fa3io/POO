package aula1;

import java.util.Scanner;

public class ExercicioSimples11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2, resultado;
		String operacao;

		System.out.println("Digite a operacaoo que deseja realizar: ");
		System.out.println("+ = Adicaoo");
		System.out.println("- = Subtracao");
		System.out.println("* = Muntiplicacao");
		System.out.println("/ = Divisao ");
		System.out.println("_______________________________________");
		operacao = scanner.nextLine();
		System.out.println("Digite o 1 Numero:");
		numero1 = scanner.nextInt();
		System.out.println("Digite o 2 Numero:");
		numero2 = scanner.nextInt();
		System.out.println("_______________________________________");

		if (operacao.equals("+")) {
			System.out.println(soma(numero1, numero2));
		} else if (operacao.equals("-")) {
			System.out.println(subtracao(numero1, numero2));
		} else if (operacao.equals("*")) {
			System.out.println(multiplicacao(numero1, numero2));
		} else if (operacao.equals("/")) {
			System.out.println(divisao(numero1, numero2));
		} else {
			System.out.println("Operacao escolhida eh invalida!");
		}
	}

	private static int divisao(int numero1, int numero2) {
		if(numero1 < numero2){
                    return 0;
                }else{
                    return 1 + divisao(numero1 - numero2, numero2);
                    
                }
	}

	private static int multiplicacao(int numero1, int numero2) {
		if(numero2 == 1){
			return numero1;
		}else {
                    return numero1 + multiplicacao(numero1, numero2 - 1);
		} 
	}

	private static int subtracao(int numero1, int numero2) {
            if(numero2 == 0){
                return numero1;
            }else{
               return subtracao(numero1, numero2 - 1) - 1;
            }
	}

	private static int soma(int numero1, int numero2) {
		if(numero2 == 0){
			return numero1 ;
		
		}else {
                    return soma(numero1, numero2 - 1)+ 1;
		}
		
	}
}
