package com.practice;

public class Stringbuffer 
{
	public static void main(String [] args)
	{
		StringBuffer s = new StringBuffer("java");
		System.out.println(s);                      //java
		s=s.append("sql");
		System.out.println(s);                      //javasql
	}
}
