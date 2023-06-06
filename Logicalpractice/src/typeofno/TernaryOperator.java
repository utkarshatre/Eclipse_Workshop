package typeofno;
public class TernaryOperator {
	public static int check(int a, int b) {
		int c = a>b?a:b;
		return c;
	}
	public static char check (char a, char b) {
		char c = a==b?a:b;
		return c;
	}
	public static boolean check1(int a, int b) {
		int c=(a>b?a:b);
		return true;
	}
public static void main(String[] args) {
	System.out.println(check(2,3));
	System.out.println(check('a','b'));
	System.out.println(check1(2,2));
}
}
