package edu.ho.java.hangman;

public class AppHangman {
	
	public static void main(String[] args) {
		
		Hangman w = new Hangman();
		
		// Array Words
		// Mask words
		w.maskWord();
		// Hint
		// Ask User input
		System.out.println(" ");
		w.getuserInput();
		// Test for user input(String) Only 1 letter at a time
		// Match user input with word
		// reveal letter
		w.revealLetter();
		// Test if the word is completely reveal
		// If live <= 0 end game, repeat/next word
		w.game();
		
		
		
		
		
		
	}

}
