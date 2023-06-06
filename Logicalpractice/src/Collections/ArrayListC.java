package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListC {
public static void main(String[] args) {
	//arrymethods();
	arayinarray();
}
public static void arayinarray() {
	List<Integer> a1 = new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	List<Integer> a2 = new ArrayList<Integer>();
	a2.addAll(a1);
	a2.add(40);
	a2.add(50);
	a2.add(60);
	System.out.print(a2);
}
public static void arrymethods() {
	List<TreeSetCable> list= new ArrayList<TreeSetCable>();
	list.add(new TreeSetCable(101,"utkarsh"));
	list.add(new TreeSetCable(102,"urvashi"));
	System.out.println(list);
	
	for(TreeSetCable al :list) {
		System.out.println(al);
	}
	System.out.println("+++++++++++add(index,object)+++++++++++++");
	list.add(1,new TreeSetCable(103,"urcrush"));
	
	for(TreeSetCable a2 :list)
	{
		System.out.println(a2);
	}
	System.out.println("++++++++++addAll(index,object)++++++++++");
	list.addAll(1,list);
	for(TreeSetCable a3 :list)
	{
		System.out.println(a3);
	}
	
	System.out.println(list.size());
//	System.out.println("++++++++++++++++remove(index)");
//	list.remove(1);
//	for(Student a4 :list)
//	{
//		System.out.println(a4);
//	}
	System.out.println("+++++++++++++contains(object)+++++++++");
	System.out.println(list.contains(list)); 
	
	System.out.println("+++++++++++++containsAll(ref)+++++++++");
	System.out.println(list.containsAll(list)); 
	
	System.out.println("+++++++++++++isEmpty()++++++++++++++++");
	System.out.println(list.isEmpty());
	
	System.out.println("+++++++++++++++get()+++++++++++++++++++");
	System.out.println(list.get(0));
	System.out.println(list.get(3));
	System.out.println("++++++++++++removeAll(ref)+++++++++");
	list.removeAll(list);
	for(TreeSetCable a5 :list)
	{
		System.out.println(a5);
	}

	List<Integer> l = new ArrayList<Integer>();
	l.add(1);
	l.add(3);
	l.add(2);
	l.add(5);
	l.add(4);
	
	Iterator<Integer> i = l.iterator();
	while(i.hasNext()) {
	 System.out.println(i.next());
	
		}
	Collections.sort(l);
	System.out.println(l);
	
	Collections.sort(l,Collections.reverseOrder());
	System.out.println(l);
}
}
