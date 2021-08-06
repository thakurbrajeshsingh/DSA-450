package Recursion;

public class PairStar {

//	hello ->  hel*lo
	public static String addStar(String input) {
		if(input.length()<=1) {
			return input;
		}
//		System.out.println(input);
		String out = addStar(input.substring(1));
		if(input.charAt(0)==input.charAt(1)) {
			out = input.charAt(0)+ "*" + out;
		}else {
			out = input.charAt(0)+out;
		}
		return out;
	}
	
	
	public static void main(String[] args) {
		
		String input = "Hello";
		String ans = addStar(input);
		System.out.println(ans);
	}

}
