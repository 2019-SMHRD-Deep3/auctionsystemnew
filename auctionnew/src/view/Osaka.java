package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Osaka {

	private JFrame frame;

	
	public Osaka() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 830, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98 : \uB0B4\uC77C\uD22C\uC5B4");
		lblNewLabel_1.setBounds(691, 393, 111, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uC624\uC0AC\uCE74.JPG"));
		lblNewLabel.setBounds(12, 10, 463, 324);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("�޸�����ü", Font.BOLD, 23));
		textPane.setText("\uC557!!!! \uC774\uC2DC\uAD6D\uC5D0 \uC624\uC0AC\uCE74\uB97C??\r\n\r\n\uCD08\uBC25\uC774 \uBA39\uACE0\uC2F6\uC5C8\uC2B5\uB2C8\uB2E4.\r\n\r\n\uACC4\uB780 \uC0CC\uB4DC\uC704\uCE58\uB3C4 \uBA39\uACE0\uC2F6\uC5C8\uC2B5\uB2C8\uB2E4.\r\n\r\n\uB77C\uBA58\uC774 \uBA39\uACE0\uC2F6\uC5C8\uC2B5\uB2C8\uB2E4.\r\n\r\n\uADF8\uB798\uC11C \uAC14\uC2B5\uB2C8\uB2E4.\r\n\r\n\uC8C4\uC1A1\uD569\uB2C8\uB2E4.");
		textPane.setBounds(495, 10, 307, 324);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("\uC624\uC0AC\uCE74 \uCD5C\uC800\uAC00 \uAC80\uC0C9");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
							"http://www.naeiltour.co.kr/365event/event_view.asp?number=7882&board_name=&page=1&s_gigan=Y&category=&n_media=27758&n_query=%EC%98%A4%EC%82%AC%EC%B9%B4%EC%97%AC%ED%96%89&n_rank=3&n_ad_group=grp-m001-01-000001091458096&n_ad=nad-a001-01-000000078145657&n_keyword_id=nkw-m001-01-000000280688360&n_keyword=%EC%98%A4%EC%82%AC%EC%B9%B4%EC%97%AC%ED%96%89&n_campaign_type=1"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("���� ���� Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(536, 415, 266, 86);
		frame.getContentPane().add(btnNewButton);
	}

}
