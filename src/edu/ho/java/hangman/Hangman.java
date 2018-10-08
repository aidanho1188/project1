package edu.ho.java.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Hangman {
	
	Scanner userInput = new Scanner(System.in); 

// lives
	int died=0;
	int live=6;
	
//--------------------------	
	
	String[] wordList = {"search", "application", "homeostatic", "general"}; // Array list for word	
	Random random = new Random();
	String word = wordList[random.nextInt(wordList.length)];
//---------------------------This is for maskWord method	
	String guesses = "";
	String newMask = "";

//------------------------------Methods----------------------------------
	public void hint(String word) {
		ArrayList<String> hint = new ArrayList<String>();
		hint.add("Survey");
		hint.add("Request");
		hint.add("Chemical balance");
		hint.add("Common");
		// print hint with if/else statement
		if (word == wordList[0]) {
			System.out.println("Your hint: A synonym of "+ hint.get(0));
		}
		else if (word == wordList[1]) {
			System.out.println("Your hint: A synonym of "+ hint.get(1));
		}
		else if (word == wordList[2]) {
			System.out.println("Your hint: "+ hint.get(2) + " that life need");
		}
		else if (word == wordList[3]) {
			System.out.println("Your hint: A synonym of "+ hint.get(3));
		}
	}
//--------------------------------------
		
	public void maskWord(String guess) throws InterruptedException {
		guesses += guess;
		if (!guess.equals(word)) { // substact 1 live each wrong guess
			live--;
		}
		
		if (live == died) {
			System.out.println("\n Game Over!");
			this.playAgain();
		} 
		else if (newMask.contentEquals(word)){ //use guesses in this method to determind if word had been guesses
			System.out.println("Win!");
			this.playAgain();
		}
			
		System.out.println("---------------------------------------------------------");
		System.out.print("Word: " );

		for (int i = 0; i < word.length(); i++) { // Check if we have a letter that matched with the word in guesses
			if (guesses.contains(String.valueOf(word.charAt(i)))){
				System.out.print(word.charAt(i));
				newMask += String.valueOf(word.charAt(i));
			}
			else {
				System.out.print("*");
				newMask += "*";
			}

		}		
	}
	
//---------------------------------------
	public void game() throws InterruptedException {
		System.out.println("Welcome to hangman!");   //Start game 
		TimeUnit.SECONDS.sleep(2);					// Add in delays
		System.out.println("Here are the rules:"); // Game rules
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1. You have 6 chance to guess the word!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("3. Have only 1 hint!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("*The best way to win this is pay attention to the hint!");

		System.out.println("\nPress enter to continue");
		@SuppressWarnings("unused")
		String agree = userInput.nextLine(); // ask for user input to continue
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "); //clear screen
		System.out.println("***Start***");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Your word have "+ word.length()+" letters."); 
		TimeUnit.SECONDS.sleep(1);
		this.playGame();
	}
	
	public void playGame() throws InterruptedException {
		
		while (true) {
		System.out.println("\nYou have " + live + " chances left.");               // print lives
		this.hint(word);	
		System.out.print( "Guess: " );
		String guess = userInput.nextLine().toLowerCase();	 // ask user input
		this.maskWord(guess); // unmask a letter
	
	}
}
	
	public void playAgain() throws InterruptedException {   // Ask user is they want to play agian
		System.out.println("Do you want to play again?: \nType y or Y for yes\nType n or N for no");
		String again = userInput.nextLine();
		if (String.valueOf(again).equals("y") || String.valueOf(again).equals("Y")) {
		this.game();			
		}
		else {
		System.out.println("Game end.");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "); // clear screen
		String again1 = userInput.nextLine();
		this.playAgain();
		}
		
	}
	
}

