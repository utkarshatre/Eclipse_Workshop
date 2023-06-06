package customdoting;

import java.util.Comparator;
import java.util.TreeSet;


public class Student implements Comparator<Student> {
	int age;
	 String name;
	
	public Student(int age, String name) {
	
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compare(Student x,Student y) {
		// TODO Auto-generated method stub
		System.out.println(x.age+" x and y is "+y.age);
		return x.age-y.age;
	}

public static void main(String[] args) {
		
		Student s1= new Student(20,"Utkarsh");
		Student s2= new Student(10,"utkarsh");		
		Student s3= new Student(30,"Urvashi");
		Student s4= new Student(40,"urvashi");	
		TreeSet<Student> t = new TreeSet<Student>(s3);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		for(Student s :t) {
			System.out.println(s);
		}
}
}
