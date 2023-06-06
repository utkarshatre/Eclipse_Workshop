package typeofno;

public class decimaltobinary {
public static void main(String[] args) {
	int n =123;
	String b ="";
	while(n!=0) {
		int s=0;
		int j =0;
		j=n%10;
		s=j%2;
		if(s==0) {
			b=s+b;
		}
		else {
			s=1;
			b=s+b;
		}
		n=n/2;
	}
	System.out.println(b);
}
}
