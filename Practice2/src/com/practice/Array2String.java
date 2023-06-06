package com.practice;
import java.util.Scanner;
public class Array2String 
{
	public static void main(String[] args) 
	{
	String s1  ="hii hello byee";
		char  []a= s1.toCharArray();
		String s="";
		for(int i =0; i<=a.length-1;i++)
		{
			s=s+a[i];
			System.out.print(a[i]);
		}
		System.out.println(s);
		System.out.println(a[0]);
	}
}
