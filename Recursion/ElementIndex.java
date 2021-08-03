package Recursion;

public class ElementIndex {

	public static int ElementIndex(int[] arr,int element ,int startIndex) {
		if(arr.length ==0) {
			return 0;
		}
		if(arr[startIndex]==element) {
			return startIndex;
		}
		return ElementIndex(arr, element, startIndex+1);
	}
	public static int ElementIndex(int[] arr,int element) {
		return ElementIndex(arr,element,0);
	}
	public static void main(String[] args) {
		int[] arr= {3,2,3,4};
		int ans = ElementIndex(arr, 3);
		System.out.println(ans);

	}

}
