package interview.given;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamQ1 {

	public static void main(String[] args) {

		Stream<double[]> hackValue = IntStream.rangeClosed(1, 100).boxed().peek(x->System.out.println(x)).flatMap(a -> IntStream.range(a, 10)
				.mapToObj(b -> new double[] { a, b, Math.sqrt(a * a + b * b) }).peek(y->{System.out.println("pp"+ Arrays.toString(y));}).filter(t -> t[2] % 1 == 0));

		hackValue.limit(5).forEach(t -> System.out.println(t[0] + ", " + t[1] + " ," + t[2]));
		

	}

}
