package Recursion;

public class LastIndex {
	
	public static int LastIndex(int[] arr,int element,int lastIndex) {
		
		if(arr.length==0) {
			return -1;
		}
		if(arr[lastIndex]==element) {
			return lastIndex+1;
		}
		return LastIndex(arr, element, lastIndex-1);
	}
	public static int LastIndex(int[] arr,int element) {
		int lastIndex=arr.length-1;
		return LastIndex(arr, element,lastIndex);
	}
	public static void main(String[] args) {
		
	int[] arr= {5,5,6,5,6};
	int ans=LastIndex(arr, 5);
	System.out.println(ans);
	
	

	}

}
