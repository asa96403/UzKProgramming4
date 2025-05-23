package excercise3;

public class Lamp implements Switchable, Dimmable{
	private boolean on;
	private int brightness;

	@Override
	public void turnOn() {
		this.on=true;
		
	}

	@Override
	public void turnOff() {
		this.on=false;
	}

	@Override
	public boolean isOn() {
		return on;
	}
	
	/**
	 * sets the brightness to the given value, ensures brightness is between 0 and MAX_BRIGHTNESS, can only be changed when lamp is on
	 * @param level The brightness level to set the lamp to
	 * @author aabert 
	 */
	@Override
	public void setBrightness(int level) {
		if(0<=level && level<=MAX_BRIGHTNESS) {
			if(isOn()==true) {
				this.brightness=level;
			}
			else {
				System.err.println("The lamp has to be on when changing the brightness!");
			}
		} else {
			System.err.println("The light level has to be between 0 and " + MAX_BRIGHTNESS);
		}
		//auch möglich: brightness = Math.max(0, Math.min(MAX_BRIGHTNESS , level));
	}
	
	@Override
	public int getBrightness() {
		return brightness;
	}

}
