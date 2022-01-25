package interview.given;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorQ1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("A");
		names.add("B");
		names.add("C");


		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.add("D");
			//names.add("C");
		}
		System.out.println(names);
	}

}
