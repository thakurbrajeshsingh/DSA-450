package Recursion;

public class AllindicesOfArray {
	
	public static int[] ArrayIndices(int[] arr,int element,int startindex,int fsf) {
		if(arr.length == startindex) {
			return new int[fsf];
		}
		if(arr[startindex]==element) {
			int[] arri=ArrayIndices(arr, element, startindex+1, fsf+1);
			arri[fsf]=startindex;
			return arri;
		}
		else {
			int[] arri=ArrayIndices(arr, element, startindex+1, fsf);
			return arri;
		}
	}
	

	public static void main(String[] args) {
		
		int[] arr= {2,3,6,9,8,3,2,3,6,4};
		int[] ans=ArrayIndices(arr, 3, 0, 0);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	
		
	}

}
