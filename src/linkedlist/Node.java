package linkedlist;

/**
 * This Node class is a generic class. You can use and data type for the Linked
 * List.
 * 
 * @author Shiva
 *
 * @param <T>
 */
public class Node<T> {

	private T data;
	private Node<T> next;

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
		this.next = null;
	}

	public Node(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node {data=" + data + "}";
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node<T> other = (Node<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

}
