package com.practice;

import java.util.Scanner;

public class SqOfNumByFnCall 
{
	public int fn(int n)
	{
		int sum=0;
		for(int i = 1; i <=n;i++)
		{
			sum+=n;
		}
		return sum;
	}
	public static void main(String [] args) 
	{
		Scanner ip = new Scanner(System.in);
		int []a=new int[ip.nextInt()];
		SqOfNumByFnCall p = new SqOfNumByFnCall();
		
		for(int i =0; i <=a.length-1; i++)
		{
			a[i]=ip.nextInt();
		}
		for(int i =0; i <=a.length-1; i++)
		{
			a[i]=p.fn(a[i]);
		}
		for(int i = 0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
