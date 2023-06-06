package com.practice;
import java.util.Scanner;
public class Absclass {
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		String s = ip.next();
		char []a=s.toCharArray();
	
		for(int i =0; i<=a.length-1;i++)
		{
			if(a[i]==41&&a[((a.length-1)/2)]==40)
			{
				System.out.println("balanced");
			}
			else
			{
				System.out.println("unbalanced");
			}
		}
	
	}
}
