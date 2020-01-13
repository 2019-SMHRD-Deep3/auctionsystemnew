package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

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
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(581, 336, 90, 90);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon("D:\\act1.JPG"));
		btnNewButton_2.setSelectedIcon(new ImageIcon("D:\\act1.JPG"));
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBounds(387, 336, 90, 90);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setSelectedIcon(new ImageIcon("D:\\\uCEA1\uCC981.JPG"));
		btnNewButton_1.setIcon(new ImageIcon("D:\\\uCEA1\uCC981.JPG"));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(210, 336, 90, 90);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("D:\\flight1.JPG"));
		btnNewButton.setSelectedIcon(new ImageIcon("D:\\flight1.JPG"));
		
		
		
		
		}
}
