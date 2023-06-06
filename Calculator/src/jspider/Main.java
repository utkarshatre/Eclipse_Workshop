package jspider;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//MENU DRIVEN PROGRAME
		Scanner ip = new Scanner(System.in);
		//OBJECT CREATION
		//CalculatorImp calc= new  CalculatorImp();
		//UPCASTING
		Calculator calc= new  CalculatorImp();
		while(true) {
		System.out.println("1 for addition \n 2 for substraction \n 3 for multiplication ");
		System.out.println("4 for division \n exit \n entre choice \n -------------------");
		int choice = ip.nextInt();
		int a=0;
		int b=0;
		if(choice>=1 && choice<=4) {
			System.out.println("enter 2 no");
			a=ip.nextInt();
			b=ip.nextInt();
		}
		switch(choice) {
		case 1 :
			System.out.println("Sum of "+a+ " & "+b+" is "+calc.add(a,b));
			break;
		case 2 :
			System.out.println("sub of "+a+ " & "+b+" is "+calc.sub(a,b));
			break;
		case 3 :
			System.out.println("mul of "+a+ " & "+b+" is "+calc.mul(a,b));
			break;
		case 4 :
			int result = calc.div(a,b);
			if(result!=0) {
			System.out.println("div of "+a+ " & "+b+" is "+calc.div(a,b));
			}
			else {
				System.out.println("demoniator "+b+" is not allowed");
			}
			break;
		case 5:
			System.out.println("thankyou");
			System.exit(0);
			break;
		default :
				System.out.println(calc.displayErrorMessage());
		}
		}
	}
}