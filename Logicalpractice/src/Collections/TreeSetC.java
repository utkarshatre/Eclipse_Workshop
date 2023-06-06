package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetC {
	

	public static void main(String[] args) {
		
		TreeSetCable s1= new TreeSetCable(20,"Utkarsh");
		TreeSetCable s2= new TreeSetCable(10,"utkarsh");		
		TreeSetCable s3= new TreeSetCable(30,"Urvashi");
		TreeSetCable s4= new TreeSetCable(40,"urvashi");	
		TreeSet<TreeSetCable> t = new TreeSet<TreeSetCable>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		for(TreeSetCable s :t) {
			System.out.println(s);
		}
		
//		TreeSet<Object> t = new TreeSet<Object>();
//		t.add(1);
//		t.add(5);
//		t.add(1);
//		t.add(7);
//		t.add(7);
//		t.add(2);
//		t.add(15);
//		t.add(17);
//		System.out.println(t);
//		Iterator i = t.descendingIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
	}

	

	
}
