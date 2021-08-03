package Recursion;

public class First_index_Number {

	
	public static int FirstIndex(int[] arr,int x,int startIndex) {
		if(arr.length==startIndex) {
			return -1;
		}
		if(arr[startIndex]==x) {
			return startIndex;
		}
		return FirstIndex(arr, x, startIndex+1);	
	}
	
	public static int FirstIndex(int[] arr,int x) {
		return FirstIndex(arr,x,0);
	}
	public static void main(String[] args) {
		int[] arr = {4,3,3,8};
		int ans= FirstIndex(arr, 3);
	System.out.println(ans);
	}

}
