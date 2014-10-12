package aula3;

import java.util.ArrayList;
import java.util.List;

public class ArranjosListas {
	
	String[] palavras = new String[10];
	int[] numeros = new int[10];
	List<Object> listaNomes = new ArrayList<Object>();
	
	
	public void testaArrays(){
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
			palavras[i] = "Pessoa  " + i + " do Array"; 
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero " + numeros[i] + " do Array ");
			System.out.println(palavras[i]);
		}
	}
	public void testaLista(){
		for (int i = 0; i < 10; i++) {
			listaNomes.add("Pessoa " + i +" da Lista");
			
		}
		for (int i = 0; i < listaNomes.size(); i++) {
			String posicao = (String) listaNomes.get(i);
			System.out.println(posicao);

		}
	}
	public static void main(String[] args) {
		ArranjosListas arranjos = new ArranjosListas();
		arranjos.testaArrays();
		arranjos.testaLista();
	}

}
