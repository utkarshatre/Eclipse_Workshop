package typeofno;

public class PowOfNo {
public static void power(int no, int p) {
	int ans=1;
	while(p>=1) {
		ans=ans*no;
		p--;
	}
	System.out.println(ans);
}
public static void main(String[] args) {
	power(2,6);
}
}
