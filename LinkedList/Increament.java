package LinkedList;

public class Increament {
	
	public static Node<Integer> createList(){
	Node<Integer> node1 = new Node<>(1);
	Node<Integer> node2 = new Node<>(2);
	Node<Integer> node3 = new Node<>(3);
	node1.next = node2;
	node2.next = node3;
	return node1;
	}	

	public static void increament(Node<Integer> head) {
		head.data++;
	}
	
	public static void print(Node<Integer> head) {
		
	while(head != null) {
		increament(head);
		System.out.print(head.data+" ");
		head=head.next;
	}
	}
	
	
	
	public static void main(String[] args) {
		
	Node<Integer> head =createList();
	System.out.println(head.data);	
	System.out.println();
	print(head);
		

	}

}
