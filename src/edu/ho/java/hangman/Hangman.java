package edu.ho.java.hangman;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {
	
	Scanner userInput = new Scanner(System.in); 

	// lives
	int maxlive=6;
	int live=0;
	
	
	
	String[] wordList = {"search", "application", "homeostatic", "general"}; // Array list for word
	
//	String[] hintList = {"Survey", "Request", "Chemical balance", "Common"};// Array list for hint
	Random random = new Random();
	String word = wordList[random.nextInt(wordList.length)];

	
	public void hint(String word) {
		ArrayList<String> hint = new ArrayList<String>();
		hint.add("Survey");
		hint.add("Request");
		hint.add("Chemical balance");
		hint.add("Common");
		System.out.println("Hint: "+hint);
	}
//--------------------------------------

	public void maskWord(String guess) {
		String newmask = "";
		for (int i = 0; i < word.length(); i++) {
			if(!String.valueOf(word.charAt(i)).equals(guess.toLowerCase())) {
				System.out.print("*");
				newmask += "*";
			}
			else {
				newmask += word.charAt(i);
				System.out.print(word.charAt(i));
			}			
		}
	}


//-------------------------------------- 

//--------------------------------------	

	public void checkUserInput(String guess){
		
		//This will check if user input is valid
		if(String.valueOf(word).equals(guess)) {
			System.out.println(word);
		}
		else if( guess.length() > 1) {
			System.out.println("Pleasa enter only one letter.");
		}
		else if(guess.length() <= 0){
			System.out.println("Please enter a letter.");
		}

	}
	
//---------------------------------------


	
//---------------------------------------
	public void game() {
		for (int i = 0; i < word.length(); i++) { // create a mask for our word
			System.out.print("*");
		}
		
		while (true) {
			System.out.println(" ");
		this.hint(word);	
			System.out.print( "Guess: " );
			String guess = userInput.nextLine().toLowerCase();	 // ask user input
		this.checkUserInput(guess); // check user input
		this.maskWord(guess); // unmask a letter
		System.out.println(" ");
		

		int lives = 5;
		if (lives == 0) {
			System.out.println("Game Over!");
			//* End game/repeat
		} 
		else if (String.valueOf(word).equals(guess)){
			System.out.println("Win!");
			//* Next round
		break;
		}
	}
}
}

