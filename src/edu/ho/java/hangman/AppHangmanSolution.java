package edu.ho.java.hangman;

import java.util.Scanner;

public class AppHangmanSolution 
{
	
	GameSolution g = new GameSolution("Meow", "Cat");
	GameSolution Game1 = new GameSolution ("woof","Dog");
	
	GameSolution[] gArray = {new GameSolution("Meow", "Cat"), new GameSolution("Woof", "Dog")};
	//Control flow
	public void playGame()
	{
		g.setHint("Meow");
		g.setWord("Cat");
		g.setLive(6);

		Scanner input = new Scanner(System.in);
		for(int i =0; i < gArray.length; i++)
		{
			GameSolution g = gArray[i];
		}
		//Repeat while not solved
		while (!g.isSolved()) 
		{		
		// Prompt the user
		System.out.println("Guess a letter");
		System.out.println("Hint "+ g.getHint());
		//Display current mask
		System.out.println("Mask "+ g.generateMask());
		//Collect user input
		String userGuess= input.nextLine();
		g.setGuesses(userGuess);
		System.out.println("Live "+g.getLive());
			
		}

	}
	
	public static void main(String[] args) {
		AppHangmanSolution game = new AppHangmanSolution();
		game.playGame();
		
	}

}
