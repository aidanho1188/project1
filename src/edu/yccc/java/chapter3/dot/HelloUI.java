package edu.yccc.java.chapter3.dot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.Panel;
import javax.swing.JTree;

public class HelloUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloUI window = new HelloUI();
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
	public HelloUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.print(textField.getText());
				textField.setText("");
			}
		});
		btnSubmit.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblFirstName = new JLabel("URL:");
		lblFirstName.setBounds(26, 33, 71, 14);
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(58, 30, 355, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGenes = new JLabel("Genres:");
		lblGenes.setBounds(10, 75, 46, 14);
		frame.getContentPane().add(lblGenes);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 72, 355, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSongList = new JButton("Songs");
		btnSongList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MusicList ml = new MusicList();
				ml.setVisible(true);
				
			}
		});
		btnSongList.setBounds(236, 227, 89, 23);
		frame.getContentPane().add(btnSongList);
	}
}
