package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Danang {

	private JFrame frame;

	
	public Danang() {
		initialize();
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 660);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uC5EC\uD589\uBC15\uC0AC");
		lblNewLabel_1.setBounds(747, 594, 87, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\\uB2E4\uB0AD\uBC30\uACBD.JPG"));
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//´Ù³¶¹è°æ.jpg";
	       lblNewLabel.setIcon(new ImageIcon(imgPath5));
		lblNewLabel.setBounds(0, 0, 834, 621);
		frame.getContentPane().add(lblNewLabel);
	}
}
