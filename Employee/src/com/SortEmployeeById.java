package com;
import java.util.Comparator;
public class SortEmployeeById implements Comparator <Employee>{
@Override
public int compare(Employee x, Employee y) {
	return x.id-y.id; // return y.id-x.id for desending
}
}
//x = object to be inserted
//y = object already existance