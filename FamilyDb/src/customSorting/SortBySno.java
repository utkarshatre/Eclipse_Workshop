package customSorting;
import java.util.Comparator;
import com.Members;
public class SortBySno implements Comparator<Members> {
	@Override
	public int compare(Members x, Members y) {
		return x.getSerial()-(y.getSerial());
	}
}
