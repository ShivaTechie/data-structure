package linkedlist;

public class LinkedMain {

	public static void main(String[] args) {

		SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.addAt(6, 10);
		
		linkedList.printList();
		linkedList.printLastNode();

	}
}
