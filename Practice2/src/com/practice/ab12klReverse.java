package com.practice;

import java.util.Scanner;

public class ab12klReverse 
{
	//12#AB&KL
		public static void main(String[] args) 
		{
			Scanner ip = new Scanner(System.in);
			String s = ip.next();
			String s2="";
			for(int i =0; i<=s.length()-1;i++)
			{
				if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
				{
					s2=s.charAt(i)+s2;
				}
			}
			String s3="";
			int c=0;
			for(int i =0; i<=s.length()-1; i++)
			{
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				{
					
					s3=s3+s2.charAt(c);
					c++;
					
				}
				else
				{
					s3=s3+s.charAt(i);
				}
			}
			System.out.println(s3);
		}
}
