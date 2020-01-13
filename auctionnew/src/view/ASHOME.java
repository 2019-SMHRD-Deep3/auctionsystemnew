package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ASHOME {

	private JFrame frame;
	private JPanel panel;
	private ImageIcon icon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASHOME window = new ASHOME();
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
	public ASHOME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1179, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\ddddd.JPG");
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1163, 58);
		panel_1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel join = new JLabel("");
		join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		join.setIcon(new ImageIcon("D:\\\uC870\uC7781.png"));
		join.setBounds(1017, 10, 85, 38);
		panel_1.add(join);
		
		JLabel login = new JLabel("New label");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		login.setIcon(new ImageIcon("D:\\\uB85C\uADF8\uC7781.png"));
		login.setBounds(920, 10, 85, 38);
		panel_1.add(login);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(12, 10, 57, 15);
		panel_1.add(lblNewLabel_2);
		
		panel = new JPanel(){
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
	            setOpaque(false);
	            super.paintComponent(g);
			
			}
			
			};
		panel.setBounds(10, 57, 1141, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(136, 245, 846, 129);
		panel.add(panel_2);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);
		

		JButton act = new JButton("");
		act.setBounds(630, 336, 90, 90);
		frame.getContentPane().add(act);
		act.setIcon(new ImageIcon("D:\\act.JPG"));
		act.setSelectedIcon(new ImageIcon("D:\\act.JPG"));
		
		JButton hotel = new JButton();
		hotel.setBounds(400, 336, 90, 90);
		frame.getContentPane().add(hotel);
		hotel.setSelectedIcon(new ImageIcon("D:\\\uCEA1\uCC981.JPG"));
		hotel.setIcon(new ImageIcon("D:\\\uCEA1\uCC981.JPG"));
		

		JButton flight = new JButton("");
		flight.setForeground(new Color(255, 255, 255));
		flight.setBounds(180, 336, 90, 90);
		frame.getContentPane().add(flight);
		flight.setIcon(new ImageIcon("D:\\flight1.JPG"));
		flight.setSelectedIcon(new ImageIcon("D:\\flight1.JPG"));
		

		JButton ticket = new JButton("");
		ticket.setIcon(new ImageIcon("D:\\ticket1.JPG"));
		ticket.setSelectedIcon(new ImageIcon("D:\\ticket1.JPG"));
		ticket.setBounds(872, 336, 90, 90);
		frame.getContentPane().add(ticket);
		
		//
		
		
		}
}
