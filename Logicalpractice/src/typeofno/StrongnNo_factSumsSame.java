package typeofno;

public class StrongnNo_factSumsSame {
public static void strong(int a) {
	int b=a;
	int sum=0;
	while(a!=0) {
		int l = a%10;
		int f=1;
		while(l>=1) {
			f=f*l;
			l--;
		}
		sum=sum+f;
		a=a/10;
	}
	if(b==sum) {
	System.out.println("strong");
	}
	else {
		System.out.println("not a strong");
	}
}
public static void main(String[] args) {
	strong(143);
}
}
