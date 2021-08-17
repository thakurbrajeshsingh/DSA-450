package LinkedList;

import java.util.Scanner;

public class OptimizedInputLL {
	
	public static Node<Integer> optimizedInputLL(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null ,tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}
			else {
				tail.next = currentNode;
				tail = currentNode;
			}
			data =sc.nextInt();
			
		}
		return head;
	}
 public static void print(Node<Integer> head) {
Node<Integer> temp = head;
	 while(temp !=null) {
		 System.out.print(temp.data+"-> ");
		 temp = temp.next;
	 }
		 
 }
 
 
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = optimizedInputLL();
		print(head);

	}

}
