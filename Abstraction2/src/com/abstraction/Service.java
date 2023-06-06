package com.abstraction;

public class Service 
{
	Account a;   // global super class ref variable
	public Account object(String name, String bank, String acc, double amt, double blc)  // return type
	{
		if(bank == "BoI")
		{
			
			a=new Current();    // subclasss object create and stored in superclass
			a=new Saving();		
		}
		else
		{
			System.out.println("invald customer");
		}
		return a;
	}
}
