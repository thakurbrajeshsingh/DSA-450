package linkedlistII;

public class InsertRecursion {

	public static LLNodeII<Integer> inputLL() {
		LLNodeII<Integer> n1=new LLNodeII<Integer>(10);
		LLNodeII<Integer> n2=new LLNodeII<Integer>(20);
		LLNodeII<Integer> n3 =new LLNodeII<Integer>(30);
		LLNodeII<Integer> n4=new LLNodeII<Integer>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	
	
	public static LLNodeII<Integer> insertRecursion(LLNodeII<Integer> head,int elem,int pos)  {
		
		if(head ==null && pos==0) {
			return head;
		}
		
		
		if(pos==0) {
			LLNodeII<Integer> newNode = new LLNodeII<>(elem);
			newNode.next=head;
			return newNode;
		}else {
			head.next=insertRecursion(head.next, elem, pos-1);
			return head;
		}		
	}
	
	
	public static void printRecursion(LLNodeII<Integer> head) {
		if(head==null) {
		return;
		}
		System.out.print(head.data+" -> ");
		printRecursion(head.next);
	}
	
	public static void main(String[] args) {
		
		LLNodeII<Integer> head = inputLL();
		head = insertRecursion(head, 80, 0);
		printRecursion(head);
		

	}

}
