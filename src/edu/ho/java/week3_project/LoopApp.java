package edu.ho.java.week3_project;

public class LoopApp {
	
	public static void main(String[] args) {

			LoopPractice l = new LoopPractice();
			System.out.println("-------------While loop in a for loop----------------");
			l.forNestLoop();
			System.out.println("-------------For loop in a while loop-------------");
			l.whileNestLoop();
			System.out.println("-------------Mask a word-----------");
			l.createMask();
		
	}
}
