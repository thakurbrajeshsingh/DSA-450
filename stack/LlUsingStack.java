package stack;

import LinkedList.Node;

public class LlUsingStack<T> {

	
	private Node<T> head;
	private int size;
//	private Node<T> tail;
	
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
	if(size==0) {
		return true;
	}
	else {
		return false;
		}
	}
	
	
	public void push(T elem) {
	Node<T> newNode = new Node<T>(elem);
	newNode.next = head;
	head = newNode;
	size++;
	}
	

	public T top() throws StackOverflowError {
		if(head ==null) {
			throw new StackOverflowError();
		}
		return head.data;
	}
	
	
	
	public T pop() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size --;
		return temp;
	}	
}