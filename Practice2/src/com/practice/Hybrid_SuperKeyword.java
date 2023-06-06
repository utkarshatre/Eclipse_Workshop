package com.practice;
class Super1{
	 int a=10;
	public void superm()
	{
		int a=20;
	}
}
class Sub1 extends Super1{
	int a=30;
	public void subm() {
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
public class Hybrid_SuperKeyword
{
	int a=55;
	public static void main(String [] args)
	{
		Sub1 s = new Sub1();
		s.subm();
		
	}
}