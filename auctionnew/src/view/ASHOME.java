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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		ImageIcon icon = new ImageIcon("C:\\Users\\SM020\\Documents\\카카오톡 받은 파일\\ddddd.JPG");
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
			}////시발좆같네
		});
		join.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\123.JPG"));
		join.setBounds(1066, 10, 85, 38);
		panel_1.add(join);
		
		JLabel login = new JLabel("New label");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		login.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\\uCEA1\uCC9812.JPG"));
		login.setBounds(952, 10, 85, 38);
		panel_1.add(login);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\1.png"));
		lblNewLabel_2.setBounds(0, 0, 180, 70);
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
		act.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\act.JPG"));
		act.setSelectedIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\act.JPG"));
		
		JButton hotel = new JButton();
		hotel.setBounds(400, 336, 90, 90);
		frame.getContentPane().add(hotel);
		hotel.setSelectedIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\\uCEA1\uCC981.JPG"));
		hotel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\\uCEA1\uCC981.JPG"));
		
		JButton flight = new JButton("");
		flight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		flight.setForeground(new Color(255, 255, 255));
		flight.setBounds(180, 336, 90, 90);
		frame.getContentPane().add(flight);
		flight.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\flight1.JPG"));
		flight.setSelectedIcon(new ImageIcon("D:\\flight1.JPG"));
		
		JButton ticket = new JButton("");
		ticket.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\ticket1.JPG"));
		ticket.setSelectedIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\ticket1.JPG"));
		ticket.setBounds(872, 336, 90, 90);
		frame.getContentPane().add(ticket);
		
		//
		
		
		}
}
