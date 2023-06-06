package String;

public class Stringmethods {
	

	public static void main(String[] args) {
		 String nc1 = new String ("UtkarshAtre");
		 						// 012345678910
		 String nc2 = new String("utkarsh");
		 String c1 ="utkarsh";
		 String c2 ="utkarsh";
		 
		System.out.println(c1.equals(nc1));
		System.out.println(c1.hashCode());
		System.out.println(nc2.hashCode());
		System.out.println(c1.toString());
		
//		true
//		-113450510
//		-113450510
//		utkarsh
		
		System.out.println(nc1.charAt(6));  //give the char at index
		System.out.println(nc1.length());  //gives the length from 1
		System.out.println(nc1.indexOf("a"));  //give index of char
		System.out.println(nc1.indexOf("a",4));  //gives index of char wiht starting char
		System.out.println(nc1.equals("UtkarshAtre"));  //compare wiht hash code
		System.out.println(c1.equals(nc2));   //   equals the characters
		System.out.println(nc1.substring(0,7));  //  create a string  wiht index to no ofo character
		System.out.println(nc1.equalsIgnoreCase("utkarshatre")); //equals string without upper lower
		System.out.println(nc1.toLowerCase());  // convert to lower
		System.out.println(nc1.toUpperCase());  //convert to upper
		
		System.out.println(c1==nc2);     //     address FALSE
		System.out.println(c1.equals(nc2));//   hashcode TRUE
		
		
	
	}


}
