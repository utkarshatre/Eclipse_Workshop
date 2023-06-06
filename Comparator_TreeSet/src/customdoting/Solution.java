



package customdoting;
import java.util.TreeSet;
public class Solution {
	public static void main(String[] args) {
		Student s1 = new Student(20,"A");
		Student s2 = new Student(40,"B");
		Student s3 = new Student(10,"C");
		StudentSortByAge age = new StudentSortByAge();

		TreeSet<Student> t1 = new TreeSet<Student>(new StudentSortByAge());
		//OR DIRECTLY 
		TreeSet<Student> t = new TreeSet<Student>(age);
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		for(Student s :t1) {
			System.out.println(s);
		}
	}
}
/* comparator interface jdk1.2
 * create a new class whch implements comparator interface
 * anf import from java.utilpackage
 * specify generics
 * override compare()
 * sybntax: public int compare(element x, element y)
 * create an ovbject of sorting logic class and paste it to constructor
 * of treeset
 */