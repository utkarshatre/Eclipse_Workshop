package com;
import java.util.*;
public class Customer implements Comparator<Customer>{
	String name;
	int id;
	public Customer( String name,int id) {
		this.id = id;
		this.name= name;
	}
	@Override
	public int compare(Customer x,Customer y) {
		return x.id-(y.id);
	}
	
	@Override
	public String toString() {
		return name + " "+id;
	}

}
