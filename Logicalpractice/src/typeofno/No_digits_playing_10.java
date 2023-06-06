package typeofno;

public class No_digits_playing_10 {
public static int onesdigit(int a) {
	int l = a%10;
	return l;
}
public static void seperateall(int a) {
	while(a!=0) {
		int l=a%10;
		System.out.println(l);
		a=a/10;
	}
}
public static void addzerolast(int a) {
	while(a<=2000) {
		a=a*10;
		//a*=10;
		System.out.println(a);
	}
}
public static void sumeven(int a) {
	int even=0;
	while(a!=0) {
		int l = a%10;
		if(l%2==0) {
			even=l;
			System.out.println(even);
		}
		a/=10;
	}
System.out.println("================================");	
}
public static void last4digit(int a) {
	int c=1;
	while(a!=0&&c<=4) {
		int four=a%10;
		System.out.print(four);
		c++;
		a=a/10;
		System.out.println("=============================");
	}
}
public static void last4digitsum(int a) {
	int c=1;
	int sum=0;
	while(a!=0&&c<=4) {
		int four=a%10;
		sum+=four;
		
		c++;
		a=a/10;
	}
	System.out.print(sum);
}
public static void main(String[] args) {
	System.out.println(onesdigit(123));
	seperateall(123);
	addzerolast(123);
	sumeven(1234567);
	last4digit(12345);
	last4digitsum(12345);
}
}
