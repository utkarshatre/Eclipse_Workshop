package innercase;
abstract class Person{
	abstract void eat();
}
class Tom extends Person{
	@Override
	void eat() {
		System.out.println("eating biryani");	
	}
}
public class Solution {
	public static void main(String[] args) {
		//buy having explicit subclass
		Tom t = new Tom();
		t.eat();

		//by anonymous inner class

		Person p = new Person(){
			@Override
			void eat() {
				System.out.println("eating curdrice");
			}
		};
		p.eat();
		Person pp1 = new Person(){
			@Override
			void eat() {
				System.out.println("hii");
			}
		};
		pp1.eat();
	}
}
