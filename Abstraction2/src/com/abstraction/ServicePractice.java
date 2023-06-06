package com.abstraction;

class Mobno
{
	 int jio=7974;
}
class Admin extends Mobno
{
	public void add()
	{
		System.out.println("member adding");
	}
	public void remove()
	{
		System.out.println("member remove");
	}
}
class Member extends Mobno
{
	public void gm()
	{
		System.out.println("hii gm all");
	}
	public void left()
	{
		System.out.println("left this group");
	}
}
class Service1
{
	public void login(Mobno s)
	{
		Member w = new Member();
		System.out.println("i join this group via link");
		w.gm();
		w.left();
		
		
		
	}
}
class ServicePractice
{
	public static void main(String []args)
	{
		Service1 s = new Service1();
		Admin a =new Admin();
		Member m = new Member();
		s.login(a);
		s.login(m);
		
	}
}