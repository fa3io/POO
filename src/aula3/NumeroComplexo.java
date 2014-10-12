package aula3;

import java.text.DecimalFormat;

public class NumeroComplexo {

	private Double real;
	private Double imaginaria;
	 DecimalFormat df = new DecimalFormat("##0");

	public NumeroComplexo() {

	}

	public NumeroComplexo(double real, double imaginaria) {
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public NumeroComplexo soma(NumeroComplexo numero) {
		NumeroComplexo retorno = new NumeroComplexo();

		retorno.setReal(this.real + numero.getReal());
		retorno.setImaginaria(this.imaginaria + numero.getImaginaria());

		return retorno;
	}

	public NumeroComplexo subtrai(NumeroComplexo numero) {
		NumeroComplexo retorno = new NumeroComplexo();

		retorno.setReal(this.real - numero.getReal());
		retorno.setImaginaria(this.imaginaria - numero.getImaginaria());

		return retorno;
	}

	public Double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public Double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}

	@Override
	public String toString() {
		if(getImaginaria() < 0 ){
			return df.format(getReal())+ "+(" + df.format(getImaginaria()) + "i)";
		}else{
			return df.format(getReal())+ "+" + df.format(getImaginaria()) + "i";
		}
		
	}

}
