package com.practice;

import java.util.Scanner;

public class String2Array 
{
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		String s = ip.next();
		char a[]= new char[s.length()];    
		for( int i =0; i <=a.length-1; i++)
		{
			a[i]=s.charAt(i);   
			 //OR use below without for loop
			char []a=s.toCharArray();
		}
		for(int i =0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
