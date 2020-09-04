package stack;

import java.util.EmptyStackException;
import java.util.Objects;

/**
 * Linked list based stack with only 3 logical operations of Stack. Peek(),
 * Pop() and Push();
 * 
 * @author Shiva
 *
 * @param <T>
 */
public class LinkedStack<T> {

	private Node<T> top;

	/**
	 * To push the data on the top of stack.
	 * 
	 * @author Shiva
	 * @param data
	 */
	public void push(T data) {

		Node<T> node = new Node<>(data);

		if (isEmpty()) {
			top = node;
			return;
		}

		node.setNext(top);
		top = node;
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
	public Node<T> pop() {
		if (isEmpty())
			throw new EmptyStackException();
		Node<T> node = top;
		top = top.next;
		return node;

	}

	/**
	 * To check whether the stack is empty or not.
	 * 
	 * @author Shiva
	 * @return
	 */
	public boolean isEmpty() {
		return Objects.isNull(top);
	}

	/**
	 * To print whole stack.
	 * 
	 * @author Shiva
	 * 
	 */
	public void print() {
		if (isEmpty())
			return;
		Node<T> node = top;
		while (node.getNext() != null) {
			System.out.println(node);
			node = node.getNext();
		}
		System.out.println(node);
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
	public Node<T> peek() {

		if (isEmpty())
			throw new EmptyStackException();

		return top;

	}
}

class Node<T> {
	Node<T> next;
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}