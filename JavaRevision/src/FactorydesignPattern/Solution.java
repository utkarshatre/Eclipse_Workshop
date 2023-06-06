package FactorydesignPattern;
class Hotel {

	Food orderFood(int choice) {
		if(choice ==1) {
			Briyani b = new Briyani();
			return b; 
	}
		else if(choice ==2) {
			CurdRice c = new CurdRice();
			return c;
		}
		else if (choice ==3) {
			EggFriedRice e = new EggFriedRice();
			return e;
		}
		else {
			return null; //object deefult value is null
		}
}
}
class Food{
	
}
class Briyani extends Food{
	@Override
	public String toString() {
		return "biryani";
	}
	
}
class CurdRice extends Food{
	@Override
	public String toString() {
		return "curdrice";
	}
}
class EggFriedRice extends Food{
	@Override
	public String toString() {
		return "eggfriedrice";
	}
}
public class Solution {
	public static void main(String[] args) {
		Hotel hotel =new Hotel();
		/**Generalisation
		 * food obj = new Biryani()
		 * Food obj = new curdrice()
		 * Food obj = new EggFriedRice()
		 * Food obj = null		 * 
		 */
		Food object =hotel.orderFood(1);
		System.out.println(object);
	}
}
