package hotel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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
import view.flightsearch;

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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 894, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(156, 45, 719, 370);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 719, 370);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(590,700));
		panel_1.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//À¯·´//ÆÄ¸®//1.jpg";
	    
	    JButton btnNewButton = new JButton("\uC608\uC57D\uD558\uAE30");
	    btnNewButton.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    		°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
	    		
	    	}
	    });
	    btnNewButton.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
	    btnNewButton.setBackground(Color.WHITE);
	    btnNewButton.setBounds(522, 49, 137, 48);
	    panel_1.add(btnNewButton);
	    
	    JButton button = new JButton("\uC608\uC57D\uD558\uAE30");
	    button.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
	    	}
	    });
	    button.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
	    button.setBackground(Color.WHITE);
	    button.setBounds(524, 184, 137, 48);
	    panel_1.add(button);
	    
	    JButton button_1 = new JButton("\uC608\uC57D\uD558\uAE30");
	    button_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
	    	}
	    });
	    button_1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
	    button_1.setBackground(Color.WHITE);
	    button_1.setBounds(524, 314, 137, 48);
	    panel_1.add(button_1);
	    
	    JButton button_2 = new JButton("\uC608\uC57D\uD558\uAE30");
	    button_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		°áÁ¦Ã¢ bill = new °áÁ¦Ã¢();
	    	}
	    });
	    button_2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 15));
	    button_2.setBackground(Color.WHITE);
	    button_2.setBounds(524, 449, 137, 48);
	    panel_1.add(button_2);
	    label_3.setIcon(new ImageIcon(imgPath1));
		label_3.setBounds(12, 10, 152, 127);
		panel_1.add(label_3);
		
		JTextPane txtpnIn = new JTextPane();
		txtpnIn.setBounds(187, 10, 489, 127);
		panel_1.add(txtpnIn);
		txtpnIn.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 16));
		txtpnIn.setText("\uB77C \uD2B8\uB808\uBAA8\uC77C in Paris\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		
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
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flightsearch search = new flightsearch();
			}
		});
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//¿¡ÆçÅ¸¿ö.jpg";
	    
	    JTextPane txtpnSameDayTo = new JTextPane();
	    txtpnSameDayTo.setForeground(Color.BLACK);
	    txtpnSameDayTo.setFont(new Font("SansSerif", Font.BOLD, 16));
	    txtpnSameDayTo.setOpaque(false);
	    txtpnSameDayTo.setText("    Same day\r\n    to go PARIS");
	    txtpnSameDayTo.setBounds(0, 181, 144, 48);
	    frame.getContentPane().add(txtpnSameDayTo);
	    label_7.setIcon(new ImageIcon(imgPath5));
		label_7.setBounds(0, 45, 144, 183);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		String imgPath6 = this.getClass().getResource(".").getPath()+"..//..//img//";
	    label_8.setIcon(new ImageIcon(imgPath6));
		label_8.setBounds(0, 239, 144, 183);
		frame.getContentPane().add(label_8);
	}
}
