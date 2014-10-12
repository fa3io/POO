package aula3;

public class TesteRetangulo {
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		
		//Mostra valor de inicialização 
		System.out.println(retangulo);
		
		//Seta dados de acordo com a regra de negocio
		retangulo.setAltura(7);
		retangulo.setLargura(3);
		
		//Mostra medidas alteradas
		System.out.println(retangulo);
		
		//Metodos para calculo de Area e Perimetro
		System.out.println(retangulo.area());
		System.out.println(retangulo.perimetro());
		
		//Tentando Inserir Valor Ilegal
		retangulo.setLargura(20);
	}

}
