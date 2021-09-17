package BinaryTree;

public class NumberNode {

	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		
		if(root == null ) {
			return 0;
		}
		int leftNode = numNodes(root.left);
		int rightNode  = numNodes(root.right);
		return 1 + leftNode + rightNode;
	}
	public static void main(String[] args) {
		
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

		BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(3);

		root.left=leftChild;
		root.right=rightChild;
//		return root;
		int ans = numNodes(root);
		System.out.println(ans);
		
		
		
		
	}

}
