package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Hongkong {

	private JFrame frame;

	
	public Hongkong() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
