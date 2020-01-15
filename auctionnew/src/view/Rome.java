package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Rome {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtBestOf;
	private JTextField textField_5;
	private JTextField textField_4;

	
	public Rome() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 834, 547);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uB610\uCE58.JPG"));
		lblNewLabel.setBounds(12, 10, 478, 290);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(502, 10, 304, 488);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.menu);
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		textField.setText("\uC800 \uB610\uCE58\uB294 \uB85C\uB9C8\uC5D0 \uC5EC\uD589\uC744 \uAC14\uC2B5\uB2C8\uB2E4");
		textField.setBounds(0, 0, 304, 56);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\uB85C\uB9C8\uB294 \uCF5C\uB85C\uC138\uC6C0\uC774 \uC788\uC8E0!");
		textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(0, 55, 304, 56);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\uCF5C\uB85C\uC138\uC6C0\uC5D0\uC11C \uC800\uB294 \uC0AC\uC9C4\uC744 \uCC0D\uC5C8\uB2F5\uB2C8\uB2E4!");
		textField_2.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(0, 110, 304, 56);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("\uC5B4\uB5A4\uAC00\uC694? \uBA4B\uC788\uB098\uC694?");
		textField_3.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(0, 163, 304, 56);
		panel.add(textField_3);
		
		txtBestOf = new JTextField();
		txtBestOf.setText("\uB85C\uB9C8\uC5D0 best of best place!!!!");
		txtBestOf.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		txtBestOf.setColumns(10);
		txtBestOf.setBounds(0, 218, 304, 56);
		panel.add(txtBestOf);
		
		textField_5 = new JTextField();
		textField_5.setText("\uCF5C\uB85C\uC138\uC6C0\uC5D0\uC11C \uB610\uCE58\uC5D0 18\uBC88\uC9F8 \uC5EC\uD589\uC744 !!!");
		textField_5.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		textField_5.setColumns(10);
		textField_5.setBounds(0, 272, 304, 56);
		panel.add(textField_5);
		
		textField_4 = new JTextField();
		textField_4.setText("\uB05D!!!!!!!!!!!!!");
		textField_4.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(0, 325, 304, 56);
		panel.add(textField_4);
	}
}
