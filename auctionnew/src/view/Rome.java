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

public class Rome {

	private JFrame frame;
	private JTextPane textPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;

	public Rome() {
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

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uB610\uCE58.JPG"));
		lblNewLabel.setBounds(12, 10, 478, 290);
		frame.getContentPane().add(lblNewLabel);

		textPane = new JTextPane();
		textPane.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 24));
		textPane.setText(
				"\uC800 \uB610\uCE58\uB294 \uB85C\uB9C8\uC5D0 \uC5EC\uD589\uC744 \uAC14\uC2B5\uB2C8\uB2E4\r\n\uB85C\uB9C8\uB294 \uCF5C\uB85C\uC138\uC6C0\uC774 \uC788\uC8E0!\r\n\uCF5C\uB85C\uC138\uC6C0\uC5D0\uC11C \uC800\uB294 \uC0AC\uC9C4\uC744 \uCC0D\uC5C8\uB2F5\uB2C8\uB2E4!\r\n\uC5B4\uB5A4\uAC00\uC694? \uBA4B\uC788\uB098\uC694?\r\n\uB85C\uB9C8\uC5D0 best of best place!!!!\r\n\uCF5C\uB85C\uC138\uC6C0\uC5D0\uC11C \uB610\uCE58\uC5D0 18\uBC88\uC9F8 \uC5EC\uD589\uC744 !!!\r\n\uB05D!!!!!!!!!!!!!!!!!!");
		textPane.setBounds(502, 10, 304, 290);
		frame.getContentPane().add(textPane);

		btnNewButton = new JButton("\uB85C\uB9C8 \uCD5C\uC800\uAC00 \uAC80\uC0C9");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
							"http://tour.interpark.com/goods/detail.aspx?BaseGoodsCd=A3015053&cate=2409&mbn=tourpackage&mln=pkg3d_topsale_1"));
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
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(561, 402, 241, 99);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uC778\uD130\uD30C\uD06C\uD22C\uC5B4");
		lblNewLabel_1.setBounds(694, 377, 108, 28);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
