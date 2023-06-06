package com.practice;

public class Thiss_keyword {
 public int a;

public Thiss_keyword(int g) {
	System.out.println(g);
	this.a=g;
}

public static void main(String[] args) {
	Thiss_keyword t = new Thiss_keyword(10);
	System.out.println(t.a);
}
}
