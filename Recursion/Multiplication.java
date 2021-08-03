package Recursion;

public class Multiplication {

	
	
	public static int multiply(int m ,int n) {
		if(n == 0 || m == 0) {
			return 0;
		}
	int ans = m + multiply(m, n-1);
	return ans;
	}
	
	public static void main(String[] args) {
		int ans = multiply(2,3);
System.out.println(ans);
	}

}
