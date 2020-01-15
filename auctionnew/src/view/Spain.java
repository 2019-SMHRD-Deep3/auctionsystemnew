package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Spain {

	private JFrame frame;

	
	public Spain() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 994, 581);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uC5EC\uD589\uBC15\uC0AC");
		lblNewLabel_1.setBounds(861, 519, 117, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uC2A4\uD398\uC7781.JPG"));
		lblNewLabel.setBounds(0, 0, 978, 542);
		frame.getContentPane().add(lblNewLabel);
	}
}
