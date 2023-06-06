package com;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
class Solution2 {
public static void main(String[] args) {
	Map<String, Double> map= new LinkedHashMap<String, Double>();
	map.put("tom",1.5);
	
	Set<String>key=map.keySet();
	Double s = map.get(key);
	System.out.println(s);
	for(String keys: key) {
		System.out.println("salary of "+key+" is "+map.get(key));
	}
	for(String keys: key){
		if(map.get(key)>=2.5 && map.get(key)<=3.5) {
			System.out.println(key);
		}
	}
}
}
