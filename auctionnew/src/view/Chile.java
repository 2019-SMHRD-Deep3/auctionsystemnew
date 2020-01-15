package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextPane;

public class Chile {

	private JFrame frame;

	
	public Chile() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uC0B0\uD2F0\uC544\uACE0 \uBAA8\uB370\uB098 \uAD81\uC804.JPG"));
		lblNewLabel.setBounds(0, 0, 600, 370);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnDdd = new JTextPane();
		txtpnDdd.setText("ddd");
		txtpnDdd.setBounds(616, 0, 220, 437);
		frame.getContentPane().add(txtpnDdd);
	}
}
