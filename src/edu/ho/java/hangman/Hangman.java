package edu.ho.java.hangman;

import java.util.Scanner;

public class Hangman {
	
	
	String word = "Search";// Can replace with array  *use array it for hint
	int lives = 5;
	

//--------------------------------------	
	public void maskWord() {
		for (int i = 0; i < word.length(); i++) {
			System.out.print("*");
		}			
	}
//--------------------------------------
	
	public void hint() {
		System.out.println("Looking");
	}
//--------------------------------------	
	
	public void getuserInput(){
		Scanner reader = new Scanner(System.in); 
		String n = reader.nextLine();
	}
	
//---------------------------------------
	public void revealLetter() {
		System.out.println(" ");
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}
		}		

	
//---------------------------------------
	public void game() {
		System.out.println(" ");
		if (lives == 0) {
			System.out.println("Game Over!");
			//* End game/repeat
		} 
		else{
			System.out.println("Win!");
			//* Next round
		}
	}
	


}
