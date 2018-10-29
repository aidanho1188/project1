package edu.ho.java.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Main Hangman classssss
 */
public class Hangman {
	private static final Scanner userInput = new Scanner(System.in);
	/* # of chances to guess */
	private int lives = 10;
	private final String[] wordList = { "search", "application", "homeostatic", "general" }; // Array list for word
	private Random random = new Random();
	private String word = wordList[random.nextInt(wordList.length)];
	/* Masked guess string */
	private String guesses = "";

	/**
	 * Prints hints.
	 * 
	 * @param word to print hints on
	 */
	private void hint(String word) { // Hint list
		ArrayList<String> hint = new ArrayList<String>();
		hint.add("Survey");
		hint.add("Request");
		hint.add("Chemical balance");
		hint.add("Common");
		if (word == wordList[0]) {
			System.out.println("Your hint: A synonym of " + hint.get(0));
		} else if (word == wordList[1]) {
			System.out.println("Your hint: A synonym of " + hint.get(1));
		} else if (word == wordList[2]) {
			System.out.println("Your hint: " + hint.get(2) + " that life need");
		} else if (word == wordList[3]) {
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
	private void maskWord(String guess) throws InterruptedException {
		String newMask = ""; // We use this newMask later to check if we reveal all the letter.. so we can
								// win.
		guesses += guess; // Store all our guess, in guesses.
		if (!word.contains(guess)) {
			// - 1 chance each guess
			lives--;
		}

		System.out.println("---------------------------------------------------------");
		System.out.print("Word: ");

		for (int i = 0; i < word.length(); i++) {
			// Check if we have a letter that matched with the word in guesses by the for
			// loop.
			if (guesses.contains(String.valueOf(word.charAt(i)))) { // Check guesses that we made instead of previous
																	// guess.
				System.out.print(word.charAt(i)); // Reveal a letter.
				newMask += String.valueOf(word.charAt(i));
			} else {
				System.out.print("*");
				newMask += "*";
			}
		}
		// check if our word has been solved
		if (lives == 0) {
			System.out.println("\n Game Over!");
			this.playAgain();
		} else if (!newMask.contains("*")) {
			// use newMask in this method to determine if word had been guesses
			System.out.println("\nWin!");
			this.playAgain();
		}
	}

	/**
	 * Start the game.
	 * 
	 * @throws InterruptedException
	 */
	public void game() throws InterruptedException {
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
	 * Game thread.
	 * 
	 * @throws InterruptedException
	 */
	private void playGame() throws InterruptedException {
		while (true) {
			System.out.println("\nYou have " + lives + " lives left."); // print chances
			this.hint(word); // print hint
			System.out.print("Guess: ");
			String guess = userInput.nextLine().toLowerCase(); // ask user input
			this.maskWord(guess); // unmask a letters
		}
	}

	/**
	 * Play again after win/loss?
	 * 
	 * @throws InterruptedException
	 */
	private void playAgain() throws InterruptedException {
		System.out.println("Do you want to play again?: \nType y or Y for yes");
		String again = userInput.nextLine();
		if (String.valueOf(again).equals("y") || String.valueOf(again).equals("Y")) {
			lives = 10; // Reset lives
			guesses = ""; // Reset guesses
			this.game();
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