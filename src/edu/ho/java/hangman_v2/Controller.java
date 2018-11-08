package edu.ho.java.hangman_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.ho.java.week8.User;

/**
 * Hangman Object
 * 
 * Create a Hangman game that:
 * Take words from a game file
 * Loop through games
 * 
 * Goal achieved!
 * @author Aidan Ho
 */

public class Controller {

	Scanner input = new Scanner(System.in);

	/**
	 * Control how the game flow 
	 * Create new game 
	 * Prompt user 
	 * Collect guess 
	 * Update game status 
	 * Repeat with while loop When word solved, while statement= false
	 * End game
	 * 
	 * @param g (a single game from games list)
	 */
	public void playGame(Game g) {
		// Loop game until game is solve
		while (!g.gameSolve() && !g.dead()) {
			// Print masked word
			System.out.println("Word: " + g.maskWord());
			// Print hint
			System.out.println("Hint: " + g.getHint());
			// Print lives
			System.out.println("Lives: " + g.getLives());
			// Ask for user input
			String guess = input.nextLine();
			// Set user input
			g.setGuesses(guess);
			// Calculated lives
			g.lives(guess);
			if (g.dead()) {
				System.out.print("You lose!\n");
			} 
			else if (g.gameSolve()) {
				System.out.println("You won and the word is " + g.getWord()+ "\n");
			}
		}
	}

	/**
	 * Create a games list out of the GameList.txt file 
	 * Read a line Set word and hint 
	 * Add it into games list
	 * 
	 * @throws IOException on error
	 * @return a List
	 */
	public List<Game> read() throws IOException {
		List<Game> gamesList = new ArrayList<Game>();
		File f = new File("GameList");
		System.out.println("Does the file existed? " + f.exists());
		if (f.exists()) {
			// Get a word from the file
			BufferedReader br = new BufferedReader(new FileReader(f));
			String lines;
			// Fill the gameslist with while loop
			while ((lines = br.readLine()) != null) {
				String[] line = lines.split(":");
				Game gl = new Game();
				// Set the word
				gl.setWord(line[0]);
				// Set hint
				gl.setHint(line[1]);
				gamesList.add(gl);
			}
		}
		return gamesList;
	}

	/**
	 * Create a loop that take information from GameList.txt file 
	 * Run game for each Word in the games list 
	 * After playGame() end, move to the next word
	 * 
	 */
	public static void main(String[] args) {
		Controller rf = new Controller();
		try {
			List<Game> games = rf.read();
			for (Game game : games) {
				rf.playGame(game); // invoke playGame(game)
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print(e);
		}
	}

}
