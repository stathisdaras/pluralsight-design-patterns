package command;

/**
 * Receiver
 *
 * Created by stathis on 6/1/2017.
 */
public class Light {

	private boolean isOn = false;

	public boolean isOn() {
		return isOn;
	}

	public void toggle() {
		if (isOn) {
			off();
		} else {
			on();
		}
		isOn = !isOn;
	}

	public void on() {
		System.out.println("Light.on");
	}

	public void off() {
		System.out.println("Light.off");
	}
}
