package typeofno;

public class DuckNo {
	public static void duck1(int a) {
		if(true){
			while(a!=0) {
				int l =a%10;
				if(l==0) {
					System.out.println("its  duck no");
					break;
				}

				a=a/10;
			}
		}
		else {
			System.out.println("its not a duck no");
		}
	}
	public static void main(String[] args) {
		duck1(101);
	}
}
