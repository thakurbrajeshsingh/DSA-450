package Asg1LL;

import LinkedList.Node;

public class EliminateDuplicate {

	public static TestNode<Integer> createLinkedList() {
	TestNode<Integer> n1= new TestNode(1);
	TestNode<Integer> n2 = new TestNode<Integer>(2);
	TestNode<Integer> n3 = new TestNode<Integer>(2);
	TestNode<Integer> n4 =  new TestNode<Integer>(3);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
			return n1;
	}
	
	public static TestNode<Integer> removeDuplicate(TestNode<Integer> head) {
		TestNode<Integer> currentNode=head;
		while(head == null) {
			return head;
		}
		while(currentNode.next != null) {
		if(currentNode.data.equals(currentNode.next.data)) {
			currentNode.next=currentNode.next.next;
		}	
		else {
			currentNode=currentNode.next;
		}
		
		}
		return head;
	}
	
	public static void print(TestNode<Integer> head) {
		while(head.next != null) {
			System.out.print(head.data);
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
	TestNode<Integer> head= createLinkedList();
	TestNode<Integer> ans = removeDuplicate(head);
	print(head);
	
	

	}

}
