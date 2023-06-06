
public class Divide {
	public void m(int j) {
		int d=10;
		d=d/j;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Divide divide= new Divide();
		int d=0;
		if(d==0) {
			try {
				throw new CustomOfZero();
			}
			catch(CustomOfZero e) {
				divide.m(e.m());
			}
		}
		else {
			divide.m(d);
		}
	}
}
