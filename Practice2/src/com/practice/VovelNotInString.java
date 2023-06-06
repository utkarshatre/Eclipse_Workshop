package com.practice;

public class VovelNotInString 
{
	public static void main(String [] args)
	{
		String s = "Utkarsh";
		
		s=s.toLowerCase();
		int c1=0; 
		int c2=0;
		int c3=0; 
		int c4=0; 
		int c5=0;
		for(int i =0; i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a')
			{
				c1++;
			}
			else if(c=='e')
			{
				c2++;
			}
			else if(c=='i')
			{
				c3++;
			}
			else if(c=='o')
			{
				c4++;
			}
			else if(c=='u')
			{
				c5++;
			}
		}
		if(c1==0)
		{
			System.out.println("a");
		}
		if(c2==0)
		{
			System.out.println("e");
		}
		if(c3==0)
		{
			System.out.println("i");
		}
		if(c4==0)
		{
			System.out.println("o");
		}
		if(c5==0)
		{
			System.out.println("u");
		}
		
		if(c1>0&&c2>0&&c3>0&&c4>0&&c5>0)
			{
				System.out.println("present");
			}
		
	}
}
