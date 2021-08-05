package Recursion;

public class Replace_pi {
	
	public static String replace(String input) {
		String Output="";
		if(input.length() <=1) {
			return input;
		}
		String small = replace(input.substring(1));
		if(input.charAt(0)=='p' && small.charAt(0) =='i') {
		Output = 3.14 + small.substring(1);
		}
		else {
			Output = input.charAt(0) + small;
		}
		return Output;
	} 

	public static void main(String[] args) {
		
		String input = "xpixpi";
		String ans = replace(input);
		System.out.println(ans);

	}

}
