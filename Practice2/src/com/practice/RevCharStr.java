package com.practice;

import java.util.Scanner;

public class RevCharStr 
{
	public static void main(String [] args)
	{
		Scanner ip = new Scanner(System.in);
		String s ="Utkarsh";
		String s1=" ";
		for(int i =s.length()-1;i>=0;i--)      /////for(int i =0; i<=s.length())
		{										{
			s1=s1+s.charAt(i);					//	s1=s.charAt(i)+s1;
		}					//					}				
		System.out.println(s1);					//System.out.println(s1);
	}                        //both have same output as hsraktU
	
}
}
