package interview.leetcode;

import java.util.Arrays;

public class Awstest1 {

	public static int[] sortEvenOdd(int[] nums) {

		int even[] = new int[nums.length];
		int odd[] = new int[nums.length];

		int evenlen = 0;
		int oddlen = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				even[evenlen++] = nums[i];

			} else {
				odd[oddlen++] = nums[i];
			}
		}

		Arrays.sort(even, 0, evenlen);
		Arrays.sort(odd, 0, oddlen);

		int nums2[] = new int[nums.length];

		for (int i = 0, even1 = 0, odd1 = oddlen; i < nums.length; i++) {
			if (i % 2 == 0) {

				nums2[i] = even[even1++];
			} else {
				nums2[i] = odd[--odd1];

			}
		}

		return nums2;

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(
				sortEvenOdd(new int[] { 5, 39, 33, 5, 12, 27, 20, 45, 14, 25, 32, 33, 30, 30, 9, 14, 44, 15, 21 })));
	}

}
