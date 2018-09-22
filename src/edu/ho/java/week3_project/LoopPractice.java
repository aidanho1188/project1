package edu.ho.java.week3_project;

//*Assignment 3*
// author = Aidan
public class LoopPractice {

//			- Nest loops.
//------------------------------------------------------
// Set x = 0
	public int x = 0;
// While loop in for loop
// This for loop will repeat 20 time	
	public void forNestLoop() {
		for(int i = 0; i < 20; i++) {
			while(thisIsTrue()) { // This while statement is true if x < 10 because of boolean(thisIsTrue)
			System.out.println(x+1);				
			x++; // Each time the loop repeat, x + 1, so the loop will stop printing at 10
			
			}
		}
	}
	
	public boolean thisIsTrue(){
		if(x < 10)
			return true;
		else
			return false;
	}
	
//---------------------------------------------------------
// for loop in while loop
	public int y = 0;
	public void whileNestLoop() {
		// This while loop will repeat if y < 10.... So it will only repeat 2 times since the for loop will add 5 
		while(thisIsTrue2()) {
			// This for loop will only repeat 5 times which will make y=5
			for(int i = 0; i < 5; i++) {
				System.out.println(i+1);// Start at 1
				y++;
			}
		}
	}
	
	boolean thisIsTrue2() {
		if(y<10)
			return true;
		else 
			return false;
}
		

//---------------------------------------------------------
//			- Loop over a word, process characters
	public void createMask() {
		String word = "Photosynthesis";
		for (int i = 0; i < word.length(); i++) { // this will repeat depending on the word length
			System.out.print("*");			
		}			
	}
	

}
