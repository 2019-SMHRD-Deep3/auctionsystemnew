package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class FlightBills {

	private JFrame frame;

	
	public FlightBills() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1017, 620);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
