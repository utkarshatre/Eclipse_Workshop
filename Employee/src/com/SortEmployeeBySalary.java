package com;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator <Employee>{
	@Override
	public int compare(Employee x, Employee y) {
		return x.salary.compareTo(y.salary); //y.salary.compareTO()(x.salary) for deending
	}
}
//x = object to be inserted
//y = exisitng object
//compare Double object
//we are using compareTo() of double class in line no 8
