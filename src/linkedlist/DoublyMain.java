package linkedlist;

public class DoublyMain {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
		linkedList.addAtFront(1);
		linkedList.addAtFront(2);
		linkedList.addAtFront(3);
		linkedList.addAtFront(4);
		linkedList.addAtFront(5);
		linkedList.printListFromHead();
		linkedList.addBefore(9, 5);
		linkedList.printListFromHead();
		linkedList.printListFromTail();
		linkedList.remove(5);
		System.out.println(linkedList.size());
		linkedList.printListFromHead();
		linkedList.printListFromTail();
	}
}
