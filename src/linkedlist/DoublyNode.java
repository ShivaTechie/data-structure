package linkedlist;

/**
 * 
 * @author Shiva
 *
 * @param <T>
 */
public class DoublyNode<T> {

	private DoublyNode<T> next;
	private T data;
	private DoublyNode<T> previous;

	public DoublyNode<T> getNext() {
		return next;
	}

	public void setNext(DoublyNode<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DoublyNode [data=" + data + "]";
	}

	public DoublyNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyNode<T> tail) {
		this.previous = tail;
	}

	public DoublyNode(T data) {
		this.data = data;
	}

	public DoublyNode() {

	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoublyNode<T> other = (DoublyNode<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

}
