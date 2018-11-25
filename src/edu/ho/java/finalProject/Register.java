package edu.ho.java.finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
/**
 * Register window
 * 
 * Register the user to the UserList file
 * @author Aidan Ho
 *
 */
public class Register extends JFrame {

	Main register = new Main();
	User u = new User();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegsiter = new JLabel("Register");
		lblRegsiter.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblRegsiter.setBounds(425, 16, 175, 56);
		contentPane.add(lblRegsiter);
		
		textField = new JTextField();
		textField.setBounds(31, 105, 873, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("First Name");
		lblUsername.setBounds(31, 64, 175, 39);
		contentPane.add(lblUsername);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(31, 172, 175, 39);
		contentPane.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(31, 214, 873, 34);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(31, 276, 175, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(31, 378, 153, 39);
		contentPane.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 315, 873, 34);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm Password");
		lblNewLabel_1.setBounds(31, 486, 265, 39);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(31, 419, 873, 34);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(31, 528, 873, 34);
		contentPane.add(passwordField_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(760, 585, 197, 47);
		contentPane.add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			/**
			 * Check if password is matched
			 * Save user information if everything is valid
			 * 
			 * @SuppressWarnings("deprecation")
			 */
			public void actionPerformed(ActionEvent e) {
				String firstName = textField.getText().toString();
				String lastName = textField_1.getText().toString();
				String username = textField_2.getText().toString();
				String password = passwordField.getText();
				String confirmPassword = passwordField_1.getText();
				
				if (!password.equals(confirmPassword)) {
					passwordField.setText("");
					passwordField_1.setText("");
					JOptionPane.showMessageDialog(null, "Password is not match!", "Register error", JOptionPane.ERROR_MESSAGE);
				}	
				else if (password.isEmpty() || confirmPassword.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter a password", "Register error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					u.saveUser(firstName, lastName, username, password);
					String userInfor = firstName + ":" + lastName + ":" + username + ":" + password;
					JOptionPane.showMessageDialog(null, "Register Successful!", "Register", JOptionPane.INFORMATION_MESSAGE);
					register.register(userInfor);
					contentPane.setVisible(false);
					dispose();
					
				}
			}
		});
	}

}
