package view;

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

import model.°áÁ¦Ã¢;

public class ACTIVITYp {

	private JFrame frame;

	
	public ACTIVITYp() {
		initialize();
//		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 892, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(144, 43, 730, 377);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 730, 377);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(700,800));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//ÆÄ¸®¾×1.jpg";
		
		JButton button = new JButton("\uC608\uC57D\uD558\uAE30");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
			}
		});
		button.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
		button.setBackground(Color.YELLOW);
		button.setBounds(546, 45, 137, 48);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
			}
		});
		button_1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
		button_1.setBackground(Color.YELLOW);
		button_1.setBounds(546, 184, 137, 48);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
			}
		});
		button_2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
		button_2.setBackground(Color.YELLOW);
		button_2.setBounds(546, 320, 137, 48);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("\uC608\uC57D\uD558\uAE30");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
			}
		});
		button_3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
		button_3.setBackground(Color.YELLOW);
		button_3.setBounds(546, 452, 137, 48);
		panel_1.add(button_3);
		lblNewLabel.setIcon(new ImageIcon(imgPath1));
		lblNewLabel.setBounds(25, 10, 164, 127);
		panel_1.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("New label");
		String imgPath2 = this.getClass().getResource(".").getPath()+"..//..//img//ÆÄ¸®¾×2.jpg";
		label_3.setIcon(new ImageIcon(imgPath2));
		label_3.setBounds(25, 147, 164, 127);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		String imgPath3 = this.getClass().getResource(".").getPath()+"..//..//img//ÆÄ¸®¾×3.jpg";
		label_4.setIcon(new ImageIcon(imgPath3));
		label_4.setBounds(25, 284, 164, 127);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		String imgPath4 = this.getClass().getResource(".").getPath()+"..//..//img//ÆÄ¸®º£¸£.jpg";
		label_5.setIcon(new ImageIcon(imgPath4));
		label_5.setBounds(25, 421, 164, 127);
		panel_1.add(label_5);
		
		JTextPane txtpnOneDayTour = new JTextPane();
		txtpnOneDayTour.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		txtpnOneDayTour.setText("One Day Tour in Paris (\uD30C\uB9AC \uD22C\uC5B4)\r\n\r\n\uD30C\uB9AC \uC2DC\uB0B4\uB97C \uD558\uB8E8\uB9CC\uC5D0!\r\n\uD30C\uB9AC\uC5D0 \uBAA8\uB4E0 \uAD50\uD1B5\uD3B8\uC744 \uC774\uC6A9\uD558\uBA70\r\n\uD30C\uB9AC\uC5D0\uC11C \uC778\uC0DD\uC0AC\uC9C4 \uCC0D\uAE30!\r\n\r\n");
		txtpnOneDayTour.setBounds(201, 10, 489, 127);
		panel_1.add(txtpnOneDayTour);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		textPane_1.setText("\uB8E8\uBE0C\uB974 \uBC15\uBB3C\uAD00\r\n\r\n\uC138\uACC4 3\uB300 \uBC15\uBB3C\uAD00\r\n\uD30C\uB9AC\uC5D0 \uC654\uB2E4\uBA74 \uAF2D \uAC00\uBD10\uC57C\uD560 \uACF3!\r\n\uC911\uC138 \uC720\uB7FD \uBB38\uD654\uB97C \uD55C\uB208\uC5D0 \uBCF4\uAE30\r\n");
		textPane_1.setBounds(201, 147, 489, 127);
		panel_1.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		textPane_2.setText("\uC5D0\uD3A0\uD0D1 \uD22C\uC5B4\r\n\r\n\uD30C\uB9AC = \uC5D0\uD3A0\uD0D1\r\n\uD30C\uB9AC\uC5D0 \uAC14\uB2E4\uBA74 \uAF2D \uAC00\uC57C\uD560 \uBA85\uC18C\r\n\uC57C\uACBD\uACFC \uD568\uAED8 \uD30C\uB9AC\uC5D0 \uCD94\uC5B5 \uB0A8\uAE30\uAE30");
		textPane_2.setBounds(201, 284, 489, 127);
		panel_1.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		textPane_3.setText("\uBCA0\uB974\uC0AC\uC720\r\n\r\n\uBC14\uB85C\uD06C \uC591\uC2DD\uC758 \uB300\uD45C\uC791\r\n17\uC138\uAE30 \uD504\uB791\uC2A4\uC758 \uAD8C\uB825\uC758 \uC0C1\uC9D5\r\n\uD504\uB791\uC2A4 \uBBF8\uC220\uC758 \uB05D\uD310\uC655\uC5D0\uC11C \uC778\uC0DD\uC0AC\uC9C4 \uCC0D\uAE30!");
		textPane_3.setBounds(201, 421, 489, 127);
		panel_1.add(textPane_3);
		
		JLabel label = new JLabel("New label");
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//qr.jpg";
		label.setIcon(new ImageIcon(imgPath5));
		label.setBounds(12, 278, 122, 122);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		String imgPath6 = this.getClass().getResource(".").getPath()+"..//..//img//ºü²ô.jpg";
		label_1.setIcon(new ImageIcon(imgPath6));
		label_1.setBounds(12, 66, 122, 122);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		String imgPath7 = this.getClass().getResource(".").getPath()+"..//..//img//¹è³Ê.png";
		lblNewLabel_1.setIcon(new ImageIcon(imgPath7));
		lblNewLabel_1.setBounds(0, 0, 180, 43);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
