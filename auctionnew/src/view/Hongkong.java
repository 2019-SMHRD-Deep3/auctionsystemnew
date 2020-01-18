package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.SystemColor;

public class Hongkong {

	private JFrame frame;

	
	public Hongkong() {
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
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uD64D\uCF69.JPG"));
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//È«Äá.jpg";
		lblNewLabel.setIcon(new ImageIcon(imgPath5));
		lblNewLabel.setBounds(150, 35, 579, 306);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 255, 255));
		textPane.setFont(new Font("ÇÑÄÄ ÄðÀçÁî M", Font.PLAIN, 26));
		textPane.setText("\uC57C \uD64D\uCF69...... \uAC08\uB798?\r\n\uB098\uB3C4 \uAC00\uACE0 \uC2F6\uC740\uB370?\r\n\uD64D\uCF69 \uAC08\uB550 \uC778\uD130\uBE60\uB044\r\n\uBE60\uB044\uBE60\uB044~");
		textPane.setBounds(290, 366, 227, 108);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("\uD64D\uCF69 \uCD5C\uC800\uAC00 \uAC80\uC0C9");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
							"https://www.drtour.com/item/?M1=2&M2=177&M3=929&M4=987&M5=3213&utm_source=Naver&utm_medium=paidsearch&utm_term=%ED%99%8D%EC%BD%A9%EC%97%AC%ED%96%89&utm_campaign=All%5FRegion&utm_content=Chinese%5FPackage&n_media=27758&n_query=%ED%99%8D%EC%BD%A9%EC%97%AC%ED%96%89&n_rank=2&n_ad_group=grp-a001-01-000000010811277&n_ad=nad-a001-01-000000061513507&n_keyword_id=nkw-a001-01-000001987427054&n_keyword=%ED%99%8D%EC%BD%A9%EC%97%AC%ED%96%89&n_campaign_type=1&NaPm=ct%3Dk5g66vlk%7Cci%3D0A80001pPLXsxBzMgeXI%7Ctr%3Dsa%7Chk%3D9f532557a29b57578ae825dacca39e8f76274a25"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("ÇÑÄÄ ÄðÀçÁî M", Font.BOLD, 24));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(580, 400, 210, 74);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uC5EC\uD589\uBC15\uC0AC");
		lblNewLabel_1.setFont(new Font("ÇÑÄÄ ÄðÀçÁî M", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(704, 484, 110, 20);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
