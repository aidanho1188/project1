package edu.ho.java.race;

public class RaceApp {
	
	//Create 3 object
	//Add Attributes
	//Race

	public static void main(String[] args)
	{
		Race race = new Race(0, 0, 0, null);
		
		Track track = new Track(0, 0, 0);
		
		Car car1 = new Car(100, 10, 20);
		
		Car car2 = new Car(100, 50, 8);
		
		
		while (!race.isFinished()) //check if game finished
		{
			//countdown
			//what to do when game not finish
		}
		
	}
}
