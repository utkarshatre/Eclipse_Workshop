package customsorting;
import java.util.Comparator;
import edbms.Employee;

public class SortByAge implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		Integer x=e1.getAge();    //Autoboxing
		Integer y = e2.getAge();  //
		return x.compareTo(y);
		//return x.getAge()-e2.getAge()
		//2.8compareTo(2.6) =+1;
		//2.8-2.6
		}
    //e1 object to be inserted
	//e2 already exsiting object
}