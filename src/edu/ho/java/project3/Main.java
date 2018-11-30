package edu.ho.java.project3;

import java.util.ArrayList;
import java.util.List;
/**
 * main class
 * @author Aidan Ho
 *
 */
public class Main {

	/**
	 * Save all classes into user, order, and address list
	 * 
	 * @param a
	 * @param u
	 * @param o
	 */
	List<User> users = new ArrayList<User>();

	List<Order> order = new ArrayList<Order>();
	
	List<Address> address = new ArrayList<Address>();
	public void store(Address a, User u, Order o) {
		users.add(u);
		order.add(o);
		address.add(a);
		
	}

	/**
	 * Load all classes
	 */
	public void load() {
		users.getClass();
		order.getClass();
		address.getClass();
	}

}
