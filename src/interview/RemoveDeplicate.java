package interview;

import java.util.Arrays;

public class RemoveDeplicate {
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {1,2,3,3,4,4,5,5,5,6,6};
		int temp[]=new int[arr.length];

		int index=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.println("jj");
				temp[index++]=arr[i];
			}
		}
		temp[index++]=arr[arr.length-1];
		
		for (int i = 0; i < index; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("hi");
		Arrays.toString(temp);
	}

}
