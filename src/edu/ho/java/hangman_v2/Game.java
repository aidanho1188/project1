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

	public void lives(String guess) {
		if (!word.contains(guess)) {
			// - 1 lives each wrong guess
			lives--;
		}
	}

	public boolean gameSolve() {
		return !maskWord().contains("*");
	}

	public boolean dead() {
		if (getLives() == 0) {
			return true;
		} else {
			return false;
		}

	}

}
