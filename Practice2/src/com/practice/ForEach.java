package com.practice;


public class ForEach 
{
	public static void main(String[] args) 
	{
		char i[] = {'a','b','c','d'};
		int c=0;
		for(char j :  i)
		{
			c++;
			System.out.println(j+" collection of sub data of i stored in combiined form in j");
		}
		System.out.println(c+" no of elements");
		
	}
}
