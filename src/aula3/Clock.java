package aula3;

public class Clock {
	
	public static void main(String[] args) {
		
		NumberDisplay horas = new NumberDisplay(23, 9);
		NumberDisplay minutos = new NumberDisplay(59, 58);
		NumberDisplay segundos = new NumberDisplay(59, 30);
		
		ClockDisplay clockDisplay = new ClockDisplay(horas, minutos, segundos);
		
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(clockDisplay.toString());
			clockDisplay.tickTime();
		}
		
		System.out.println(clockDisplay.toString());
		
		
		
		
	}

}
