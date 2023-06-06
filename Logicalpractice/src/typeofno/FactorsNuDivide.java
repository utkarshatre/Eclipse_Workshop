package typeofno;

public class FactorsNuDivide {
	public static int factors(int a) {
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
		System.out.println(i);
			}
		}
		return 0;
	}
public static void main(String[] args) {
	System.out.println(factors(12));
}
}
