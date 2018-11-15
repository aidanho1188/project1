package edu.yccc.java.chapter3.dot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Font;

public class SongInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SongInfo frame = new SongInfo();
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
	public SongInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSongName = new JLabel("Song name:");
		lblSongName.setBounds(10, 36, 63, 14);
		contentPane.add(lblSongName);
		
		JLabel lblSongGenres = new JLabel("Song genres:");
		lblSongGenres.setBounds(10, 61, 75, 14);
		contentPane.add(lblSongGenres);
		
		JLabel lblLyrics = new JLabel("Lyrics");
		lblLyrics.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLyrics.setBounds(190, 90, 46, 14);
		contentPane.add(lblLyrics);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(10, 11, 46, 14);
		contentPane.add(lblUrl);
		
		TextField textField = new TextField();
		textField.setBounds(10, 110, 414, 141);
		contentPane.add(textField);
	}
}
