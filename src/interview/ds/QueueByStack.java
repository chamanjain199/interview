package interview.ds;

import java.util.Arrays;

class Stack {
	int stackArray[];
	int top;

	public Stack(int size) {
		this.stackArray = new int[size];
		this.top = -1;

	}

	public void push(int val) {
		if (!isFull()) {
			stackArray[++top] = val;
		} else {
			System.out.println("Stack is Full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			return stackArray[top--];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == stackArray.length-1;
	}

	@Override
	public String toString() {
		return "Stack [stackArray=" + Arrays.toString(stackArray) + ", top=" + top + "]";
	}
	
	

}

public class QueueByStack {
	Stack enQueueStack;
	Stack deQueueStack;
	int top;
	int beginning;

	QueueByStack(int size) {
		enQueueStack = new Stack(size / 2);
		deQueueStack = new Stack(size / 2);
	}

	boolean isEmpty() {

		return deQueueStack.isEmpty() && enQueueStack.isEmpty();

	}

	boolean isFull() {

		return enQueueStack.isFull() && deQueueStack.isFull();

	}

	void enQueue(int val) {
		if (!isFull()) {
			if (enQueueStack.isFull()) {
				moveToDequeueStack();
			}
			enQueueStack.push(val);
			if (top == -1) {
				beginning = 0;
			}
			top++;
		} else {
			System.out.println("Queue is full");
		}

	}

	int deQueue() {
		if (!isEmpty()) {
			if (deQueueStack.isEmpty()) {
				moveToDequeueStack();
			}
			beginning--;
			return deQueueStack.pop();

		} else {
			System.out.println("Queue is Empty");
			return -1;
		}

	}

	private void moveToDequeueStack() {
		int size=enQueueStack.top;
		for (int i = 0; i <=size && !deQueueStack.isFull(); i++) {
			int val=enQueueStack.pop();
			//System.out.println("val "+val);
			deQueueStack.push(val);
		}

	}

	public static void main(String[] args) {
		QueueByStack queue = new QueueByStack(6);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		//System.out.println(queue.enQueueStack);
		queue.enQueue(4);
		//System.out.println(queue.deQueueStack);

		//System.out.println(queue.enQueueStack);

		queue.enQueue(5);
		queue.enQueue(6);
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());


	}

}
