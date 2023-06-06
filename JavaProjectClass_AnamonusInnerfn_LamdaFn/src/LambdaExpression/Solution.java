package LambdaExpression;
@FunctionalInterface
interface Employee{
	void work();
}
public class Solution {
public static void main(String[] args) {
	Employee emp = ()-> {
		System.out.println("Employee is working");
	};
	emp.work();
	
}
}
