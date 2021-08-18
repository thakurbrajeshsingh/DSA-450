package Asg1;

import LinkedList.Node;

public class FindIndexLL {


	public static TestNode<Integer> createLinkedList() {
		TestNode<Integer> n1 = new TestNode<>(10);
		TestNode<Integer> n2 = new TestNode<>(20);
		TestNode<Integer> n3 = new TestNode<>(30);
		TestNode<Integer> n4 = new TestNode<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	
	
	public static int findIndex(TestNode<Integer> head,int n) {
		
		if(head==null) {
			return -1;
		}
		int i  = 0;
		
		while(head != null) {
			if(head.data.equals(n)) {
				return i;
			}
			head=head.next;
			i++;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		TestNode<Integer> head = createLinkedList();
		int ans = findIndex(head, 20);
		System.out.println(ans);

	}

}
