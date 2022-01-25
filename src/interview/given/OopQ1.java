package interview.given;

class A {
	public void print() {
		System.out.println("Printing A");
	}
}

class B extends A {
	public void print() {
		System.out.println("Printing B");
	}
}

class C extends B {
	public void print() {
		super.print();
		System.out.println("Printing C");
	}
}

public class OopQ1 {

	public static void main(String[] args) {

		C c=new C();
		c.print();
	}

}
