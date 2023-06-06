package com;

import java.util.*;
public class TreeSetComparator2 implements Comparator<Jspider> {
	@Override
	public int compare(Jspider a, Jspider b) {
		return a.branch.compareTo(b.branch);
	}
}
