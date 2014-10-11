package aula3;

public class ClockDisplay {

	private NumberDisplay hours;
	private NumberDisplay minutes;
	private NumberDisplay seconds;

	public ClockDisplay() {
	}

	public ClockDisplay(NumberDisplay hours, NumberDisplay minutes, NumberDisplay seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	
	public ClockDisplay(int hours, int minutes, int seconds) {
		this.hours.setValue(hours);
		this.minutes.setValue(minutes);
		this.seconds.setValue(seconds);
	}
	public void  tickTime(){
		if(seconds.incZerar()){
			if(minutes.incZerar()){
				hours.incZerar();
			}
		}	
	}
	
	public NumberDisplay getHours() {
		return hours;
	}

	public void setHours(NumberDisplay hours) {
		this.hours = hours;
	}

	public NumberDisplay getMinutes() {
		return minutes;
	}

	public void setMinutes(NumberDisplay minutes) {
		this.minutes = minutes;
	}

	public NumberDisplay getSeconds() {
		return seconds;
	}

	public void setSeconds(NumberDisplay seconds) {
		this.seconds = seconds;
	}
	
	@Override
	public String toString() {
		return hours.getValue() + ":"+minutes.getValue()+":"+seconds;
	}
	
	
	
	
	






}
