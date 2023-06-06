

package com.hasa;
class Accounthas
{
	int acno;
	int ifsc;
	int blc;
	public Accounthas(int acno, int ifsc, int blc)
	{
		this.acno=acno;
		this.ifsc=ifsc;
		this.blc=blc;
	}
	public String dc()
	{
		return acno+" "+ifsc+" "+blc;
	}
	
}
class Customerhas
{
	Accounthas a;
	String name;
	int no;
	
	public Customerhas(String name, int no, int acno,int ifsc,int blc)
	{
		this.name=name;
		this.no=no;
		a=new Accounthas(acno,ifsc,blc);
	
	}
	public void dcp()
	{
		System.out.println(name+" "+no+" "+a.dc());
		
	}
}
public class HasASingeClass
{
	public static void main(String [] args)
	{
		Customerhas c = new Customerhas("Utkarsh", 7739,981, 193, 50);
		c.dcp();
		
	}
}