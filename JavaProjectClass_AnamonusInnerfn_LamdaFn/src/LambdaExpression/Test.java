package LambdaExpression;
@FunctionalInterface
interface Person{
	
	String display(int age);

}
public class Test {
public static void main(String[] args) {
	


	Person p= (age)->{
		return "age : "+age;
	};
	System.out.println(p.display(23));
}
}
