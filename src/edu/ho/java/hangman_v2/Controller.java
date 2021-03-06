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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Controller rf = new Controller();
		try {
			List<Game> games = rf.read();
			for (Game game : games) {
				rf.playGame(game, input);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print(e);
		}
	}
	
	public List<Game> read() throws IOException {
		List<Game> gamesList = new ArrayList<Game>();
		File f = new File("GameList");
		System.out.println("Does the file existed? " + f.exists());
		if (f.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String lines;
			// game file is in format of, word : hint
			while ((lines = br.readLine()) != null) {
				String[] line = lines.split(":");
				Game gl = new Game();
				gl.setGame(line[0], line[1]);
				gamesList.add(gl);
			}
		}
		return gamesList;
	}
	
	public void playGame(Game g, Scanner guess) {
		while (!g.isSolved() && !g.isDead()) {
			g.printGameStatus();
			g.getUserInput(guess);
			if (g.isDead()) {
				System.out.print("You lose!\n");
			} 
			else if (g.isSolved()) {
				System.out.println("You won and the word is " + g.getWord()+ "\n");
			}
		}
	}

}
