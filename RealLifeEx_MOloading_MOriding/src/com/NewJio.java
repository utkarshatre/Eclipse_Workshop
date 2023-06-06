package com;
                 //Method Overloading

public class NewJio {
	int no=76754543;
	public NewJio(String name, String add, int voterid) {
		System.out.println("name       "+name);
		System.out.println("add        "+add);
		System.out.println("voterid    "+voterid);
		System.out.println(no);
	}
	public NewJio(String name, String add, int voterid,int adcard) {
		if(name!=null&&add!=null&&voterid!=0&&adcard!=0) {
			System.out.println("name       "+name);
			System.out.println("add        "+add);
			System.out.println("voterid    "+voterid);
			System.out.println("addharcard "+adcard);
			System.out.println("Addhar is mandatory now");
			newSim();
			}	
	}
	public void newSim() {
		System.out.println("2g network");
	}
}
