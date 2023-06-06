


package typeofno;

public class swap2no {
	public static void type1(int a, int b) {
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("a is "+a+" b is "+b);
	}
	public static void type2(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a+" b is "+b);
	}
	public static void  type3(int a, int b) {
		a=a^b;    
		b=a^b;    
		a=a^b;   
		System.out.println("a is "+a+" b is "+b);
	}
public static void main(String[] args) {
type1(2,3);
type2(2,3);	
type3(2,3);
}
}
