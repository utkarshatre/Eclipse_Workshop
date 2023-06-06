package com.practice;
import java.util.Scanner;

class ReplaceCharOnly
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip = new Scanner(System.in);
         String s= ip.next();
         String a="";
        for(int i=0; i<=s.length()-1;i++)
        {
        	char c=s.charAt(i);
        	if(c>=65&&c<=90 || c>=97&&c<=122)
        	{
        		a=c+a;
        	}
        }
        String b="";
        int count=0;
        for(int i=0; i<=s.length()-1;i++)
        {
        	char c = s.charAt(i);
        	if(c>=65&&c<=90 || c>=97&&c<=122)
        	{
        		b=b+a.charAt(count);
        		count++;
        	}
        	else
        	{
        		b=b+c;
        	}
        }
        System.out.println(b);
        System.out.println(a);
    }
}

