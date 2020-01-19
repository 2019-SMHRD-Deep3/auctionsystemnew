package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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
import model.∞·¡¶√¢;

public class ACTIVITYj {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ACTIVITYj(Member member) {
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
		panel.setOpaque(false);
		panel.setBounds(144, 43, 730, 378);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(0, 0, 730, 378);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(700,800));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		String imgPath1= this.getClass().getResource(".").getPath()+"..//..//img//¿œ∫ªµµ≈Ê.jpg";
		
		JButton button = new JButton("\uC608\uC57D\uD558\uAE30");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				∞·¡¶√¢ bill = new ∞·¡¶√¢();
			}
		});
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 15));
		button.setBackground(Color.YELLOW);
		button.setBounds(543, 42, 137, 48);
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
		button_1.setBounds(543, 178, 137, 48);
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
		button_2.setBounds(543, 316, 137, 48);
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
		button_3.setBounds(543, 449, 137, 48);
		panel_1.add(button_3);
		lblNewLabel.setIcon(new ImageIcon(imgPath1));
		lblNewLabel.setBounds(25, 10, 164, 127);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		String imgPath2= this.getClass().getResource(".").getPath()+"..//..//img//¿œ∫ª¿Ø¥œπˆº».jpg";
		label.setIcon(new ImageIcon(imgPath2));
		label.setBounds(25, 147, 164, 127);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("New label");
		String imgPath3= this.getClass().getResource(".").getPath()+"..//..//img//¿œ∫ªø¿ªÁƒ´º∫.jpg";
		label_1.setIcon(new ImageIcon(imgPath3));
		label_1.setBounds(25, 284, 164, 127);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		String imgPath4= this.getClass().getResource(".").getPath()+"..//..//img//¿œ∫ª¡÷≈√π⁄π∞∞¸.jpg";
		label_2.setIcon(new ImageIcon(imgPath4));
		label_2.setBounds(25, 421, 164, 127);
		panel_1.add(label_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		textPane.setText("\uB3C4\uD1A4\uBCF4\uB9AC\r\n\r\n\uC624\uC0AC\uCE74\uC758 \uBA85\uBB3C \uAE00\uB9AC\uCF54\uC0C1\r\n\uAE00\uB9AC\uCF54\uC0C1\uC744 \uD55C\uB208\uC5D0 \uBCFC\uC218 \uC788\uB294 \uB3C4\uD1A4\uBCF4\uB9AC\r\n\uB3C4\uD1A4\uBCF4\uB9AC\uB97C \uD06C\uB8E8\uC988\uB85C \uD55C\uB208\uC5D0 \uBCFC \uC218 \uC788\uB2E4\uBA74?\r\n");
		textPane.setBounds(201, 10, 489, 127);
		panel_1.add(textPane);
		
		JTextPane txtpnIn = new JTextPane();
		txtpnIn.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		txtpnIn.setText("\uC720\uB2C8\uBC84\uC15C \uC2A4\uD29C\uB514\uC624 in Japan\r\n\r\n\uC138\uACC4 \uCD5C\uB300 \uC2A4\uD29C\uB514\uC624\uB97C \uC77C\uBCF8\uC5D0\uC11C?\r\n\uD560\uB9AC\uC6C3 \uC601\uD654\uB97C \uAC00\uAE4C\uC6B4 \uC77C\uBCF8\uC5D0\uC11C \uB290\uB084\uC218 \uC788\uB2E4?\r\nWORLD UNIVERSAL STUDIO IN JAPAN ");
		txtpnIn.setBounds(201, 147, 489, 127);
		panel_1.add(txtpnIn);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		textPane_2.setText("\uC624\uC0AC\uCE74\uC131\r\n\r\n16\uC138\uAE30 \uC77C\uBCF8\uC758 \uC808\uB300\uAD8C\uB825\r\n\uB3C4\uC694\uD1A0\uBBF8 \uD788\uB370\uC694\uC2DC\uC758 \uAD81\uC804\r\n\uC804\uAD6D\uD1B5\uC77C \uD6C4 \uC77C\uBCF8\uC5D0 \uC911\uC2EC \uC624\uC0AC\uCE74\uB97C \uB290\uAEF4\uBCF4\uC790");
		textPane_2.setBounds(201, 284, 489, 127);
		panel_1.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 16));
		textPane_3.setText("\uC77C\uBCF8 \uC8FC\uD0DD \uBC15\uBB3C\uAD00\r\n\r\n\uB3C4\uC2DC \uAC70\uC8FC\uC5D0 \uC5ED\uC0AC\uC640 \uBB38\uD654\uB97C \uD14C\uB9C8\uB85C\r\n\uC5D0\uB3C4 \uC2DC\uB300 \uD6C4\uAE30\uBD80\uD130 \uD604\uC7AC\uAE4C\uC9C0\r\n\uC77C\uBCF8 \uC8FC\uD0DD\uC5D0 \uBCC0\uD654\uB97C \uD55C\uBC88\uC5D0 \uBCFC \uC218 \uC788\uC74C....");
		textPane_3.setBounds(201, 421, 489, 127);
		panel_1.add(textPane_3);
		
		JLabel label_3 = new JLabel("New label");
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//qr.jpg";
		label_3.setIcon(new ImageIcon(imgPath5));
		label_3.setBounds(12, 289, 122, 122);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		String imgPath6 = this.getClass().getResource(".").getPath()+"..//..//img//∫¸≤Ù.jpg";
		label_4.setIcon(new ImageIcon(imgPath6));
		label_4.setBounds(12, 79, 122, 122);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		String imgPath7 = this.getClass().getResource(".").getPath()+"..//..//img//πË≥ .png";
	    label_5.setIcon(new ImageIcon(imgPath7));
		label_5.setBounds(0, 0, 180, 43);
		frame.getContentPane().add(label_5);
		
	}

}
