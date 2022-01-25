package interview.leetcode;

import java.util.Arrays;

public class Test1 {

	public static int minimumCost(int[] cost) {

		Arrays.sort(cost);
		int sum = 0;
		int lastCandyPrice = 0;
		int count = 0;
		for (int i = cost.length - 1; i >= 0; i--) {
			if (count == 2) {
				count = 0;

				continue;
			} else {
				count++;
			}

			lastCandyPrice = cost[i];

			sum += lastCandyPrice;

		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println(minimumCost(new int[] {3,2,3 }));

	}

}
