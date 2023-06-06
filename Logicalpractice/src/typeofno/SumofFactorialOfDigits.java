package typeofno;

public class SumofFactorialOfDigits {
	public static void factsumdigit(int a) {
		int sum=0;
		while(a!=0) {
			int l =a%10;
			int f=1;
			while(l>=1) {
				f=f*l;
				System.out.println(f);
				l--;
			}
			sum+=f;
			a=a/10;
			System.out.println("sum"+sum);
		}
	}
	public static void main(String []args) {
		factsumdigit(145);
	}
}
