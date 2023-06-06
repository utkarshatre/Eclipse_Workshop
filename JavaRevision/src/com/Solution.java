package com;
class Student{
String name;
int age;
Student(String name, int age){
	this.name= name;
	this.age = age;
}
@Override    //Object obj = new Studnet ("tom",20)
public boolean equals(Object obj) { //  1) upcasting
	Student s =(Student)obj;        //  1) downcasting
	return this.name.equals(s.name)&& this.age == s.age;       //3) comparison logic
}
}
public class Solution {
	public static void main(String[] args) {
		Student s1 = new Student("abi",20) ;
		Student s2 = new Student("abc",20) ;
		System.out.println(s1.equals(s2));
	
	}
}
//Rules to override equals method
// 1) upcasting
//  1) downcasting
//  3) comparison logic