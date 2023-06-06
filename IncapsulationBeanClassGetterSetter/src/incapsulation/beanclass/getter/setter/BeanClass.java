package incapsulation.beanclass.getter.setter;
class Login{
	private 
	String id;
	private String pw;
	public String getid() {
		return id;
	}
	public String setid(String id) {
		return this.id=id;
	}
}
public class BeanClass {
	public static void main(String[] args) {
		Login l = new Login();
		System.out.println(l.getid());
		l.setid("utkarsh");
		System.out.println(l.getid());
		l.setid("atre");
		System.out.println(l.getid());
		System.out.println(l.getid());
		
	}
}
