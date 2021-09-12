package Queue;

import LinkedList.Node;

public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	
	public QueueUsingLL() {
		front=null;
		rear=null;
		size=0;
	}
	
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public void enqueue(T data) {
		this.size+=1;
		Node<T> newNode = new Node<>(data);
		
		if(rear==null) {
			front=newNode;
			rear=newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
	}
	
	
	public T dequeue() throws QueueEmptyException {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		
		T ans = rear.data;
		rear = rear.next;
		size -= 1;
		return ans;
	}
	
	
	public T front() throws QueueEmptyException {
		if(this.isEmpty()) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
}
