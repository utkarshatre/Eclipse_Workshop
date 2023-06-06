package LambdaExpression;
@FunctionalInterface
interface Mobile{
	void display(String brand , int cost);
}
public class Tom {
public static void main(String[] args) {
	//anonymonus fn with ref varoable
	Mobile m1 = new Mobile() {
		@Override
		public void display(String brand , int cost) {
			System.out.println(brand+" "+cost);
		}
	};
	m1.display("samsung", 10000);
	//anonmynous diff class without ref var
	new Mobile() {
		@Override
		public void display(String brand , int cost) {
			System.out.println(brand+" "+cost);
		}
	}.display(null, 0);
	Mobile m2 =(brand , cost)->{
		System.out.println(brand+" "+cost);
	};
	m2.display("samsung",20000);
	Mobile m3 =(brand , cost)-> System.out.println(brand+" "+cost);
	m3.display("samsung", 150000);

}
}
