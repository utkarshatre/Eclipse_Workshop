package com;

import java.util.*;

public class TreeSetComparator implements Comparator<Jspider> {
	@Override
	public int compare(Jspider a, Jspider b) {
		System.out.println("a "+a.code +" and b is "+b.code);
		return b.code-a.code;
	}
}
