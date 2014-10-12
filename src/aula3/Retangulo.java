package aula3;

public class Retangulo {

	private double largura;
	private double altura;


	public Retangulo() {
		this.largura = 1.0;
		this.altura = 1.0;
		
	}
	public double area() {
		double area = this.largura * this.altura;
		return area;

	}
	public double perimetro(){
		double perimetro = (2 * this.altura)+(2 * this.largura);
		return perimetro;
	}

	public String toString() {
	String retangulo = "Retangulo com Altura: " + getAltura()+", Largura: " + getLargura();
	return retangulo;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		
		if ((largura <= 0) || (largura >= 20)){
			throw new IllegalArgumentException("Valor  Inserido em Campo Largura Inválido: " + largura );
		}else{
			this.largura = largura;
		}
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {

		if ((altura <= 0) || (altura >= 20) ){
			throw new IllegalArgumentException("Valor Inserido em Campo Altura Inválido: " + altura );
		}else{
			this.altura = altura;
		}
		
		
	}
}
