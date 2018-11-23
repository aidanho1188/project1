package edu.ho.java.finalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class App {

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
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 457, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Song", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(10, 11, 46, 14);
		panel.add(lblUrl);
		
		textField = new JTextField();
		textField.setBounds(53, 8, 366, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(330, 199, 89, 23);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Description:");
		lblNewLabel.setBounds(10, 50, 63, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 50, 346, 138);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Songs", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(66, 5, 353, 20);
		panel_1.add(comboBox);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(10, 8, 46, 14);
		panel_1.add(lblSearch);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 41, 46, 14);
		panel_1.add(lblName);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setBounds(250, 66, 46, 14);
		panel_1.add(lblDuration);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(250, 41, 46, 14);
		panel_1.add(lblAuthor);
		
		JLabel lblGeners = new JLabel("Geners:");
		lblGeners.setBounds(10, 66, 46, 14);
		panel_1.add(lblGeners);
		
		JButton btnLyrics = new JButton("Lyrics");
		btnLyrics.setBounds(337, 203, 89, 23);
		panel_1.add(btnLyrics);
		
		JLabel lblDescribtion = new JLabel("Description:");
		lblDescribtion.setBounds(10, 91, 89, 14);
		panel_1.add(lblDescribtion);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(93, 91, 326, 101);
		panel_1.add(textPane);
	}
}
