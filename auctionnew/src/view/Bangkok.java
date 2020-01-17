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

public class Bangkok {

	private JFrame frame;

	public Bangkok() {
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

		JButton btnNewButton = new JButton("\uBC29\uCF55 \uCD5C\uC800\uAC00 \uAC80\uC0C9");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 17));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
							"http://go.modetour.co.kr/pkg/?at=ICN%7c88%7c3%7c4%7c12&cm_id=KYS005_5_34_20190528_PR_KYS_GO&NaPm=ct%3Dk5g5mwgo%7Cci%3Dab764ef061f69aa5c25740d51be9b35874443f2f%7Ctr%3Dsls%7Csn%3D294141%7Chk%3D379cf7af21e14d939cd77321faa7b28d959ca135"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		btnNewButton.setBounds(594, 420, 208, 81);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//¹æÄÛ2.jpg";
	       lblNewLabel.setIcon(new ImageIcon(imgPath5));
		lblNewLabel.setBounds(12, 10, 310, 320);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		String imgPath6 = this.getClass().getResource(".").getPath()+"..//..//img//¹æÄÛ.jpg";
	       lblNewLabel_1.setIcon(new ImageIcon(imgPath6));
		lblNewLabel_1.setBounds(363, 10, 310, 320);
		frame.getContentPane().add(lblNewLabel_1);

		JTextPane txtpnDd = new JTextPane();
		txtpnDd.setFont(new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.PLAIN, 24));
		txtpnDd.setText(
				"\uBC29 \uCF55\uC5D0\uC11C          >>>>>>>>>>>>>>>>>>          \uBC29\uCF55\uC73C\uB85C\r\n\r\n\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\uBA4D\r\n\r\n(feat.\uAC1C\uD314\uC790\uC0C1\uD314\uC790)");
		txtpnDd.setBounds(12, 340, 661, 161);
		frame.getContentPane().add(txtpnDd);
		
		JLabel lblNewLabel_2 = new JLabel("\uCD9C\uCC98:\uBAA8\uB450\uD22C\uC5B4\r\n");
		lblNewLabel_2.setBounds(690, 395, 112, 26);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
