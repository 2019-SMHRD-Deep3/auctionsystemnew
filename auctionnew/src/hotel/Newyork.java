package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class Newyork {

	private JFrame frame;

	public Newyork() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 764, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB274\uC695\uD638\uD154 \uD55C\uB208\uC5D0 \uBCF4\uAE30");
		lblNewLabel.setBounds(12, 10, 723, 83);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\\uB274\uC695\\\uAE38\uB4DC \uD640 - \uC5B4 \uD1B0\uC2A8 \uD638\uD154 4\uC131\uAE09 168,560.jpg"));
		lblNewLabel_1.setBounds(12, 125, 120, 110);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(144, 125, 120, 110);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(279, 125, 120, 110);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(418, 125, 120, 110);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(550, 125, 120, 110);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(12, 299, 120, 110);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(144, 299, 120, 110);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(279, 299, 120, 110);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(418, 299, 120, 110);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(550, 299, 120, 110);
		frame.getContentPane().add(label_8);
	}
}
