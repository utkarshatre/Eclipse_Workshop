package ClassCastExTreeSet;

import java.util.TreeSet;

public class CCExTreeSet {
public static void main(String[] args)

{
	TreeSet t = new TreeSet();
	t.add(20);
	t.add(30);
	t.add(10);
	try {
		t.add("50");
		throw new ClassCastException();
	}
	catch(Exception c) {
		
	}
	System.out.println(t);
}
}
