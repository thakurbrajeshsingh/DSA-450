package Recursion;

public class ArraySortedOptimized {
	
	private static boolean checkSorted(int[] input,int startIndex) {
		if(input.length == startIndex-1) {
			return true;
		}
		if(input[startIndex] > input[startIndex+1]) {
			return false;
		}
		boolean smallAns=checkSorted(input, startIndex+1);
		return  smallAns;
	}
	public static boolean checkSorted(int[] input) {
		return checkSorted(input,0);
	}

	public static void main(String[] args) {
		
		int [] arr = {1,7,3,9,0};
		boolean ans=checkSorted(arr);
		System.out.println(ans);
	}

}
