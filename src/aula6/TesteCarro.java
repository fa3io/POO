package aula6;

import java.util.HashMap;
import java.util.Map;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		//Criando carros não implementados
		
		Carro carro1 = new Carro("GOL", "VOLKS", 2, "XYZ20");
		Carro carro2 = new Carro("GOLF GTI", "VOLKS", 4, "FFF3");
		Carro carro3 = new Carro("X4", "BMW", 4, "ZZZ3");
		Carro carro1Clone = new Carro("GOL", "VOLKS", 2, "XYZ20");
		
		//Criando carros Implementados
		
		CarroImplementado iCarro1 = new CarroImplementado("GOL", "VOLKS", 2, "XYZ20");
		CarroImplementado iCarro2 = new CarroImplementado("GOLF GTI", "VOLKS", 4, "FFF3");
		CarroImplementado iCarro3 = new CarroImplementado("X4", "BMW", 4, "ZZZ3");
		CarroImplementado iCarro1Clone = new CarroImplementado("GOL", "VOLKS", 2, "XYZ20");
		
		
		// gerando nossos HashMaps
		
		HashMap<String, Carro> carros = new HashMap<String, Carro>();
		Map<String, CarroImplementado> carrosImplementados = new HashMap<String, CarroImplementado>();
		
		
		// Inserindo os Carros
		carros.put("1", carro1);
		carros.put("2", carro2);
		carros.put("3", carro3);
		carros.put("4", carro1Clone);
		
		//Inserindo CarrosImplementados
		carrosImplementados.put("1", iCarro1);
		carrosImplementados.put("2", iCarro2);
		carrosImplementados.put("3", iCarro3);
		carrosImplementados.put("4", iCarro1Clone);
		
		
		System.out.println("CARROS SEM IMPLEMENTAÇÃO DE HASHCODE E EQUALS (ACEITOU REPETIÇÃO)\n");
		for (String Key : carros.keySet()) {
			System.out.println(carros.get(Key));
		}
		System.out.println("\nCARROS COM IMPLEMENTAÇÃO DE HASHCODE E EQUALS (NÃO ACEITOU REPETIÇÃO)\n");
		for (String Key : carrosImplementados.keySet()) {
			System.out.println(carrosImplementados.get(Key));
		}
	}
}
