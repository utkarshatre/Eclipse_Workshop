package customdoting;
import java.util.Comparator;
public class StudentSortByAge implements Comparator<Student>{
	@Override
	public int compare(Student x, Student y) {
		System.out.println(x.age+" x and y is "+y.age);
		return x.age-y.age;
	}
}
//x is object to be inserted
//y already existing object