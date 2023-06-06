package org;

interface Paytm{
	int id=200;        
	//public static final int id
	void payment();    //public abstract void payment
}
class Amazon implements Paytm{
	@Override
	public void payment() {
		System.out.println("paying through paytm");
	}
}
public class MainClass {
	public static void main(String[] args) {
		System.out.println(Paytm.id);
		Amazon amazon = new Amazon();
		amazon.payment();
	}
}
//while  override a menthod access spdecifier should be same or higher visibility