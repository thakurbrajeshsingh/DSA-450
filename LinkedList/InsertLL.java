package LinkedList;

import java.util.Scanner;

public class InsertLL {

//	Inserting element at particular index
	public static Node<Integer> takeInput(){
		
		Scanner sc =new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null,tail =null;
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
		
		if(head ==null ) {
			head = currentNode;
			tail = currentNode;
			
		}else {
			tail.next=currentNode;
			tail = currentNode;
		}
		data = sc.nextInt();
	}
		return head;
	}
	public static Node<Integer> insertLL(Node<Integer> head,int element,int pos) {
		Node<Integer> nodeToBeInserted = new Node<Integer>(element);
		
		
		if(pos==0) {
			nodeToBeInserted.next = head;
//			head =nodeToBeInserted;
			return nodeToBeInserted;
		}
		else {
		int count = 0 ;
		Node<Integer> prev = head;
		while(count <pos-1 && prev !=null) {
			count ++;
			prev=prev.next;
		}
		if(prev != null) {
		nodeToBeInserted.next = prev.next;
		prev.next = nodeToBeInserted;
			}
		}
		return head;
	}
	
	
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+"-> ");
			temp =temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head =insertLL(head, 80, 0);
		print(head);
		

	}

}
