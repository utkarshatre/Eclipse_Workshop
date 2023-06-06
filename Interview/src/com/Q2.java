package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q2 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//adding of element
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		
		//dislpay of element
		Set<Integer>keys=map.keySet(); 
		System.out.println(keys);		
		
		//remove the element
		for(Integer key:keys) {
			map.remove(key);
		}	
		
		
	}
}
