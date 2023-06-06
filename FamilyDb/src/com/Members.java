package com;

public class Members {
	private String name;
	private int age;
	private int no;
	private int serial;
	static int count =1;
	
	Members (String name, int age,int no ){
		this.serial=count;
		this.name = name;
		this.age=age;
		this.no = no;
		count++;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial= serial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Name "+name+ " of age  "+age+" and no is "+no;
	}
		
}
