package customSorting;
import java.util.Comparator;
import com.Members;
public class SortByName implements Comparator<Members>{
	@Override
	public int compare(Members x, Members y) {
		return x.getName().compareTo(y.getName());

	}
}
