package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Danang {

	private JFrame frame;

	
	public Danang() {
		initialize();
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 660);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uC5EC\uD589\uBC15\uC0AC");
		lblNewLabel_1.setBounds(747, 594, 87, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uB2E4\uB0AD\uBC30\uACBD.JPG"));
		lblNewLabel.setBounds(0, 0, 834, 621);
		frame.getContentPane().add(lblNewLabel);
	}
}
