package hotel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import model.Member;

public class Newyork {

	private JFrame frame;
	private Member loginuser;
	public Newyork(Member m) {
		this.loginuser = m;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(144, 43, 730, 367);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 724, 367);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(580,600));
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC608\uC57D\uD558\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		btnNewButton.setBounds(528, 41, 137, 48);
		panel_1.add(btnNewButton);
		
		JButton button_2 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_2.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button_2.setBounds(528, 459, 137, 48);
		panel_1.add(button_2);
		
		JButton button_1 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button_1.setBounds(528, 322, 137, 48);
		panel_1.add(button_1);
		
		JButton button = new JButton("\uC608\uC57D\uD558\uAE30");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button.setBounds(528, 185, 137, 48);
		panel_1.add(button);
		
		JTextPane txtpnIn = new JTextPane();
		txtpnIn.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		txtpnIn.setBounds(204, 10, 489, 127);
		panel_1.add(txtpnIn);
		txtpnIn.setText("\uB354 \uB9C8\uD06C in NYC\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		
		JTextPane txtpnIn_1 = new JTextPane();
		txtpnIn_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		txtpnIn_1.setBounds(204, 147, 489, 127);
		panel_1.add(txtpnIn_1);
		txtpnIn_1.setText("\uB86F\uB370 \uD3A0\uB9AC\uC2A4 in NYC\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		textPane_1.setBounds(204, 284, 489, 127);
		panel_1.add(textPane_1);
		textPane_1.setText("\uB354 \uB85D\uC2DC \uD2B8\uB77C\uC774\uBCA0\uCE74 in NYC\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		
		JTextPane txtpnIn_2 = new JTextPane();
		txtpnIn_2.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		txtpnIn_2.setText("\uD2B8\uB7FC\uD504 \uCEE8\uD2F0\uB128\uD0C8 in NYC\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnIn_2.setBounds(204, 421, 489, 127);
		panel_1.add(txtpnIn_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//πÃ¡÷//¥∫øÂ//1.jpg";
		lblNewLabel.setIcon(new ImageIcon(imgPath1));
		lblNewLabel.setBounds(25, 10, 152, 127);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		String imgPath2 = this.getClass().getResource(".").getPath()+"..//..//img//πÃ¡÷//¥∫øÂ//2.jpg";
		label.setIcon(new ImageIcon(imgPath2));
		label.setBounds(25, 147, 152, 127);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("New label");
		String imgPath3 = this.getClass().getResource(".").getPath()+"..//..//img//πÃ¡÷//¥∫øÂ//3.jpg";
		label_1.setIcon(new ImageIcon(imgPath3));
		label_1.setBounds(25, 284, 152, 127);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		String imgPath4 = this.getClass().getResource(".").getPath()+"..//..//img//πÃ¡÷//¥∫øÂ//4.jpg";
		label_2.setIcon(new ImageIcon(imgPath4));
		label_2.setBounds(25, 421, 152, 127);
		panel_1.add(label_2);
		
		frame.setBounds(100, 100, 890, 459);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
