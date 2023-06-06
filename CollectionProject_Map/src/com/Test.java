package com;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	Student s1= new Student(21,"tom");
	Student s2= new Student(22,"jack");
	Student s3= new Student(23,"smith");
		Map<Integer,Student> map = new LinkedHashMap<Integer,Student>();
	 	map.put(101,s1);  //map.put(101, new Student(21,"tom");
		map.put(102,s2);  //map.put(101, new Student(22,"jack");
		map.put(103,s3);  //map.put(101, new Student(23,"smith");
		//convert mapp into a set which stores only keys using keyset()
		System.out.println(map);
		Set<Integer>keys=map.keySet();  // 101,102,103
		//creating a instance of arylist and storing into reffrence of list
		
		
		System.out.println(keys);
		List<Student> l= new ArrayList<Student>();
		//triversing the entites
		for(int key:keys) {
			Student std= map.get(key);//getting the vlue (student value)
			l.add(std);// adding the vlue (student object) into arraylist
			System.out.println(l);//the value(student objectprinting 
			
		}
		//System.out.println(l);
}
}
