package edu.ho.java.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Hangman {
	
	private static final Scanner userInput = new Scanner(System.in);
	private Random random = new Random();

	private final String[] words = { "search", "application", "homeostatic", "general" };
	private String word = words[random.nextInt(words.length)];
	private String tempMask = "";
	private int lives = 10;
	
	boolean isRevealed(String mask) {
		return !mask.contains("*");
	}
	
	boolean isSolved() {
		return lives == 0;
	}
	
	/**
	 * Prints hints.
	 * 
	 * @param word to print hints on
	 */
	private void printHint(String word) {
		ArrayList<String> hint = new ArrayList<String>();
		hint.add("Survey");
		hint.add("Request");
		hint.add("Chemical balance");
		hint.add("Common");
		if (word == words[0]) {
			System.out.println("Your hint: A synonym of " + hint.get(0));
		} else if (word == words[1]) {
			System.out.println("Your hint: A synonym of " + hint.get(1));
		} else if (word == words[2]) {
			System.out.println("Your hint: " + hint.get(2) + " that life need");
		} else if (word == words[3]) {
			System.out.println("Your hint: A synonym of " + hint.get(3));
		}
	}

	/**
	 * Mask word and reveal letters. Also check if our word has been completely
	 * revealed.
	 * 
	 * @param guess string to search
	 * @throws InterruptedException on error playing again
	 */
	private void checkMaskedWord(String guess) throws InterruptedException{
		String mask = ""; // We use this mask later to check if we reveal all the letter.. so we can win.
		tempMask += guess; // Store all our guess, in tempMask.
		if (!word.contains(guess)) {
			// - 1 live each wrong guess
			lives--;
		}
		System.out.println("---------------------------------------------------------");
		System.out.print("Word: ");
		mask = checkMask(mask);
		compCheck(mask);
	}
	
	String checkMask(String mask) {
		// Check if we have a letter that matched with the word in guesses by the for loop.
		String currentMask = mask;
		for (int i = 0; i < word.length(); i++) {
			if (tempMask.contains(String.valueOf(word.charAt(i)))) {
				System.out.print(word.charAt(i));
				currentMask += String.valueOf(word.charAt(i));
			} else {
				System.out.print("*");
				currentMask += "*";
			}
		}
		return currentMask;
	}
	
	void compCheck(String mask) throws InterruptedException{
		// check if our word has been solved
		if (isSolved()) {
			System.out.println("\n Game Over!");
			playAgain();
		} else if (isRevealed(mask)) {
			// use newMask in this method to determine if word had been guesses
			System.out.println("\nWin!");
			playAgain();
		}
	}
	
	/**
	 * Start the game.
	 * 
	 * @throws InterruptedException
	 */
	public void startGame() throws InterruptedException {
		System.out.println("Welcome to hangman!"); // Start game
		TimeUnit.SECONDS.sleep(2); // Add in delays
		System.out.println("Here are the rules:"); // Game rules***
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1. You have 10 chance to guess the word!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2. Have only 1 hint!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("*The best way to win this is pay attention to the hint!");// ***

		System.out.println("\nPress enter to continue");

		userInput.nextLine(); // ask for user input to continue

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "); // clear screen
		System.out.println("***Start***");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Your word have " + word.length() + " letters.");
		playGame(); // move to playGame and ask for user input
	}

	/**
	 * Game thread:
	 * Print lives, print hint, user input, print maskedWord
	 * 
	 * @throws InterruptedException
	 */
	private void playGame() throws InterruptedException {
		while (true) {
			System.out.println("\nYou have " + lives + " lives left.");
			printHint(word);
			System.out.print("Guess: ");
			String guess = userInput.nextLine().toLowerCase(); // ask user input
			checkMaskedWord(guess);
		}
	}

	/**
	 * Play again after win/loss?
	 * 
	 * @throws InterruptedException
	 */
	private void playAgain() throws InterruptedException {
		System.out.println("\nDo you want to play again?: \nType y or Y for yes");
		String again = userInput.nextLine();
		if (String.valueOf(again).equals("y") || String.valueOf(again).equals("Y")) {
			lives = 10; // Reset lives
			tempMask = ""; // Reset guesses
			this.startGame();
		} else { // Create a loop that keep asking the user input to play the game, if the user
					// don't want to play, the screen will keep clearing.
			System.out.println("Game end.");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "); // clear screen
			@SuppressWarnings("unused")
			String again1 = userInput.nextLine();
			this.playAgain();
		}
	}
}