package edu.ho.java.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * This class’s methods will introduce and let the user play the game “Hangman”. 
 * The algorithm will start the game with game rules and create a mask for the word we are guessing. 
 * When the player guesses all of the letters/word correctly or lose all of the lives, 
 * the game will ask play if they want to play it again or not.
 */

public class Hangman {
	
	private static final Scanner userInput = new Scanner(System.in);
	private Random random = new Random();

	private final String[] wordList = { "search", "application", "homeostatic", "general" };
	private String randomWord = wordList[random.nextInt(wordList.length)];
	private String tempMask = "";
	private int lives = 10;
	
	public void startGame() throws InterruptedException {
		System.out.println("Welcome to hangman!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Here are the rules:");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1. You have 10 chance to guess the word!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2. Have only 1 hint!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("*The best way to win this is pay attention to the hint!");
		System.out.println("\nPress enter to continue");
		userInput.nextLine();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "); 
		System.out.println("***Start***");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Your word have " + randomWord.length() + " letters.");
		playGame();
	}
	
	private void playGame() throws InterruptedException {
		while (true) {
			System.out.println("\nYou have " + lives + " lives left.");
			printHint(randomWord);
			System.out.print("Guess: ");
			String guess = userInput.nextLine().toLowerCase();
			generateMasks(guess);
		}
	}
	
	private void printHint(String word) {
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
	
	private void generateMasks(String guess) throws InterruptedException{
		String completionMask = ""; // We use this mask later to check if we reveal all the letter.. so we can win.
		tempMask += guess; // Store all our guess in tempMask.
		checkLive(guess);
		System.out.println("---------------------------------------------------------");
		System.out.print("Word: ");
		completionMask = createMask(completionMask);
		checkForCompletion(completionMask);
	}
	
	void checkLive(String guess) {
		if (!randomWord.contains(guess)) {
			lives--;
		}
	}
	
	String createMask(String wordToMask) {
		String currentMask = wordToMask;
		for (int i = 0; i < randomWord.length(); i++) {
			if (tempMask.contains(String.valueOf(randomWord.charAt(i)))) {
				System.out.print(randomWord.charAt(i));
				currentMask += String.valueOf(randomWord.charAt(i));
			} else {
				System.out.print("*");
				currentMask += "*";
			}
		}
		return currentMask;
	}
	
	void checkForCompletion(String completionMask) throws InterruptedException{
		if (isSolved()) {
			System.out.println("\n Game Over!");
			playAgain();
		} else if (isRevealed(completionMask)) {
			System.out.println("\nWin!");
			playAgain();
		}
	}
	
	boolean isSolved() {
		return lives == 0;
	}
	
	boolean isRevealed(String mask) {
		return !mask.contains("*");
	}
	

	private void playAgain() throws InterruptedException {
		System.out.println("\nDo you want to play again?: \nType y or Y for yes");
		String userResponse = userInput.nextLine();
		if (String.valueOf(userResponse).equals("y") || String.valueOf(userResponse).equals("Y")) {
			lives = 10;
			tempMask = "";
			this.startGame();
		} else { 
			// Create a loop that keep asking the user input to play the game, if the user
			// don't want to play, the screen will keep clearing.
			System.out.println("Game end.");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");
			@SuppressWarnings("unused")
			String input = userInput.nextLine();
			this.playAgain();
		}
	}
}