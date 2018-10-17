package edu.ho.java.race;

//Start time
//Stop time
//Winner
//

public class Race {
	
	private int startTime;
	private int endTime;
	private int lap;
	private String winner;
	
	public Race(int startTime, int endTime, int lap, String winner)
	{
		this.startTime = startTime;
		this.endTime= endTime;
		this.winner = winner;
		this.lap = lap;
	}
	
	public boolean isFinished() 
	{
		if (startTime == endTime) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}

	public int getLap() {
		return lap;
	}

	public void setLap(int lap) {
		this.lap = lap;
	}
	


}
