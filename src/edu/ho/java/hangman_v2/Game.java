package edu.ho.java.hangman_v2;

import java.util.List;
import java.util.Scanner;

// Process the input and check if it right
//
public class Game 
{
	private int lives;
	private String guesses="";
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
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}

	public String maskWord() 
	{
		String mask= "";
		for (int i = 0; i < word.length(); i++) 
		{
			String currentChar = String.valueOf(word.charAt(i));
			if (guesses.contains(currentChar))
			{
				mask += currentChar;
			}
			else 
			{
				mask += "*";
			}
			
		}
		return mask;

	}
	
	
	public boolean gameSolve() {
		return !maskWord().contains("*");
	}
		
	public boolean dead() {
		if (getLives() == 0) 
		{
			return true;
		}
		else {
			return false;
		}
 
	}
}

