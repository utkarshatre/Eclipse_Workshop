package customsorting;
import java.util.Comparator;
import edbms.Employee;

public class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		String x=e1.getName();    //Autoboxing
		String y = e2.getName();  //
		return x.compareTo(y);
	}
}