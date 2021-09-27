package BinaryTree;

import java.util.Scanner;

public class RangeK1_K2BST {
	
	public static void printRange(BinaryTreeNode<Integer> root,int k1,int k2) {
		if(root.data == null) {
			return;
		}
		if(root.data < k1) {
			printRange(root.right, k1, k2);
		}else if(root.data > k1) {
			printRange(root.left, k1, k2);
		}
		else {
			System.out.println(root.data);
			printRange(root.left, k1, k2);
			printRange(root.right, k1, k2);
		}
	} 

	public static void main(String[] args) {
	
		

	}

}
