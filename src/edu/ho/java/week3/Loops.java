package edu.ho.java.week3;

public class Loops 
{	
		private int x;
		public void forLoopSample1() 
		
		{
			for(int i = 0; i <10 ; i++)
			{
				System.out.println(i);
			}
		}
			
		//-----------------------------------------------------------------	
		public void forLoopSample2() 
		{
			String word = "Cat";
			for(int i = 0; i < word.length(); i++ )
			{
				System.out.println(i);
				System.out.println(word.charAt(i));
			}
		}
		//------------------------------------------------------------------
		public void createMask()
		{
			String word = "Horse"; 
			for(int i=0; i< word.length(); i ++)
			{
				System.out.print("*");
			}
		}
		//-------------------------------------------------------------------
		public void whileSample()
		{
			int i = 0;
			for(int i1 = 0; i1 <10; i1++) //repeat 10 time *if only* the keepRunning() statement is still true!! ||Loop nest: loop within loop(for in while, while in for)||
			{
				while(keepRunning(i1))// Run this while the statement is true           This code is what make it a while loop
				{
					System.out.println("Help!");
					i1++; // This + 1 but we set i = 0 on top so it will repeat 
				}
			}
		}
		//-------------------------------------------------------------------
		
		private boolean keepRunning(int i ) // boolean can take augrument infinity loop       This return true make the whileSample() loop run| boolean mean 0 or 1(true or false)
		{	
			int x = 0;
			//if(x = 0) 	// We can use this code for if statement to eliminated out *. In another word use logic
			return true;
			//else
		//	return false;
		}
		//-------------------------------------------------------------------- **Practice**
		public void whileloop() 
		{
			int i = 0;
			i++;		// this two lines create loop ***
			int x = 0; // *****
			while(thisIsTrue())
			{
				System.out.println("Something");
			}
		}
		//--------------------------------------------------------------- A loop within a loop let you move to the next game(new words)
		public boolean thisIsTrue() // This is a method that return boolean(1 or 0)
		{
		//	if(int x = 0)
			return true;
		//	else
		//	return false;
		}

}

