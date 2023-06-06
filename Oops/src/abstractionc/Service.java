package abstractionc;

public class Service {
	Customer c;
	public Customer facility(int option) {
		if(option==1) {
			c=new Bank();
		}
		else {
			c=new Atm();
		}
		return c;
	}
}
