package edbms;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Welcome to Employee DataBase Management System");
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	Scanner scan = new Scanner(System.in);
	EmployeeManagementSystem sms= new EmployeeManagementSystemImpl();
	while(true) {
		System.out.println("1:  Add Empployee");
		System.out.println("2:  Display Employee");
		System.out.println("3:  Display All Employee");
		System.out.println("4:  Remove Employee");
		System.out.println("5:  Remove All Employee");
		System.out.println("6:  Update Employee");
		System.out.println("7:  Count Employee");
		System.out.println("8:  Sort Employee");
		System.out.println("9:  getEmployeeWithHighestSalary");
		System.out.println("10: getEmployeeWithLowestSalary");
		int choice=scan.nextInt();
		switch(choice){
			case 1 :
				sms.addEmployee();
				break;
			case 2:
				sms.displayEmployee();
				break;
			case 3 :
				sms.displayAllEmployee();
				break;
			case 4:
				sms.removeEmployee();
				break;
			case 5:
				sms.removeAllEmployee();
				break;
			case 6:
				sms.updateEmployee();
				break;
			case 7 :
				sms.countEmpployee();
				break;
			case 8:
				sms.sortEmployee();
				break;
			case 9:
				sms.getEmployeeWithHighestSalary();
				break;
			case 10:
				sms.getEmployeeWthLowestSalary();
				break;
			default:
		}
					
				
		}
	}
}
