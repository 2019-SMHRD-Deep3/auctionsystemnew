package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class ASJoin최종 {

	private JFrame frame;
	private JTextField id;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JRadioButton male;
	private JRadioButton female;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASJoin최종 window = new ASJoin최종();
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
	public ASJoin최종() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlightText);
		frame.setBounds(100, 100, 473, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel id_panel = new JPanel();
		id_panel.setBackground(SystemColor.activeCaption);
		id_panel.setBounds(62, 138, 340, 38);
		frame.getContentPane().add(id_panel);
		id_panel.setLayout(new GridLayout(1, 0, -60, 0));
		
		JLabel lblNewLabel = new JLabel("            ID");
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		id_panel.add(lblNewLabel);
		
		id = new JTextField();
		id_panel.add(id);
		id.setColumns(10);
		
		JPanel main_panel = new JPanel(); 
		main_panel.setBackground(SystemColor.textHighlightText);
		
		
		main_panel.setBounds(26, 26, 387, 82);
		frame.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JLabel 화면 = new JLabel("");
		화면.setBounds(63, 5, 270, 72);
		화면.setIcon(new ImageIcon("C:\\Users\\SM022\\Desktop\\\uC5FC\uB530 \uB85C\uACE01.png"));
		main_panel.add(화면);
		
		JPanel pw_panel = new JPanel();
		pw_panel.setBackground(SystemColor.activeCaption);
		pw_panel.setBounds(62, 205, 340, 38);
		frame.getContentPane().add(pw_panel);
		pw_panel.setLayout(new GridLayout(1, 0, -60, 0));
		
		JLabel lblNewLabel_1 = new JLabel("      Password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		pw_panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		pw_panel.add(passwordField);
		
		JPanel name_panel = new JPanel();
		name_panel.setBackground(SystemColor.activeCaption);
		name_panel.setBounds(62, 271, 340, 38);
		frame.getContentPane().add(name_panel);
		name_panel.setLayout(new GridLayout(1, 0, -60, 0));
		
		JLabel lblNewLabel_3 = new JLabel("         Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		name_panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		name_panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Join");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frame,
					    "회원가입 성공");
				
			}
			
		});
		btnNewButton.setBounds(124, 537, 213, 54);
		frame.getContentPane().add(btnNewButton);
		
		JPanel email_panel = new JPanel();
		email_panel.setBackground(SystemColor.activeCaption);
		email_panel.setBounds(62, 400, 340, 38);
		frame.getContentPane().add(email_panel);
		email_panel.setLayout(new GridLayout(1, 0, -60, 0));
		
		JLabel lblEmail = new JLabel("        E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		email_panel.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		email_panel.add(textField_3);
		
		JPanel birth_panel = new JPanel();
		birth_panel.setBackground(SystemColor.activeCaption);
		birth_panel.setBounds(62, 338, 340, 38);
		frame.getContentPane().add(birth_panel);
		birth_panel.setLayout(new GridLayout(1, 0, -60, 0));
		
		JLabel lblBirth = new JLabel("          Birth");
		lblBirth.setHorizontalAlignment(SwingConstants.LEFT);
		lblBirth.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		birth_panel.add(lblBirth);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		birth_panel.add(textField_4);
		
		JPanel sex_panel = new JPanel();
		sex_panel.setBackground(SystemColor.activeCaption);
		sex_panel.setBounds(62, 463, 340, 44);
		frame.getContentPane().add(sex_panel);
		sex_panel.setLayout(new GridLayout(1, 0, 30, 0));
		
		
		JLabel lblNewLabel_2 = new JLabel("           Sex");
		lblNewLabel_2.setBackground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		sex_panel.add(lblNewLabel_2);
		
	
		
		
	
		
		JRadioButton male = new JRadioButton("male");
		male.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		male.setSelected(true);
		male.setBackground(SystemColor.activeCaption);
		sex_panel.add(male);
		
		JRadioButton female = new JRadioButton("female");
		female.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		female.setBackground(SystemColor.activeCaption);
		sex_panel.add(female);
		
		int sex = 0;
		if(male.isSelected()==true) {
			sex = 1;
		}else {
			sex = 2;
		}
		
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
	}
}
