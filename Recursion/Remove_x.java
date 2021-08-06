package Recursion;

public class Remove_x {

	public static String removeX(String input) {
		
		if(input.length()==0) {
			return "";
		}
		if(input.charAt(0)=='x') {
			return removeX(input.substring(1));
		}

			return input.charAt(0) + removeX(input.substring(1)) ;
	
		
	}
	public static void main(String[] args) {
		String input = "pixpix";
		String ans = removeX(input);
//		System.out.println(ans);
		
		
		System.out.println(input.substring(0,input.length()-1));
	}

}
