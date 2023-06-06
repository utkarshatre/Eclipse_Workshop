package com;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class Solution {
	public static void main(String[] args) {
		Map<Integer,String> map= new LinkedHashMap<Integer, String>();
		map.put(25, "Apple");
		map.put(26, "Samsung");
		map.put(27, "Sony");
		
		Set <Integer> key = map.keySet();
		for(Integer keys : key) {
		System.out.println(map.get(keys));
	}
		
	}
}

