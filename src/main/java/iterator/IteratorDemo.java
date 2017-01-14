package iterator;

import java.util.Iterator;

/**
 * Created by stathis on 14/1/2017.
 */
public class IteratorDemo {
	public static void main(String[] args) {

		BikeRepositoryRepo repo = new BikeRepositoryRepo();

		repo.addBike("bike1");
		repo.addBike("bike2");
		repo.addBike("bike3");

		//Iterator<String> bikeIterator = repo.iterator();

		/*while (bikeIterator.hasNext()) {
			System.out.println("bikeIterator.next() = " + bikeIterator.next());
		}*/

		for (String bike : repo) {
			System.out.println("bike = " + bike);
		}

	}
}
