package com;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator <Employee> {
	@Override
	public int compare(Employee x, Employee y) {
		return x.name.compareTo(y.name); // return y.name.compareTo(x.name)
	}
}
//x = inserted object
// y = exisitng object
//compare string object
// we are using compareTo() of string class in line no 8