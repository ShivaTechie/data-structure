package stack;

public class LinkedStackMain {

	public static void main(String[] args) {

		LinkedStack<Integer> linkedStack = new LinkedStack<>();

		linkedStack.push(1);
		linkedStack.push(2);
//		linkedStack.push(3);
//		linkedStack.push(4);
//		linkedStack.push(5);
//		linkedStack.push(6);

		System.out.println(linkedStack.peek());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.peek());
		System.out.println(linkedStack.pop());
//		System.out.println(linkedStack.peek());

	}
}
