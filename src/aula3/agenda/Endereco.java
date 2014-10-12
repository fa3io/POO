package aula3.agenda;

public class Endereco {

	private String logradouro;
	private String numero;
	private String completo;
	private String cep;
	
	public Endereco() {
	
	}
	
	public Endereco(String logradouro, String numero, String completo, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.completo = completo;
		this.cep = cep;
	}



	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCompleto() {
		return completo;
	}

	public void setCompleto(String completo) {
		this.completo = completo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
