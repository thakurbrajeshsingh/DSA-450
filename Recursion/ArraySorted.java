package Recursion;

public class ArraySorted {

	public static boolean ArrSort(int[] arr) {
		if(arr.length==1) {
			return true;
		}
		int[] smallInput=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallInput[i-1] = arr[i];
		}
		
		boolean checkSorted = ArrSort(smallInput);
		if(!checkSorted) {
			return false;
		}
		if(arr[0]<arr[1]) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		boolean ans= ArrSort(arr);
		System.out.println(ans);
	}

}
