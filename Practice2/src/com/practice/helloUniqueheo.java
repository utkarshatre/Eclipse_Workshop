package com.practice;

import java.util.Scanner;

public class helloUniqueheo 
{
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		String s = ip.next();
		String s1="";
		
		for(int i =0;i<=s.length()-1;i++)
		{
			int c=0;
			for(int j =0; j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
				}
			}
			if(c==1)
			{
			s1=s.charAt(i)+s1;
			}
		}
		System.out.println(s1);
	}
}
