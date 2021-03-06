package behavioral.chainofresponsibility;

/**
 * Created by stathis on 2/1/2017.
 */
public abstract class Handler {

	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(Request request);

}