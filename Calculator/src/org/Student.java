package org;

public class Student {
	private int age;
	private String name;
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name= name;
	}
	public int getAge()
	{
		return age;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(56);
		s.setName("tom");
		int age = s.getAge();
		String  u=s.getName();
		System.out.println(u);
		System.out.println(s.getAge());
	}
}
