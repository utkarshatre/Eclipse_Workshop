package com;
class Parent {
	public Parent(int a) {
		//System.out.println(a);
	}
	public Parent(int a, double b) {
		System.out.println(a+" a and b "+b);
	}
}
class Child extends Parent{
int a;
int c;
double b;
	public Child(int a) {
		super(a);
     this.a=a;
     System.out.println("child"+a);
	}
	public Child(int c, double b) {
		super(c, b);
		this.c=a;
		this.b=b;
		System.out.println(c+b);
		
	}
}
public 	class ParentChild{
	public static void main(String[] args) {
		Child c= new Child(10);
		Child c1  = new Child(20,1.1);
	}
}

