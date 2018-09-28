package edu.ho.java.hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
	
	int lives = 5;
	
	String[] wordList = {"Search", "Application", "Homeostatic", "General"}; // Array list
	

//--------------------------------------
	Random random = new Random();
	String word = wordList[new Random().nextInt(wordList.length)];
	
	public void maskWord() {
		
		// Choose random word from Array
		for (int i = 0; i <= word.length(); i++) {
			System.out.print("*");
		}			
	}
//--------------------------------------
	
	public void hint() {
		System.out.println("Looking");
	}
//--------------------------------------	
	
	public void getuserInput(){
		Scanner userInput = new Scanner(System.in); 
		String guess = userInput.nextLine();	// This will ask for user input
		
		//This will check if user input is valid
		if( guess.length() > 1) {
			System.out.println("Pleasa enter only one letter.");
		}
		else if(guess.length() < 1 || guess.length() == 0){
			System.out.println("Please enter a letter.");
		}
		else if(guess == word) {
			System.out.println(word.charAt(guess));
		}
	}
	
//---------------------------------------
	public void revealLetter() {
		System.out.println(" ");
		for(int i = 0; i < wordList.length; i++) {
			System.out.print(wordList.length);
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
