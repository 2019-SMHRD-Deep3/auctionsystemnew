package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class 비행기결제 {

	private JFrame frame;
	private Member loginuser;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public 비행기결제(Member member) {
		this.loginuser = member;
		initialize();
		frame.setVisible(true);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 207, 149, 35);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 207, 345, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBounds(536, 207, 162, 35);
		frame.getContentPane().add(textField_2);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(12, 171, 83, 25);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC");
		label_1.setBounds(179, 172, 187, 25);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uB9CC\uB8CC\uB0A0\uC9DC        ex)DD.MM.YY");
		label_2.setBounds(537, 171, 180, 25);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC774\uBA54\uC77C \uC8FC\uC18C");
		label_3.setBounds(12, 249, 96, 25);
		frame.getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 284, 345, 35);
		frame.getContentPane().add(textField_3);
		
		JLabel label_4 = new JLabel("\uC804\uD654\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC\r\n");
		label_4.setBounds(371, 249, 187, 25);
		frame.getContentPane().add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(369, 284, 290, 35);
		frame.getContentPane().add(textField_4);
		
		JLabel label_5 = new JLabel("\uC5EC\uAD8C\uBC88\uD638");
		label_5.setBounds(12, 330, 96, 35);
		frame.getContentPane().add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 375, 345, 35);
		frame.getContentPane().add(textField_5);
		
		JButton button = new JButton("\uACB0\uC81C\uD558\uAE30");
		button.setBounds(590, 386, 180, 51);
		frame.getContentPane().add(button);
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//캡처.3333jpg";
	}
}
