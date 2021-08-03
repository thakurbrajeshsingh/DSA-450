package Recursion;

public class NumOfDigit {
	
	
	public static int print(int n) {
		if(n==0) {
			return 0;
		}
		int smallAns = print(n/10);
//		System.out.println("ans is"+ smallAns);
		return smallAns +1;
	}
	public static void main(String[] args) {
		
		int ans = print(4025);
		System.out.println(ans);

	}

}
