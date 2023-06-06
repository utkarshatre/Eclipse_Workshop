package com.abstraction;

public class Current implements Account
{
	public void deposit(String name, String bank, String acc, double amt, double blc)
	{
		blc+=amt;
		if(blc>500.0)
		{
			System.out.println("details = "+name+bank+acc+amt+blc);
			System.out.println("Current ac status "+blc);
		}
		else
		{
		}
	}
	public void withdraw(String name, String bank, String acc, double amt, double blc)
	{
		double limit = 500;
		if(limit<=500)
		{
			System.out.println("details = "+name+bank+acc+amt+blc);
			System.out.println(amt+" amount withdraw is not processd annd your blc is  "+blc);
		}
	}
}
