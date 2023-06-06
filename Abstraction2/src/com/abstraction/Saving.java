package com.abstraction;

public class Saving implements Account
{
	public void deposit(String name, String bank, String acc, double amt, double blc)
	{
		if(blc>0.0)
		{
			System.out.println("details = "+name+bank+acc+amt+blc);
			System.out.println("Saving ac status "+blc);
		}
		else
		{
			System.out.println("this is saving so its ok " +blc);
		}
	}
	public void withdraw(String name, String bank, String acc, double amt, double blc)
	{
		if(amt<=0.0)
		{
			System.out.println("details = "+name+bank+acc+amt+blc);
			blc-=amt;
			System.out.println("your blc is "+blc);
		}
	}
}
