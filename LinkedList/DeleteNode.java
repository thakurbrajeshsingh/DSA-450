package LinkedList;
import java.util.*;
public class DeleteNode {

	
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

public static void deleteNode(Node<Integer> head,int pos) {
	Node<Integer> prev = head;
	int count = 0;
	while(count <pos-1) {
		count++;
		prev = prev.next;
	}
	prev = prev.next.next;

}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
