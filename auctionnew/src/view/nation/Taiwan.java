package view.nation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Taiwan {

	private JFrame frame;

	 
	public Taiwan() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 560);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uCC98:\uD558\uB098\uD22C\uC5B4");
		lblNewLabel_1.setBounds(694, 489, 94, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//´ë¸¸1.jpg";
	       lblNewLabel.setIcon(new ImageIcon(imgPath5));
		lblNewLabel.setBounds(0, 0, 800, 521);
		frame.getContentPane().add(lblNewLabel);
	}
}
