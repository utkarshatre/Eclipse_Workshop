package com;

class ThisS {
	public ThisS() {

		System.out.println("0");
	}
	public ThisS(int a) {
		this();
		System.out.println(a);
	}
	public ThisS(int a, int b) {
		this(a);
	}
	public void method() {
		System.out.println("hiiii");
	}
	public void method(int a) {
		this.method();
		System.out.println(a);
	}
	public void method(int a, int b) {
		this.method(a);
		System.out.println(a+b);
	}
public static void main(String[] args) {
ThisS t = new  ThisS(10);
t.method(10);
}
}