package com;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in); 
	System.out.print(" Enter your Family Name : \n");
	String i = ip.next().toUpperCase();
	System.out.println("Welcome to "+i+" Famliy");
	MSystem family = new MSystemImp();
	while(true) {
		System.out.println("1:  add\n2:  read\n3:  readall\n4:  delete\n5:  deleteall");
		System.out.print("6:  update\n7:  count\n8:  sort\n9:  elder\n10: younger");
		System.out.println("Enter your choice");
	     int choice = ip.nextInt();
		switch(choice) {
		case 1:
			family.add();
			break;
		case 2:
			family.read();
			break;
		case 3:
			family.readall();
			break;
		case 4:
			family.delete();
			break;
		case 5:
			family.deleteall();
			break;
		case 6:
			family.update();
			break;
		case 7:
			family.count();
			break;
		case 8:
			family.sort();
			break;
		case 9:
			family.elder();
			break;
		case 10:
			family.younger();
			break;
			default:
				try {
				String msg = "invalid choice";
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
	}
}
}
