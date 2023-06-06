package com.hasa;

class Account {
	String bank;
	int ac;
	int ifsc;
	String branch;
	Account(String bank, int ac, int ifsc, String branch)
	{
		this.bank=bank;
		this.ac=ac;
		this.ifsc=ifsc;
		this.branch=branch;
	}
	public void ac()
	{
		System.out.println("Account created in bank for the customer");
		System.out.println(bank);
		System.out.println(ac);
		System.out.println(ifsc);
		System.out.println(branch);
	}
}
