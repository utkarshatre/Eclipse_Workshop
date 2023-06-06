package com;
import java.util.*;
public class TreeSetUser implements Comparable<TreeSetUser>{
	int no;
	String name;
	public TreeSetUser(int no, String name) {
		this.no=no;
		this.name=name;
	}
	@Override
	public String toString(){
		return (no+" "+name);
	}
	@Override
	public int compareTo(TreeSetUser r){
		return this.no-(r.no);
	}
	
}
// THIS IS DIRECTLY INT VALUE GIVES - OR +
//ACCORDING TO TREE DIAGRAM