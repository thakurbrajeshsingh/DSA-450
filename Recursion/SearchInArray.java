package Recursion;

public class SearchInArray {

	public static boolean FindArray(int[] arr,int element,int length) {
		if(length==0) {
		return false;
		}
		if(arr[length-1]==element) {
			return true;
		}
		return FindArray(arr, element, length-1);
	}
	
	public static void main(String[] args) {
		int[] arr= {2,3,8,1};
		int element=2;
		boolean ans = FindArray(arr, element, 4);
		System.out.println(ans);
		

	}

}
