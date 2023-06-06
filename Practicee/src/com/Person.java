package com;
import java.io.ObjectInputStream.GetField;
import java.util.*;

class Person {

	public static void main(String[] args) {
		Customer c1 = new Customer("utkarsh",1);
		Customer c5 = new Customer("utkarsh",2);
		Customer c2 = new Customer("shivani",3);
		Customer c3 = new Customer("aditi",4);
		Customer c4 = new Customer ("ayushi",5);
		Customer c6 = new Customer(null,6);
		TreeMap<Character,Integer> a = new TreeMap<Character,Integer>();
		a.put('A',1);
		a.put('Z',1);
		a.put('B',3);
		a.put('D',4);
		a.put('A',2);
		a.put('M',5);
		System.out.println(a);


		}

	}
	
	
//	public static void main(String[] args) {
//		BeanClass b1 = new BeanClass(12,"utarsh");
//		BeanClass b2 = new BeanClass(1,"aditi");
//		BeanClass b3 = new BeanClass(2,"shiavni");
//	TreeSet <BeanClass> t = new TreeSet<BeanClass>(b1);
//	t.add(b1);
//	t.add(b2);
//	t.add(b3);
//	Iterator <BeanClass> i = t.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
//	}
//	
//}


//interface Demo{
////	public void mess();
////  public static void call() {
////		System.out.println("cll the inspector");
////	}
////	public default void arrest() {
////		System.out.println("arrest owner");
////	}
////}
////	class DemoImp implements Demo{
////		@Override
////		public void mess() {
////			System.out.println("FOOD IS NOT GOOD");
////		}
////		@Override
////		public void arrest() {
////			System.out.println("ARREST OWNER");
////		}
////	}
////public class Practice{
////	public static void main(String[] args) {
////	    DemoImp d= new DemoImp();
////		d.mess();
////		d.arrest();
////		Demo.c
////		
////		
////		all();	
//	}
//}