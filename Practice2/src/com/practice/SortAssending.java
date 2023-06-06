package com.practice;

public class SortAssending 
{
	public static void main(String[] args) 
	{
		int [] a = {5,1,4,3,2};
		for(int i =0; i<=a.length-1;i++)
		{
			for(int j=i+1; j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int ele:a)
		{
			System.out.println(ele);
		}
	}
}
