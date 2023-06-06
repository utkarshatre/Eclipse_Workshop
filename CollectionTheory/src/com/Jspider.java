package com;
import java.lang.Object;
public class Jspider{
	String branch;
	int code;
	public Jspider(String branch, int code) {
		this.branch=branch;
		this.code=code;
	}
	@Override
	public String toString() {
		return "Jspider [branch=" + branch + ", code=" + code + "]";
	}
	
	

}
