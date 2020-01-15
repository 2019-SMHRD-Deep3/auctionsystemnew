package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Taiwan {

	private JFrame frame;

	 
	public Taiwan() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 560);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uD558\uB098\uD22C\uC5B4");
		lblNewLabel_1.setBounds(694, 489, 94, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uB300\uB9CC1.JPG"));
		lblNewLabel.setBounds(0, 0, 800, 521);
		frame.getContentPane().add(lblNewLabel);
	}
}
