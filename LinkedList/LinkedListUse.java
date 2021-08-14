package LinkedList;

public class LinkedListUse {

	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	
	public static void print(Node<Integer> head) {
		
		while(head != null) {
			System.out.print(head.data+" ");
			head =head.next;
		}
		
		
//	System.out.println("Print "+head);
//	System.out.println(head.data);
//	System.out.println(head.next.data);
	}
	
	
public static void main(String[] args) {
	
	Node<Integer> head = createLinkedList();
	
	
	print(head);

	}
}
