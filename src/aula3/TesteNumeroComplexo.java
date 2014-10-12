package aula3;

public class TesteNumeroComplexo {

	NumeroComplexo numero1 = new NumeroComplexo(10, 5);
	NumeroComplexo numero2 = new NumeroComplexo(7, 8);
	
	public static void main(String[] args) {
		

		NumeroComplexo numero1 = new NumeroComplexo(10, 5);
		NumeroComplexo numero2 = new NumeroComplexo(7, 8);
		
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		NumeroComplexo numero3 = numero1.soma(numero2);
		NumeroComplexo numero4 = numero1.subtrai(numero2);
		
		System.out.println("Resultado de soma: "+ numero3);
		System.out.println("Resultado da subtração: "+ numero4);
	}
}
