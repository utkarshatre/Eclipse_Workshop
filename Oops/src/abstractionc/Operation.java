package abstractionc;

public class Operation {
public static void main(String[] args) {

	Service s = new Service();
	Customer c=s.facility(1);
	c.trans();
}
}
