package com.twodarray;


public class Row_ColmBasedAxis {
	public static void rowBased() {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void colBased() {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length;j++) {
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	rowBased();
	colBased();
}
}
