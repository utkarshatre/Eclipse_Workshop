package Collections;

import java.util.LinkedList;

public class LinkedListC {
public static void main(String[] args) {
	LinkedList<TreeSetCable> list = new LinkedList<TreeSetCable>();
	list.add(new TreeSetCable(101,"utkarsh"));
	list.add(new TreeSetCable(102,"urvashi"));
	list.add(new TreeSetCable(104,"utkarsh"));
	list.add(new TreeSetCable(105,"urvashi"));
	//System.out.println(list);
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	System.out.println(list.get(3));

	list.add(2,new TreeSetCable(103,"utsav"));
	System.out.println("         ");
	System.out.println(list.get(1));
	System.out.println(list.get(2));
System.out.println(list.get(3));

System.out.println(list);
}
}
