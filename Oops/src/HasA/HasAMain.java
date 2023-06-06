package HasA;

public class HasAMain {
public static void main(String[] args) {

	Account a = new Account(323,"Indore");
	Customer c = new Customer(101,"Utkarsh",a);
	System.out.println(c);
}
}
