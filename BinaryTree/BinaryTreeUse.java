package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> treeInputBetter(boolean isRoot,int parentData,boolean isLeft) {
		
		if(isRoot) {
		System.out.print("Enter Root Data: ");
		}
		else {
		if(isLeft) {
			System.out.print("Enter left child of "+parentData +" : ");
		}
		else {
			System.out.print("Enter right child of "+parentData+" : ");
		}
		}
		
		Scanner sc = new Scanner(System.in);
		int rootData=sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = treeInputBetter(false,rootData,true); 
		BinaryTreeNode<Integer> rightChild = treeInputBetter(false,rootData,false);
		root.left=leftChild;
		root.right=rightChild;
		return root;
		
	}
	
	
	
	
	public static BinaryTreeNode<Integer> treeInput() {
		System.out.print("Enter Root Data: ");
		Scanner sc = new Scanner(System.in);
		int rootData=sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = treeInput(); 
		BinaryTreeNode<Integer> rightChild = treeInput();
		root.left=leftChild;
		root.right=rightChild;
		return root;
		
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + ":" );
		
		if(root.left != null) {
			System.out.print("L" + root.left.data + " ,");
		}
		if(root.right !=null) {
			System.out.print(" R"+root.right.data);
		}
		System.out.println();
		
		printTree(root.left);
		printTree(root.right);	
	}
	
	public static void main(String[] args) {
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		root.data=1;
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//		root.left=rootLeft; 
//		root.right=rootRight;
//			
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
//		rootLeft.right=twoRight;
//		rootRight.left=threeLeft;
		
//		BinaryTreeNode<Integer> root = treeInput();
		BinaryTreeNode<Integer> root = treeInputBetter(true,0,true);
		printTree(root);
		
	}

}
