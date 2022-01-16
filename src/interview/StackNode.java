package interview;

public class StackNode {
	int value;
	Node top;
	Node bottom;
	int capacity;
	int size;

	public StackNode(int value, Node top, Node bottom) {
		super();
		this.value = value;
		this.top = top;
		this.bottom = bottom;
	}

	public StackNode(int capacity) {

		this.capacity = capacity;
	}

	void push(int value) {
		if (!isFull()) {
			Node newNode = new Node(value, null, null);
			if (isEmpty()) {
				bottom = newNode;
			} else {
				top.next = top;
				newNode.prev = top;
			}
			top = newNode;
			size++;
		} else {
			System.out.println("Stack is full");
		}
	}

	int pop() {
		if (!isEmpty()) {
			Node node = top;
			top = top.prev;
			size--;
			return node.value;
		} else {
			System.out.println("Stack is full");
		}
		return -1;
	}

	int removeBottom() {
		if (!isEmpty()) {
			Node node = bottom;
			bottom = bottom.next;
			size--;
			return node.value;
		} else {
			System.out.println("Stack is empty");
		}
		return -1;
	}

	boolean isEmpty() {
		return size == 0;
	}

	boolean isFull() {
		return size == capacity;
	}
}
