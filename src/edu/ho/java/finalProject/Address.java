package edu.ho.java.finalProject;

import java.nio.file.Path;

/**
 * 
 * @author Aidan Ho
 *
 */
public class Address {
	String url;
	String siteName;
	String song;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String string) {
		this.url = string;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	
	// Constructor
	public void saveAddress(String siteName, String url) {
		this.url = url;
		this.siteName = siteName;
	}

}
