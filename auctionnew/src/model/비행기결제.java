package model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class �������� {

	private JFrame frame;
	private Member loginuser;
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
					�������� window = new ��������();
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
	public ��������() {
	//	this.loginuser = member;
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
		
		price = new JLabel();
		price.setBounds(371, 356, 187, 60);
		frame.getContentPane().add(price);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 207, 149, 35);
		frame.getContentPane().add(textField);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(12, 171, 83, 25);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC");
		label_1.setBounds(179, 172, 187, 25);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 207, 345, 35);
		frame.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("\uB9CC\uB8CC\uB0A0\uC9DC        ex)DD.MM.YY");
		label_2.setBounds(537, 171, 180, 25);
		frame.getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBounds(536, 207, 162, 35);
		frame.getContentPane().add(textField_2);
		
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
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(590, 386, 180, 51);
		frame.getContentPane().add(button);
		
		JRadioButton price1 = new JRadioButton("");
		price1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(price1.isSelected()) {
				String i = "1,670,480��";
				
				price.setText(i);
				}
				else {
					price.setText(null);
				}
			}
		});
		price1.setBounds(90, 142, 24, 23);
		frame.getContentPane().add(price1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("OZ137\r\nICN(13:30) > LAX(12:00)\r\nOZ375\r\nLAX(09:00) > ICN(15:00)+1");
		textPane.setFont(new Font("���� ���� Semilight", Font.BOLD, 12));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(12, 45, 180, 116);
		frame.getContentPane().add(textPane);
		
		JRadioButton price2 = new JRadioButton("");
		price2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(price2.isSelected()) {
					String m = "1,628,320��";
					
					price.setText(m);
				
				}else {
						price.setText(null);
					}
				}
			
			
		});
		price2.setBounds(285, 142, 24, 23);
		frame.getContentPane().add(price2);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("OZ168\r\nICN(16:30) > LAX(15:00)\r\nOZ354\r\nLAX(11:00) > ICN(17:00)+1");
		textPane_1.setFont(new Font("���� ���� Semilight", Font.BOLD, 13));
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(204, 46, 180, 116);
		frame.getContentPane().add(textPane_1);
		
		JRadioButton price3 = new JRadioButton("");
		price3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(price3.isSelected()) {
					String k = "1,594,540��";
					
					price.setText(k);
					
					
				}else {
						price.setText(null);
					}
				}
				
				
		});
		price3.setBounds(500, 142, 24, 23);
		frame.getContentPane().add(price3);
		
		
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("OZ132\r\nICN(23:30) >LAX(20:00)\r\nOZ362\r\nLAX(21:00) >ICN(03:00)+2");
		textPane_2.setFont(new Font("���� ���� Semilight", Font.BOLD, 13));
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setBounds(414, 45, 180, 116);
		frame.getContentPane().add(textPane_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(price1);
		group.add(price2);
		group.add(price3);
		
//		if(price1.isSelected()) {
//			String i = "1,670,480��";
//			price.setText(i);
//			price = new JLabel(price.getText());
//		}else if(price2.isSelected()) {
//			String m = "1,627,320��";
//			price.setText(m);
//			price = new JLabel(price.getText());
//		}else if(price3.isSelected()) {
//			String k = "1,595,680��";
//			price.setText(k);
//			price = new JLabel(price.getText());
//		}
	//	price = new JLabel(price.getText());
		
//		price.setBounds(371, 375, 187, 60);
//		frame.getContentPane().add(price);
		
		JLabel lblNewLabel_1 = new JLabel("\uACB0\uC81C\uAE08\uC561\r\n");
		lblNewLabel_1.setBounds(371, 329, 106, 35);
		frame.getContentPane().add(lblNewLabel_1);
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//ĸó.3333jpg";
	}
}
