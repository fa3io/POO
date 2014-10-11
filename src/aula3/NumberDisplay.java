package aula3;

public class NumberDisplay {
	
	private int limite;
	private int value;
	

	public NumberDisplay() {
	}
	public NumberDisplay(int limite, int value) {
		this.limite = limite;
		this.value = value;
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
	return value+"";
	}
	
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	

}
