package edu.ho.java.hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
	
	Scanner userInput = new Scanner(System.in); 
	String guess = userInput.nextLine();	// This will ask for user input	
	
	int lives = 5;
	
	String[] wordList = {"Search", "Application", "Homeostatic", "General"}; // Array list for word
	String[] hintList = {"Looking", "Apply", "Chemical balance", "G_ner__"};// Array list for hint

//--------------------------------------
	Random random = new Random();
	String word = wordList[new Random().nextInt(wordList.length)];
	
	public void maskWord() {
		System.out.println(hint.indexOf(word));
		// Choose random word from Array
		for (int i = 0; i < word.length(); i++) {
			
			if(!String.valueOf(word.charAt(i)).equals(guess)) {
				System.out.print("*");
			}			
			else {
				System.out.print(word.charAt(i));
			}
		}			
	}
//--------------------------------------
	
	
//--------------------------------------	
		

		
	public void checkUserInput(){

		
		//This will check if user input is valid
		if(guess == word) {
			System.out.println(word.charAt(guess.length()));
		}
		else if( guess.length() > 1) {
			System.out.println("Pleasa enter only one letter.");
		}
		else if(guess.length() < 1 || guess.length() == 0){
			System.out.println("Please enter a letter.");
		}

	}
	
//---------------------------------------


	
//---------------------------------------
	public void game() {
		System.out.println(" ");
		if (lives == 0) {
			System.out.println("Game Over!");
			//* End game/repeat
		} 
		else {
			System.out.println("Win!");
			//* Next round
		}
	}
	
	
}
