package com.practice;

public class ArrowStars 
{
	public static void main(String[] args) 
	{
		for(int i =1 ; i<=5; i++)
		{
			for( int j =1; j<=5; j++)
			{
				if((i==1||j==1 || i==j))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println(" ");
		}
		/*
	    * * * * *  
		* *        
		*   *      
		*     *    
		*       *  
	 */
		for(int i =5 ; i>=1; i--)
		{
			for( int j =1; j<=5; j++)
			{
				if((i==1||j==1 || i==j))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println(" ");
		}
	/*  *       *  
		*     *    
		*   *      
		* *        
		* * * * *  
	 */
		for(int i =1 ; i<=5; i++)
		{
			for( int j =5; j>=1; j--)
			{
				if((i==1||j==1 || i==j))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println(" ");
		}
		/*
		        * * * * *  
				      * *  
				    *   *  
				  *     *  
				*       *  
		 */
		for(int i =5 ; i>=1; i--)
		{
			for( int j =5; j>=1; j--)
			{
				if((i==1||j==1 || i==j))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println(" ");
		}
		/*
		    *       *  
			  *     *  
			    *   *  
			      * *  
			* * * * * 
		 */
	}
	
	
	

}
