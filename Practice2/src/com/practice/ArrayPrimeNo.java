package com.practice;

import java.util.Scanner;

public class ArrayPrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		int[]a=new int[ip.nextInt()];
		for(int i =0;i<=a.length; i++)
		{
			a[i]=ip.nextInt();
			int c=1;
			for(int j=1; j<=i;j++)
				{
				
					if(a[i]%j==0)
					{
						c++;
					}
					
				}
			if(c==2)
			{
				System.out.println(a[i]+" iprime");
			}
			else
			{
				System.out.println("not a prime no");
			}
		}
		
	}
}
