package Recursion;

public class CountZeros {
	
	public static int countZeros(int num) {
		if(num < 10) {
		if(num==0) {
			return 1;
		}
		else {
			return 0;
		}
		}
		if(num % 10 == 0) {
			return countZeros(num/10)+1;
		}
		else {
			return countZeros(num/10);
		}
	}

	public static void main(String[] args) {
	int ans = countZeros(40200);
	System.out.println(ans);
	
	}

}
