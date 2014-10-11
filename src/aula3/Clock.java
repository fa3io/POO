package aula3;

public class Clock {
	
	static ClockDisplay display;
	
	public void exec() throws InterruptedException{
		
		display = new ClockDisplay();
		
		while (true) {
			System.out.println(display);
			display.tickTime();
			Thread.sleep(1000);
			
		}
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Clock relogio = new Clock();
		relogio.exec();
		
	}

}
