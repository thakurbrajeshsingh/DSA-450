package BinaryTree;

public class NumLeaf {
	
	public static int numLeaf(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		return numLeaf(root.left) + numLeaf(root.right);
	}
	
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

		BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(3);

		root.left=leftChild;
		root.right=rightChild;

		System.out.println(numLeaf(root));
	
		
		
	}

}
