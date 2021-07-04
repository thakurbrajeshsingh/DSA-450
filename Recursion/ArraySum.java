package Recursion;

public class ArraySum {

	
	public static int SumArr(int[] arr,int n) {
		if(n<=0) {
		return 0;
		}
		return SumArr(arr, n-1) + arr[n-1];
		
	}
	public static void main(String[] args) {
		int[] arr = {2,5,6,8,9,12};
		int n=6;
		int ans = SumArr(arr, n);
		System.out.println(ans);

	}

}
