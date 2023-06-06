package com;
import java.util.*;
public class TreeSetUser2 implements Comparable<TreeSetUser2>{
	int no;
	String name;
	public TreeSetUser2(int no, String name) {
		this.no=no;
		this.name=name;
	}
	@Override
	public String toString(){
		return no+" "+name;
	}
	@Override
	public int compareTo(TreeSetUser2 r){
		return this.name.compareTo(r.name);
	}
}
// THIS COMPARISON BY STRING BY WHICH 
//COMPARE TO CONVERT THE STRING INTO ASCI 