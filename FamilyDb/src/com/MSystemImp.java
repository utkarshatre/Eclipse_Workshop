package com;
import java.util.*;

import customException.MemberNotFoundException;
import customSorting.SortByAge;
import customSorting.SortByName;
import customSorting.SortBySno;
import customSorting.SortByNo;
import customException.InvalidChoiceException;
public class MSystemImp implements MSystem{
	Map<Integer,Members> map = new LinkedHashMap<Integer, Members>();
	Scanner ip = new Scanner(System.in);
	public void add() {
		System.out.println("---------------------------------------------\nAdd : ");
		System.out.print("name :");
		String n = ip.next();
		System.out.print("age");
		int age = ip.nextInt();
		System.out.print("no");
		int no = ip.nextInt();
		Members m = new Members(n,age,no);
		map.put(m.getSerial(),m);
	}
	public void read() {
		System.out.println("----------------------------------------------------\nRead : ");
		System.out.println("enter member s/no");
		int i = ip.nextInt();
		if(map.containsKey(i)) {
			Members m = map.get(i);
			System.out.println("Name "+m.getName());
			System.out.println("Age "+m.getName());
			System.out.println("name "+m.getName());
		}
		else {
			try {
				String message = "member s/no not found";
				throw new MemberNotFoundException(message);
				}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
    public void readall() {
		System.out.println("------------------------------------------------------\nReadAll : ");
		if(map.size()!=0) {
			Set<Integer> key = map.keySet();
			for(Integer keys : key) {
				Members m = map.get(keys);
				System.out.println(m);
			}
		}
		else {
			try {
				String message = "No data found";
				throw new MemberNotFoundException(message);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
    }
    public void delete() {
		System.out.println("--------------------------------------------------------\nRemove : ");
		System.out.println("Enter menmber s/no "+map);
		int i = ip.nextInt();
		Members m = map.get(i);
		if(map.containsKey(i)) {
			System.out.println(map.get(i) +"is going to delete");
			map.remove(i);
			System.out.println("Stduent record deleted succesfully");
		}
		else {
			try {
				String message =  "invalid id "+map.get(i);
				throw new MemberNotFoundException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
    public void deleteall() {
		System.out.println("-----------------------------------------------------------\nDeleteAll");
		map.clear();
	}
    public void update() {
		System.out.println("Enter member s/no");
		int i = ip.nextInt();
		if(map.containsKey(i)) {
			System.out.println("Member Found now press");
			Members m = map.get(i);
			System.out.println("1: update name");
			System.out.println("2: update age");
			System.out.println("3: update no");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name : ");
				String name = ip.next();
				m.setName(name);
				break;
			case 2:
				System.out.println("Enter Age : ");
				int age = ip.nextInt();
				m.setAge(age);
				break;
			case 3:
				System.out.println("Enter no : ");
				int no = ip.nextInt();
				m.setNo(no);
				break;
				default:
					try {
						String message = "wrong choice";
						throw new InvalidChoiceException(message);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
			}
			
		}
		else {
			try {
				String message = "invlaid s/no";
				throw new InvalidChoiceException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
    public void count() {
		
    	System.out.println(map.size());
	}
    public void sort() {
		Set<Integer> key = map.keySet();
		ArrayList<Members> a = new ArrayList<Members>();
		for(Integer keys :key) {
			a.add(map.get(keys));
		}
		System.out.println("1: Sort by ID\n2: Sort by Age");
		System.out.println("3: Sort by Name\n2: Sort by Marks");
		System.out.println("Enter choice");
		
		int choice= ip.nextInt();
		switch(choice) {
		case 1:
			System.out.println("sort by s/no");
			Collections.sort(a, new SortBySno());
			break;
		case 2:
			System.out.println("Sort by name");
			Collections.sort(a,new SortByName());
			break;
		case 3:
			System.out.println("sort by age");
			Collections.sort(a,new SortByAge());
			break;
		case 4:
			System.out.println("Sort by no");
			Collections.sort(a,new SortByNo());
			break;
			default:
				try {
					String s = "invalid choice";
					throw new InvalidChoiceException(s);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
	}
    public void elder() {
    	if(map.size()>=2) {
		Set<Integer> key = map.keySet();
		LinkedList <Members> list = new LinkedList<Members>();
		for(Integer keys : key) {
			list.add(map.get(keys));
		}
		Collections.sort(list, new SortByAge());
		System.out.println(list.get(list.size()-1));
	}}
    public void younger() {
		Set<Integer> key = map.keySet();
		LinkedList<Members> list = new LinkedList<Members>();
		for(Integer keys : key) {
			list.add(map.get(keys));
		}
		Collections.sort(list, new SortByAge());
		System.out.println(list.get(0));
	}
}
