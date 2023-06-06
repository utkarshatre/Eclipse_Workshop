package org;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("entre chooice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("hii");
				break;
			case 2:
				System.out.println("bye");
			case 3:
				System.out.println("thankyou");
				System.exit(0);   // Terminate the JVM (Program)
			default:
				System.out.println("invalid");
			}
			System.out.println("------");
		}
	}
}
