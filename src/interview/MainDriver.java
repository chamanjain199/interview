package interview;

public class MainDriver {

	public static void main(String[] args) {
		SetOfStack setOfStack = new SetOfStack(3);
		setOfStack.push(1);
		setOfStack.push(2);
		setOfStack.push(3);
		setOfStack.push(4);
		setOfStack.push(5);
		setOfStack.push(6);
		setOfStack.push(7);
		setOfStack.push(8);

		System.out.println(setOfStack.popAt(0));
		System.out.println(setOfStack.popAt(0));
//		System.out.println(setOfStack.pop());
//		System.out.println(setOfStack.pop());
//		System.out.println(setOfStack.pop());
//		System.out.println(setOfStack.pop());
//		System.out.println(setOfStack.pop());
//		System.out.println(setOfStack.pop());

	}

}
