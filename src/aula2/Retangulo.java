package aula2;

public class Retangulo {

	private double largura;
	private double altura;
	private String cor;

	public Retangulo() {
		this.largura = 10.0;
		this.altura = 20.0;
		this.cor = "Verde";
	}

	public Retangulo(double largura, double altura) {
		this.largura = 10.0;
		this.altura = 20.0;
		this.cor = "Verde";
	}

	public Retangulo(double largura, double altura, String cor) {
		this.largura = largura;
		this.altura = altura;
		this.cor = cor;
	}

	public void area() {
		double area = this.largura * this.altura;
		System.out.println(area);

	}

	public String toString() {
	String retangulo = "Restangulo com Altura: " + getAltura()+", Largura: " + getLargura() + " e cor " + getCor();
	return retangulo;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
