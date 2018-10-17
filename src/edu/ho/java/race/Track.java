package edu.ho.java.race;

//Distance
// #Turn
//Surface roughness

public class Track {

	private int distance;
	private int numTurn;
	private int roughness;
	
	public Track(int distance,int numTurn,int roughness)
	{
		this.distance = distance;
		this.numTurn= numTurn;
		this.roughness= roughness;
	}
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getNumTurn() {
		return numTurn;
	}
	public void setNumTurn(int numTurn) {
		this.numTurn = numTurn;
	}
	public int getRoughness() {
		return roughness;
	}
	public void setRoughness(int roughness) {
		this.roughness = roughness;
	}
	
	
}
