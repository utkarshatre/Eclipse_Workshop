package LogicalSkill;

import java.util.Scanner;

public class DiagonalsumMatrixmul {
	public void dsum() {
		int[][]arr ={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length;j++) {
				System.out.print(arr[i][j]);
				if(i==j) {
					sum+=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("sum of dagonals is "+sum);
	}
	public void twodarrayadd() {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter arr1 row col");
		int row = ip.nextInt();
		int col = ip.nextInt();
		int arr1[][] = new int[row][col];

		for(int i =0; i<arr1.length;i++) {
			for(int j =0; j<arr1.length;j++) {
				System.out.print("enter arr1 data  ");
				arr1[i][j]=ip.nextInt();
			}
		}
		System.out.println("enter arr2 row col");
		int row1 = ip.nextInt();
		int col1 = ip.nextInt();
		int arr2[][] = new int[row1][col1];

		for(int i =0; i<arr2.length;i++) {
			for(int j =0; j<arr2.length;j++) {
				System.out.print("enter arr2 data  ");
				arr2[i][j]=ip.nextInt();
			}
		}
			int r=row1;
			int c=col1;
		int sum[][]=new int[r][c];
		for(int i =0; i<arr1.length;i++) {
			for(int j =0; j<arr2.length;j++) {
				sum[i][j] =arr1[i][j]+arr2[j][i];
			}
		}
		System.out.println("output");
		for(int i =0; i<arr1.length;i++) {
			for(int j =0; j<arr2.length;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void twodarraymatrixmul() {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int [][]mulm= new int[3][3];
		
		for(int i =0; i<arr1.length;i++) {
			for(int j=0; j<arr1.length;j++) {
				//mulm[i][j]=0;
				int sum=0;
				for(int k =0; k<arr1.length;k++) {
					mulm[i][j]+=arr1[j][k]*arr2[i][k];
					mulm[i][j]+=sum;
				}
				System.out.print(mulm[i][j]+"   ");
			}
			System.out.println();
		}

		
	}
	public static void main(String[] args) {
		DiagonalsumMatrixmul o = new DiagonalsumMatrixmul();
		//o.dsum();
		//o.twodarrayadd();
		o.twodarraymatrixmul();
	}
}
