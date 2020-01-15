package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextPane;

public class Bangkok {

	private JFrame frame;

	public Bangkok() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 830, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uBC29\uCF552.JPG"));
		lblNewLabel.setBounds(12, 10, 310, 320);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uBC29\uCF55.JPG"));
		lblNewLabel_1.setBounds(363, 10, 310, 320);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane txtpnDd = new JTextPane();
		txtpnDd.setText("dd");
		txtpnDd.setBounds(12, 340, 470, 161);
		frame.getContentPane().add(txtpnDd);
	}

}
