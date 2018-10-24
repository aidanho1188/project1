package edu.ho.java.hangman;

/**
 * Generic container to help an hangman game.
 * Each instance will...
 * Have a hint.
 * Have a word.
 * Have user guesses.
 * Be able to generate a mask of the word based on user guesses.
 * Determine when solve
 * 
 * 
 */


public class GameSolution {	
	
	private String hint;
	private String word;
	private String guesses = "";
	private int live;
	
	//arg Constructor
	public GameSolution(String hint, String word) 
	{
		this.hint = hint;
		this.word = word;
	}
	
	public int getLive() {
		return live;
	}

	public void setLive(int live) {
		this.live += live;
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

	public String getGuesses() {
		return guesses;
	}

	public void setGuesses(String guesses) {
		this.guesses += guesses;
	}


	

	public boolean isSolved()
	{
		return !generateMask().contains("*");
	}
	
	public String generateMask() 
	{
		String mask ="";
		
		//Loop over word
		for (int i=0; i < word.length(); i++)
		{
			String currentChar = String.valueOf(word.charAt(i));
			//Look at each char in word
			if (guesses.contains(currentChar))			//Determine if user guessed that char.
			{
				mask += currentChar;			//If they did, append the char.
			}
			else
			{
				mask += "*";			//If they did not, append a*.
			}

		}
		CharSequence charWord = word;
		if(!word.contains(guesses)) {
			live--;			
		}
		return mask;
		
	}
}
