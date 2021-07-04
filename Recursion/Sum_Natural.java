package Recursion;

public class Sum_Natural {

	public static int sumNum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumNum(n-1);
	}
	
	
	public static void main(String[] args) {
		
		int num=5;
		int ans=sumNum(num);
		System.out.println(ans);
		
	}

}
