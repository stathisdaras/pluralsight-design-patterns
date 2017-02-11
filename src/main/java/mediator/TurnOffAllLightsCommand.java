package mediator;

import command.Command;

/**
 * Concrete command
 * <p>
 * Created by stathis on 14/1/2017.
 */
public class TurnOffAllLightsCommand implements Command {

	private Mediator mediator;

	public TurnOffAllLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}
}
