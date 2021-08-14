package ArrayList;

import java.util.ArrayList;

public class Intro {

	public static void main(String[] args) {
	
	
		ArrayList<Integer> arr =new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30); //adds element to last
		System.out.println(arr.size());
		arr.add(1, 50); //1 at which index to add & 50 is value
		System.out.println(arr.get(1));   //to get element of particular index
		arr.set(0, 100); //will set 100 value to index 0
		
		
		
		
//		iterating over ArrayList
for(int i=0;i<arr.size();i++) {
	System.out.print(arr.get(i)+" ");
}		
//	for each loop
System.out.println();
System.out.println("For Each Loop");
for(int i:arr) {
	System.out.print(i+" ");
	
	}
		
		
		
	}

}
