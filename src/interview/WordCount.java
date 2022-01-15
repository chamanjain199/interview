package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {

		String str="A A b b e r a c b A";
		String arr[]=str.split(" ");
		List<String> listStr=Arrays.asList(arr);
		
		Map<Object, Long> m=listStr.stream().collect(Collectors.groupingBy(a->a, Collectors.counting()));
		System.out.println(m);
		Map<Object, Long> m2=listStr.stream().collect(Collectors.groupingBy(UnaryOperator.identity(), Collectors.counting()));
		

	}

}
