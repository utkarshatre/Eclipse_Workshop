package String;

import java.util.Arrays;
import java.util.Stack;
//bubble sort
//string anagram
//armstromng no
//ocurance of each character
//diff between diagonal sum in 2d Arry
//mutionltipca of 2d aray
//Stringp1 "hello hi bye" to "hellO hI byE"


//Stringp2 "hello 14 ih 13 bye 17 welcome 1 bye 16"
	//even - add
   //odd = substract
   //-1
public class StringLogic {
	public static void main(String[] args) {
		 String s1="cpp";
//       int x=123;
//       //Complete this line
//       int space=15;
//
//       for(int j=0;j<=space;j++) {
//      	 //System.out.println(space);
//      	 int c=0;
//           if(s1.charAt(j)!=0&&s1.charAt(j)!=' '){
//               c++;
//               //System.out.println(c);
//
//           }
//           space=space-c;
//           s1=s1+' ';
//       }
//
//      System.out.println("outside"+space);
//       s1=s1+x;
//       System.out.println(s1);
		//toCharArrayy();

//		
//		
//		reverse("abcdefgh");
//		reverseconcate("abcdefgh");
	//	palidrome("abccba");
//		ceterreverse("12||AB@KL");
//		unique("hello hi byeee");
//		duplicate("hello hi byeee");
//		string2array("utkarsh atre");
//		char[] carr = {'a','t','r','e'};
//		String s = "utkarsh atre ji";
//		array2string(carr);
//		char []c = s.toCharArray();
//		System.out.println(c);
//		noOfChar("hello");
//		noOfWords("hello hi byeee");
//		noOfSpaces("hello hi byeee");
//		removeExtraSpaces("hello   hi   byeee");
//		mirrorwords("hello   hi   byeee");
//		wordsToArray("hello hi byeee");
//		balanced("((((()))()()()))"); //"()()()()" b"))))(((("unb "))()()()(("unb "((()))()()()))"unb
//		balancedByStack("((((()))()()()))");
//		tableform("ut");
//			//countword();
		//replace();
		//bubbleSort();
		//stringAnagram();
		//armStrongNo();
		//ocuranceOfEachChar();
		//diffOfDiagoanlSum2dArray();
		//stringp1();
		 //stringLu();
		//stringp2();
		immutablity();
//		
//		
//		
//		
	}
	public static void immutablity() {
		Integer s1 = 10;//"utkarsh";
		
		int b = s1;
		
		s1= s1+20;//" atre";
		System.out.println(s1);
		System.out.println(b);
		
	}
	
	
	
	public static void reverse(String s) {
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));

		}
		System.out.println(s.compareTo("abcdefgh"));

		
	
	}
	public static void stringp2() {
		String s ="hello 14 in 13 bye 17 welcome 1 bye 16";
		for(int i=1; i<s.length();i++) {
			String s1="";
			int k=0;
			if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
				s1=s1+s.charAt(k);
				k++;
			}
		
			System.out.print(s1);
			
		}
	}
	public static void toCharArrayy() {
		char c1 = 'A';
		int j=c1;
		//System.out.println(i);
		
		String s3 = "hii hello bbyee";
		char []a= s3.toCharArray();
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void stringLu() {
		String s = "Utkarsh";
		String s1 ="";
		for(int i =0; i<s.length(;i++) {
			char ch = s.charAt(i);
			if(ch=='U') {
				ch+=32;
				s1=s1+ch;
			}
			else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		
	}
	public static void stringp1() {
		String s="hello hi bye";
		String []arr =s.split(" ");
		for(int i =0; i<arr.length;i++) {
		 String g=arr[i];
		 String d="";
		 char c=(char)(g.charAt(g.length()-1)-32);
		 for(int j=0; j<g.length();j++) {
			if(g.charAt(j)==c+32) {
				d=d+c;
			}
			else {
				d=d+g.charAt(j) ;
			}
		 }
		 System.out.println(d);
		}
	}
	public static void diffOfDiagoanlSum2dArray(){
		int [][]arr={{1,2,3},{1,2,3},{1,2,3}};
		int d1=0;
		int d2=0;
		for(int i =0;i<arr.length;i++){
			for(int j =0; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					d1+=arr[i][j];
				}

					d2+=arr[i][j];
				}
			}
		
		int diff=d1-d2;
		System.out.println(diff);
	}
	public static void ocuranceOfEachChar() {
		String s = "utkarshatre";
		for(int i =0; i<s.length();i++) {
			int c=0;
			for(int j=i;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
					c++;
				System.out.println(s.charAt(i)+" contains "+c+ " times");
			}
		}
	}
	public static void armStrongNo() {
		int no a= 1634;
		int no1=no;
		int no2=no;
		int c=0;
		int sum=0;
		for(int i=0;i<=c;i++) {
			if(no1!=0) {
				c++;
				no1=no1/10;
			}
		}
		System.out.println(c);
		while(no2!=0) {
			int rem=no2%10;
			int power =1;
			for(int i=1;i<=c;i++) {
				power=power*rem;
			}
			sum+=power;
			no2=no2/10;
		}
		System.out.println(sum);
	}
	public static void stringAnagram() {
		String s1= "racer";
		String s2="carer";
		char []a1=s1.toCharArray();
		char []a2= s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		boolean b= false;
		for(int i =0; i<a1.length;i++) {
			if(a1[i]==a2[i]) {
				b=true;
			}
			else {
				b=false;
			}
		}
		if(b==true) {
			System.out.println("anagram");
		}
		else {
			System.out.println("non-anagram");
		}
		
	}
	public static void bubbleSort() {
		int []a= {3,2,6,9,4,8};
		for(int i=1;i<a.length;i++) {
			if(a[i-1]>a[i]) {
				int temp=a[0];
				temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
				System.out.println(a[i-1]+" "+a[i]);
			}
		}
		for(int b :a) {
		)	System.out.println(b);
		}
	}
	public static void replace() {
		String s = "AB@C";
		String j ="";
		String a="";
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)!='@') {
				j =s.charAt(i)+j;
			}
		}
		int k =0;
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)=='@') {
				a=a+s.charAt(i);
				System.out.println(a);
	
			}
			else {
				a=a+j.charAt(k);
				k++;
				System.out.println(a);
			}
		}
		System.out.println(j);
	}
	public static void countword() {
		String s = "hello hii Indiaa hii India";
		String[] arr  = s.split(" ");
		String []arr1=s.split(" ");
		for(int i =0;i<arr.length;i++) {
			int c=0;
			for(int j =i; j<arr1.length;j++) {
				if(arr[i].equals(arr1[j])) {
					
					c++;
					arr1[j]="";
				}
			}
			System.out.println(arr[i]+ " "+c);
		}
	}
