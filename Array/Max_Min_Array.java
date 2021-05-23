package Array;

import java.util.Arrays;

//Question-Find the Maximum and Minimum Element in a Array.

public class Max_Min_Array {
	
	/* public static int Max(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[0]<arr[i]) {
				max=arr[i];
				}
		}
		return max;
	}
	
	public static int Min(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
				if (arr[0]>arr[i]) {
				min=arr[i];
			}	
		}
		return min;
	}

	public static void Max_Min(int[] arr) {
		
		System.out.print(" Maximum  is "+Max(arr)+" And ");
		System.out.print(" Minimum is "+Min(arr));
		
	}

	*/
	
	public static void Max_Min_(int[] arr) {
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("Minimum is "+min +" Max is "+max);
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {2,5,7,1,9};
		Max_Min_(arr);
	}

}
