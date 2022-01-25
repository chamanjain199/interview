package interview.img;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {

	public static void main(String[] args) {

		List<String> city = new ArrayList<>();
		city.add("a");
		city.add("a");
		city.add("a");
		city.add("a");
		
		List<String> city2 = new ArrayList<>();
		city2.add("a");
		
		city.removeAll(city2);
		System.out.println(city);
	}

}
