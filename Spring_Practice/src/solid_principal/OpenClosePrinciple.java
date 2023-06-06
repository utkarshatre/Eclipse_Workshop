package solid_principal;
class Account{
	public void amount() {
		System.out.println("10000 Rs");
	}
}
class SalaryAccount extends Account{
	@Override
	public void amount() {
		System.out.println("2000Rs");
		
	}
}
class SavingAccount extends Account{
	@Override
	public void amount() {
		System.out.println("500Rs");
	}
}
public class OpenClosePrinciple {
public static void main(String[] args) {
	Account a1= new SalaryAccount();
	a1.amount();
	Account a2 = new SavingAccount();
	a2.amount();
	Account a3 = new Account();
	a3.amount();
	
 }
}
