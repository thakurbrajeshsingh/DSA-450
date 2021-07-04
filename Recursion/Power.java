package Recursion;

public class Power {
	
	public static int power(int base,int pow) {
		if(pow==0) {
			return 1;
		}
		int smallAns = power(base, pow-1);
		return smallAns*base;
	}

	public static void main(String[] args) {
	
		int base=2;
		int pow=3;
		int Ans=power(base, pow);
		System.out.println(Ans);
	}

}
