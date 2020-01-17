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
import model.∞·¡¶√¢;

public class LA {
	private JFrame frame;
	private Member loginuser;
	public LA(Member member) {
		this.loginuser = member;
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
		panel.setBounds(156, 60, 738, 371);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 720, 370);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		scrollPane.setViewportView(panel_1);
		frame.setBounds(100, 100, 890,465);
		panel_1.setPreferredSize(new Dimension(680,600));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//πÃ¡÷//LA//1.jpg";
	    
	    JButton btnNewButton = new JButton("\uC608\uC57D\uD558\uAE30");
	    btnNewButton.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    		∞·¡¶√¢ bill = new ∞·¡¶√¢();
	    	}
	    });
	    btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 18));
	    btnNewButton.setBackground(Color.WHITE);
	    btnNewButton.setBounds(532, 85, 175, 55);
	    panel_1.add(btnNewButton);
	    
	    JButton button = new JButton("\uC608\uC57D\uD558\uAE30");
	    button.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		∞·¡¶√¢ bill = new ∞·¡¶√¢();
	    	}
	    });
	    button.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 18));
	    button.setBackground(Color.WHITE);
	    button.setBounds(532, 253, 175, 62);
	    panel_1.add(button);
	    
	    JButton button_1 = new JButton("\uC608\uC57D\uD558\uAE30");
	    button_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		∞·¡¶√¢ bill = new ∞·¡¶√¢();
	    	}
	    });
	    button_1.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 18));
	    button_1.setBackground(Color.WHITE);
	    button_1.setBounds(532, 474, 175, 62);
	    panel_1.add(button_1);
	    lblNewLabel_1.setIcon(new ImageIcon(imgPath));
		lblNewLabel_1.setBounds(12, 10, 160, 157);
		panel_1.add(lblNewLabel_1);
		
		JTextPane txtpnJwIn = new JTextPane();
		txtpnJwIn.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		txtpnJwIn.setText("JW \uBA54\uB9AC\uC5B4\uD2B8 in L.A\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnJwIn.setBounds(231, 10, 476, 157);
		panel_1.add(txtpnJwIn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 695, 182);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//πÃ¡÷//LA//2.jpg";
	    lblNewLabel_2.setIcon(new ImageIcon(imgPath1));
		lblNewLabel_2.setBounds(12, 205, 160, 157);
		panel_1.add(lblNewLabel_2);
		
		JTextPane txtpnTheGrandHotel = new JTextPane();
		txtpnTheGrandHotel.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		txtpnTheGrandHotel.setText("Embassy Suites by Hilton L.A(\uD790\uD2BC)\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnTheGrandHotel.setBounds(231, 202, 476, 157);
		panel_1.add(txtpnTheGrandHotel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(12, 202, 695, 182);
		panel_1.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		String imgPath2 = this.getClass().getResource(".").getPath()+"..//..//img//πÃ¡÷//LA//3.jpg";
	    lblNewLabel_4.setIcon(new ImageIcon(imgPath2));
		lblNewLabel_4.setBounds(12, 394, 160, 157);
		panel_1.add(lblNewLabel_4);
		
		JTextPane txtpnInLa = new JTextPane();
		txtpnInLa.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 20));
		txtpnInLa.setText("\uC250\uB77C\uD1A4 in L.A\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnInLa.setBounds(231, 394, 476, 157);
		panel_1.add(txtpnInLa);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 394, 695, 182);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(0, 10, 155, 194);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(0, 229, 155, 182);
		frame.getContentPane().add(lblNewLabel_6);
		
		
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
