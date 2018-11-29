package edu.ho.java.project3;

import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * Project 3
 * Create classes that model this scenario.
 * Create a class to load and store lists of Users, Addresses, and Orders.
 * Create a UI to create (add to above list(s)) Users, Addresses, and Orders.
 * Java best practices are expected. Good names, comments, proper case sensitivity, etc..
 * 
 * main object
 * @author Aidan Ho
 *
 */
public class UI {
	
	User u = new User();
	Address a = new Address();
	Order o = new Order();

	private JFrame frame;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;
	private JTextField textFieldStreet;
	private JTextField textFieldCity;
	private JTextField textFieldState;
	private JTextField textFieldZipcode;
	private JTextField textFieldItem;
	private JTextField textFieldQuanity;
	private JTextField textFieldUserId;
	private JTextField textFieldCost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(333, 30, 64, 39);
		frame.getContentPane().add(lblUser);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(31, 105, 164, 39);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(31, 177, 161, 39);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(31, 249, 87, 39);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(31, 319, 145, 39);
		frame.getContentPane().add(lblPassword);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(215, 102, 276, 45);
		frame.getContentPane().add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(215, 174, 276, 45);
		frame.getContentPane().add(textFieldLastName);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(215, 246, 276, 45);
		frame.getContentPane().add(textFieldEmail);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(215, 316, 276, 45);
		frame.getContentPane().add(textFieldPassword);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(333, 388, 78, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblStreet = new JLabel("Street:");
		lblStreet.setBounds(31, 449, 97, 39);
		frame.getContentPane().add(lblStreet);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(31, 521, 64, 39);
		frame.getContentPane().add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(31, 593, 85, 39);
		frame.getContentPane().add(lblState);
		
		JLabel lblZipcode = new JLabel("Zipcode:");
		lblZipcode.setBounds(31, 665, 121, 39);
		frame.getContentPane().add(lblZipcode);
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setBounds(844, 42, 64, 14);
		frame.getContentPane().add(lblOrder);
		
		JLabel lblNewLabel = new JLabel("Item:");
		lblNewLabel.setBounds(559, 105, 78, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quanity:");
		lblNewLabel_1.setBounds(559, 177, 121, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User ID:");
		lblNewLabel_2.setBounds(559, 249, 119, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setBounds(559, 319, 72, 39);
		frame.getContentPane().add(lblCost);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setColumns(10);
		textFieldStreet.setBounds(215, 434, 276, 45);
		frame.getContentPane().add(textFieldStreet);
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(215, 518, 276, 45);
		frame.getContentPane().add(textFieldCity);
		
		textFieldState = new JTextField();
		textFieldState.setColumns(10);
		textFieldState.setBounds(215, 590, 276, 45);
		frame.getContentPane().add(textFieldState);
		
		textFieldZipcode = new JTextField();
		textFieldZipcode.setColumns(10);
		textFieldZipcode.setBounds(215, 662, 276, 45);
		frame.getContentPane().add(textFieldZipcode);
		
		textFieldItem = new JTextField();
		textFieldItem.setColumns(10);
		textFieldItem.setBounds(721, 102, 276, 45);
		frame.getContentPane().add(textFieldItem);
		
		textFieldQuanity = new JTextField();
		textFieldQuanity.setColumns(10);
		textFieldQuanity.setBounds(721, 174, 276, 45);
		frame.getContentPane().add(textFieldQuanity);
		
		textFieldUserId = new JTextField();
		textFieldUserId.setColumns(10);
		textFieldUserId.setBounds(721, 246, 276, 45);
		frame.getContentPane().add(textFieldUserId);
		
		textFieldCost = new JTextField();
		textFieldCost.setColumns(10);
		textFieldCost.setBounds(721, 316, 276, 45);
		frame.getContentPane().add(textFieldCost);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			/**
			 * Save everything to classes
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// get info from textField and turn it into string
				String firstName = textFieldFirstName.getText().toString();
				String lastName = textFieldLastName.getText().toString();
				String email = textFieldEmail.getText().toString();
				String password = textFieldPassword.getText().toString();
				
				String street = textFieldStreet.getText().toString();
				String city = textFieldCity.getText().toString();
				String state = textFieldState.getText().toString();
				String zipcode = textFieldZipcode.getText().toString();
				
				String item = textFieldItem.getText().toString();
				String quanity = textFieldQuanity.getText().toString();
				String userId = textFieldUserId.getText().toString();
				String cost = textFieldCost.getText().toString();
				
				// a separate variable for address/shippingAddress
				String address = street + " " + city +" "+ state + " "+ zipcode + ".";
				String shippingAddress = address;
				// save everything use user, address, order constructor
				u.saveUser(firstName, lastName, email, password, address);
				a.saveAddress(street, city, state, zipcode);
				o.saveOrder(item, quanity, userId, shippingAddress, cost);
				
			}
		});
		btnSave.setBounds(695, 777, 197, 47);
		frame.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			
			// load everything from classes and print it out
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("First Name is: " + u.getFirstName());
				System.out.println("Last Name is: " + u.getLastName());
				System.out.println("Email is: " + u.getEmail());
				System.out.println("Password is: " + u.getPassword());
				System.out.println("Address is is: " + u.getAddress());
				System.out.println(" ");
				System.out.println("Street is: "+ a.getStreet());
				System.out.println("City is: "+ a.getCity());
				System.out.println("State is: "+ a.getState());
				System.out.println("Zipcode is: "+ a.getZipcode());
				System.out.println(" ");
				System.out.println("Item is: " + o.getItem());
				System.out.println("Item Quanity is: " + o.getQuanity());
				System.out.println("Shipping Address is: " + o.getShippingAddress());
				System.out.println("User ID is: " + o.getUserId());
				System.out.println("Cost is: " + o.getCost());
				
				
				
			}
		});
		btnLoad.setBounds(936, 777, 197, 47);
		frame.getContentPane().add(btnLoad);
	}
}
