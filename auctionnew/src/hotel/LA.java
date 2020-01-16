package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class LA {

	private JFrame frame;

	
	public LA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C\uD558\uAE30");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(550, 25, 168, 67);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("LA\uD638\uD154 \uD55C\uB208\uC5D0 \uBCF4\uAE30");
		lblNewLabel.setBounds(12, 9, 723, 83);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\JW\uBA54\uB9AC\uC5B4\uD2B8 5\uC131\uAE09 26\uB9CC\uC6D0.JPG"));
		lblNewLabel_1.setBounds(12, 125, 120, 110);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uB808\uC9C0\uB358\uC2A4 \uC778 \uBC14\uC774 \uBA54\uB9AC\uC5B4\uD2B8 \uB85C\uC2A4\uC564\uC824\uB808\uC2A4 LAX \uC13C\uCD94\uB9AC \uBD88\uB7EC\uBC14\uB4DC  3\uC131\uAE09  277,767\uC6D0.jpg"));
		label.setBounds(282, 125, 120, 110);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uB85C\uC2A4\uC564\uC824\uB808\uC2A4 \uC5D0\uC5B4\uD3EC\uD2B8 \uBA54\uB9AC\uC5B4\uD2B8 3\uC131\uAE09  233,456.jpg"));
		label_1.setBounds(414, 125, 120, 110);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uB974\uB124\uC0C1\uC2A4 \uB85C\uC2A4\uC564\uC824\uB808\uC2A4 \uC5D0\uC5B4\uD3EC\uD2B8 \uD638\uD154  3\uC131\uAE09  254,546.jpg"));
		label_2.setBounds(546, 125, 120, 110);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uC250\uB77C\uD1A4 \uAC8C\uC774\uD2B8\uC6E8\uC774 \uB85C\uC2A4\uC564\uC824\uB808\uC2A4  LA  4\uC131\uAE09  248.456\uC6D0.jpg"));
		label_3.setBounds(12, 281, 120, 110);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uC5E0\uBC84\uC2DC \uC2A4\uC704\uD2B8 \uB85C\uC2A4\uC564\uC824\uB808\uC2A4 \uC778\uD130\uB0B4\uC154\uB110 \uC5D0\uC5B4\uD3EC\uD2B8\uB178\uC2A4 3\uC131\uAE09  156,566s=\uC6D0.jpg"));
		label_4.setBounds(282, 281, 120, 110);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uCF54\uD2B8\uC57C\uB4DC \uBC14\uC774 \uBA54\uB9AC\uC5B4\uD2B8 \uB85C\uC2A4\uC564\uC824\uB9AC\uC2A4 LAX \uC13C\uCD94\uB9AC \uBE14\uB7EC\uBC14\uB4DC 3\uC131\uAE09  260,456\uC6D0.jpg"));
		label_5.setBounds(414, 281, 120, 110);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uD558\uC58F\uD2B8 \uB9AC\uC804\uC2DC \uB85C\uC2A4\uC564\uC824\uB808\uC2A4 \uC778\uD130\uB0B4\uC154\uB110 \uC5D0\uC5B4\uD3EC\uD2B8  3\uC131\uAE09  128.567\uC6D0.jpg"));
		label_6.setBounds(546, 281, 120, 110);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uB354 \uC6E8\uC2A4\uD2F4 \uB85C\uC2A4\uC564\uC824\uB808\uC2A4 \uC5D0\uC5B4\uD3EC\uD2B8 4\uC131\uAE09  245,445\uC6D0.jpg"));
		label_7.setBounds(144, 125, 120, 110);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\SM020\\Desktop\\\uD638\uD154\uC0AC\uC9C4\\\uD638\uD154\uC0AC\uC9C4\\\uBBF8\uC8FC\\LA\\\uC528\uC5D0\uC2A4\uD638\uD154\uC564\uB9AC\uC870\uD2B8 5\uC131\uAE09 171,229\uC6D0.jpg"));
		label_8.setBounds(144, 281, 120, 110);
		frame.getContentPane().add(label_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("JW\uBA54\uB9AC\uC5B4\uD2B8");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(11, 96, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnla = new JRadioButton("\uB354\uC6E8\uC2A4\uD2F4LA");
		rdbtnla.setBackground(Color.WHITE);
		rdbtnla.setBounds(143, 96, 121, 23);
		frame.getContentPane().add(rdbtnla);
		
		JRadioButton radioButton_1 = new JRadioButton("\uB808\uC9C0\uB358\uC2A4\uBA54\uB9AC\uC5B4\uD2B8");
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(282, 96, 121, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\uBA54\uB9AC\uC5B4\uD2B8");
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(414, 96, 121, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("\uB974\uB124\uC0C1\uC2A4");
		radioButton_3.setBackground(Color.WHITE);
		radioButton_3.setBounds(545, 96, 121, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\uC250\uB77C\uD1A4");
		radioButton_4.setBackground(Color.WHITE);
		radioButton_4.setBounds(12, 252, 121, 23);
		frame.getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("\uC528\uC5D0\uC2A4");
		radioButton_5.setBackground(Color.WHITE);
		radioButton_5.setBounds(144, 252, 121, 23);
		frame.getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("\uC5E0\uBC84\uC2DC \uC2A4\uC704\uD2B8");
		radioButton_6.setBackground(Color.WHITE);
		radioButton_6.setBounds(281, 252, 121, 23);
		frame.getContentPane().add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("\uCF54\uD2B8\uC57C\uB4DC");
		radioButton_7.setBackground(Color.WHITE);
		radioButton_7.setBounds(413, 252, 121, 23);
		frame.getContentPane().add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("\uD558\uC57C\uD2B8");
		radioButton_8.setBackground(Color.WHITE);
		radioButton_8.setBounds(546, 252, 121, 23);
		frame.getContentPane().add(radioButton_8);
	}
}
