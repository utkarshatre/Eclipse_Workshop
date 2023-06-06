package com;

import java.util.TreeSet;

public class TreeSetComparatorMain {
	public static void main(String[] args) {
		Jspider j1 = new Jspider("basavanagudi",05
				
				);
		Jspider j2 = new Jspider("bhopal",04);
		Jspider j3 = new Jspider("Rajajinagar",02);
		Jspider j4 = new Jspider("Kormangala",03);
		TreeSetComparator2 t1 = new TreeSetComparator2();
		// for Branch in string comparison 
		TreeSetComparator t2 = new TreeSetComparator();
		TreeSet<Jspider> t = new TreeSet<Jspider>(t1);
		t.add(j4);
		t.add(j3);
		t.add(j1);
		t.add(j2);
		for(Jspider obj :t){
			System.out.println(obj);
		}
	}

}
