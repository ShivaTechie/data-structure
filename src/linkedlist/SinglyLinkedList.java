package linkedlist;

import java.util.Objects;

/**
 * This Singly linked list is a generic type list.
 * 
 * @author Shiva
 * @param <T>
 */

public class SinglyLinkedList<T> {

	Node<T> head;
	int size;
	Node<T> tail;

	/**
	 * To add object data at last. Using tail concept by which we are not traversing
	 * the whole list instead saving the last node in tail and add to node to the
	 * tail.next
	 * 
	 * Complexity O(1)
	 * 
	 * @author Shiva
	 * @param data
	 */
	public void add(T data) {

		Node<T> node = new Node<>(data);

		if (head == null) {
			head = node;
			tail = node;
			size++;
			return;
		}

		tail.setNext(node);
		tail = node;
		size++;

	}

	/**
	 * To print the whole list. Complexity O(n)
	 * 
	 * @author Shiva
	 */
	public void printList() {

		if (head == null)
			return;

		Node<T> node = head;
		System.out.print("head -> ");

		while (node.getNext() != null) {

			System.out.print(node + " ->");
			node = node.getNext();
		}
		System.out.print(node);
		System.out.println(" -> null");
	}

	/**
	 * To print the last tail node. Complexity O(1)
	 * 
	 * @author Shiva
	 */

	public void printLastNode() {

		if (tail == null)
			return;
		System.out.println(tail);
	}

	/**
	 * To add data at front. Complexity O(1)
	 * 
	 * @author Shiva
	 * @param node
	 */
	public void addAtFront(Node<T> node) {

		if (head == null) {
			head = node;
			size++;
			return;
		}
		node.setNext(head);
		head = node;
		size++;
	}

	/**
	 * This method adds the data at front.
	 * 
	 * @author Shiva
	 * @param data
	 */
	public void addAtFront(T data) {
		Node<T> node = new Node<>(data);
		addAtFront(node);
	}

	/**
	 * To remove data using object data. Complexity O(n)
	 * 
	 * @author Shiva
	 * @param node
	 * @return
	 */
	public Node<T> remove(Node<T> node) {

		if (Objects.isNull(node) || head == null)
			return null;

		Node<T> focusNode = head;
		Node<T> focusNode2 = head;
		if (node.getData() == head.getData()) {
			head = head.getNext();
			size--;
			return head;
		}
		while (focusNode.getNext().getData() != node.getData()) {
			focusNode = focusNode.getNext();
			focusNode2 = focusNode2.getNext();
			if (focusNode.getNext() == null)
				return null;
		}

		node = focusNode.getNext();
		if (node == tail)
			tail = focusNode;
		focusNode2.setNext(focusNode.getNext().getNext());
		node.setNext(null);
		size--;
		return node;
	}

	/**
	 * Overload method to remove data. Complexity O(n)
	 * 
	 * @author Shiva
	 * @param data
	 */
	public void remove(T data) {
		Node<T> node = new Node<>(data);
		remove(node);
	}

	/**
	 * To print total size of linkedList. Complexity O(1)
	 * 
	 * @author Shiva
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * To check the is list empty or not. Complexity O(1)
	 * 
	 * @author Shiva
	 * @return
	 */
	public boolean isEmpty() {
		return Objects.isNull(head);
	}

	/**
	 * To check if the list contains the data or not
	 * 
	 * @author Shiva
	 * @param node
	 * @return
	 * 
	 */

	public boolean contains(Node<T> node) {
		Node<T> focusNode = head;
		if (Objects.isNull(head))
			return false;

		while (focusNode.getNext() != null) {
			if (focusNode.getData() == node.getData())
				return true;
			focusNode = focusNode.getNext();
		}
		if (focusNode.getData() == node.getData())
			return true;
		return false;
	}

	public boolean contains(T node) {
		Node<T> value = new Node<>(node);
		return contains(value);
	}

	/**
	 * This method add the data to the linked list at given position. Throws
	 * NullPointerException, if the index is greater than the size of linked list.
	 * 
	 * @throws NullPointerException
	 * @param index
	 * @param data
	 * @author Shiva
	 */
	public void addAt(int index, T data) {
		Node<T> node = new Node<>(data);
		int pos = index - 1;
		if (isEmpty())
			return;

		if (size() < pos)
			throw new NullPointerException("Index is not present. Index is greater than the size of Linked List.");
		Node<T> focusNode = head;

		if (pos == 0) {
			node.setNext(head);
			head = node;
			return;
		}
		while (pos > 0) {
			pos--;
			if (pos != 0) {
				focusNode = focusNode.getNext();
			}
		}
		if (pos == 0) {
			if (tail == focusNode)
				tail = node;
			node.setNext(focusNode.getNext());
			focusNode.setNext(node);
		}
	}

	public void printFirstNode() {

		if (Objects.isNull(head))
			return;
		System.out.println(head);

	}
}
