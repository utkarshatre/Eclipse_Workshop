package absraction;
 abstract class Abc {
	  public int a;
public static  int b;
	public abstract void fn();
	public void fn2() {
		
	}
	public Abc(int a) {
		this.a=a;
		System.out.println(a);
	}
}
 class Abs extends Abc{
	public Abs(int a) {
		super(a);
		System.out.println(a+"dgd");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fn() {
		System.out.println("hii i am abstract");
	}
	@Override
	public void fn2() {
		System.out.println("byeee");
	}
 }
	public class Hii{
		public static void main(String[] args) {
			Abc a=new Abs(6);
			a.fn();
			a.fn2();
			Abc.b=4;
			System.out.println(Abc.b);
		}
	
}
