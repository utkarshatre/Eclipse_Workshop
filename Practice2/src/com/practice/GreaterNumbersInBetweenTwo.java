package com.practice;

import java.util.Scanner;

public class GreaterNumbersInBetweenTwo {
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		String s=ip.next();
		for(int i =0; i<=s.length()-1;i+=3)
		{
			System.out.println(i);
		}
	}
	
}
