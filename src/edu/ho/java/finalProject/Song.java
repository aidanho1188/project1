package edu.ho.java.finalProject;

/**
 * 
 * @author Aidan Ho
 *
 */
public class Song {
	String songName;
	String author;
	String lyric;
	String date;
	String duration; // turn duration into string first 
	String genres; // this will be selected by the user
	String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLyric() {
		return lyric;
	}
	public void setLyric(String lyric) {
		this.lyric = lyric;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	// Constructor
	public void saveSong(String songName, String author, String lyric, String date, String duration, String genres) {
		this.songName = songName;
		this.author = author;
		this.lyric = lyric;
		this.date = date;
		this.duration = duration;
		this.genres = genres;
	}

}
