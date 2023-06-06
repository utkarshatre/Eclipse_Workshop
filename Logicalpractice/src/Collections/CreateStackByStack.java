package Collections;

import java.util.Stack;

public class CreateStackByStack {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String s = "({{)}}[]";
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') {
				stack.push(s.charAt(i));
			}
			else if(stack.empty()==false&&(s.charAt(i)=='('&& stack.peek()==')')
					&&(s.charAt(i)=='{'&& stack.peek()=='}')&&
					(s.charAt(i)=='['&& stack.peek()==']')){
				stack.pop();
			}
			else {
				stack.push(s.charAt(i));
			}
		}
		if(stack.empty()==true) {
			System.out.println("balanced");
		}
		else {
			System.out.println("unbalanced");
		}
	}
}
