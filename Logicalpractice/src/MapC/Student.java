package MapC;

import java.util.Comparator;

public class Student {
private Integer id;
private String name;
public Student(int id, String name) {
	this.id=id;
	this.name=name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

//@Override
//public int compare(Student o1, Student o2) {
//
//	// TODO Auto-generated method stub
//	return o1.id-o2.id;
//}
}
