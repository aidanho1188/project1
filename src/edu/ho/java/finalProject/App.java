package edu.ho.java.finalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.Font;
import javax.swing.JList;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
/**
 * Login window ()
 * register window (done)
 * Display song information
 * Display lyrics
 * 
 * @author Aidan Ho
 *
 */

public class App extends Login{

	Song song = new Song();
	Address address = new Address();
	User user = new User();
	Main m = new Main();
	Login log = new Login();
	Register reg = new Register();
	
	private JFrame frame;
	private JTextField textFieldURL;
	private JTextField textFieldDescription;
	private JTextField textFieldSong;
	private JTextField textFieldAuthor;
	private JTextField textFieldDuration;
	private JTextField textFieldGenres;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JTable table;
	

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
				 * Smart code check user information for login
				 * get username and password from the textField and passwordField
				 */
				String username1 = textFieldUsername.getText();
				String password1 = passwordField.getText().toString();
				String firstName = m.getFirstName();
				String lastName = m.getLastName();
				
				// check if username and password is matched with the UserList in the main class
					if (m.Login(username1, password1)) {
						JOptionPane.showMessageDialog(null, "Login successful!", "Login", JOptionPane.INFORMATION_MESSAGE);
						m.saveUser(firstName, lastName, username1, password1);
					}
					else {
						passwordField.setText("");
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password!", "Login", JOptionPane.ERROR_MESSAGE);
					}
			
			}
		});
		btnLogin.setBounds(796, 643, 197, 47);
		panel_2.add(btnLogin);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * smart code, pop up register window
				 */
				reg.setVisible(true);
			}
		});
		btnNewButton.setBounds(569, 643, 197, 47);
		panel_2.add(btnNewButton);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblLogin.setBounds(408, 11, 104, 46);
		panel_2.add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(10, 167, 90, 25);
		panel_2.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(10, 342, 90, 25);
		panel_2.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(10, 203, 983, 33);
		panel_2.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 470, 983, 33);
		panel_2.add(passwordField);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Song", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(31, 36, 68, 39);
		panel.add(lblUrl);
		
		textFieldURL = new JTextField();
		textFieldURL.setBounds(149, 33, 803, 45);
		panel.add(textFieldURL);
		textFieldURL.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			/**
			 * add song to a file
			 */
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		btnSubmit.setBounds(839, 531, 131, 58);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Description:");
		lblNewLabel.setBounds(31, 405, 169, 39);
		panel.add(lblNewLabel);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setBounds(149, 402, 803, 45);
		panel.add(textFieldDescription);
		textFieldDescription.setColumns(10);
		
		JLabel lblSong = new JLabel("Song:");
		lblSong.setBounds(31, 108, 82, 39);
		panel.add(lblSong);
		
		JLabel lblNewLabel_1 = new JLabel("Genres:");
		lblNewLabel_1.setBounds(31, 333, 138, 39);
		panel.add(lblNewLabel_1);
		
		textFieldSong = new JTextField();
		textFieldSong.setBounds(149, 111, 803, 45);
		panel.add(textFieldSong);
		textFieldSong.setColumns(10);
		
		JLabel lblAuthor_1 = new JLabel("Author:");
		lblAuthor_1.setBounds(31, 189, 106, 39);
		panel.add(lblAuthor_1);
		
		textFieldAuthor = new JTextField();
		textFieldAuthor.setColumns(10);
		textFieldAuthor.setBounds(149, 189, 803, 45);
		panel.add(textFieldAuthor);
		
		JLabel lblDuration_1 = new JLabel("Duration:");
		lblDuration_1.setBounds(31, 261, 138, 39);
		panel.add(lblDuration_1);
		
		textFieldDuration = new JTextField();
		textFieldDuration.setColumns(10);
		textFieldDuration.setBounds(149, 258, 803, 45);
		panel.add(textFieldDuration);
		
		textFieldGenres = new JTextField();
		textFieldGenres.setColumns(10);
		textFieldGenres.setBounds(149, 330, 803, 45);
		panel.add(textFieldGenres);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Songs", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Load song");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  //  String data1 = something1.getSomething();
			    //    String data2 = something2.getSomething();
				  //  String data3 = something3.getSomething();
				  //  String data4 = something4.getSomething();

				    Object[] row = { "", "", "", "" };

				    DefaultTableModel model = (DefaultTableModel) table.getModel();

				    model.addRow(row);

				    // clear the entries.
	
			}
		});
		btnNewButton_2.setBounds(755, 643, 197, 47);
		panel_1.add(btnNewButton_2);
		
		table = new JTable();
		table.setForeground(Color.WHITE);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setBackground(Color.DARK_GRAY);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"URL", "Song", "Author", "Genres", "Duration", "Description"
			}
		));
		table.setBounds(10, 11, 942, 522);
		panel_1.add(table);
	}
}
