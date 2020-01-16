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
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
		frame.setBounds(100, 100, 967,682);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(189, 52, 750, 672);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(500,400));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//1.jpg";
		lblNewLabel_1.setIcon(new ImageIcon(imgPath1));
		lblNewLabel_1.setBounds(12, 10, 170, 150);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(12, 531, 170, 150);
		panel.add(lblNewLabel_4);
		
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(194, 532, 512, 150);
		panel.add(textArea_3);
		textArea_3.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		textArea_3.setText("\uB354 \uB2C8\uAEBC \uBF40\uAEBC \uD638\uD154\r\n\r\nbreakfast included\r\nFree WIFI\r\nFree PARKING");
		
		JTextArea txtrJw = new JTextArea();
		txtrJw.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		txtrJw.setText("JW \uBA54\uB9AC\uC6B0\uD2B8 \uD638\uD154\r\n\r\nbreakfast included\r\nFree WIFI\r\nFree PARKING");
		txtrJw.setBounds(194, 10, 512, 148);
		panel.add(txtrJw);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 691, 148);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//2.jpg";
		lblNewLabel_2.setIcon(new ImageIcon(imgPath2));
		lblNewLabel_2.setBounds(12, 197, 170, 150);
		panel.add(lblNewLabel_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("\uAE38\uD2BC \uD640\uB9AC \uD638\uD154\r\n\r\nbreakfast included\r\nFree WIFI\r\nFree PARKING");
		textArea_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		textArea_1.setBounds(191, 198, 512, 148);
		panel.add(textArea_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(12, 198, 691, 148);
		panel.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 373, 170, 150);
		panel.add(lblNewLabel_3);
		
		
		JTextArea txtrBreakfastIncluded = new JTextArea();
		txtrBreakfastIncluded.setBounds(194, 374, 512, 148);
		panel.add(txtrBreakfastIncluded);
		txtrBreakfastIncluded.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		txtrBreakfastIncluded.setText("\uB354\uB108\uB9C8\uB4DC\r\n\r\nbreakfast included\r\nFree WIFI\r\nFree PARKING");
		
		JLabel lblX = new JLabel("x");
		lblX.setBounds(12, 532, 691, 148);
		panel.add(lblX);
		lblX.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		
		JLabel lblBreakfastIncluded = new JLabel("");
		lblBreakfastIncluded.setBounds(12, 374, 691, 148);
		panel.add(lblBreakfastIncluded);
		lblBreakfastIncluded.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//3.jpg";
		lblNewLabel_3.setIcon(new ImageIcon(imgPath3));
		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//4.jpg";
		lblNewLabel_4.setIcon(new ImageIcon(imgPath4));
		
//<<<<<<< HEAD
//		JTextArea textArea_3 = new JTextArea();
//		textArea_3.setBounds(384, 618, 512, 150);
//		frame.getContentPane().add(textArea_3);
//		
//		JLabel label_2 = new JLabel("\uB354 \uB2C8\uAEBC \uBF40\uAEBC \uD638\uD154\r\n\r\nbreakfast included\r\nFree WIFI\r\nFree PARKING");
//		label_2.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
//		label_2.setBounds(201, 620, 691, 148);
//		frame.getContentPane().add(label_2);
//		String imgPath21 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//1.jpg";
//		String imgPath31 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//2.jpg";
//		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//4.jpg";
//		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//5.jpg";
//		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//6.jpg";
//		String imgPath8 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//7.jpg";
//		String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//8.jpg";
//		String imgPath10 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//9.jpg";
//		String imgPath11 = this.getClass().getResource(".").getPath() + "..//..//img//πÃ¡÷//LA//10.jpg";
//=======
//>>>>>>> branch 'master' of https://github.com/khornejp/auctionsystemnew.git
	}
}
