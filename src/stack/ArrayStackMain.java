package stack;

public class ArrayStackMain {

	public static void main(String[] args) {

		ArrayStack arrayStack = new ArrayStack(10);
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(5);

		arrayStack.printStack();
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.peek());

	}
}
