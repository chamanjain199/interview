package interview;

import java.util.ArrayList;
import java.util.List;

public class BuildArray {
	public static List<String> buildArray(int[] target, int n) {
		List<String> list = new ArrayList<>(n*2);

		int count = 1;
		int len=target.length;

		for (int i = 0; i <len; i++) {

			if (target[i] != count) {

				while (count < target[i]) {
					list.add("Push");
					list.add("Pop");
					count++;
				}

			}

			list.add("Push");

			count++;

		}
		System.gc();
		return list;

	}

	public static void main(String[] args) {

		System.out.println(buildArray(new int[] { 1, 3, 4, 6 }, 6));

	}

}
