package interview.given;

abstract class MyClass {
	private void desp1() {
		System.out.println("Parent class");
	}

	abstract public void desp2();

	abstract void desp3();

	abstract protected void desp4();

}

public class AbsClassQ1 extends MyClass {

	void desp2() {
		System.out.println("1");
	};

	void desp3() {
		System.out.println("2");
	}

	protected void desp4() {
		System.out.println("3");

	}

	public static void main(String[] args) {
		AbsClassQ1 abs = new AbsClassQ1();
	}

}
