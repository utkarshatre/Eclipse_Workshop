package jspider;

abstract class Person{
	abstract void eat();
}
class Jerry extends Person{
	@Override          //annotation Override
	void eat() {
		System.out.println("eating biryani");
	}
}
public class Solution {
	public static void main(String[] args) {
		Jerry jerry= new Jerry();
		jerry.eat();
	}
}
//COntract of Abstract = Rules
// make the class as abstract
//Override the abstract


