package com.practice;


	class Account
	{
		String name;
		long Acc;
		double blc;
		public void details()
		{
			System.out.println("Acc holder : "+name);
			System.out.println("Acc No : "+Acc);
			System.out.println("blc is : "+blc);
		}
		public void deposit(double amt)
		{
			blc += amt;
			System.out.println(amt+" (supperclass)amount is credited to your acc and your blc is "+blc);
		}
		public void withdraw(double amt)
		{
			blc -= amt;
			if(blc>=amt)
			{
				System.out.println(amt+" (superclass) amount is deduted from your acc and your blc is "+blc);
			}
		}
	}
	class SavingAc extends Account
		{
			double roi = 11.5;
			public void saving()
			{
				blc += blc*roi;
				System.out.println("Saving blc with intrest credited "+roi+" is = "+blc);
			}
		}
	class CurrentAc extends Account
	{          
	//change method definition from doubles to ints
		@Override
		public void deposit(double AMT)
		{
			//super.deposit(AMT);
			blc += AMT;
			System.out.println(AMT+" (modify super in subclass) amount is credited to your acc and your blc is "+blc);
		}
		public void withdraw(double AMT)
		{
	       super.withdraw(AMT);    //super statement calling super class and serve superclass properties
			blc -= AMT;
			if(blc>=500)
			{
				System.out.println(AMT+" (modify super in subclass)amount is deduted from your acc and your blc is "+blc);
			}
			else
			{
				System.out.println("not proceed for current ac as your min amount should be : "+blc);
			}
		}
		public void limit()
		{
		double min = 500;
			if(blc<=min)
			{
				System.out.println("Transactio fail as you cross the blc limit is = "+min);
			}
		}
	}
	class OverridingAc
	{
		public static void main(String[]args)
		{
			CurrentAc c = new CurrentAc();
			c.deposit(5000);
			c.withdraw(400);
			c.limit();
			
		}
		
	}

