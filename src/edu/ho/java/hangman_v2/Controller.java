package edu.ho.java.hangman_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

	public Controller() 
	{

	}
	public List<Game> read() throws IOException
	{
		/**
		 * Control how the game procedure
		 */
		Scanner user_input = new Scanner(System.in);
		List<Game> games = new ArrayList<Game>();
		File f = new File("GameList");
		System.out.println("Does the file existed? "+ f.exists());
		
		if (f.exists())
		{
			// Get a word from the file
			BufferedReader br = new BufferedReader(new FileReader(f));
			String word = br.readLine();
			while (true)
			{	// Create new game
				Game g = new Game();
				// Set the word to setWord
				g.setWord(word);
				// Print masked word
				// Print hint
				// Ask for user input
				String guess = user_input.nextLine();
				// Set user input
				g.setGuesses(guess);
				// Un-mask user guess letter
				System.out.println("Word: "+g.maskWord());
				
			}
		}
		
		
		return games;
	}
	
	public static void main(String[] args) {
		Controller rf = new Controller();
		try 
		{
			List<Game> games = rf.read();
			for (Game game: games)      // repeat the loop and move on to the next word
			{
				System.out.println(game);// can change with another variable
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
