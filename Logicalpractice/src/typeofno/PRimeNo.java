package typeofno;

public class PRimeNo {
public static int check(int a) {
	 if(a%2==0) {
		return a;	
	}
	return 0;
}
public static int check1(int a) {
	int count=0;
	for(int i =0; i<=a;i++) {
		if(a%2==0) {
	}
		count++;
	}
	if(count==2) {
		return a;
	}
	return 0;
}
public static void main(String[] args) {
System.out.println(check(6));
System.out.println(check1(6));
}
}
