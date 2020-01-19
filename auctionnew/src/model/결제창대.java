package model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class °áÁ¦Ã¢´ë {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					°áÁ¦Ã¢´ë window = new °áÁ¦Ã¢´ë();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public °áÁ¦Ã¢´ë() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 515);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		price = new JLabel();
		price.setBounds(371, 356, 187, 60);
		frame.getContentPane().add(price);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 200, 149, 35);
		frame.getContentPane().add(textField);

		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(12, 169, 83, 25);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC");
		label_1.setBounds(181, 169, 187, 25);
		frame.getContentPane().add(label_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 200, 345, 35);
		frame.getContentPane().add(textField_1);

		JLabel label_2 = new JLabel("\uB9CC\uB8CC\uB0A0\uC9DC        ex)DD.MM.YY");
		label_2.setBounds(537, 169, 180, 25);
		frame.getContentPane().add(label_2);

		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBounds(533, 200, 162, 35);
		frame.getContentPane().add(textField_2);

		JLabel label_3 = new JLabel("\uC774\uBA54\uC77C \uC8FC\uC18C");
		label_3.setBounds(12, 245, 96, 25);
		frame.getContentPane().add(label_3);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 277, 345, 35);
		frame.getContentPane().add(textField_3);

		JLabel label_4 = new JLabel("\uC804\uD654\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC\r\n");
		label_4.setBounds(369, 245, 187, 25);
		frame.getContentPane().add(label_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(369, 277, 290, 35);
		frame.getContentPane().add(textField_4);

		JLabel label_5 = new JLabel("\uC5EC\uAD8C\uBC88\uD638");
		label_5.setBounds(12, 322, 96, 35);
		frame.getContentPane().add(label_5);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 362, 345, 35);
		frame.getContentPane().add(textField_5);

		JButton button = new JButton("\uACB0\uC81C\uD558\uAE30");
		button.setBackground(Color.WHITE);
		button.setBounds(582, 382, 180, 51);
		frame.getContentPane().add(button);

		JRadioButton price1 = new JRadioButton("");
		price1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (price1.isSelected()) {
					String i = "1,654,830¿ø";

					price.setText(i);
				} else {
					price.setText(null);
				}
			}
		});
		price1.setBounds(93, 135, 24, 23);
		frame.getContentPane().add(price1);

		JTextPane txtpnKeIcn = new JTextPane();
		txtpnKeIcn.setText("KE371\r\nICN(12:30) > LAX(11:00)\r\nKE348\r\nLAX(07:00) > ICN(13:00)+1");
		txtpnKeIcn.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 12));
		txtpnKeIcn.setBackground(SystemColor.menu);
		txtpnKeIcn.setBounds(12, 43, 180, 116);
		frame.getContentPane().add(txtpnKeIcn);

		JRadioButton price2 = new JRadioButton("");
		price2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (price2.isSelected()) {
					String k = "1,598,420¿ø";

					price.setText(k);
				} else {
					price.setText(null);
				}
			}
		});
		price2.setBounds(288, 135, 24, 23);
		frame.getContentPane().add(price2);

		JTextPane txtpnKeIcn_1 = new JTextPane();
		txtpnKeIcn_1.setText("KE314\r\nICN(15:40) > LAX(14:10)\r\nKE385\r\nLAX(15:00) > ICN(21:00)+1");
		txtpnKeIcn_1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 12));
		txtpnKeIcn_1.setBackground(SystemColor.menu);
		txtpnKeIcn_1.setBounds(204, 43, 180, 116);
		frame.getContentPane().add(txtpnKeIcn_1);

		JRadioButton price3 = new JRadioButton("");
		price3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (price3.isSelected()) {
					String m = "1,708,150¿ø";

					price.setText(m);
				} else {
					price.setText(null);
				}
			}
		});
		price3.setBounds(483, 136, 24, 23);
		frame.getContentPane().add(price3);

		ButtonGroup group = new ButtonGroup();
		group.add(price1);
		group.add(price2);
		group.add(price3);

		JTextPane txtpnKeIcn_2 = new JTextPane();
		txtpnKeIcn_2.setText("KE348\r\nICN(13:30) > LAX(12:00)\r\nKE386\r\nLAX(23:00) > ICN(05:00)+2");
		txtpnKeIcn_2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 12));
		txtpnKeIcn_2.setBackground(SystemColor.menu);
		txtpnKeIcn_2.setBounds(396, 43, 180, 116);
		frame.getContentPane().add(txtpnKeIcn_2);

		JLabel label_6 = new JLabel("\uACB0\uC81C\uAE08\uC561\r\n");
		label_6.setBounds(369, 322, 106, 35);
		frame.getContentPane().add(label_6);

	}

}
