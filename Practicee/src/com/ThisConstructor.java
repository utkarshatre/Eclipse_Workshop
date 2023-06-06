package com;

public class ThisConstructor {
	static int c;
public ThisConstructor(int a) {
	
	this.c=a;
	System.out.println(a);
}
public ThisConstructor(int a, int b) {
	this(10);  //this statement8
	System.out.println(a+" a and b is "+b);
}
public static void main(String[] args) {
	ThisConstructor d = new ThisConstructor(10,20);
	System.out.println(c);
}
}
