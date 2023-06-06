package MapC;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapC {

	public static void main(String[] args) {
		Student s1 = new Student(20,"utkarsh");
		Student s2 = new Student (2,"urvashi");
		LinkedHashMap<Integer,Student> h = new LinkedHashMap<Integer,Student>();
		h.put(1,s1);
		h.put(2,s2);
		System.out.println(h);
		Set <Integer> key = h.keySet();
		for(Integer keys :key) {
			System.out.println(keys);
			System.out.println(h.get(keys));
		}
}
}
