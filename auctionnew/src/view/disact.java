package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.Payment;

public class disact {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					disact window = new disact();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public disact(Payment payment) {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 730, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uACB0\uC81C\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 23, 690, 48);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//¾×Æ¼ºñÆ¼.jpg";
	    lblNewLabel.setIcon(new ImageIcon(imgPath1));
		lblNewLabel.setBounds(12, 95, 274, 274);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(298, 97, 404, 87);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
