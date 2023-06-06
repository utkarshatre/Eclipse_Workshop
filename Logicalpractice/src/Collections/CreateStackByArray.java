package Collections;

public class CreateStackByArray {
	static char []stack;
	static int top=-1;
	public static void push() {
		top++;
		char a='(';
		if(a=='('||a=='{'||a=='[')
		stack[top]=a;
	}
	public static void pop() {
	      top--;
	}
	public static void main(String[] args) {
		String s = "(){}[]";
		stack= new char[s.length()];
		if(s.length()%2!=0) {
			System.out.println("unbalanced by length");
		}
		else {
			boolean f = true;
			for(int i =0; i<s.length();i++) {
				if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') {
					push();
				}
				else if((s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')&& top!=-1) {
					pop();
				}
				else{
					f= false;
					break;
				}
			}
			if(f==true ||top==-1) {
				System.out.println("balanced");
			}
			else {
				System.out.println("unbalanced");
			}
		}
	}
}