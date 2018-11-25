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
 * Smart code object register user (done) User login
 * 
 * @author Aidan Ho
 *
 */
public class Main extends User {
	

	/**
	 * smart code to get website information
	 * @throws IOException 
	 */
	public void getStats() throws IOException {
		
	}

	/**
	 * save user information into a file
	 * 
	 * @throws IOExceptionS
	 */
	public void register(String userInfo) {
		BufferedWriter writer;
		// Write the file without overwrite it.
		try {
			writer = new BufferedWriter(new FileWriter("..//project1/src/edu//ho//java//finalProject//UserList", true));
			writer.write(userInfo);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * smart code for user login Read UserList file and scan is the username and
	 * password is valid This will return either true or false
	 * 
	 * @return isLogin
	 * @throws IOException
	 */
	public boolean Login(String username1, String password1) {
		boolean isLogin = false;
		File file = new File("C:\\Users\\Aidan Ho\\gitHome\\project1\\src\\edu\\ho\\java\\finalProject\\UserList");
		List<String> list = new ArrayList<String>();

		// Fill in the list
		try {
			Scanner input = new Scanner(file);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while (input.hasNextLine()) {
				// read a line
				String lines = reader.readLine();
				String[] line = lines.split(":");
				// save user information for comparison
				saveUser(line[0], line[1], line[2], line[3]);
				// compare username1 and password1 to
				if (username1.equals(username) && password1.equals(password)) {
					isLogin = true;
				}
				input.nextLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isLogin;
	}

    public static void main(String[] args) throws Exception {
    	Song s = new Song();
        URL url = new URL("https://www.youtube.com/oembed?format=json&url=https://www.youtube.com/watch?v=qVdPh2cBTN0");
        URLConnection con = url.openConnection();
        InputStream is =  url.openStream();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))){
        	String line;
        	while ((line = br.readLine()) != null) {
        		String[] info = line.split(",");
        		// make a search method to search for a array that author_name and set it to author name...
                System.out.println(line);
            }
        }
    }
}
