
package com;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
public class Student {
	int age;
	String name;
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
