package ArrayList;

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr =new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30); //adds element to last
		System.out.println(arr.size());
		arr.add(1, 50); //1 at which index to add & 50 is value
		System.out.println(arr.get(1));   //to get element of particular index
		
		

	}

}
