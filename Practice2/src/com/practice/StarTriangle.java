package com.practice;

public class StarTriangle 
{
	public static void main(String[] args) 
	{
		for(int i =1  ; i<=5; i++)
		{
			for( int j =1; j<=5; j++)
			{
				if(j==i )
				{
					System.out.print("* ");       
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	
	/*
	    *         
		  *       
		    *     
		      *   
		        * 
	 */

		for(int i =1  ; i<=5; i++)
		{
			for( int j =1; j<=5; j++)
			{
				if(i>=j)
				{
					System.out.print("* ");       
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		/*  *         
			* *       
			* * *     
			* * * *
		* */
		for(int i =1  ; i<=5; i++)
		{
			for( int j =1; j<=5; j++)
			{
				if(i<=j)
				{
					System.out.print("* ");       
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		/*  * * * * * 
			  * * * * 
			    * * * 
			      * * 
			        *
	     */
		for(int i =5  ; i>=1; i--)
		{
			for( int j =1; j<=5; j++)
			{
				if(i>=j)
				{
					System.out.print("* ");       
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		/*
		    * * * * * 
			* * * *   
			* * *     
			* *       
			*         
		 */
		for(int i =5  ; i>=1; i--)
		{
			for( int j =1; j<=5; j++)
			{
				if(i<=j)
				{
					System.out.print("* ");       
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		/*
					* 
			      * * 
			    * * * 
			  * * * * 
			* * * * * 
		 */
		for(int i =5  ; i>=1; i--)
		{
			for( int j =1; j<=5; j++)
			{
				if(i==j)
				{
					System.out.print("* ");       
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
			//        * 
			//      *   
			//    *     
			//  *       
			//*         
		
		for(int i =5  ; i>=1; i--)
		{
			for( int j =1; j<=5; j++)
			{
				if(i==j)
				{
					System.out.print("* ");       
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		for(int i =0  ; i<5; i++)
		{
			for( int j =5-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
		for(int i =5  ; i>=1; i--)
		{
//			
			for(int k=5; k>=1;k--) {
				if(i>=k) {
				System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}	
}   
