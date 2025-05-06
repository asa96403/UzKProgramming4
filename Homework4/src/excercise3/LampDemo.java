package excercise3;

public class LampDemo {

	public static void main(String [] args) {
		Lamp lamp = new Lamp ();
		// turn on , set brightness , dim to half , print result
		System.out.println("Brightness: " + lamp.getBrightness());
		System.out.println("On: " + lamp.isOn() + "\n --set brightness--");
		lamp.setBrightness (80);
		System.out.println("Brightness: " + lamp.getBrightness());
		System.out.println("On: " + lamp.isOn()+ "\n --lamp on--");
		lamp.turnOn ();
		System.out.println("On: " + lamp.isOn()+ "\n --set brightness--");
		lamp.setBrightness (80);
		System.out.println("Brightness: " + lamp.getBrightness()+ "\n --dim to half--");
		lamp.dimToHalf ();
		System.out.println (" Brightness: " + lamp.getBrightness ());
		}
}
