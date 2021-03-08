package edu.ho.java.hangman_v2;

import java.util.List;
import java.util.Scanner;

public class Game {
	private int lives = 6;
	private String guesses = "";
	private String hint;
	private String word;

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public String getGuesses() {
		return guesses;
	}

	public void setGuesses(String guess) {
		this.guesses += guess;
	}

	public String getHint() {
		return hint;
	}

	public String getWord() {
		return word;
	}
	
	public void setGame(String word, String hint) {
		this.word = word;
		this.hint = hint;
	}
	
	public void printGameStatus(Scanner input) {
		System.out.println("Word: " + maskWord());
		System.out.println("Hint: " + getHint());
		System.out.println("Lives: " + getLives());
	}
	
	public void getUserGuess(Scanner input) {
		String guess = input.nextLine();
		setGuesses(guess);
		checkLives(guess);
	}
	
	public String maskWord() {
		String mask = "";
		for (int i = 0; i < word.length(); i++) {
			String currentChar = String.valueOf(word.charAt(i));
			if (guesses.contains(currentChar)) {
				mask += currentChar;
			} else {
				mask += "*";
			}

		}
		return mask;

	}

	public void checkLives(String guess) {
		if (!word.contains(guess)) {
			lives--;
		}
	}

	public boolean isSolved() {
		return !maskWord().contains("*");
	}

	public boolean isDead() {
		if (getLives() == 0) {
			return true;
		} else {
			return false;
		}

	}

}
