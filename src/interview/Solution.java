package interview;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public static int solution(String S) {
		String arr[] = S.split("");
		String temp = arr[0];
		TreeSet<Integer> list = new TreeSet<>();
		for (int i = 1; i < arr.length; i++) {
			String value = temp + arr[i];
			int finalValue = Integer.valueOf(value);
			list.add(finalValue);
			temp = arr[i];
		}
	
		return list.last();
	}

	public static void main(String[] args) {
		System.out.println(solution("50552"));
	}
}
