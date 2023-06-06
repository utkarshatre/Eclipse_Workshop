package Collections;

import java.util.Stack;

public class StackC {
public static void main(String[] args) {
	Stack <Integer>s = new Stack<Integer>();
	s.add(10);
	s.add(30);
	s.add(50);
	s.add(20);
	System.out.println(s);
	s.pop();
	System.out.println(s);
	s.remove(1);
	System.out.println(s);
}
}