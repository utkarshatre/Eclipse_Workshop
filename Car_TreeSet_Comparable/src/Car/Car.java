package Car;
public class Car implements Comparable <Car> {
	int cost;
	public Car(int cost) {
		this.cost=cost;
	}
	
	@Override
	public String toString() {
		return "Car [cost=" + cost + "]";
	}

	@Override
	public int compareTo(Car c) {
		return this.cost-c.cost;
	}
}
/*this -. object to be inserted (current object) c-. already exixting object
 * <<comparable >> pdi java.lang java.lang
 * specify generics
 * overriden compareTo() -> public int compareTo(Element  e) */
