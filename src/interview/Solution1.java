package interview;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

	public static int solution(String S) {

		char chars[] = S.toCharArray();

		List<Integer> subStrings = new ArrayList<>();

		char firstChar = chars[0];
		int count = 1;
		int subStringwithMaxSize = 0;
		for (int i = 1; i < chars.length; i++) {
			if (firstChar == chars[i]) {
				count++;
			} else {

				subStrings.add(count);
				if (count > subStringwithMaxSize) {
					subStringwithMaxSize = count;
				}
				count = 1;
			}
			firstChar = chars[i];
		}
		if (count > subStringwithMaxSize) {
			subStringwithMaxSize = count;
		}
		subStrings.add(count);

		int result = 0;
		for (Integer integer : subStrings) {
			result += subStringwithMaxSize - integer;
		}
		return result;

	}

	public static void main(String[] args) {

		System.out.println(solution("aabbcc"));
	}

}
