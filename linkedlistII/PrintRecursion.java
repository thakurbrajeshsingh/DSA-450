package linkedlistII;

import LinkedList.Node;

public class PrintRecursion {

	public static LLNodeII<Integer> inputLL() {
		LLNodeII<Integer> n1=new LLNodeII<Integer>(1);
		LLNodeII<Integer> n2=new LLNodeII<Integer>(2);
		LLNodeII<Integer> n3=new LLNodeII<Integer>(3);
		LLNodeII<Integer> n4 = new LLNodeII<Integer>(4);
		n1.next = n2;
		n2.next =n3;
		n3.next=n4;
	return n1;
	}
	
	public static void printRecursion(LLNodeII<Integer> head) {
		if(head==null) {
		return;
		}
		System.out.print(head.data+" -> ");
		printRecursion(head.next);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLNodeII<Integer> head = inputLL();
		printRecursion(head);

	}

}
