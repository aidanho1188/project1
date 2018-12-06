package edu.ho.java.finalProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.*;
import java.io.*;
import javax.swing.text.Document;

import edu.ho.java.hangman_v2.Game;;

/**
 *Old proposal
 *I want to make an application that takes URL from the user and find the Songs information on a web page like name, duration, lyrics, and author. It will also store all of that information on another file so the user can call it.

 *Make UI
 *Get User Input
 *Gather information from URL
 *Store information in a file
 *
 *
 *New proposal
 *
 *Make and application that let the user self-register and login. Allow the user to manually add a song into a song list.
 *
 *Create UI
 *Store user register info in a file
 *Login: Check if username and password are correct
 *Store song info
 * 
 * @author Aidan Ho
 *
 */
public class Main extends User{



	/**
	 * save user information into a file
	 * 
	 * @param userInfo from ui (else) statement
	 * @catch IOException e
	 */
	public void register(String userInfo) {
		BufferedWriter writer;
		// Write the file without overwrite it.
		try {
			writer = new BufferedWriter(new FileWriter("UserList", true));
			writer.write(userInfo);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * smart code for user login Read UserList file and scan if the username and
	 * password is valid This will return either true or false
	 * 
	 * @param username1 and password1 from user input
	 * @catch IOException e
	 * @return isLogin
	 */
	public boolean Login(String username1, String password1) {
		boolean isLogin = false;
		File file = new File("UserList");
		List<String> list = new ArrayList<String>();

		// Fill in the list
		try {
			Scanner input = new Scanner(file);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while (input.hasNextLine()) {
				// read a line
				String lines = reader.readLine().trim();
				String[] line = lines.split(":");
				// save user information for comparison
				username = line[2];
				password = line[3];
				// compare username1 and password1
				if (username1.equals(username) && password1.equals(password)) {
					// save user info if login successful
					saveUser(line[0], line[1], username1, password1);
					isLogin = true;
				}
				input.nextLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isLogin;
	}

	/**
	 * load song
	 * 
	 */
	public void loadSong() {

	}

	List<Address> song = new ArrayList<Address>();
	
	/**
	 * Save song 
	 * 
	 */
	public void saveSong(Address a) {
		song.add(a);
	}

	// Testing
	public static void main(String[] args){

	}

}
