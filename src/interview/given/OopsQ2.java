package interview.given;

class Base {
	int number;

	public Base(int i) {

		this.number = i;
	}
}

class Child extends Base {
	int count;

	public Child(int count, int num) {
		super(num);
		this.count = count;
	}

//	public Child(int count) {
//		this(count, 0);
//	}
	
//	public Child(int count) {
//		this.count = count;
//	}
	
//	public Child(int count) {
//		super(0);
//		this(count, 0);
//	}
}

public class OopsQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
