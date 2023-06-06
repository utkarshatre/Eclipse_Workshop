package Collections;

import java.util.TreeSet;

public class MainForStudent {
	public static void main(String[] args) {
		Student s1 = new Student(01,"utkarsh");
		Student s2 = new Student(02,"urvashi");
		SortById i = new SortById();
		TreeSet <Student> t = new TreeSet<Student> ();
		t.add(s1);
		t.add(s2);
		for(Student s : t) {
			System.out.println(s);
		}
	}
}
