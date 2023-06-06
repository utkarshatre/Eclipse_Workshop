package com.abstraction;

public interface Account 
{
	
	public default void deposit(String name, String bank, String acc, double amt, double blc)
	{
		
		System.out.println("details = "+name+bank+acc+amt+blc);
		blc += amt;
		System.out.println(amt+" amount is credited to your acc and your blc is "+blc);
	}
	public default void withdraw(String name, String bank, String acc, double amt, double blc)
	{
		System.out.println("details = "+name+bank+acc+amt+blc);
		blc -= amt;
		if(blc>=amt)
		{
			System.out.println(amt+" amount is deduted from your acc and your blc is "+blc);
		}
	}
}
