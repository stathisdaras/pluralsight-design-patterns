package command;

/**
 * Concrete command
 * <p>
 * Created by stathis on 6/1/2017.
 */
public class OnCommand implements Command {

	private Light light;

	public OnCommand(Light light) {
		this.light = light;
	}

	@Override public void execute() {
		light.on();
	}
}
