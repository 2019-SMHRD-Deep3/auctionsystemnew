package view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import model.Member;
import model.∞·¡¶√¢;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class ACTIVITYl {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ACTIVITYl(Member member) {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 892, 460);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(144, 43, 730, 378);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 730, 378);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(700,800));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//la¿Ø¥œ.jpg";
		
		JButton button = new JButton("\uC608\uC57D\uD558\uAE30");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				∞·¡¶√¢ bill = new ∞·¡¶√¢();
			}
		});
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button.setBackground(Color.YELLOW);
		button.setBounds(541, 46, 137, 48);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				∞·¡¶√¢ bill = new ∞·¡¶√¢();
			}
		});
		button_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button_1.setBackground(Color.YELLOW);
		button_1.setBounds(541, 178, 137, 48);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				∞·¡¶√¢ bill = new ∞·¡¶√¢();
			}
		});
		button_2.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button_2.setBackground(Color.YELLOW);
		button_2.setBounds(541, 320, 137, 48);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				∞·¡¶√¢ bill = new ∞·¡¶√¢();
			}
		});
		button_3.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button_3.setBackground(Color.YELLOW);
		button_3.setBounds(541, 454, 137, 48);
		panel_1.add(button_3);
		lblNewLabel.setIcon(new ImageIcon(imgPath1));
		lblNewLabel.setBounds(25, 10, 164, 127);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		String imgPath2= this.getClass().getResource(".").getPath()+"..//..//img//la∏ª∏Æ.jpg";
		label.setIcon(new ImageIcon(imgPath2));
		label.setBounds(25, 147, 164, 127);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("New label");
		String imgPath3= this.getClass().getResource(".").getPath()+"..//..//img//la«“∏Æ.jpg";
		label_1.setIcon(new ImageIcon(imgPath3));
		label_1.setBounds(25, 284, 164, 127);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		String imgPath4= this.getClass().getResource(".").getPath()+"..//..//img//la¿⁄ø¨ªÁ.jpg";
		label_2.setIcon(new ImageIcon(imgPath4));
		label_2.setBounds(25, 421, 164, 127);
		panel_1.add(label_2);
		
		JTextPane txtpnIn = new JTextPane();
		txtpnIn.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		txtpnIn.setText("\uC720\uB2C8\uBC84\uC15C \uC2A4\uD29C\uB514\uC624 in L.A\r\n\r\n\uC138\uACC4 \uCD5C\uB300 \uC2A4\uD29C\uB514\uC624\r\n\uB9CE\uC740 \uD560\uB9AC\uC6C3 \uC791\uD488\uC774 \uC5EC\uAE30\uC11C!!\r\n\uC720\uB2C8\uBC84\uC15C \uC2A4\uD29C\uB514\uC624\uC758 \uB300\uD45C\uC791\uC744\r\nLA\uC5D0\uC11C \uB290\uAEF4\uBCF4\uC138\uC694.");
		txtpnIn.setBounds(201, 10, 489, 127);
		panel_1.add(txtpnIn);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		textPane_1.setText("\uB9D0\uB9AC\uBD80 \uD22C\uC5B4\r\n\r\n\uBBF8 \uC11C\uBD80 1\uBC88 \uB3C4\uB85C\r\n\uD0DC\uD3C9\uC591\uC5D0 \uC811\uD55C 34km\uC758 \uC544\uB984\uB2E4\uC6B4 \uD574\uC548\uC120\r\n\uBBF8\uAD6D\uC5D0\uC11C \uC9C0\uC911\uD574\uB97C \uB290\uAEF4\uBCF4\uC138\uC694");
		textPane_1.setBounds(201, 147, 489, 127);
		panel_1.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		textPane_2.setText("\uD560\uB9AC\uC6C3 \uC0AC\uC778\r\n\r\n\uC138\uACC4 No.1 \uC601\uD654\uC2DC\uC7A5\r\nL.A\uC758 \uC2DC\uADF8\uB2C8\uCC98 \uC0AC\uC778\r\n\uD560\uB9AC\uC6C3 \uC0AC\uC778\uAE4C\uC9C0 \uD2B8\uB798\uD0B9 \uD558\uAE30! ");
		textPane_2.setBounds(201, 284, 489, 127);
		panel_1.add(textPane_2);
		
		JTextPane txtpnIn_1 = new JTextPane();
		txtpnIn_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		txtpnIn_1.setText("\uC790\uC5F0\uC0AC \uBC15\uBB3C\uAD00 in L.A\r\n\r\n1\uC5B5\uB144\uC804 \uC9C0\uAD6C\uC758 \uCD95\uC18C\uD310\r\n\uC790\uC5F0\uC758 \uC5ED\uC0AC\uAC00 \uAE30\uB85D\uB41C \uBC15\uBB3C\uAD00\r\n\uC9C0\uAD6C \uD0C4\uC0DD\uC758 \uBE44\uBC00\uC774 \uC5EC\uAE30\uC5D0!!\r\n");
		txtpnIn_1.setBounds(201, 421, 489, 127);
		panel_1.add(txtpnIn_1);
		
		JLabel label_4 = new JLabel("New label");
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//qr.jpg";
		label_4.setIcon(new ImageIcon(imgPath5));
		label_4.setBounds(12, 289, 122, 122);
		frame.getContentPane().add(label_4);
		
		JLabel label_3 = new JLabel("New label");
		String imgPath6 = this.getClass().getResource(".").getPath()+"..//..//img//∫¸≤Ù.jpg";
		label_3.setIcon(new ImageIcon(imgPath6));
		label_3.setBounds(12, 92, 122, 122);
		frame.getContentPane().add(label_3);
		
		JLabel label_5 = new JLabel("New label");
		String imgPath7 = this.getClass().getResource(".").getPath()+"..//..//img//πË≥ .png";
	    label_5.setIcon(new ImageIcon(imgPath7));
		label_5.setBounds(0, 0, 180, 43);
		frame.getContentPane().add(label_5);
		
	}

}
