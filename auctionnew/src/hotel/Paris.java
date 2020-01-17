package hotel;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;

public class Paris {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paris window = new Paris();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paris() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(156, 45, 707, 417);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 707, 417);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(590,700));
		panel_1.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//À¯·´//ÆÄ¸®//1.jpg";
	    label_3.setIcon(new ImageIcon(imgPath1));
		label_3.setBounds(12, 10, 152, 127);
		panel_1.add(label_3);
		
		JTextPane txtpnIn = new JTextPane();
		txtpnIn.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		txtpnIn.setText("\uB77C \uD2B8\uB808\uBAA8\uC77C in Paris\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnIn.setBounds(187, 10, 489, 127);
		panel_1.add(txtpnIn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 584, 127);
		panel_1.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("New label");
		String imgPath2 = this.getClass().getResource(".").getPath()+"..//..//img//À¯·´//ÆÄ¸®//2.jpg";
	    label_4.setIcon(new ImageIcon(imgPath2));
		label_4.setBounds(12, 147, 152, 127);
		panel_1.add(label_4);
		
		JTextPane txtpnIn_1 = new JTextPane();
		txtpnIn_1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		txtpnIn_1.setText("\uC0F9\uADF8\uB9B4\uB77C in Paris\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle(by Rolls Royce)");
		txtpnIn_1.setBounds(187, 147, 489, 127);
		panel_1.add(txtpnIn_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(12, 147, 584, 127);
		panel_1.add(label);
		
		JLabel label_5 = new JLabel("New label");
		String imgPath3 = this.getClass().getResource(".").getPath()+"..//..//img//À¯·´//ÆÄ¸®//3.jpg";
	    label_5.setIcon(new ImageIcon(imgPath3));
		label_5.setBounds(12, 284, 152, 127);
		panel_1.add(label_5);
		
		JTextPane txtpnIn_2 = new JTextPane();
		txtpnIn_2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		txtpnIn_2.setText("\uD2B8\uB7FC\uD504 \uCEE8\uD2F0\uB128\uD0C8 in Paris\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnIn_2.setBounds(187, 284, 489, 127);
		panel_1.add(txtpnIn_2);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(12, 284, 584, 127);
		panel_1.add(label_1);
		
		JLabel label_6 = new JLabel("New label");
		String imgPath4 = this.getClass().getResource(".").getPath()+"..//..//img//À¯·´//ÆÄ¸®//4.jpg";
	    label_6.setIcon(new ImageIcon(imgPath4));
		label_6.setBounds(12, 421, 152, 127);
		panel_1.add(label_6);
		
		JTextPane txtpnIn_3 = new JTextPane();
		txtpnIn_3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		txtpnIn_3.setText("\uD558\uC57C\uD2B8 \uB9AC\uC820\uC2DC in Paris\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnIn_3.setBounds(187, 421, 489, 127);
		panel_1.add(txtpnIn_3);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(12, 421, 584, 127);
		panel_1.add(label_2);
	}
}
