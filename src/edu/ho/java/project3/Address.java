package edu.ho.java.project3;
/**
 * Address class / getter and saver
 * @author Aidan Ho
 *
 */
public class Address { 
	String street;
	String city;
	String state;
	String zipcode;
	

	/**
	 * 
	 * @param street
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	// address constructor
	public void saveAddress(String street, String city, String state, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
