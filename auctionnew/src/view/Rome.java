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
import javax.swing.border.MatteBorder;
import javax.swing.JTextPane;

public class Rome {

	private JFrame frame;
	private JTextPane textPane;

	
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uB610\uCE58.JPG"));
		lblNewLabel.setBounds(12, 10, 478, 290);
		frame.getContentPane().add(lblNewLabel);
		
		textPane = new JTextPane();
		textPane.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 24));
		textPane.setText("\uC800 \uB610\uCE58\uB294 \uB85C\uB9C8\uC5D0 \uC5EC\uD589\uC744 \uAC14\uC2B5\uB2C8\uB2E4\r\n\uB85C\uB9C8\uB294 \uCF5C\uB85C\uC138\uC6C0\uC774 \uC788\uC8E0!\r\n\uCF5C\uB85C\uC138\uC6C0\uC5D0\uC11C \uC800\uB294 \uC0AC\uC9C4\uC744 \uCC0D\uC5C8\uB2F5\uB2C8\uB2E4!\r\n\uC5B4\uB5A4\uAC00\uC694? \uBA4B\uC788\uB098\uC694?\r\n\uB85C\uB9C8\uC5D0 best of best place!!!!\r\n\uCF5C\uB85C\uC138\uC6C0\uC5D0\uC11C \uB610\uCE58\uC5D0 18\uBC88\uC9F8 \uC5EC\uD589\uC744 !!!\r\n\uB05D!!!!!!!!!!!!!!!!!!");
		textPane.setBounds(502, 10, 304, 290);
		frame.getContentPane().add(textPane);
	}
}
