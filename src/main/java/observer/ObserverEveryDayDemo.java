package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by stathis on 27/1/2017.
 */
public class ObserverEveryDayDemo {

	public static void main(String[] args) {

		TwitterStrem stream = new TwitterStrem();

		Client c1 = new Client("c1");
		Client c2 = new Client("c2");

		stream.addObserver(c1);
		stream.addObserver(c2);

		stream.tweet();

	}
}

// subject
class TwitterStrem extends Observable {

	public void tweet() {
		setChanged();
		notifyObservers();
	}

}

// observer
class Client implements Observer {
	public String name;

	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Client.update");
	}
}
