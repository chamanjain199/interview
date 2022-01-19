package interview.ds;

import java.util.Stack;

public class QueueViaStack {

	Stack<Integer> pushStack, popStack;

	QueueViaStack() {
		pushStack = new Stack<>();
		popStack = new Stack<>();
	}

	public int size() {
		return pushStack.size() + popStack.size();
	}

	public void push(int val) {
		pushStack.push(val);
	}

	void shiftEleemnt() {
		if (popStack.isEmpty()) {
			while (!pushStack.isEmpty()) {
				popStack.push(pushStack.pop());

			}
		}
	}

	public int pop() {
		shiftEleemnt();
		return popStack.pop();
	}

	public static void main(String[] args) {
		QueueViaStack queueViaStack = new QueueViaStack();
		queueViaStack.push(1);
		queueViaStack.push(2);
		queueViaStack.push(3);
		System.out.println(queueViaStack.pop());
		System.out.println(queueViaStack.pop());
		System.out.println(queueViaStack.pop());
		System.out.println(queueViaStack.pop());

	}
}
