package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Beanclass implements Comparator<Beanclass>{
	String name;
	int id;
	int year;
	Beanclass(String name, int id, int year){
		this.name=name;
		this.id=id;
		this.year=year;
	}
	public void setName() {
		this.name=name;
	}
	public String getName(String name) {
		return name;
	}
	public void setID() {
		this.id=id;
	}
	public int GetId(int id) {
		return id;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Beanclass [name=" + name + ", id=" + id + ", year=" + year + "]";
	}
	@Override
	public int compare(Beanclass o,Beanclass y) {
		// TODO Auto-generated method stub
		return o.id-y.id;
	}
	public static void main(String[] args) {
		Beanclass b1=new Beanclass("a",1,1998);
		Beanclass b2=new Beanclass("b",3,1998);
		Beanclass b3=new Beanclass("c",2,1998);
		// sort = new SortById();
		TreeSet<Beanclass> t = new TreeSet<Beanclass>();
		t.add(b1);
		t.add(b2);
		t.add(b3);
		//System.out.println(t);
		for(Beanclass b: t) {
			System.out.println(b);
		}
		}
	
}
