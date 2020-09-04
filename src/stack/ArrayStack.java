package stack;

import java.util.EmptyStackException;

/**
 * Array based stack with only 3 logical operations of Stack. Peek(), Pop() and
 * Push();
 * 
 * @author Shiva
 *
 */
public class ArrayStack {

	private int top;

	private int[] stack;

	/**
	 * Creates the empty stack with the prefixed size of capacity
	 * 
	 * @param capacity
	 */
	public ArrayStack(int capacity) {

		stack = new int[capacity];
	}

	/**
	 * To push the data into the top of the stack. If the array size becomes greater
	 * than the fixed size then this method resizes the array and copies the data
	 * from old stack in to the new stack with double of length.
	 * 
	 * @author Shiva
	 * @param data
	 */
	public void push(int data) {

		if (top == stack.length) {

			int[] newStack = new int[2 * stack.length];
			System.arraycopy(stack, 0, newStack, 0, stack.length);
			stack = newStack;
		}

		stack[top++] = data;
	}

	/**
	 * This method is used to pop the data from stack and remove it from the stack.
	 * If you want to just check the data from stack use {@link #peek} method.
	 * 
	 * @author Shiva
	 * @return
	 * 
	 * @throws EmptyStackException
	 */
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return stack[--top];
	}

	/**
	 * To just print the top data of the stack. This method does not remove the data
	 * from stack. if you want to remove the data from the stack use {@link #pop}
	 * method.
	 * 
	 * @author Shiva
	 * @return
	 * @throws EmptyStackException
	 */
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top - 1];
	}

	/**
	 * To check whether the stack is empty or not.
	 * 
	 * @author Shiva
	 * @return
	 */
	public boolean isEmpty() {
		return top == 0;
	}

	/**
	 * This methods prints the whole stack.
	 * 
	 * @author Shiva
	 */
	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
