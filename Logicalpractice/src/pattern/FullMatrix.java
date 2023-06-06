package pattern;

public class FullMatrix {
public static void all(int r, int c) {
	for(int i =1; i<=r; i++) {
		for(int j =1; j<=c;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	all(3,2);
	System.out.println("+========================");
	all(2,3);
}
}
