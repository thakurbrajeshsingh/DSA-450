package Queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		int [] data = {1,2,3,4,5};
		QueueUsingArray queue = new QueueUsingArray(5);
		
		for(int i=0; i<data.length;i++) {
		queue.enqueue(data[i]);	
		}
		
		System.out.println(queue.front());
		System.out.println(queue.rear());
		System.out.println(queue.isEmpty());
		System.out.println(queue.denqueue());
		
	}

}

