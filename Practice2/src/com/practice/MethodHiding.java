package com.practice;

class Superr
{
	public void mo()
	{
		System.out.println("MOverriding Super");
	}
	public static void mh()
	{
		System.out.println("M hiding Super");
	}
	
	
}
class Subb extends Superr
{
	@Override
	public void mo()
	{
		System.out.println("MOverriding Sub");
	}
	public static void mh()
	{
		System.out.println("M hiding Sub");
	}
}
public class MethodHiding 
{
	public static void main(String[] args) 
	{
		Subb s2= new Subb();
		Superr s1 = new Superr();
		s2.mo();
		s2.mh();		
		s1.mo();
		s1.mh();
		System.out.println("..................................");
		Superr s3 = new Subb();
		s3.mh();
	}
	
	
}


