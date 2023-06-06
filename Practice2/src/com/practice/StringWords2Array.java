package com.practice;

import java.util.Scanner;

public class StringWords2Array 
{
	public static void main(String []args)
	{
		Scanner ip = new Scanner(System.in);
		String s= ip.next();
		int c=0;
		for(int i =0; i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				c++;
			}
		}
		String arr[]=new String[c+1];
		int k=0;
		String s2="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch= s.charAt(i);
			if(ch==' ') 
			{
				arr[k]=s2;
				k++;
				s2=" ";
			}
			else
			{
				s2=s2+ch;
			}
			arr[k]=s2;
		}
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
