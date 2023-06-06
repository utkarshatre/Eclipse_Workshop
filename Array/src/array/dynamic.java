package array;

import java.util.Scanner;

public class dynamic {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int arr[]=new int[n];
		for(int i =0; i<arr.length;i++) {
			System.out.println("enter element");
			arr[i]=ip.nextInt();
			
		}
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]+"");
			
		}
	}
}
