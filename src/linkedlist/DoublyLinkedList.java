package linkedlist;

import java.util.Objects;

/**
 * This doubly linked list is a generic type list.
 * 
 * @author Shiva
 * 
 * @param <T>
 */
public class DoublyLinkedList<T> {

	DoublyNode<T> head;
	DoublyNode<T> tail;
	int size;

	/**
	 * It adds the node at front to the list. Complexity O(1)
	 * 
	 * @author Shiva
	 * @param data
	 * @return boolean
	 */
	public boolean addAtFront(T data) {
		DoublyNode<T> node = new DoublyNode<T>(data);

		if (Objects.isNull(head)) {

			head = node;
			tail = node;
			size++;
			return true;
		}

		node.setNext(head);
		head.setPrevious(node);
		head = node;
		size++;
		return true;
	}

	/**
	 * It adds node to the end of the list. Complexity O(1)
	 * 
	 * @author Shiva
	 * @param data
	 * @return boolean
	 */
	public boolean add(T data) {
		DoublyNode<T> node = new DoublyNode<T>(data);

		if (Objects.isNull(tail)) {

			head = node;
			tail = node;
			size++;
			return true;
		}

		node.setNext(tail.getNext());
		tail.setNext(node);
		node.setPrevious(tail);
		tail = node;
		size++;
		return true;
	}

	/**
	 * Adds the data before the given node data. Using before node to find the node
	 * to insert the data into the list before 'BEFORE' node.
	 * 
	 * @author Shiva
	 * @param toAdd
	 * @param before
	 * @return boolean
	 */
	public boolean addBefore(T toAdd, T before) {

		DoublyNode<T> toAddNode = new DoublyNode<>(toAdd);
		DoublyNode<T> beforeNode = new DoublyNode<>(before);

		if (isEmpty())
			return false;
		if (head.getData() == beforeNode.getData()) {
			toAddNode.setNext(head);
			head.setPrevious(toAddNode);
			head = toAddNode;
			size++;
			return true;
		}
		DoublyNode<T> focusNode = head;
		while (focusNode.getNext() != null) {
			if (focusNode.getNext().getData() == beforeNode.getData())
				break;
			focusNode = focusNode.getNext();
		}
		if (focusNode == tail)
			return false;
		toAddNode.setNext(focusNode.getNext());
		focusNode.getNext().setPrevious(toAddNode);
		focusNode.setNext(toAddNode);
		toAddNode.setPrevious(focusNode);
		size++;
		return true;
	}

	/**
	 * Prints the data from head to end of the list. Complexity O(n)
	 * 
	 * @author Shiva
	 */
	public void printListFromHead() {
		if (Objects.isNull(head))
			return;
		DoublyNode<T> node = head;

		System.out.print("\nHead ->");
		while (node.getNext() != null) {
			System.out.print(node.getData() + " ->");
			node = node.getNext();
		}
		System.out.print(node.getData() + " -> null\n");
	}

	/**
	 * Prints the data from tail to front of the list. Complexity O(n)
	 * 
	 * @author Shiva
	 */
	public void printListFromTail() {
		if (Objects.isNull(tail))
			return;
		DoublyNode<T> node = tail;

		System.out.print("\nTail ->");
		while (node.getPrevious() != null) {
			System.out.print(node.getData() + " ->");
			node = node.getPrevious();
		}

		System.out.print(node.getData() + " -> null\n");
	}

	/**
	 * Returns size of the list. Complexity O(1)
	 * 
	 * @author Shiva
	 * @return size
	 */
	public int size() {
		return size;
	}

	/**
	 * To check if the list is or not. Complexity O(1)
	 * 
	 * @author Shiva
	 * @return boolean
	 * 
	 */
	public boolean isEmpty() {
		return Objects.isNull(head);
	}

	/**
	 * Removes the data from the list using head traversal. Complexity O(n)
	 * 
	 * @author Shiva
	 * @param data
	 * @return boolean
	 */
	public boolean remove(T data) {
		DoublyNode<T> node = new DoublyNode<T>(data);

		if (isEmpty())
			return false;
		if (head.getData() == node.getData()) {
			if (size() == 1) {
				head = null;
				tail = null;
				size--;
				return true;
			}
			head = head.getNext();
			head.setPrevious(null);
			size--;
			return true;
		}
		DoublyNode<T> focusNode = head;
		while (focusNode.getNext() != null) {
			if (focusNode.getNext().getData() == node.getData())
				break;
			focusNode = focusNode.getNext();
		}

		DoublyNode<T> removedNode = focusNode.getNext();
		if (tail == removedNode) {
			focusNode.setNext(null);
			tail = focusNode;
			size--;
			return true;
		}
		focusNode.setNext(removedNode.getNext());
		focusNode.getNext().setPrevious(focusNode);
		size--;
		return true;
	}

	/**
	 * To check the list if it contains the data or not. Complexity O(n)
	 * 
	 * @author Shiva
	 * @param data
	 * @return boolean
	 */
	public boolean contains(T data) {
		if (isEmpty())
			return false;
		DoublyNode<T> node = head;

		while (node != null) {
			if (node.getData() == data)
				return true;
			node = node.getNext();
		}
		return false;
	}
}
