package com.practice;

public class Table
{
	public static void main(String [] args)
	{
		for(int i =1; i<=10;i++) {
			for(int j =1;j<=10;j++) {
			    if(i*j<=9) {
				System.out.print(" "+j+"*"+i+"="+i*j+"   ");
				}
			    else if(i>=10) {
			    	System.out.print(" "+j+"*"+i+"="+i*j+" ");
			    }
				else {
					System.out.print(" "+j+"*"+i+"="+i*j+"  ");
	
				}
//			    
//			    if(i*j<=9) {
//					System.out.print(j+"*"+i+"="+i*j+"\t");
//					}
//				    else if(i>=10) {
//				    	System.out.print(j+"*"+i+"="+i*j+"\t");
//				    }
//					else {
//						System.out.print(j+"*"+i+"="+i*j+"\t");
//		
//					}
//				
			
			}
			System.out.println();
		}
	}
}