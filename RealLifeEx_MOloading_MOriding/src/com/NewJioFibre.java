package com;
                                 //overriding
public class NewJioFibre extends NewJio{
	public NewJioFibre(String name, String add, int voterid,int adcard){
	super(name, add, voterid,adcard);	
	}
	public NewJioFibre(String name, String add, int voterid) {
		super(name,add,voterid);
	}
	public void newSim() {
		System.out.println(no+" 5g network accessible");	
	}
	public static void main(String[] args) {

		NewJioFibre n = new NewJioFibre("Samarth","Indore",567);
		System.out.println("____________________________________");
		NewJioFibre n1 = new NewJioFibre("Utkarsh","Indore",567,766564534);
	}
}