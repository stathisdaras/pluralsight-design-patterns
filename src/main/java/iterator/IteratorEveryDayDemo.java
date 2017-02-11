package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stathis on 14/1/2017.
 */
public class IteratorEveryDayDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("stathis");
		names.add("cubbies");
		names.add("kota");

		//Iterator<String> stringIterator = names.iterator();

		/*while (stringIterator.hasNext()) {
			String name = stringIterator.next();
			System.out.println("name = " + name);
			stringIterator.remove();
		}*/

		for (String name : names) {
			System.out.println("name = " + name);

		}

		System.out.println("List size= " + names.size());

	}

}
