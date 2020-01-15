package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

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
		frame.setBounds(100, 100, 703, 504);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uC624\uC0AC\uCE74.JPG"));
		lblNewLabel.setBounds(12, 10, 463, 324);
		frame.getContentPane().add(lblNewLabel);
	}

}
