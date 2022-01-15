package interview;

public class LowCost {

	public static int cost(String s, int[] cost) {

		char chars[] = s.toCharArray();

		char c = chars[0];
		int max = cost[0];
		int totalResult = 0;
		int localTotal = cost[0];
		for (int i = 1; i < chars.length; i++) {
			if (c != chars[i]) {
				totalResult += localTotal - max;
				max = localTotal=cost[i];
			} else {
				localTotal +=cost[i];
				max = Math.max(max, cost[i]);
			}
			c = chars[i];

		}
		totalResult += localTotal - max;


		return totalResult;
	}

	public static void main(String[] args) {
		// abccbd

		System.out.println(cost("bbbaaa", new int[] { 4, 9, 3, 8, 8, 9 }));
	}

}
