package MapC;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapC {
	public static void main(String[] args) {
		Student s1 = new Student(20,"utkarsh");
		Student s2 = new Student (2,"urvashi");
		SortbyId s= new SortbyId();
		TreeMap<Integer,Student> h = new TreeMap<Integer,Student>();
		h.put(1,s1);
		h.put(2,s2);
		System.out.println(h);
		Set <Integer> keys = h.keySet();
		for(Integer key : keys) {
			System.out.println(h.get(key));
		}
}
}
