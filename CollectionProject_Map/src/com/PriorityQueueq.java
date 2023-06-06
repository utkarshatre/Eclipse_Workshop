package com;
import java.util.*;

public class PriorityQueueq implements Comparator<Integer>{
  public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(5);
		p.add(0);
		p.add(3);
		p.add(2);
		Comparator c = p.comparator();
		System.out.println(c);
	}

@Override
public int compare(Integer o1, Integer o2) {
	// TODO Auto-generated method stub
	return 0;
}
}