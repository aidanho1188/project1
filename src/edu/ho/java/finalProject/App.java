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
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.event.AncestorListener;

import java.awt.Color;
/**
 * Login window ()
 * register window (done)
 * Display song information
 * Display lyrics
 * 
 * @author Aidan Ho
 *
 */

public class App {

	Song song = new Song();
	Address address = new Address();
	User user = new User();
	Main register = new Main();
	Main login = new Main();
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	

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
		frame.setForeground(Color.WHITE);
		frame.setAlwaysOnTop(true);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Home", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * smart code, pop up login window
				 */
				Login log = new Login();
				log.setVisible(true);
				textField_2.revalidate();
			}
		});
		btnLogin.setBounds(755, 532, 197, 47);
		panel_2.add(btnLogin);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * smart code, pop up register window
				 */
				Register reg = new Register();
				reg.setVisible(true);
			}
		});
		btnNewButton.setBounds(527, 532, 197, 47);
		panel_2.add(btnNewButton);
		
		JLabel lblName_1 = new JLabel("Name:");
		lblName_1.setBounds(31, 33, 93, 39);
		panel_2.add(lblName_1);
		
		JLabel lblNumberOfSongs = new JLabel("Number of songs:");
		lblNumberOfSongs.setBounds(31, 118, 252, 39);
		panel_2.add(lblNumberOfSongs);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(155, 30, 797, 45);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		System.out.print(textField_2.getText());
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(314, 115, 638, 45);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Song", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(31, 36, 68, 39);
		panel.add(lblUrl);
		
		textField = new JTextField();
		textField.setBounds(119, 33, 661, 45);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			/**
			 * Run smart code to find song information
			 * save song and Address info
			 */
			public void actionPerformed(ActionEvent e) {
				String url = textField.getText();
				String songName = textField_4.getText();
				String author = textField_5.getText();
				String duration = textField_6.getText();
				String genres = textField_7.getText();
				String description = textField_1.getText();
				address.saveAddress(null, url);
				song.saveSong(songName, author, null, null, duration, genres, description);
				System.out.println(address.url);
				System.out.print(song.songName);	
				System.out.print(song.author);	
				System.out.print(song.duration);	
				System.out.print(song.genres);	
				System.out.print(song.description);		
				
			}
		});
		
		btnSubmit.setBounds(839, 531, 131, 58);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Description:");
		lblNewLabel.setBounds(31, 405, 169, 39);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 389, 739, 45);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSong = new JLabel("Song:");
		lblSong.setBounds(31, 108, 82, 39);
		panel.add(lblSong);
		
		JLabel lblNewLabel_1 = new JLabel("Genres:");
		lblNewLabel_1.setBounds(31, 333, 138, 39);
		panel.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 111, 833, 45);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAuthor_1 = new JLabel("Author:");
		lblAuthor_1.setBounds(31, 189, 106, 39);
		panel.add(lblAuthor_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(149, 189, 803, 45);
		panel.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(786, 32, 166, 47);
		panel.add(btnNewButton_1);
		
		JLabel lblDuration_1 = new JLabel("Duration:");
		lblDuration_1.setBounds(31, 261, 138, 39);
		panel.add(lblDuration_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(170, 258, 782, 45);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(149, 330, 803, 45);
		panel.add(textField_7);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Songs", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(160, 5, 792, 28);
		panel_1.add(comboBox);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(10, 7, 119, 25);
		panel_1.add(lblSearch);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 50, 119, 25);
		panel_1.add(lblName);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setBounds(539, 99, 182, 25);
		panel_1.add(lblDuration);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(539, 50, 119, 25);
		panel_1.add(lblAuthor);
		
		JLabel lblGeners = new JLabel("Geners:");
		lblGeners.setBounds(10, 99, 119, 25);
		panel_1.add(lblGeners);
		
		JButton btnLyrics = new JButton("Lyrics");
		btnLyrics.setBounds(828, 544, 124, 35);
		panel_1.add(btnLyrics);
		
		JLabel lblDescribtion = new JLabel("Description:");
		lblDescribtion.setBounds(10, 160, 182, 25);
		panel_1.add(lblDescribtion);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(31, 207, 921, 241);
		panel_1.add(textPane);
	}
}
