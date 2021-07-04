package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//Question:- "Kth Max & Min element in Array"
/*  Input:
 	N = 6
 	arr[] = 7 10 4 3 20 15
 	K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7. */
public class Kth_Max_Min {
	
	public static void KthMin(int[] arr,int k) {
		Arrays.sort(arr);
		System.out.println("Kth Minimum Number is: "+arr[k-1]);
		
	}
	
	public static void KthMax(int[] arr,int k) {
		
		System.out.println("Kth Max Number is: "+arr[k-1]);
		
	}
	
	
	

	public static void main(String[] args) {
		int[] arr= {7,10,4,3,20,15};
		KthMin(arr, 3);

	}

}
