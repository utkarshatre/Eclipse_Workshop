package com.practice;

//public class Static_NonStatic {
//
//int a=10;
//void m() {
//	a=20;										
//	System.out.println(a);
//}
//public static void main(String[] args) {          //  Static 
//	Static_NonStatic az = new Static_NonStatic();
//	System.out.println(az.a);
//	az.m();
//	
//}
//}

public class Static_NonStatic {

private int a=10;


          


public static void m() {
//	a=20;
//	System.out.println(a);
}
public static void main(String[] args) {          //  Non_Static 
	
	Static_NonStatic.m();
	System.out.println(a);

	
}
}

