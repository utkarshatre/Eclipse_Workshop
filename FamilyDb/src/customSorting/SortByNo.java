package customSorting;
import java.util.Comparator;
import com.Members;
public class SortByNo implements Comparator<Members>   { 
	@Override
	public int compare(Members x, Members y) {
       return x.getNo()-(y.getNo()); 
	}
}
