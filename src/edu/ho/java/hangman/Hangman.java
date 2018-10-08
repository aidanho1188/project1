package edu.ho.java.hangman;
// _author_ = Aidan
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Hangman 
{
	
	Scanner userInput = new Scanner(System.in); 

// chances
	int chances=10;
	
//--------------------------	Create variable/List for game
	
	String[] wordList = {"search", "application", "homeostatic", "general"}; // Array list for word	
	Random random = new Random();
	String word = wordList[random.nextInt(wordList.length)];
//---------------------------This is for maskWord method	
	String guesses = "";

//------------------------------Methods----------------------------------
// This method will print hints by if/else statement.
	public void hint(String word) 
	{   //Hint list
		ArrayList<String> hint = new ArrayList<String>();
		hint.add("Survey");
		hint.add("Request");
		hint.add("Chemical balance");
		hint.add("Common");
// printing out the hint
		if (word == wordList[0]) {
			System.out.println("Your hint: A synonym of "+ hint.get(0));
		}
		else if (word == wordList[1]) {
			System.out.println("Your hint: A synonym of "+ hint.get(1));
		}
		else if (word == wordList[2]) {
			System.out.println("Your hint: "+ hint.get(2) + " that life need");
		}
		else if (word == wordList[3]) {
			System.out.println("Your hint: A synonym of "+ hint.get(3));
		}
	}
//-----------------------------------------------------------------------
		
	public void maskWord(String guess) throws InterruptedException  // This method will mask word and reveal letters. It also check if our word has been completely reveal.
	{
		String newMask = ""; //We use this newMask later to check if we reveal all the letter.. so we can win.
		guesses += guess;  //Store all our guess, in guesses.
		if (!guess.equals(word)) // - 1 chance each guess
		{ 
			chances--;
		}
			
		System.out.println("---------------------------------------------------------");
		System.out.print("Word: " );

		for (int i = 0; i < word.length(); i++) // Check if we have a letter that matched with the word in guesses by the for loop.
		{ 
			if (guesses.contains(String.valueOf(word.charAt(i)))){ // Check guesses that we made instead of previous guess.
				System.out.print(word.charAt(i));		// Reveal letter.
				newMask += String.valueOf(word.charAt(i));
			}
			else {
				System.out.print("*");
				newMask += "*";
			}

		}
		// check if our word has been solved
		if (chances == 0) 
		{
			System.out.println("\n Game Over!");
			this.playAgain();
		} 
			else if (!newMask.contains("*")) //use newMask in this method to determind if word had been guesses
		{ 
			System.out.println("\nWin!");
			this.playAgain();
		}
	}
	
//----------------------------------------------------------------
	public void game() throws InterruptedException  // This method welcoming player and start the game.
	{
		System.out.println("Welcome to hangman!");   //Start game 
		TimeUnit.SECONDS.sleep(2);					// Add in delays
		System.out.println("Here are the rules:"); // Game rules***
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1. You have 10 chance to guess the word!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2. Have only 1 hint!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("*The best way to win this is pay attention to the hint!");//***

		System.out.println("\nPress enter to continue");
		@SuppressWarnings("unused")
		String agree = userInput.nextLine(); // ask for user input to continue
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "); //clear screen
		System.out.println("***Start***");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Your word have "+ word.length()+" letters."); 
		TimeUnit.SECONDS.sleep(1);
		this.playGame(); //move to playGame and ask for user input 
	}
//---------------------------------------------------------------	
	public void playGame() throws InterruptedException  // This method contain the while loop keep the game going.
	{
		
		while (true) 
		{
		System.out.println("\nYou have " + chances + " chances left.");               // print chances
		this.hint(word);										// print hint
		System.out.print( "Guess: " );
		String guess = userInput.nextLine().toLowerCase();	 // ask user input
		this.maskWord(guess); // unmask a letters
	
		}
	}
//---------------------------------------------------------------	
	public void playAgain() throws InterruptedException  // This method ask if the player want to play the game after they loss or win.
	{   // Ask user is they want to play agian
		System.out.println("Do you want to play again?: \nType y or Y for yes");
		String again = userInput.nextLine();
		if (String.valueOf(again).equals("y") || String.valueOf(again).equals("Y")) 
		{
		this.game();			
		}
		else { // Create a loop that keep asking the user input to play the game, if the user don't want to play, the screen will keep clearing.
		System.out.println("Game end.");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "); // clear screen
		@SuppressWarnings("unused")
		String again1 = userInput.nextLine();
		this.playAgain();
		}
		
	}
	
}

