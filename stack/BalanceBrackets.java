package stack;
import java.util.Stack;

public class BalanceBrackets {

public static boolean isBalanced(String expression) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0 ;i<expression.length();i++) {
			
			if(expression.charAt(i)=='(') {
				stack.push(expression.charAt(i));
			}
			else if(expression.charAt(i)==')') {
				if(stack.isEmpty()) {
					return false;
				}
				char topChar =stack.pop();
				if(expression.charAt(i)==')' && topChar =='(') {
					continue;
				}
				else {
					return false;
				}
			}
		}
		
		System.out.println(stack.isEmpty());
	return stack.isEmpty();	
		
	}	
	
	public static void main(String[] args) {
		
		String expression = "{(a+b)-(a*b}";
		isBalanced(expression);

	}

}
