package edu.ho.java.project3;

/**
 * Order class/ setter and getter
 * 
 * @author Aidan Ho
 *
 */
public class Order {
	String item;
	String quanity;
	String userId;
	String cost;
	private Address address;
	private User name;

	/**
	 * 
	 * @param item
	 * @param quanity
	 * @param userId
	 * @param shippingAddress
	 * @param cost
	 * @param name 
	 */
	// order constructor
	public void setOrder(String item, String quanity, String userId, String cost, Address address,  User name) {
		this.item = item;
		this.quanity = quanity;
		this.userId = userId;
		this.address = address;
		this.cost = cost;
		this.address = address;
		this.name = name;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getQuanity() {
		return quanity;
	}

	public void setQuanity(String quanity) {
		this.quanity = quanity;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User getName() {
		return name;
	}

	public void setName(User name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	// Create a string for shipping address
	public String shippingAddress() {
		return name.firstName + " " + name.lastName + " " + address.street + ". " + address.city+", "+address.state+" "+address.zipcode;
	}

}
