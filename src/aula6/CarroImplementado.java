package aula6;



public class CarroImplementado {
	
	private String modelo;
	private String marca;
	private Integer nPortas;
	private String chassi;
	
	@Override
	public String toString() {
		return getModelo() +" "+ getMarca() +" "+getChassi();
	}
	
	
	
	public CarroImplementado(String modelo, String marca, Integer nPortas,String chassi) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.nPortas = nPortas;
		this.chassi = chassi;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarroImplementado other = (CarroImplementado) obj;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		return true;
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
