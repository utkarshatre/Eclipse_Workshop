package com.abstraction;

interface User
{
	public void tran();
}
class Atm implements User   //ovrride this another subclass too
{
	public void tran()
	{
		System.out.println("transaction vi atm");
	}
}
class Upi implements User  //override this subclass
{
	public void tran()
	{
		System.out.println("tran under RBI guidelines"); 
		System.out.println("transaction via upi");
	}
}
class Service3
{
	User u;
	public User login(int mob)
	{
		if(mob==1234)
		{
			u = new Atm();
			return u;
		}
		else
		{
			u = new Upi();
			return u;
		}
	}
}
class AbsAtmUpi
{
	public static void main(String []args)
	{
		Service3 s = new Service3();
		 User u= s.login(1234);
		u.tran();
	}
}
