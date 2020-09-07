package queue;

import java.util.NoSuchElementException;

/**
 * 
 * @author Shiva
 *
 */
public class ArrayQueue {

	private int queue[];
	private int front = -1;
	private int back = -1;

	public ArrayQueue(int capacity) {
		queue = new int[capacity];
	}

	/**
	 * Adds the data to the queue as a addLast.
	 * 
	 * @author Shiva
	 * @param data
	 */
	public void enQueue(int data) {

		if (back + 1 % queue.length == front) {
			int startBack = queue.length - 1;
			int newqueue[] = new int[queue.length * 2];
			System.arraycopy(queue, front, newqueue, 0, queue.length - front);
			System.arraycopy(queue, 0, newqueue, queue.length - front, back + 1);
			queue = newqueue;
			System.out.println("As queue is full, Array is resizing");
			back = startBack;
			front = 0;
		}

		if (front == -1)
			front = 0;
		back = back + 1 % queue.length;
		if (back >= queue.length)
			back = 0;
		queue[back] = data;

	}

	/**
	 * To check size of the queue.
	 * 
	 * @author Shiva
	 * @return size
	 * @param data
	 */
	public int size() {

		if (front <= back)
			return back - front;
		else
			return back - front + queue.length;
	}

	/**
	 * Removes the data from the very last of linked queue.
	 * 
	 * @author Shiva
	 * @param data
	 * @return size
	 * @throws NoSuchElementException
	 */
	public int deQueue() {
		if (size() <= 0)
			throw new NoSuchElementException("Queue is Empty");
		int data = queue[front];
		queue[front] = -1;
		if (back == front)
			back = front = 0;
		else
			front = ++front % queue.length;

		return data;
	}

	/**
	 * Prints the whole queue
	 * 
	 * @author Shiva
	 */
	public void printQueue() {
		if (size() <= 0) {
			System.out.println("Queue is Empty");
			return;
		}
		if (back > front)
			for (int i = front; i <= back; i++)
				System.out.println(queue[i]);
		else {
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			for (int i = 0; i <= back; i++) {
				System.out.println(queue[i]);
			}
		}
	}
}
