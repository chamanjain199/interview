package interview;

import java.util.ArrayList;

public class SetOfStack {

	ArrayList<StackNode> setOfStack = new ArrayList<>();
	int capacity;

	public SetOfStack(int capacity) {
		this.capacity = capacity;
	}

	public void push(int value) {

		StackNode stackNode = getStackNode();
		if (stackNode != null && !stackNode.isFull()) {
			stackNode.push(value);
		} else {
			stackNode = new StackNode(capacity);
			stackNode.push(value);
			setOfStack.add(stackNode);
		}
	}

	public int pop() {

		StackNode stackNode = getStackNode();
		if (stackNode == null) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int value = stackNode.pop();
			if (stackNode.isEmpty()) {
				setOfStack.remove(setOfStack.size() - 1);
			}
			return value;
		}
	}

	public int shiftLeft(int index, boolean isRemoveable) {

		
		StackNode stackNode = setOfStack.get(index);
		
		int value;
		if (isRemoveable) {
			value = stackNode.pop();
		} else {
			value = stackNode.removeBottom();
		}

		if (stackNode.isEmpty() && index == setOfStack.size() - 1) {
			setOfStack.remove(index);
		} else if(index < setOfStack.size()-1 ){
			int nextValue = shiftLeft(index + 1, false);
			stackNode.push(nextValue);
		}
		return value;

	}

	public int popAt(int index) {

		return shiftLeft(index, true);

	}

	StackNode getStackNode() {
		if (setOfStack.isEmpty()) {
			return null;
		} else {
			return setOfStack.get(setOfStack.size() - 1);
		}
	}

}
