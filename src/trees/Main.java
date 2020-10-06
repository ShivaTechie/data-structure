package trees;

public class Main {

	public static void main(String[] args) {

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insertUtil(10);
		binarySearchTree.insertUtil(12);
		binarySearchTree.insertUtil(13);
		binarySearchTree.insertUtil(8);
		binarySearchTree.insertUtil(9);
		binarySearchTree.insertUtil(7);
		binarySearchTree.insertUtil(6);
		System.out.println("In order->>>");
		binarySearchTree.inOrderTraversalUtil();
		System.out.println("\n");
		System.out.println("Pre order->>>");
		binarySearchTree.preOrderTraversalUtil();
		System.out.println("\n");
		System.out.println("Post order--->>");
		binarySearchTree.postOrderTraversalUtil();
		System.out.println("\n");

//		System.out.println("Min value is: " + binarySearchTree.minUtil());
//		System.out.println("Max value is: " + binarySearchTree.maxUtil());
//		System.out.println(binarySearchTree.containsUtil(13));
//		System.out.println(binarySearchTree.remove(6));

		binarySearchTree.remove(10);
		binarySearchTree.inOrderTraversalUtil();
	}
}
