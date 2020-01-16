package view;

import javax.swing.JFrame;
import javax.swing.JComboBox;

public class Hotel {

	private JFrame frame;

	
	public Hotel() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 752, 353);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(42, 44, 127, 33);
		frame.getContentPane().add(comboBox);
	}
}
