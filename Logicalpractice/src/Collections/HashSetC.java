package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetC {
public static void main(String[] args) {
	HashSet<Object> h = new HashSet<Object>();
	h.add(1);
	h.add(5);
	h.add(1);
	h.add(7);
	h.add(7);
	h.add(2);
	h.add(15);
	h.add(17);
	h.add("ut");
	//h.add(null);
	System.out.println(h);
	ArrayList<Object> l = new ArrayList<Object>(h);
	Collections.sort(l,Collections.reverseOrder());
	for(Object o :l) {
		System.out.println(o);
	}
}
}
