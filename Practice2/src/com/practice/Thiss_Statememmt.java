package com.practice;

public class Thiss_Statememmt {

	public Thiss_Statememmt() {
		System.out.println("zero");
		// TODO Auto-generated constructor stub
	}
public Thiss_Statememmt(int a) {
	this(8.8);
	System.out.println("int a");
		// TODO Auto-generated constructor stub
	}
public Thiss_Statememmt(double a) {
	this();
	System.out.println("double a");
	// TODO Auto-generated constructor stub
}
public Thiss_Statememmt(int a, double b) {
	this(10);
	System.out.println("int a double b");
	
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	Thiss_Statememmt t = new Thiss_Statememmt(8,8.8);
}

}
