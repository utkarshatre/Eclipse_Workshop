package array;

public class Primeno{
	
	static void add(int i) {
		int a=1; 
		int b=2;
		int add=a+b;
		i++;
		System.out.println(add);
		if(i<=5) {
			add(i);

		}
		}
	public static void main(String[] args) {
		add(1);
	}
}