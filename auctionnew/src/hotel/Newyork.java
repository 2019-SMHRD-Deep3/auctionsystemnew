package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import model.결제창;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Newyork {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newyork window = new Newyork();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Newyork() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(153, 86, 738, 428);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 738, 406);
		
		
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//미주//뉴욕//1.jpg";
	    
	    JButton button_2 = new JButton("\uC608\uC57D\uC870\uD68C");
	    button_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	}
	    });
	    button_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    		결제창 bill = new 결제창();
	    	}
	    });
	    button_2.setBounds(546, 41, 178, 80);
	    panel_1.add(button_2);
	    
	    JButton button_1 = new JButton("\uC608\uC57D\uC870\uD68C");
	    button_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		결제창 bill = new 결제창();
	    	}
	    });
	    button_1.setBounds(546, 193, 178, 80);
	    panel_1.add(button_1);
	    
	    JButton button = new JButton("\uC608\uC57D\uC870\uD68C");
	    button.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		결제창 bill = new 결제창();
	    	}
	    });
	    button.setBounds(546, 341, 178, 80);
	    panel_1.add(button);
	    
	    JButton btnNewButton = new JButton("\uC608\uC57D\uC870\uD68C");
	    btnNewButton.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		결제창 bill = new 결제창();
	    	}
	    });
	    btnNewButton.setBounds(546, 496, 178, 80);
	    panel_1.add(btnNewButton);
	    label_3.setIcon(new ImageIcon(imgPath1));
		label_3.setBounds(12, 10, 154, 142);
		panel_1.add(label_3);
		
		JTextPane txtpnIn = new JTextPane();
		txtpnIn.setText("\uB354 \uB9C8\uD06C in NYC\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnIn.setBounds(178, 10, 546, 142);
		panel_1.add(txtpnIn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 712, 142);
		panel_1.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("");
		String imgPath2 = this.getClass().getResource(".").getPath()+"..//..//img//미주//뉴욕//2.jpg";
	    label_4.setIcon(new ImageIcon(imgPath2));
		label_4.setBounds(12, 162, 154, 142);
		panel_1.add(label_4);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("\uB354 \uB85D\uC2DC \uD2B8\uB77C\uC774\uBCA0\uCE74 in NYC\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		textPane_1.setBounds(178, 162, 546, 142);
		panel_1.add(textPane_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(12, 162, 712, 142);
		panel_1.add(label);
		
		JLabel label_5 = new JLabel("");
		String imgPath3 = this.getClass().getResource(".").getPath()+"..//..//img//미주//뉴욕//3.jpg";
	    label_5.setIcon(new ImageIcon(imgPath3));
		label_5.setBounds(12, 314, 154, 142);
		panel_1.add(label_5);
		
		JTextPane txtpnIn_1 = new JTextPane();
		txtpnIn_1.setText("\uB86F\uB370 \uD3A0\uB9AC\uC2A4 in NYC\n\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnIn_1.setBounds(178, 314, 546, 142);
		panel_1.add(txtpnIn_1);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(12, 314, 712, 142);
		panel_1.add(label_1);
		
		JLabel label_6 = new JLabel("");
		String imgPath4 = this.getClass().getResource(".").getPath()+"..//..//img//미주//뉴욕//4.jpg";
	    label_6.setIcon(new ImageIcon(imgPath4));
		label_6.setBounds(12, 466, 154, 142);
		panel_1.add(label_6);
		
		JTextPane txtpnIn_2 = new JTextPane();
		txtpnIn_2.setText("\uD2B8\uB7FC\uD504 \uCEE8\uD2F0\uB128\uD0C8 in NYC\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnIn_2.setBounds(178, 466, 546, 142);
		panel_1.add(txtpnIn_2);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(12, 466, 712, 142);
		panel_1.add(label_2);
		frame.setBounds(100, 100, 907, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
