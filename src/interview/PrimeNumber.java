package interview;

public class PrimeNumber {
	
	
	
	public static void main(String[] args) {
		System.out.println(isPrime(9));
	}

	private static boolean isPrime(int num) {
		for (int j = 2; j <=num/2; j++) {
			if(num%j==0) {
				return false;
			}
		}
		return true;
	}

}
