package com;
import java.util.*;
public class CollectionEx {
	public static void main(String[] args) {
		ArrayList<Object> cs=new ArrayList<Object>();
		ArrayList l1 =new ArrayList();
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		//l1.add("ouiyt");
	
		l1.add(6);
		l1.add(7);
		//l1.add("jhugyfhd");
		l1.add(9);
		l1.add(10);
		l1.add(12);
		//l1.add(null);
		Collections.sort(l1);
		System.out.println(l1); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12]
//		System.out.println(l1.size()); //11
//		System.out.println(l1.get(2));//3
//		System.out.println(l1.contains(null));  //true
//		System.out.println(l1.contains(2));  //true
//		System.out.println(l1.remove(0));
//		//System.out.println(l1.clear());
//		System.out.println(l1.isEmpty());
//		System.out.println(l1.indexOf(null));
//		System.out.println(l1.lastIndexOf(10)); //repeat last from back sude
//		System.out.println("----------------------------------------------------");
//
//		LinkedList l2 =new LinkedList();
//		l2.add(1);
//		l2.add(2);
//		l2.add(3);
//		l2.set(0, 0);
//		System.out.println(l2);
//		l2.add(3, 7);
//		System.out.println(l2);
//		//same methods above one
//		//l2.add(l1);
//		ArrayList <Integer>l3= new ArrayList(l2);
//		l2.set(0,12);
//		System.out.println(l3);
//		
//		LinkedList <Integer> l4 = new LinkedList(l2);
//		l3.add(0,5);
//		System.out.println(l4);
//		
//		Vector <Integer> l5 =  new Vector(l2);
//		System.out.println(l5);
//		
//		Integer a =2;
//		Integer b=3;
//		System.out.println(b.compareTo(a));
//		System.out.println("----------------------------------------------------");
//
//		TreeSet<Integer> l6= new TreeSet<Integer>();
//		l6.add(4);
//		l6.add(5);
//		l6.add(6);
//		l6.add(7);
//		l6.add(8);
//		l6.add(9);
//		l6.add(1);
//		l6.add(2);
//		l6.add(3);
//		l6.add(4);
//		l6.add(5);;
//		System.out.println(l6);
//		System.out.println("----------------------------------------------------");

	}
}
