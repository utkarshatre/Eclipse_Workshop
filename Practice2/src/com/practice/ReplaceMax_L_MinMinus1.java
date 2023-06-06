package com.practice;

import java.util.Scanner;

public class ReplaceMax_L_MinMinus1 
{
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		int[]a=new int[ip.nextInt()];
		for(int i =0;i<=a.length-1; i++)
		{
			a[i]=ip.nextInt();
		}
		int max=a[1];
		for(int i =0; i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
	
		for(int i =0; i<=a.length-1;i++)
		{	
			if(a[i]<max)
			{
				a[i]=max;
			}
			else
			{
				a[i]=-1;
			}
		}
		for(int i =0;i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
			
	}
}
