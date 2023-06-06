package com.practice;

public class JSpider2i 
{
	public static void main(String[] args) 
	{
		String s="jspider";
		int r=s.length();
		int l=0;
	
		for(int i =0; i<=s.length()-1;i++)
		{
			if(i%2==0)
			{
				r--;
			}
			else
			{
				l++;
			}
			String s2="";
			for(int j=l;j<r;j++)
			{
				s2=s2+s.charAt(j);
			}
			System.out.println(s2);
		}
}
}
