package Collections;

import java.util.Comparator;

public class SortById implements Comparator<Student> {
@Override
public int compare(Student x, Student y) {
	return x.getId()-y.getId();
}
}
