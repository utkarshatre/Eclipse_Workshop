package AllStrings;

public class Palindrome {
	 public boolean isPalindrome(String s) {
	       String s1="";
	      for(int i =0; i<s.length();i++){
	            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'|| s.charAt(i)>='a'&&s.charAt(i)<='z'){
	                s1=s1+s.charAt(i);
	            }
	        }
	     System.out.println(s1.toLowerCase());
	      String s2="";

	        for(int i =0; i<s.length();i++){
	            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'|| s.charAt(i)>='a'&&s.charAt(i)<='z'){
	                s2=s.charAt(i)+s2;
	            }
	        }
	        System.out.println(s2.toLowerCase());
	        if(s2.toLowerCase().equals(s1.toLowerCase())){
	            return true;
	        }
	        else{
	            return false;
	        }
	        
	    }
    public static void main(String [] args) {
   //Palindrome p = new Palindrome();
    	//System.out.println(p.isPalindrome("UtkTu"));
//    	String String = "String";
//    	System.out.println(String.charAt(2));
    	
    	for(int i =0;i<=5;i++) {
    		for(int j=0;j<=5;j++){
    			if((i+j==5+1)||(j==3&&j<i)) {
    				System.out.print("*");
    			}
    			else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println("");
    	}
    }
}
