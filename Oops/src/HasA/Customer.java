package HasA;

public class Customer {
int id;
String name;
Account a;
public Customer(int id, String name, Account a) {
	super();
	this.id = id;
	this.name = name;
	this.a = a;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", a=" + a + "]";
}


}
