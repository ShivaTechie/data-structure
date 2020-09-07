package queue;

public class ArrayQueueMain {
	public static void main(String[] args) {

		ArrayQueue arrayQueue = new ArrayQueue(5);
		arrayQueue.enQueue(1);
		arrayQueue.enQueue(2);
		arrayQueue.enQueue(3);
		arrayQueue.enQueue(4);
		arrayQueue.enQueue(5); //Array is resizing at this moment
		System.out.println(arrayQueue.deQueue() + " dequeued");
		System.out.println(arrayQueue.deQueue() + " dequeued");
//		System.out.println(arrayQueue.deQueue() + " dequeued");
//		System.out.println(arrayQueue.deQueue() + " dequeued");
//		System.out.println(arrayQueue.deQueue() + " dequeued");

		arrayQueue.enQueue(6);
		arrayQueue.enQueue(7);
		arrayQueue.enQueue(8);
		System.out.println(arrayQueue.deQueue() + " dequeued");
		System.out.println(arrayQueue.deQueue() + " dequeued");
		arrayQueue.enQueue(9);
		System.out.println("*************");
		arrayQueue.printQueue();
	}
}
