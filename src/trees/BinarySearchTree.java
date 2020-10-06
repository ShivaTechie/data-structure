package trees;

public class BinarySearchTree {

	TreeNode root;

	public void insertUtil(int data) {
		if (root == null)
			root = new TreeNode(data);
		else
			insert(root, data);
	}

	private TreeNode insert(TreeNode root, int nodeToBeInserted) {
		if (root == null) {
			root = new TreeNode(nodeToBeInserted);
			return root;
		} else if (root.getData() > nodeToBeInserted) {
			root.setLeftChild(insert(root.getLeftChild(), nodeToBeInserted));
		} else
			root.setRightChild(insert(root.getRightChild(), nodeToBeInserted));
		return root;
	}

	public void inOrderTraversalUtil() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(TreeNode root) {

		if (root == null)
			return;
		inOrderTraversal(root.getLeftChild());
		System.out.print(root.getData() + ", ");
		inOrderTraversal(root.getRightChild());
	}

	public void preOrderTraversalUtil() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(TreeNode root) {

		if (root == null)
			return;
		System.out.print(root.getData() + ", ");
		preOrderTraversal(root.getLeftChild());
		preOrderTraversal(root.getRightChild());

	}

	public void postOrderTraversalUtil() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(TreeNode root) {

		if (root == null)
			return;
		postOrderTraversal(root.getLeftChild());
		postOrderTraversal(root.getRightChild());
		System.out.print(root.getData() + ", ");
	}

	public int minUtil() {
		if (root == null)
			return Integer.MIN_VALUE;
		return min(root);
	}

	private int min(TreeNode root) {
		if (root == null)
			return Integer.MIN_VALUE;
		if (root.getLeftChild() != null)
			return min(root.getLeftChild());
		return root.getData();
	}

	public int maxUtil() {
		if (root == null)
			return Integer.MAX_VALUE;
		return max(root);
	}

	private int max(TreeNode root) {
		if (root == null)
			return Integer.MAX_VALUE;
		if (root.getRightChild() != null)
			return max(root.getRightChild());
		return root.getData();
	}

	public TreeNode containsUtil(int data) {
		TreeNode nodeToBeFound = new TreeNode(data);
		TreeNode node = contains(nodeToBeFound, root);
		if (nodeToBeFound.getData() == node.getData())
			return node;
		return null;
	}

	private TreeNode contains(TreeNode nodeToBeFound, TreeNode root) {
		if (root == null)
			return new TreeNode(Integer.MIN_VALUE);
		if (root.getData() == nodeToBeFound.getData())
			return nodeToBeFound;
		else if (root.getLeftChild() != null && root.getData() > nodeToBeFound.getData())
			return contains(nodeToBeFound, root.getLeftChild());
		else if (root.getRightChild() != null && root.getData() < nodeToBeFound.getData())
			return contains(nodeToBeFound, root.getRightChild());
		return root;
	}

	public void remove(int data) {

		delete(root, data);

	}

	public TreeNode delete(TreeNode root, int data) {
		if (root == null)
			return null;
		else {
			if (data < root.getData())
				root.setLeftChild(delete(root.getLeftChild(), data));
			else if (data > root.getData())
				root.setRightChild(delete(root.getRightChild(), data));

			else {
				if (root.getLeftChild() == null)
					return root.getRightChild();
				else if (root.getRightChild() == null)
					return root.getLeftChild();

				int min = min(root.getRightChild());
				root.setData(min);
				root.setRightChild(delete(root.getRightChild(), min));
			}

			return root;
		}
	}
}
