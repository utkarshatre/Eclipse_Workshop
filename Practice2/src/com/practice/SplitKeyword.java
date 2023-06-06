package com.practice;

import java.util.Scanner;

public class SplitKeyword 
{
	public static void main(String []args)
	{
		Scanner ip = new Scanner(System.in);
		String s= " hii hello hii byee";
		String []arr=s.split(" ");
		for(int i =0;i<=s.length();i++)
		{
			System.out.println(arr[i]);
		}
				
	}
}
