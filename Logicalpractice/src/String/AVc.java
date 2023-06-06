package String;

public class AVc { 

	public static void main(String[] args) {
	AVc obj = new AVc();
	AVc obj1=obj;
	System.out.println(obj);//add
	System.out.println(obj1);//add
	System.out.println(obj==obj1);//ture
	
	
	
	
	System.out.println(obj1.equals(obj));//true
	System.out.println(obj.hashCode()==obj1.hashCode());
	}

}
