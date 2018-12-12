package edu.ho.java.finalProject;

/**
 * 
 * @author Aidan Ho
 *
 */
public class Song {
	String songName;
	String author;
	String duration; 
	String genres; 
	String description;
	String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
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
	// Constructor to save song
	public void saveSong(String songName, String author, String duration, String genres, String description, String url) {
		this.songName = songName;
		this.author = author;
		this.duration = duration;
		this.genres = genres;
		this.description = description;
		this.url = url;
	}

}
