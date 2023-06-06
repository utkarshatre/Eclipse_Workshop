package solid_principal;
interface ClassA{
	void method();
	
}
class ClassB implements ClassA{

	@Override
	public void method() {
		System.out.println("inherited method()");
	}
	
}
public class DependencyInjectionPrincipal {
public static void main(String[] args) {
	ClassA a = new ClassB();
	a.method();
}
}
