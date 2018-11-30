package edu.ho.java.project3;

/**
 * Order class/ setter and getter
 * 
 * @author Aidan Ho
 *
 */
public class Order extends User{
	String item;
	String quanity;
	String userId;
	String cost;
	private User shippingAddress;

	/**
	 * 
	 * @param item
	 * @param quanity
	 * @param userId
	 * @param shippingAddress
	 * @param cost
	 */
	// order constructor
	public void setOrder(String item, String quanity, String userId, User shippingAddress, String cost) {
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

	public User getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(User shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
