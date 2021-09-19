package BinaryTree;

public class LargestNode {

	public static int largest(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return -1;
		}
		
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		
		 return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	
	
	public static void main(String[] args) {
	
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(3);
		root.left=leftChild;
		root.right = rightChild;
		
		 System.out.println("Largest is "+largest(root));
		
		
	}

}
