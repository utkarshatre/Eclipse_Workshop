package edbms;

public class Employee {
	private String id;
private String name;
private int age;
private double salary;
public static int count=101;

public Employee(String name, int age, double salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.id="jsp"+count;
	count++;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public static int getCount() {
	return count;
}

public static void setCount(int count) {
	Employee.count = count;
}

}
