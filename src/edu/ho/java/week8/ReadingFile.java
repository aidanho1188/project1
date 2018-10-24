package edu.ho.java.week8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {

	public void addUser() {

	}
	// use List<User> instead of void because it added to the list with return value
	public List<User> read() throws IOException //Using value of list.txt with class User
	{
		List<User> users = new ArrayList<User>();
		File f = new File("list");
		System.out.println("Does the file existed? "+ f.exists());
		
		if (f.exists()) 
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String st;
			while ((st = br.readLine()) != null) 
			{
				// Use the String.spilt method to break the string up into parts based on
				// the spaces between each name
				String[] spiltNames = st.split(" ");
				User u = new User();
				u.setFirst_name(spiltNames[0]); // set first name 
				if (spiltNames.length > 2)			// check middle name and last name
				{
					u.setMiddle_name(spiltNames[1]); // In the middle of 0,1,2
					u.setLast_name(spiltNames[2]);
				}
				else
				{
					u.setLast_name(spiltNames[1]);
				}
				users.add(u);  // in the loop so it will add it endlessly
				System.out.println(st);
			}
				
		}
		return users;	
	}
	
	public static void main(String[] args) 
	{
		ReadingFile rf = new ReadingFile();
		String hi = "hello";
		hi.split("l",2);
		System.out.println(hi);
		try {
			List<User> users = rf.read();
			for (User user: users)  //Loop that can help move from game to game 
			{
				System.out.println(user.getFirst_name()+ " " + user.getLast_name());
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
}
