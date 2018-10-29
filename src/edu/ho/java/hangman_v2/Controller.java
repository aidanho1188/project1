package edu.ho.java.hangman_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {

	public Controller() 
	{

	}
	public List<Game> read() throws IOException
	{
		List<Game> games = new ArrayList<Game>();
		File f = new File("GameList");
		System.out.println("Does the file existed? "+ f.exists());
		
		if (f.exists())
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String string;
			while ((string = br.readLine()) != null )
			{
				Game g = new Game();
				g.setWord(string);
				System.out.println("Word: "+g.maskWord());
				System.out.println("Hint: "+g.getHint());
				
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
