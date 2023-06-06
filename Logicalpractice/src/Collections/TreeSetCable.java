package Collections;

import java.util.TreeSet;

public class TreeSetCable implements  Comparable<TreeSetCable>{
 int id;
 String name;
TreeSetCable(int id, String name){
	this.id=id;
	this.name=name;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

@Override
public int compareTo(TreeSetCable o) {
	// TODO Auto-generated method stub
	return this.id-o.id;
}
public static void main(String[] args) {
	
	TreeSetCable s1= new TreeSetCable(20,"Utkarsh");
	TreeSetCable s2= new TreeSetCable(10,"utkarsh");		
	TreeSetCable s3= new TreeSetCable(30,"Urvashi");
	TreeSetCable s4= new TreeSetCable(40,"urvashi");	
	TreeSet<TreeSetCable> t = new TreeSet<TreeSetCable>();
	t.add(s1);
	t.add(s2);
	t.add(s3);
	t.add(s4);
	for(TreeSetCable s :t) {
		System.out.println(s);
	}
}
}