package com;
import java.util.*;
public class TreeSetUSerMain{
	public static void main(String[] args) {
		TreeSetUser t1= new TreeSetUser(1,"A");
		
		TreeSetUser t3= new TreeSetUser(3,"C");
		TreeSetUser t2= new TreeSetUser(2,"B");
		TreeSet<TreeSetUser> t=new TreeSet<TreeSetUser>();
		t.add(t3);
		t.add(t1);
		t.add(t2);
		for( TreeSetUser obj : t) {
			System.out.println(obj);
		}
	}
}
