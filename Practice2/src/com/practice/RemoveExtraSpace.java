package com.practice;

import java.util.Scanner;

public class RemoveExtraSpace 
{
	public static void main(String []args)
	{
		Scanner ip = new Scanner(System.in);
		String s= ip.next();
		String s1=s.charAt(0)+"";
		for(int i = 1; i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c!=' ' && s.charAt(i-1)==' ')
			{
				s1=s1+" "+c;
			}
			else if(c!=' ')
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
		
	}
}
