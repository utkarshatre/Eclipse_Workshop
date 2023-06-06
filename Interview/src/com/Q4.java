package com;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
	
	String s= "Welcome to    India";
	String s1= " ";
	for(int i = 0; i<s.length()-1;i++)
	{
		char c=s.charAt(i);
		if(c!=' ' && s.charAt(i-1)==' ')
		{
			s1=c+s1;
		}
		else if(c!=' ')
		{
			s1=c+s1;
		}
	}
	System.out.println(s1);
	
}
}