//		String s = "hello hii";
//		int len=0;
//		try {
//			for(int i =0;;i++) {
//				s.charAt(i);
//				len++;
//				}
//		}
//		catch(Exception e){
//			System.out.println(len);
//		}
//	}
	public static void reverseconcate(String s) {
		String si = "";
		for(int i =0;i<=s.length()-1;i++) {
			si=s.charAt(i)+si;
		}
		System.out.println(si);
	}
	public static void palidrome(String s) {
		String s1="";
		for(int i =0; i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		if(s.equals(s1)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palidrome");
		}
	}
	public static void ceterreverse(String s) {
		String s1="";

		for(int i =0; i<s.length();i++) {
			char c= s.charAt(i);
			if(c>='A'&&c<='Z') {
				s1=c+s1;
			}
		}
		System.out.println(s1);
		String s2="";
		int k =0;
		for(int i=0; i<=s.length()-1; i++) {
			char c = s.charAt(i);

			if(c>='A'&&c<='Z') {
				s2=s2+s1.charAt(k);
				k++;


			}
			else {
				s2=s2+c;	
			}
		}
		System.out.println(s2);    //12||AB@KL
	}
	public static void unique(String s) {
		String s1="";
		for(int i=0; i<s.length();i++) {
			char c= s.charAt(i);
			int count=0;
			for(int j =0; j<s.length();j++) {
				if(c==s.charAt(j)) {
					count++;
				}
			}
			if(count==1&&s.charAt(i)!=' ') {
				System.out.print(c);
			}
		}
		System.out.println();
	}
	public static void duplicate(String s) {
		for(int i =0; i<s.length();i++) {
			int count=0;
			for(int j=0; j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}
	public static void string2array(String s) {
		char arr[]=new char[s.length()];
		for(int i =0; i<s.length();i++) {
			arr[i]=s.charAt(i);
			System.out.println(arr[i]);
		}
		System.out.println(arr);
	}
	public static void array2string(char arr[]) {
		String s = "";
		for(int i =0; i<arr.length;i++) {
			s=s+arr[i];
		}
		System.out.println(s);
	}
	public static void noOfChar(String s) {
		for(int i=0; i<s.length();i++) {
			int c=0;
			for(int j=0; j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
				}
			}

		}

	}
	public static void noOfWords(String s) {
		int c=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println(c+1);
	}
	public static void noOfSpaces(String s) {
		int c=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println(c);
	}
	public static void removeExtraSpaces(String s) {
		String s1=s.charAt(0)+"";
		for(int i =1; i<s.length();i++) {
			if(s.charAt(i)!=' '&&s.charAt(i-1)==' ') {
				s1=s1+" "+s.charAt(i);
			}
			else if(s.charAt(i)!=' '){
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
	public static void mirrorwords(String s) {
		String s1=s.charAt(0)+"";
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=' '&& s.charAt(i-1)==' ') {
				s1=s.charAt(i)+" "+s1;
			}
			else if(s.charAt(i)!=' ') {
				s1=s.charAt(i)+s1;
			}
		}
		System.out.println(s1);

		//wordsInArray(s1);
	}
	public static void wordsToArray(String s) {
		String []arrs=s.split(" ");
		for(int i=0; i<arrs.length;i++) {
			System.out.println(arrs[i]);
		}

		int c=0;
		for(int i=0; i<s.length();i++) {
			c++;	
		}
		String arr[]=new String [c+1];
		String s2="";
		int k=0;
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				arr[k]=s2;
				k++;
				s2="";
			}
			else {
				s2=s2+s.charAt(i);

			}
			arr[k]=s2;

		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}
	public static void balanced(String s) {
		int c=0;
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)=='(') {
				for(int j=i+1; j<s.length();j++) {
					if(s.charAt(j)==')') {
						c++;
						//char g='';
						//s.charAt(j)=g;
						break;
					}
				}
			}
			
		}
		if(c*2==s.length()) {
			System.out.println("balanced");
		}
		else {
			System.out.println("unbalanced");
		}
	}
	public static void balancedByStack(String s) {
		Stack <Character> stack=new Stack<Character>();
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push(s.charAt(i));
			}
			else if(stack.empty()==false &&(s.charAt(i)==')'&&stack.peek()=='(')) {
				stack.pop();
			}
		}
		if(stack.empty()) {
			System.out.println("balanced");
		}
		else {
			System.out.println("unbalanced");
		}
	}
	public static void tableform(String s) {
		String s1=s;
		int size=15;
		int c=0;
		for(int i=0; i<=size;i++) {
			if(s.charAt(i)!=' '&&s.charAt(i)!=0) {
				c++;
			}
			s1=s1+' ';
			size-=c;
		}
		s1=s1+"hii";
		System.out.println(s1);
	}
	
}


























