package solid_principal;
interface Java {
	void core();
}
interface Sql{
	void rdbms();
}
interface WebTech{
	void htmlCssJs();
}
class FullStack implements Java, Sql, WebTech{

	@Override
	public void core() {
		System.out.println("complete");
	}

	@Override
	public void rdbms() {
		System.out.println("complete");
	}

	
	@Override
	public void htmlCssJs() {
		System.out.println("complete");
	}

}

public class Interface_Segerration_Principal {
public static void main(String[] args) {
	FullStack fs = new FullStack();
	fs.core();
	fs.rdbms();
	fs.htmlCssJs();
}
}
