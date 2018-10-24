package edu.ho.java.race;

//speed
//acceleration
//Fuel tank size
//mile till empty

public class Car 
{
	private int topSpeed;
	private double mpg;
	private int tankSize;
	
	public Car(int topSpeed, int mpg, int tankSize) {
		this.topSpeed = topSpeed;
		this.tankSize = tankSize;
		this.mpg = mpg;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public double getmpg() {
		return mpg;
	}
	public void setmpg(double mpg) {
		this.mpg = mpg;
	}
	public int getTankSize() {
		return tankSize;
	}
	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
	

	public double getMileTillNextPitStop(int distanceTraveled) 
	{
		//Calculation
		double milesTillEmpty = 0;
		double fuel = distanceTraveled/mpg;
		milesTillEmpty =  tankSize - fuel;
		
		// if the car travel 20 miles at 20mpg, and the car have 10 gallon, how many gallons does the car have? 
		// Distance traveled by gas consumed
		// TopSpeed / mpg
		return milesTillEmpty;

	}
	
	public static void main(String[] args) 
	{
		//Test case 1: Test miles left in car
		// if topSpeed = 100;
		// if mpg is 20;
		// if tanksize is 10 gallons.
		// if car has gone 20 miles at top speed the tank should have 9 gallon.
		int n = 9; // n == gas
		Car car1 = new Car(100, 20, 10);
		if(car1.getMileTillNextPitStop(20)== n)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		//Test case 2: Test miles left in car
		// if topSpeed = 100;
		// if mpg is 50;
		// if tanksize is 8 gallons.
		// if car has gone 70 miles at top speed the tank should have _ gallon.
		Car car2 = new Car(100, 50, 8);
		double n1=6.5;
		if(car1.getMileTillNextPitStop(70)== n1)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	
	}
}
