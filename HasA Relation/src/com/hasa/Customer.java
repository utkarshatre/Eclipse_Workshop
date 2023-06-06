package com.hasa;

public class Customer {
	Account a1;
	String name;
	int no;
	String ad;
	Customer(String name,int no, String ad, String bank, int ac, int ifsc, String branch)
	{
		this.name= name;
		this.no=no;
		this.ad=ad;
		a1=new Account(bank,ac,ifsc,branch);
	}
	public void  cu()
	{
		System.out.println("customer fill the form");
		System.out.println(name);
		System.out.println(no);
		System.out.println(ad);
		a1.ac();
	}
}
