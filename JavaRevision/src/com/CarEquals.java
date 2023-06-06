package com;
class Car{
	String brand;
	int cost;
	
	Car(String brand, int cost){
		this.brand= brand;
		this.cost =cost;
	}
	@Override // Object obj = new Car("Hundai",2000)
	public boolean equals(Object obj) {                           //1
		Car c = (Car)obj;                                         //2
		return this.brand.equals(c.brand)&& this.cost == c.cost;  //3
	}
	
}
public class CarEquals {
public static void main(String[] args) {
	Car c1 = new Car("Hundai",2000);
	Car c2 = new Car("Hundai", 3000);//this is going to initialise obj
	Object o = new Car("Hundaie",399);
	System.out.println(o.brand);
	System.out.println(c1.equals(c2));
	System.out.println(c1.equals(new Car("hundai",200)));
	if(c1.equals(c2)==true) {
		System.out.println("car details are same");
	}
	else {
		System.out.println("Car deails are different");
	}
}
}
