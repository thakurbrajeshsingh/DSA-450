package Asg1LL;

public class ReverseLL {
	
	
	
	public static TestNode<Integer> linkedLlist() {
		TestNode<Integer> n1=new TestNode<Integer>(1);
		TestNode<Integer> n2 = new TestNode<Integer>(2);
		TestNode<Integer> n3 = new TestNode<Integer>(3);
		TestNode<Integer> n4 = new TestNode<Integer>(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	
	public static void reverseLL(TestNode<Integer> head) {
		if(head==null) {
			return ;
		}
		
		reverseLL(head);
		System.out.println(head.data);
	}

	public static void main(String[] args) {
		

	}

}
