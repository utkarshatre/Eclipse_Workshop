package com;

import java.util.TreeSet;

public class HotelSort {
	public static void main(String[] args) {
		TreeSet <Hotel> h = new TreeSet<Hotel>(); 
		h.add(new Hotel("A",3.4));
		h.add(new Hotel("C",5.6));
		h.add(new Hotel("B",5.1));
		for(Hotel h1 : h) {
			System.out.println(h1);
		}
	}
}