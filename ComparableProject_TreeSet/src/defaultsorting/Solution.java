package defaultsorting;
import java.util.TreeSet;
public class Solution {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("B");
		ts.add("A");
		for(String s : ts) {
			System.out.println(s);
		}
		System.out.println("================================");
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);
		t.add(30);
		t.add(20);
		t.add(10);
		for(Integer a: t) {    // use Integer a or int bcz of defualt unboxing and downcasting

			System.out.println(a);
		}
		
	}
}
/*Rules or Implemen
 * tation of treeset
 * when u add an object into treeset internally compareTo() gets called
 * returnn type of compareTo() is int , +1, -1, 0==
 * underlying datastructor of treeset is binary treee
 * triversying order of treeset is left node parent node right node
 *compareTo is present in al the wrapper classes and string class
 *if u add intger object so integer class of compareTo() is claeed 
 *if you add string object so string class of compareTo() is classed
 **/
 
