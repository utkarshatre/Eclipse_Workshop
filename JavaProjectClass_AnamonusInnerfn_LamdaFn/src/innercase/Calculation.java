package innercase;
interface Calculate{
	void add(int a , int b);
	void mul(int a , int b);
}
class Calci implements Calculate{
	@Override
     public void add(int a , int b) {
		System.out.println(a+b);
	}
	@Override
	public void  mul(int a , int b) {
	System.out.println(a*b);
	}
	
}
public class Calculation {
	public static void main(String[] args) {
		Calci a = new Calci();
		a.add(2,3);
		a.mul(2,3);
		
		
		Calculate c = new Calculate() {
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
			}
			@Override
			public void mul(int a, int b) {
				System.out.println(a*b);
			}
		};
		c.add(2, 3);
		c.mul(2, 3);
	}
	
}
