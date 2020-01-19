package view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Chile {

	private JFrame frame;

	
	public Chile() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 830, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uC0B0\uD2F0\uC544\uACE0 \uBAA8\uB370\uB098 \uAD81\uC804.JPG"));
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//산티아고 모데나 궁전.jpg";
	       lblNewLabel.setIcon(new ImageIcon(imgPath5));
		lblNewLabel.setBounds(104, 29, 600, 286);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnDdd = new JTextPane();
		txtpnDdd.setBackground(new Color(255, 255, 255));
		txtpnDdd.setFont(new Font("한컴 쿨재즈 M", Font.PLAIN, 24));
		txtpnDdd.setText("\uCE60\uB808\uC758 \uBD81\uBD80\uB294 1520\uB144 \uB9C8\uC824\uB780\uC5D0 \uC758\uD574 \uBC1C\uACAC\uB418\uAE30 \uC804 16\uC138\uAE30 \uCD08\uAE4C\uC9C0 \uC789\uCE74\uC81C\uAD6D\uC758 \uC601\uD1A0\uC600\uC73C\uB098 1540\uB144 \uC5D0\uC2A4\uD30C\uB0D0\uC758 P.\uBC1C\uB514\uBE44\uC544 \uC7A5\uAD70\uC774 \uC544\uB77C\uC6B0\uCE78\uC871 \uC815\uBCF5\uC804\uC7C1\uC744 \uC2DC\uC791\uD55C \uC774\uD6C4 270\uC5EC \uB144 \uB3D9\uC548 \uC5D0\uC2A4\uD30C\uB0D0\uC758 \uC2DD\uBBFC\uC9C0\uAC00 \uB418\uC5C8\uB2E4. 1810\uB144 9\uC6D4 18\uC77C(\uCE60\uB808\uC758 \uB3C5\uB9BD\uAE30\uB150\uC77C) \uC804 \uD398\uB8E8 \uBD80\uC655\uC758 \uC544\uB4E4\uC778 \uBCA0\uB974\uB098\uB974\uB3C4 \uC624\uC774\uAE34\uC2A4\uB97C \uCD5C\uACE0 \uCD1D\uB3C5\uC73C\uB85C \uC0BC\uC544 \uB3C5\uB9BD\uC744 \uC120\uC5B8\uD558\uC600\uC73C\uB098 \uC774\uD6C4 100\uB144 \uAC04\uC740 \uC601\uAD6D\uC758 \uACBD\uC81C\uC9C0\uBC30\uB97C \uBC1B\uC558\uB2E4. \uCE60\uB808\uB85C\uC624\uC138\uC6A9\r\n\r\n\r\n");
		txtpnDdd.setBounds(36, 325, 472, 174);
		frame.getContentPane().add(txtpnDdd);
		
		JButton btnNewButton = new JButton("\uCE60\uB808 \uCD5C\uC800\uAC00 \uAC80\uC0C9\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
							"https://www.tour2000.co.kr/overseas/goods/summary.do?curPage=1&rownum=&go_pkg=&good_type_cd=P&area_cd=40&sub_area_cd=P462&goods_cd=19220165&utm_source=naver&utm_medium=cpc&utm_campaign=pc_naver_usa&utm_term=%EC%A4%91%EB%82%A8%EB%AF%B822%EC%9D%BC#0"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("한컴 쿨재즈 M", Font.BOLD, 24));
		btnNewButton.setBounds(572, 406, 214, 69);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98: \uD22C\uC5B42000");
		lblNewLabel_1.setFont(new Font("한컴 쿨재즈 M", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(676, 476, 110, 25);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
