package edu.yccc.java.chapter3.dot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicList extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicList frame = new MusicList();
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
	public MusicList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnHome.setBounds(335, 227, 89, 23);
		contentPane.add(btnHome);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(236, 227, 89, 23);
		contentPane.add(btnNext);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(10, 11, 46, 14);
		contentPane.add(lblSearch);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 345, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setBounds(10, 68, 414, 139);
		contentPane.add(list);
		
		JLabel lblGeners = new JLabel("Genres");
		lblGeners.setBounds(10, 36, 46, 14);
		contentPane.add(lblGeners);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Alternative Music", " Blues", " Classical Music", " Country Music", " Dance Music", " Easy Listening", " Electronic Music", " European Music (Folk / Pop)", " Hip Hop / Rap", " Indie Pop", " Inspirational (incl. Gospel)", " Asian Pop (J-Pop, K-pop)", " Jazz", " Latin Music", " New Age", " Opera", " Pop (Popular music)", " R&B / Soul", " Reggae", " Rock", " Singer / Songwriter (inc. Folk)", " World Music / Beats"}));
		comboBox.setBounds(66, 39, 345, 20);
		contentPane.add(comboBox);
		
		JButton btnLyrics = new JButton("Lyrics");
		btnLyrics.setBounds(141, 227, 89, 23);
		contentPane.add(btnLyrics);
	}
}
