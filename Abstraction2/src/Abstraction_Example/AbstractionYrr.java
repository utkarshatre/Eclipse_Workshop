package Abstraction_Example;
interface Property{
	public void papahouse();
	public void papacar();
	public void papabike();
	public void mybike();

}
class Papa implements Property{
	@Override
	public void papahouse() {
		System.out.println("sagorkuti");
	}
	@Override
	public void papacar() {
System.out.println("waganor");
	}
	@Override
	public void papabike() {
		System.out.println("hero");
	}
	@Override
	public void mybike() {
		System.out.println("pulsar");
	}
}
public class AbstractionYrr {
	public static void main(String[] args) {
		Property p= new Papa();
		p.papahouse();
		p.papacar();
		p.papabike();
		p.mybike();
	}
}
