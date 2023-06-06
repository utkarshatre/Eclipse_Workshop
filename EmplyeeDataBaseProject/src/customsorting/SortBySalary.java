package customsorting;
import java.util.Comparator;
import edbms.Employee;

public class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		Double x=e1.getSalary();    //Autoboxing
		Double y = e2.getSalary();  //
		return x.compareTo(y);
	}
}