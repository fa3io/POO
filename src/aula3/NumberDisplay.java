package aula3;

public class NumberDisplay {
	
	private int limite;
	private int value;
	

	public NumberDisplay() {
	}
	public NumberDisplay(int limite, int value) {
		setLimite(limite);
		setValue(value);
	}



	public boolean incZerar(){
		boolean retorno = false;
		
		if(value < limite){
			retorno = false;
			value ++;
		}else if(value == limite){
			retorno = true;
			value = 0;
		}
		return retorno;
		
	}
	
	@Override
	public String toString() {
		return (value < 10 ) ? "0"+ value : String.valueOf(value);
	}
	
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		if(limite < 0 ){
			throw new RuntimeException("Valoe Inválido para Limite!");
		}
		this.limite = limite;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		if(limite < 0 ){
			throw new RuntimeException("Valor Inválido!");
		}
		this.value = value;
	}
}