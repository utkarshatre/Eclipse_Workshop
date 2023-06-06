package com;
import java.util.*;
public class TreeSetUserMain2{
	public static void main(String[] args) {
		TreeSetUser2 t3= new TreeSetUser2(3,"C");
		TreeSetUser2 t1= new TreeSetUser2(1,"A");
		TreeSetUser2 t2= new TreeSetUser2(2,"B");
		TreeSet<TreeSetUser2> t=new TreeSet<TreeSetUser2>();
		t.add(t2);
		t.add(t3);
		t.add(t1);
		for( TreeSetUser2 obj : t) {
			System.out.println(obj);
		}
	}
}