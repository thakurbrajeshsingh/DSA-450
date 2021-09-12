package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaCollection {

	public static void main(String[] args) {
		
		Queue<Integer> queueLL = new LinkedList<>();
		
		System.out.println(queueLL.offer(10));
		System.out.println(queueLL.add(20));
		System.out.println(queueLL.add(30));
		System.out.println(queueLL.add(40));
		
	System.out.println(queueLL.poll());
		System.out.println(queueLL.remove());
	}
	
	
}
