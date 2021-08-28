package stack;

public class StackUsingArray {
	
	
	private int data[];
	private int topIndex;

	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}
	
//	for dynamically adding size of array
public StackUsingArray(int size) {
	int[] data =new int[size];
	topIndex=-1;
}
	
	// time complexity O(1)  as adding 1 to to index 
	public  int size() {
		return topIndex+1;
	}
	
	
	// time complexity O(1) just checking
	public boolean isEmpty() {
		if(topIndex==-1) {
			return true;
		}else {
			return false;
		}  //OR
		
//		return topIndex==-1;  //if expression return true else false
	}
	
	// time complexity O(1) adding  to top
	 public int push(int elem) throws StackThrowsException {
		 
//		 if stack is full
		 if(topIndex == data.length-1) {
//			 StackThrowsException e =new StackThrowsException();
//			 throw e;
//			 OR
//			 throw new StackThrowsException();
//			 throw exception
			 doubleCapacity();
		 }
		return data[++topIndex]=elem;
	}
	 
	 	 
	private void doubleCapacity() {
		int[] temp = data;
		data=new int[2* temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}

	// time complexity O(1) just fetching top 
	public int top() throws StackEmptyException {
//		if stack is empty
		if(topIndex==-1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
		
	}
	
	
	// time complexity O(1) just removing last index
	public int pop() throws StackEmptyException {
//		if stack is empty
	if(topIndex == -1) {
		throw new StackEmptyException();
	}	
	int temp = data[topIndex];
	topIndex--;
	return temp;
	}
	

	
	
	
}
