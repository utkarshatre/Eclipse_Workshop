package Car;

import java.util.*;

public class SortCar {
	public static void main(String[] args) {
		Car c1=new Car(200);
		Car c2=new Car(300);
		Car c3=new Car(100);
		TreeSet<Car> c = new TreeSet<Car>();
		c.add(c3);
		c.add(c1);
		c.add(c2);
		System.out.println(c);
		for(Car s : c) {
			System.out.println(s);
		}
	}
}
