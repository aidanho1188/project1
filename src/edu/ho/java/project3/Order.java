package edu.ho.java.project3;

/**
 * Order class/ setter and getter
 * @author Aidan Ho
 *
 */
public class Order {
	String item;
	String quanity;
	String userId;
	String shippingAddress;
	String cost;
	
	/**
	 * 
	 * @param item
	 * @param quanity
	 * @param userId
	 * @param shippingAddress
	 * @param cost
	 */
	// order constructor
	public void saveOrder(String item, String quanity, String userId, String shippingAddress, String cost) {
		this.item = item;
		this.quanity = quanity;
		this.userId = userId;
		this.shippingAddress = shippingAddress;
		this.cost = cost;
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
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	

}
