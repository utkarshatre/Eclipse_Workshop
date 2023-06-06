package com.abstraction.hasA;

public class Account 
{
	String bank = "SBI";
	String name;
	int Ac;
	String branch;
	String ifsc;
	double blc;
	public Account(String bank,String name,int Ac,String branch,String ifsc,double blc) // constructor
	{
		this.bank=bank;
		this.name=name;
		this.Ac=Ac;
		this.branch=branch;
		this.ifsc=ifsc;
		this.blc=blc;
		
	}
	public void details()
		{
		if (this.bank=="SBI")
		{
			System.out.println("Go to Counter no.3, Lunch Time");
		}
		else
		{
			System.out.println();
			System.out.println("Server down for port new costomer from "+bank+ ", Come tomorrow");
		}
			System.out.print(name);
			System.out.print(Ac);
			System.out.print(branch);
			System.out.print(ifsc);
			System.out.print(blc);
		}
	
}
