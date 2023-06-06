package com.practice;

public class StringObj_Array_toStirng_Direct$membername 
{
	String brand;
	StringObj_Array_toStirng_Direct$membername (String brand)
	{
		this.brand = brand;
	}
	@Override
	public String toString()
	{
		return brand;
	}
	public static void main(String[] args) {
		StringObj_Array_toStirng_Direct$membername  p1= new StringObj_Array_toStirng_Direct$membername ("pulsar");
		StringObj_Array_toStirng_Direct$membername  p2= new StringObj_Array_toStirng_Direct$membername ("deluxe");
		StringObj_Array_toStirng_Direct$membername  p3= new StringObj_Array_toStirng_Direct$membername ("punch");
		StringObj_Array_toStirng_Direct$membername  arr[] = new StringObj_Array_toStirng_Direct$membername [3];
		arr[0]= p1;
		arr[1]=p2;
		arr[2]=p3;
		for( int i =0; i<=2; i++)
		{
			System.out.println(arr[i]);  // gives object adddress
			System.out.println(arr[i].brand); //gives values
			System.out.println(arr[i].toString()); //Object toString overriden  methodcalling
		}

	}
}
