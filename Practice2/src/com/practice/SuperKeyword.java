package com.practice;
class Aaa    //SUPERCLASS 1
{
	
	public void a() {

		System.out.println("A");
	}
	
}

class Cc extends Aaa
{
	@Override
	public void a()
	{
		super.a();
		System.out.println("C");
		
	}
}

public class SuperKeyword
{

	public static void main(String [] args)
	{
		Cc c = new Cc();
		c.a();
	}
}
