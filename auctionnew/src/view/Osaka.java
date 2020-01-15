package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextPane;

public class Osaka {

	private JFrame frame;

	
	public Osaka() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uC624\uC0AC\uCE74.JPG"));
		lblNewLabel.setBounds(12, 10, 463, 324);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\uC557!!!! \uC774\uC2DC\uAD6D\uC5D0 \uC624\uC0AC\uCE74\uB97C???????????");
		textPane.setBounds(487, 10, 315, 421);
		frame.getContentPane().add(textPane);
	}

}
