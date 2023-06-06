package com.practice;

public class ObjectClassFnMethods 
{

	@Override
	public int hashCode()
	{
		return 24;
	}
	@Override
	public String toString()
	{
		return "java";
	}
	public boolean equals(Object p)
	{
		return true;
	}
	public static void main(String [] args)
	{
		Practice p = new Practice();
		Practice q = new Practice();
		//below 3 are without oveerride
		System.out.println(p.hashCode());
		System.out.println(q.hashCode()); //1973538135
		System.out.println(p.toString());   //com.practice.Practice@75a1cd57
		System.out.println(p.equals(q));   //false
		
		//below are with override
		System.out.println(p.hashCode());   //24
		System.out.println(q.hashCode()); //24
		System.out.println(p.toString());   //java
		System.out.println(p.equals(q));   // true is bcz both values are same
		
	}
	
}
