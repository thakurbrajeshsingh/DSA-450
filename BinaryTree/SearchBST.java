package BinaryTree;

public class SearchBST {
	
//	Find Element in BST
	public static boolean findBST(BinaryTreeNode<Integer> root,int k) {
		
		if(root == null) {
			return false;
		}
		if(root.data == k) {
			return true;
		}
		
		else if(root.data> k) {
			return findBST(root.left, k);
		}
		
		return findBST(root.right, k);
	
		
	}
	

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
		root.left=rootLeft; 
		root.right=rootRight;
		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
		rootLeft.right=twoRight;
		rootRight.left=threeLeft;
		boolean ans = findBST(rootRight, 3);
System.out.println(ans);

	}

}
