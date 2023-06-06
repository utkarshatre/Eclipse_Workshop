package com.twodarray;

import java.util.Scanner;

public class Sequence {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int ut = ip.nextInt();
 int arr[]= new int[ut];
 
	for(int i =0; i<=arr.length;i++) {
	}
	
	int s=arr[0]-arr[1];
	for(int i =2; i<arr.length;i++) {
	
			int r=arr[i-1]-arr[i];
			if(r==s|| r==(-s)) {
				System.out.println("sequence no");
			}
			else {
				System.out.println("non sequnce");
			}
	}
}
}
