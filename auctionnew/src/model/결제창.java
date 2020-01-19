package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Font;

public class 결제창 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public 결제창() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 515);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCE74\uB4DC\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(179, 172, 187, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(179, 207, 345, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(12, 172, 83, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 207, 149, 35);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uB9CC\uB8CC\uB0A0\uC9DC        ex)DD.MM.YY");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(538, 172, 180, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setBounds(536, 207, 162, 35);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel((String) null);
		lblNewLabel_3.setBounds(596, 172, 122, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uBA54\uC77C \uC8FC\uC18C");
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(12, 252, 96, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(12, 287, 345, 35);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC804\uD654\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC\r\n");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(377, 252, 187, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(369, 287, 290, 35);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//캡처.3333jpg";
		lblNewLabel_3.setIcon(new ImageIcon(imgPath3));
		
		JButton btnNewButton = new JButton("\uACB0\uC81C\uD558\uAE30");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(579, 395, 180, 51);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
