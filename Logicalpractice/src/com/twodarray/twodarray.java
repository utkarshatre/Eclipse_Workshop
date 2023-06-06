package com.twodarray;

import java.util.Scanner;
//diagonal sum
//take 2 twod array from user 
//sum of 2d array
//matrix mul
public abstract class twodarray {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("enter row");
		int row = ip.nextInt();
		System.out.println("enter col");
		int col = ip.nextInt();
		
		int arr[][]= new int [row][col];
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		System.out.println("=====================");
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
//		//row based axis
//		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i =0; i<=2;i++) {
//			for(int j=0;j<=2;j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//
//		}
//}

//}
