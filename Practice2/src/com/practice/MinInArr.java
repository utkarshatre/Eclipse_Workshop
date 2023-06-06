package com.practice;

import java.util.Scanner;

public class MinInArr 
{
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		int[]a=new int[ip.nextInt()];
		for(int i =0; i<=a.length-1;i++)
		{
			a[i]=ip.nextInt();
		}
		                  int min=a[1];     //achaa aisa bad m declare kro mtlb

		for(int i =0; i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
