package aula3;

public class Circulo {

	
	private double cx;
	private double cy;
	private double raio;
	
	public Circulo() {
	}

	public Circulo(double cx, double cy, double raio) {
		super();
		this.cx = cx;
		this.cy = cy;
		this.raio = raio;
	}

	public double getCx() {
		return cx;
	}

	public void setCx(double cx) {
		this.cx = cx;
	}

	public double getCy() {
		return cy;
	}

	public void setCy(double cy) {
		this.cy = cy;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [cx=" + cx + ", cy=" + cy + ", raio=" + raio + "]";
	}
	
	
}
