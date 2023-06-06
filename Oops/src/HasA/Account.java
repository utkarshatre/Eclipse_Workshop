package HasA;

public class Account {
int no;
String branch;
public Account(int no, String branch) {
	super();
	this.no = no;
	this.branch = branch;
	
}
@Override
public String toString() {
	return "Account [no=" + no + ", branch=" + branch + "]";
}
}
