package Recursion;

public class FibonacciSeries {
	
	public static int fabi(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		return fabi(n-1) + fabi(n-2);
	}
	
	
	
	public static void main(String[] args) {
		int n=4;
		System.out.println(fabi(n));

	}

}
