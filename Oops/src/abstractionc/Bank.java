package abstractionc;

public class Bank implements Customer{
@Override
public void trans() {
	System.out.println("Bank transaction");
}
}
