package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import hotel.LA;
import hotel.Newyork;
import hotel.Paris;
import model.Member;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class Hotel {

	private JFrame frame;
//<<<<<<< HEAD
//
//	public Hotel() {
//=======
	private Member loginuser;
	
	public Hotel(Member member) {
		this.loginuser = member;
//>>>>>>> branch 'master' of https://github.com/khornejp/auctionsystemnew
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 752, 335);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
//<<<<<<< HEAD
//		JButton btnNewButton = new JButton("\uC870\uD68C\uD558\uAE30");
//		btnNewButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				
//			}
//		});
//		btnNewButton.setBackground(Color.WHITE);
//		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
//		btnNewButton.setBounds(543, 249, 181, 55);
//		frame.getContentPane().add(btnNewButton);
//=======
//		
//>>>>>>> branch 'master' of https://github.com/khornejp/auctionsystemnew
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(41, 77, 187, 33);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("인천");
		comboBox.addItem("L.A");
		comboBox.addItem("밴쿠버");
		comboBox.addItem("샌프란시스코");
		comboBox.addItem("뉴욕");
		comboBox.addItem("하와이");
		comboBox.addItem("파리");
		comboBox.addItem("런던");
		comboBox.addItem("로마");
		comboBox.addItem("프라하");
		comboBox.addItem("바르셀로나");
		comboBox.addItem("다낭");
		comboBox.addItem("방콕");
		comboBox.addItem("홍콩");
		comboBox.addItem("타이베이");
		comboBox.addItem("세부");
		comboBox.addItem("하노이");
		comboBox.addItem("싱가포르");
		comboBox.addItem("코트니키나발루");
		comboBox.addItem("괌");
		comboBox.addItem("시드니");
		comboBox.addItem("사이판");
		
//<<<<<<< HEAD
//		String i = (String)comboBox.getSelectedItem();
//		
//		
//		
//=======
		JButton btnNewButton = new JButton("\uC870\uD68C\uD558\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String la = (String)comboBox.getSelectedItem();
				if(la=="L.A") {
					LA la1 = new LA(loginuser);
				}else if (la == "파리") {
					Paris paris1 = new Paris(loginuser);
				}else if (la == "뉴욕") {
					Newyork newyork1 = new Newyork(loginuser);
				}
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBounds(549, 241, 181, 55);
		frame.getContentPane().add(btnNewButton);
//>>>>>>> branch 'master' of https://github.com/khornejp/auctionsystemnew
		JLabel lblNewLabel = new JLabel("\uCD5C\uC800\uAC00 \uD638\uD154\uC740 \uC778\uD130\uBE60\uB044");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("양재둘기체M", Font.BOLD, 23));
		lblNewLabel.setBounds(0, 0, 754, 304);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(41, 120, 230, 145);
		frame.getContentPane().add(panel);
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel1);
		datePicker.getJFormattedTextField().setBackground(Color.WHITE);
		model.setDate(2020, 01, 20);
		panel.add(datePicker);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(307, 120, 230, 145);
		frame.getContentPane().add(panel_1);
		
		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model1);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel);
		datePicker1.getJFormattedTextField().setBackground(Color.WHITE);
		model1.setDate(2020, 01, 20);
		panel_1.add(datePicker1);
		
		JLabel lblNewLabel_1 = new JLabel("");
//<<<<<<< HEAD
//		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//마리나베이샌즈.jpg";
//	    lblNewLabel_1.setIcon(new ImageIcon(imgPath1));
//=======
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//마리나베이샌즈.jpg";
	       lblNewLabel.setIcon(new ImageIcon(imgPath5));
//>>>>>>> branch 'master' of https://github.com/khornejp/auctionsystemnew
		lblNewLabel_1.setBounds(0, 0, 736, 314);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
	}
}
