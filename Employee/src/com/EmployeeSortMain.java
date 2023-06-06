package com;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
public class EmployeeSortMain {
	public static void main(String[] args) {
		//	Employee e1 = new Employee(03,"B",65.3);
		//	Employee e2 = new Employee(02,"A",12.2);
		//	Employee e3 = new Employee(05,"C",21.4)
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(03,"B",65.3));
		list.add(new Employee(02,"A",12.2));
		list.add(new Employee(05,"C",21.4));
		Scanner ip = new Scanner(System.in);
		System.out.println("Display \n 1: SortEmployeeById \n 2:SortEmployeeByName\n 3:SortEmployeeBySalary");
		int choice =ip.nextInt();
		switch(choice) {
		case 1: 
			Collections.sort(list ,new SortEmployeeById());
			for(Employee e : list) 
				System.out.println(e);
				break;
			
		case 2 :
			Collections.sort(list,new SortEmployeeByName());
			for(Employee e : list) 
				System.out.println(e);
				break;
		
		case 3 :
			Collections.sort(list,new SortEmployeeBySalary());
			for(Employee e : list) 
				System.out.println(e);
				break;
			
default: 
	System.out.println("invalid");
	}
}
}
