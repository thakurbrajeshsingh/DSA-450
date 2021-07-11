package Recursion;

public class LastIndexLeft {
	
	public static int Index_Left_right(int[] arr,int element,int startIndex) {
	
		if(arr.length==startIndex) {
		return -1;
	}	
	int smallAns = Index_Left_right(arr, element, startIndex+1);
	if(smallAns==-1) {
		if(arr[startIndex]==element) {
			return startIndex;
		}
		else {
			return -1;
		}
	}
	else {
		return smallAns;
	}
	}
	
	public static void main(String[] args) {
		
	int[] arr= {5,5,6,5,6};
	int ans=Index_Left_right(arr, 5, 0);
	System.out.println(ans);
	}

}
