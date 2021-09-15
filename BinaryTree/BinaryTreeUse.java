package BinaryTree;

public class BinaryTreeUse {

	public static void printBinary(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printBinary(root.left);
		printBinary(root.right);	
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		root.data=1;
		
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
		root.left=rootLeft;
		root.right=rootRight;
		
		printBinary(root);	
		
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
//		rootLeft.right=twoRight;
//		rootRight.left=threeLeft;

	}

}
