package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Spain {

	private JFrame frame;

	
	public Spain() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 994, 581);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\uCD5C\uC800\uAC00 \uAC80\uC0C9\uD558\uAE30");
		button.setBackground(SystemColor.window);
		button.setBounds(838, 489, 128, 43);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uC2A4\uD398\uC7781.JPG"));
		lblNewLabel.setBounds(0, 0, 978, 542);
		frame.getContentPane().add(lblNewLabel);
	}
}
