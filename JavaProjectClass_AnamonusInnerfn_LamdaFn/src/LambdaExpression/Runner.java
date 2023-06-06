package LambdaExpression;
interface Amazon{
	void purchase(String product);
}
class Customer implements Amazon{
	@Override
	public void purchase(String product) {
		System.out.println("purchasing "+product);
	}
}
public class Runner {
public static void main(String[] args) {
	//by having explicitly subclass / interface
	Customer c = new Customer();
	c.purchase("laptop");
	
	
	//anamonus inner class 
		Amazon a1 = new Amazon() {
			@Override
			public void purchase(String product) {
				System.out.println("purchasing "+product);
			}
		};
		a1.purchase("mobile");
	
	
	//lambda expression
		Amazon a2 = (product) ->{
			System.out.println("purchasing "+product);
		};
		a2.purchase("watch");
		}
}
