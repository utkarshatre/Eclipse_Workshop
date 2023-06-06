package com.practice;

public class SpuerClassFnOvMethod 
{
	public static void main(String [] args)
	{
		String s1="Hello";    
		String s2= "Hello";
		 //both s1 &s2 overriden method of string class
		System.out.println(s1.length());   //5
		System.out.println(s1.charAt(4));  //o
		System.out.println(s1.indexOf('o'));//4
		System.out.println(s1.indexOf('o',0));  //4
		System.out.println(s1.equalsIgnoreCase(s2));   //false
		System.out.println(s2.substring(0,3));    //hii
		
		System.out.println(s1.hashCode());   //12345
		System.out.println(s2.hashCode());   //12345
		System.out.println(s1.toString());   //hello
		         //OR                    //same as
		System.out.println(s1);              //hello
		System.out.println(s1.equals(s2));    //true
		if(s1==s2)
		{
			System.out.println("equals");      //adress are same so true
		}
	}

}
