package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedHashSetC {
public static void main(String[] args) {
	LinkedList<Object> ll = new LinkedList<Object>();
	ll.add(1);
	ll.add(5);
	ll.add(1);
	ll.add(7);
	ll.add(7);
	ll.add(2);
	ll.add(15);
ll.add(17);
	//ll.add("ut");
	System.out.println(ll);
	List <Object> al = new ArrayList<Object>(ll);
	Collections.sort(al,Collections.reverseOrder());
System.out.println(al);
}
}