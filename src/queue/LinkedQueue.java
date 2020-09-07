package queue;

import java.util.Objects;

public class LinkedQueue<T> {

	private Node<T> front;
	private Node<T> back;

	/**
	 * Adds data to the very end of the linked queue.
	 * 
	 * @author Shiva
	 * @param data
	 */
	public void enQueue(T data) {
		Node<T> node = new Node<>(data);

		if (Objects.isNull(back)) {
			back = node;
		}
		back.setNext(node);
		back = node;
		if (front == null)
			front = node;
	}

	/**
	 * Remove data from the very first of the linked queue.
	 * 
	 * @author Shiva
	 * @param data
	 * @throws NullPointerException
	 */
	public Node<T> deQueue() {
		if (Objects.isNull(front)) {
			throw new NullPointerException("Front is null, Queue is empty");
		}
		Node<T> node = front;
		Node<T> node2 = back;
		if (node == node2) {
			back.setNext(null);
		}
		Node<T> focus = front;
		front = front.getNext();
		focus.setNext(null);

		return node;

	}

	/**
	 * If the list is empty or not.
	 * 
	 * @author Shiva
	 * @return
	 */
	public boolean isEmpty() {
		return Objects.isNull(front);
	}

	/**
	 * To print the whole queue.
	 * 
	 * @author Shiva
	 */
	public void printQueue() {
		Node<T> focusNode = front;
		while (focusNode != null) {
			System.out.println(focusNode);
			focusNode = focusNode.getNext();
		}
	}
}

class Node<T> {

	private Node<T> next;
	private T data;

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node(T data) {

		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [ data=" + data + "]";
	}

}