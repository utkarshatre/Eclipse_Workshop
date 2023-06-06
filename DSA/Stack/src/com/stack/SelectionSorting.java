package com.stack;
public class SelectionSorting {
	public static void main(String[] args) {
		int [] a = {64,12,25,1,20,18};
		for(int i =0; i<=a.length-1;i++) {
			int min = i;
			for(int j =i; j<=a.length-1;j++) {
				if(a[min]>a[j] ){
					min = j;
				}
			}
			int temp =a[i];
			a[i]=a[min];
			System.out.println(a[i]);	
		}

		}
	}

