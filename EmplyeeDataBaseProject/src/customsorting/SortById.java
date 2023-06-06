package customsorting;
import java.util.Comparator;
import edbms.Employee;

public class SortById implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		String x=e1.getId();    //Autoboxing
		String y = e2.getId();  //
		return x.compareTo(y);
	}
}