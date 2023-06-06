package defaultsorting;

public class Demo {
public static void main(String[] args) {
	String a = "A";
	String b = "B";
	System.out.println(a.compareTo(b));  //-1
	System.out.println(a.compareTo(a));  //0
	System.out.println(b.compareTo(a));  //1
	Double c=18.4;
	Double d=24.3;
	System.out.println(d.compareTo(c));  //1
	System.out.println(c.compareTo(c));  //0
	System.out.println(c.compareTo(d));  //-1
}
}
