package com.practice;

public class ArrayMinusIrritation {
	public static void main(String[] args) 
	{
		int c=0;
		int []a= {15,7,10,5,5};
		int []b= {5,2,1,3,2};
		for(int i=0;i<a.length;i++)
		{
			
			while(a[i]>=b[i])
			{
				
				for(int j =0; j<a.length;j++)
				{
					a[j]=a[j]-b[j];
				}
				c++;
			}
		}
		System.out.println(c);
		
	}
}
