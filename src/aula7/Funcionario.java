package aula7;

public class Funcionario extends Pessoa {
	
	private String codigo;
	private double salario;

	public Funcionario() {
	
	}
	
	public Funcionario(String codigo, double salario) {
		super();
		this.codigo = codigo;
		this.salario = salario;
	}



	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return getId() +" - "+getNome()+" Codigo: "+getCodigo();
	}
}
