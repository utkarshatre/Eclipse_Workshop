package customSorting;
import java.util.Comparator;
import com.Members;
public class SortByAge implements Comparator<Members>{
	@Override
	public int compare(Members x, Members y) {
	return x.getAge()-y.getAge();
	}
}
