package typeofno;

public class nthFibonociiSeries {
public static void main(String[] args) {
	int f=0;
	int s=1;
	int n = 10;
	int sum=0;
	for(int i=2; i<=n ; i++) {
		f= s;
		s=sum;
		sum = f+s;
		System.out.println(f);
	}	
}
}
