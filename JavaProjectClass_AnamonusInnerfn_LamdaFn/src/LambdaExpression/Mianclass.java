package LambdaExpression;
@FunctionalInterface
interface Student{
	void study(String name,String sub);
}
public class Mianclass{
	public static void main(String[] args) {
		Student s1 = (name, sub) ->{
			System.out.println(name+" is studiyng "+sub);
		};
		s1.study("utkarsh","hidu");
	}
}