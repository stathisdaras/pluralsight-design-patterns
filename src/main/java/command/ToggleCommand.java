package command;

/**
 * Concrete command
 * <p>
 * Created by stathis on 6/1/2017.
 */
public class ToggleCommand implements Command {

	private Light light;

	public ToggleCommand(Light light) {
		this.light = light;
	}

	@Override public void execute() {
		light.toggle();
	}
}
