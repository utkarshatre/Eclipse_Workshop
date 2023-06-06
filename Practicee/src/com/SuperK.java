package com;

 class Super {
public Super(int a) {
System.out.println(a);
}
 Super(int a, int b) {
	System.out.println(a+b);
}
 public void method() {
	 System.out.println("hiii");
 }
 public void method(int a) {
	 System.out.println(a);
 }
 public void method(int a, int b) {
	System.out.println(a+b); 
 }
}
class Sub extends Super{
	public Sub(int a) {
		super(a);
	}
	public Sub(int a, int b) {
		super(a, b);
	}
	@Override
	public void method() {
		
		System.out.println("byee");
	}
	@Override
	public void method(int a) {
		super.method();
		System.out.println("a"+a);
	}
	public void method(int a, int b) {
		super.method(a);
		System.out.println("a and b"+a+b);
	}
}
class SuperK{
	public static void main(String[] args) {
		Sub s = new Sub(10);
	}
}
