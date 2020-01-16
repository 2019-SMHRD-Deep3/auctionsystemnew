package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

import view.ASlogin;

import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class LA {
	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LA window = new LA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
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
		btnNewButton.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(550, 25, 168, 67);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("LA호텔을 한눈에");
		lblNewLabel.setBounds(12, 9, 723, 83);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//2.jpg";
		lblNewLabel_1.setIcon(new ImageIcon(imgPath2));
		lblNewLabel_1.setBounds(12, 125, 120, 110);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//3.jpg";
		label.setIcon(new ImageIcon(imgPath3));
		label.setBounds(272, 125, 120, 110);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//4.jpg";
		label_1.setIcon(new ImageIcon(imgPath4));
		label_1.setBounds(402, 125, 120, 110);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//5.jpg";
		label_2.setIcon(new ImageIcon(imgPath5));
		label_2.setBounds(532, 125, 120, 110);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//6.jpg";
		label_3.setIcon(new ImageIcon(imgPath6));
		label_3.setBounds(12, 281, 120, 110);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//7.jpg";
		label_4.setIcon(new ImageIcon(imgPath7));
		label_4.setBounds(272, 281, 120, 110);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		String imgPath8 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//8.jpg";
		label_5.setIcon(new ImageIcon(imgPath8));
		label_5.setBounds(402, 281, 120, 110);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//9.jpg";
		label_6.setIcon(new ImageIcon(imgPath9));
		label_6.setBounds(532, 281, 120, 110);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		String imgPath10 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//10.jpg";
		label_7.setIcon(new ImageIcon(imgPath10));
		label_7.setBounds(142, 125, 120, 110);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		String imgPath11 = this.getClass().getResource(".").getPath() + "..//..//img//미주//LA//1";
		label_8.setIcon(new ImageIcon(imgPath11));
		label_8.setBounds(142, 281, 120, 110);
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
