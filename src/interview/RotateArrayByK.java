package interview;

import java.util.Arrays;


public class RotateArrayByK {

	public static void main(String[] args) {

		int array[]=new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		
		int rotateBy=2;
		int arrayLen=array.length;
		array=reverseArray(array, 0, arrayLen-1);
		System.out.println(Arrays.toString(array));

		array=reverseArray(array, 0, arrayLen-rotateBy-1);
		System.out.println(Arrays.toString(array));
		array=reverseArray(array, arrayLen-rotateBy, arrayLen-1);
		System.out.println(Arrays.toString(array));

		
	}
	
	public static int[] reverseArray(int arrs[],int start,int end){
		
		
		while (start <=end) {
			
			int temp=arrs[start];
			arrs[start]=arrs[end];
			arrs[end]=temp;
			
			start++;
			end--;
			
		}
		
		return arrs;
		
	}

}
