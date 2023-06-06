package Bank;

public class Account {
private int blc;
private String name;
public Account(int blc, String name) {
	super();
	this.blc = blc;
	this.name = name;
}
public int getBlc() {
	return blc;
}
public void setBlc(int blc) {
	this.blc = blc;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
