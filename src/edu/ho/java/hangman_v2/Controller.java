package edu.ho.java.hangman_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

	public Controller() {

	}

	public List<Game> read() throws IOException {
		/**
		 * Control how the game procedure
		 */
		Scanner user_input = new Scanner(System.in);
		List<Game> games = new ArrayList<Game>();
		File f = new File("GameList");
		System.out.println("Does the file existed? " + f.exists());

		if (f.exists()) {
			// Get a word from the file
			BufferedReader br = new BufferedReader(new FileReader(f));
			String words = br.readLine();
			String[] word = words.split(":");
			// Create new game
			Game g = new Game();
			// Set the word to setWord
			g.setWord(word[0]);
			// Set hint
			g.setHint(word[1]);
			// Loop game until game is solve
			while (!g.gameSolve()) {
				// Print masked word
				System.out.println("Word: " + g.maskWord());
				// Print hint
				System.out.println("Hint: " + g.getHint());
				// Print lives
				System.out.println("Lives: " + g.getLives());
				// Ask for user input
				String guess = user_input.nextLine();
				// Set user input
				g.setGuesses(guess);

			}
		}

		return games;
	}

	public static void main(String[] args) {
		Controller rf = new Controller();
		try {
			List<Game> games = rf.read();
			for (Game game : games) // repeat the loop and move on to the next word
			{
				System.out.println(game);// can change with another variable
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
