package com;
public class Employee {
int id;
String name;
Double salary; //wrappper class declaration
public Employee(int id, String name, double salary) {
	this.id = id;
	this.name= name;
	this.salary= salary;
}
@Override
public String toString() {
	return "id: "+id+" name: "+name+" salary:"+salary;
}
}
