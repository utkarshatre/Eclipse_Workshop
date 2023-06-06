package LogicalSkill;

public class StringToNoAdd {
	public static void main(String[] args) {
		String s = "oneseveneightninezero";
		String arr[]= { "zero","one", "two", "three", "four", "five","six", "seven", "eight", "nine"};
		int sum=0;
		int add=0;
		String t ="";
		for(int i =0; i<s.length(); i++) {
			t=t+s.charAt(i);
			System.out.println(t);
			for(int j =0; j<arr.length;j++) {
				if(t.equalsIgnoreCase(s)) {
					sum+=j;
					t="";
					add*=10;
					add+=j;
					
				}
			}
			
		}
		System.out.println(add);
		System.out.println(sum
				
				
				);
	}
}
