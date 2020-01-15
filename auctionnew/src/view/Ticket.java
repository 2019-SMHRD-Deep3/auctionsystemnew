package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Ticket {

	private JFrame frame;
	public Ticket() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 752, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
