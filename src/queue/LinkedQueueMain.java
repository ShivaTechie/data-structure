package queue;

public class LinkedQueueMain {

	public static void main(String[] args) {

		LinkedQueue<Integer> queue = new LinkedQueue<>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);

		System.out.println(queue.deQueue() + " dequeued");
		System.out.println(queue.deQueue() + " dequeued");
		System.out.println(queue.deQueue() + " dequeued");
		System.out.println(queue.deQueue() + " dequeued");
		System.out.println(queue.deQueue() + " dequeued");
		queue.enQueue(6);
		queue.enQueue(7);
		System.out.println("***************");
		System.out.println(queue.deQueue() + " dequeued");
		System.out.println(queue.deQueue() + " dequeued");
		System.out.println(queue.isEmpty());
		queue.printQueue();
		
	}
}
