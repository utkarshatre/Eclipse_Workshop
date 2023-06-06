package typeofno;

public class Factorial {
	public static int factorial(int a) {
		int f=1;
		for(int i =1; i<=a; i++) {
			f*=i;
			System.out.println(f);
			
		}
		return f;
	}
	public static int whilefact(int a) {
		int f=1;
		while(a>=1) {
			f=f*a;
		
			System.out.println(f);
			a--;
		}
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(whilefact(5));
	}
}
