package com;

import java.util.Comparator;

public class SortById implements Comparator<Beanclass>{

	@Override
	public int compare(Beanclass o1, Beanclass o2) {
		// TODO Auto-generated method stub
		return o1.id-(o2.id);
	}

	
}
