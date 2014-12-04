package aula6;

public class Carro {
	
	private String modelo;
	private String marca;
	private Integer nPortas;
	private String chassi;
	
	
	@Override
	public String toString() {
		return getModelo() +" "+ getMarca() +" "+getChassi();
	}
	public Carro(String modelo, String marca, Integer nPortas, String chassi) {
		this.modelo = modelo;
		this.marca = marca;
		this.nPortas = nPortas;
		this.chassi = chassi;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getnPortas() {
		return nPortas;
	}
	public void setnPortas(Integer nPortas) {
		this.nPortas = nPortas;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	

}
