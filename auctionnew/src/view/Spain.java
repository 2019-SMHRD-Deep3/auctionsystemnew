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
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uC5EC\uD589\uBC15\uC0AC");
		lblNewLabel_1.setBounds(861, 519, 117, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//Ω∫∆‰¿Œ1.jpg";
	       lblNewLabel.setIcon(new ImageIcon(imgPath5));
		lblNewLabel.setBounds(0, 0, 978, 542);
		frame.getContentPane().add(lblNewLabel);
	}
}
