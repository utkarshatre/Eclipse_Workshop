package pattern;

public class Diagonals {
	public static void d1(int r, int c){
		for(int i =1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void d2(int r, int c){
		for(int i=1; i<=r;i++) {
			for(int j=c; j>=1; j--)
			{
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	public static void d3(int r, int c) {
		for(int i=1; i<=r;i++) {
			for(int j=1; j<=c; j++) {
				if(j==1||i==6)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void d4(int r, int c) {
		for(int i=1; i<=r;i++) {
			for(int j=1; j<=c; j++) {
				if(i==6||j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
	public static void d5(int r, int c) {
		for(int i=1; i<=r;i++) {
			for(int j=1; j<=c; j++) {
				if(i==1||j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void d6(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
				if(i==1||i==6||j==1||j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void d7(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
				if(i==6||i==1||j==1||j==6||i==j||i+j==r+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	public static void d8(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void d9(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j=c; j>=1; j--) {
				if(j>=i) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void d10(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
			}
		}
	}
	public static void d11(int r, int c){
		for(int i =1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void d12(int r, int c){
		for(int i=1; i<=r;i++) {
			for(int j=c; j>=1; j--)
			{
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	public static void d13(int r, int c) {
		for(int i=1; i<=r;i++) {
			for(int j=1; j<=c; j++) {
				if(j==1||i==6)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void d14(int r, int c) {
		for(int i=1; i<=r;i++) {
			for(int j=1; j<=c; j++) {
				if(i==6||j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
	public static void d15(int r, int c) {
		for(int i=1; i<=r;i++) {
			for(int j=1; j<=c; j++) {
				if(i==1||j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void d16(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
				if(i==1||i==6||j==1||j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void d17(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
				if(i==6||i==1||j==1||j==6||i==j||i+j==r+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	public static void d18(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void d19(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j=c; j>=1; j--) {
				if(j>=i) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void d20(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j =1; j<=c; j++) {
				if(i>=j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void d21(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j=c; j>=1; j--) {
				if(i>=j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public  static void d22(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				if(i+j>=r+1) {
				System.out.print(" *");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}

	}
	public  static void d23(int r, int c) {
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				if(j>=i) {
				System.out.print(" *");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}

	}
	public static void main(String[] args) {
		System.out.println("======1====================================");
		d1(6,6);
		System.out.println("=======2===================================");
		d2(6,6);
		System.out.println("========3==================================");
		d3(6,6);
		System.out.println("=========4=================================");
		d4(6,6);
		System.out.println("=======5===================================");
		d5(6,6);
		System.out.println("======6====================================");
		d6(6,6);
		System.out.println("=======7===================================");
		d7(6,6);
		System.out.println("========8==================================");
		d8(6,6);
		System.out.println("=========9=================================");
		d9(6,6);
		System.out.println("==========10================================");
		d10(6,6);
		System.out.println("============11==============================");
		d11(6,6);
		System.out.println("====12======================================");
		d12(6,6);
		System.out.println("======13====================================");
		d13(6,6);
		System.out.println("========14==================================");
		d14(6,6);
		System.out.println("==========15================================");
		d15(6,6);
		System.out.println("===========16===============================");
		d16(6,6);
		System.out.println("=============17=============================");
		d17(6,6);
		System.out.println("===============18===========================");
		d18(6,6);
		System.out.println("=================19=========================");
		d19(6,6);
		System.out.println("===================20=======================");
		d20(6,6);
		System.out.println("=====================21=====================");
		d21(6,6);
		System.out.println("=====================22=====================");
		d22(6,6);
		System.out.println("=====================23=====================");
		d23(6,6);
	}
}
