package view;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class ASlogin {

	private JFrame frame;
	private ImageIcon icon;
	JPanel panel;
	JPanel panel_1 ;
	private JLabel id;
	private JTextField ID_FIELD;
	private JPanel pw_pannel;
	private JLabel pw;
	private JPasswordField passwordField;
	private JButton confirm;
	private JButton cancel;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ASlogin() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 618, 650);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		

		frame.getContentPane().setLayout(null);
		ImageIcon icon = new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\INTERBBAKK.JPG");
		panel_1 = new JPanel() {
			
				protected void paintComponent(Graphics g) {
					// TODO Auto-generated method stub
					g.drawImage(icon.getImage(),0,0,panel_1.getWidth(),panel_1.getHeight(),null);
					setOpaque(false);
					super.paintComponent(g);
				}
		};
		panel_1.setBounds(29, 38, 538, 169);

		frame.getContentPane().add(panel_1);
		
		JPanel id_panel = new JPanel();
		id_panel.setBounds(97, 270, 408, 50);
		frame.getContentPane().add(id_panel);
		id_panel.setLayout(new GridLayout(0, 2, -50, 0));
		
		id = new JLabel("             ID");
		id.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		id.setHorizontalAlignment(SwingConstants.LEFT);
		id_panel.add(id);
		
		ID_FIELD = new JTextField();
		id_panel.add(ID_FIELD);
		ID_FIELD.setColumns(10);
		
		pw_pannel = new JPanel();
		pw_pannel.setBounds(97, 364, 408, 50);
		frame.getContentPane().add(pw_pannel);
		pw_pannel.setLayout(new GridLayout(0, 2, -50, 0));
		
		pw = new JLabel("    PASSWORDS");
		pw.setHorizontalAlignment(SwingConstants.LEFT);
		pw.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		pw_pannel.add(pw);
		
		passwordField = new JPasswordField();
		pw_pannel.add(passwordField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(159, 469, 259, 50);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		confirm = new JButton("\uD655\uC778");
		panel_2.add(confirm);
		
		cancel = new JButton("\uCDE8\uC18C");
		panel_2.add(cancel);
		
		
		
		
		
		
		
		}
	}

