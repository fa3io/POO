package uri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ida_a_Feira {

	public static void main(String[] args) {
		
		int nIdas, produtoDisponivel, qtdProdutosComprados , quantidade;
		Map<String , Double> mapaDeCompras = new HashMap<>();
		String nome;
		Double preco, total = 0.0;
		
		Scanner teclado = new Scanner(System.in);
		
		nIdas = teclado.nextInt();
		
		for (int i = 0; i < nIdas; i++) {
			produtoDisponivel = teclado.nextInt();
			
			for (int j = 0; j < produtoDisponivel; j++) {
				nome = teclado.next();
				preco = teclado.nextDouble();
				mapaDeCompras.put(nome, preco);
			}
			qtdProdutosComprados = teclado.nextInt();
			for (int j = 0; j < qtdProdutosComprados; j++) {
				nome = teclado.next();
				quantidade = teclado.nextInt();
				total += mapaDeCompras.get(nome) * quantidade;
			}
			System.out.println("R$ "+ total);
		}
	}
}
