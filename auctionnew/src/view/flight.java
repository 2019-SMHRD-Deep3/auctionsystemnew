package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Member;
import model.MemberManagementService;
import model.비행기결제;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class flight {

	private JFrame frame;
	private Member loginuser;
	private DefaultComboBoxModel comboBoxModel;
	private JComboBox comboBox_1;
	private JDatePickerImpl datePicker;
	private JDatePickerImpl datePicker1;
	private Date value;
	private Date value2;
	MemberManagementService service = new MemberManagementService(); 
	
	
	
	
	
	
	public flight(Member member) {
		this.loginuser = member;
		initialize();
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 752, 353);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 735, 313);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox.addItem("인천(ICN)");
		comboBox.addItem("L.A(LAX)");
		comboBox.addItem("밴쿠버(YVR)");
		comboBox.addItem("샌프란시스코(SFO)");
		comboBox.addItem("뉴욕(JFK)");
		comboBox.addItem("하와이(KAO)");
		comboBox.addItem("파리(PAR)");
		comboBox.addItem("런던(LOM)");
		comboBox.addItem("로마(ROM)");
		comboBox.addItem("프라하(PRG)");
		comboBox.addItem("바르셀로나(BCN)");
		comboBox.addItem("다낭(DAN)");
		comboBox.addItem("방콕(BOK)");
		comboBox.addItem("홍콩(HOK)");
		comboBox.addItem("타이베이(TPE)");
		comboBox.addItem("세부(CEB)");
		comboBox.addItem("하노이(HAN)");
		comboBox.addItem("싱가포르(SGI)");
		comboBox.addItem("코트니키나발루(BKI)");
		comboBox.addItem("괌(GUM)");
		comboBox.addItem("시드니(SYD)");
		comboBox.addItem("사이판(SPN)");
		
		
		comboBox.setBounds(118, 105, 242, 34);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String i = (String)comboBox.getSelectedItem();
				
			String i1 = (String)comboBox_1.getSelectedItem();
			
			비행기결제 bills = new 비행기결제(loginuser);
				
		
				
			}
		});
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(12, 105, 94, 34);
		panel.add(comboBox_2);
		btnNewButton.setBackground(Color.WHITE);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox_2.addItem("아시아나");
		comboBox_2.addItem("대한항공");
		comboBox_1.addItem("");
		
		
		btnNewButton.setBounds(626, 269, 97, 34);
		panel.add(btnNewButton);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox_1.addItem("인천(ICN)");
		comboBox_1.addItem("L.A(LAX)");
		comboBox_1.addItem("밴쿠버(YVR)");
		comboBox_1.addItem("샌프란시스코(SFO)");
		comboBox_1.addItem("뉴욕(JFK)");
		comboBox_1.addItem("하와이(KAO)");
		comboBox_1.addItem("파리(PAR)");
		comboBox_1.addItem("런던(LOM)");
		comboBox_1.addItem("로마(ROM)");
		comboBox_1.addItem("프라하(PRG)");
		comboBox_1.addItem("바르셀로나(BCN)");
		comboBox_1.addItem("다낭(DAN)");
		comboBox_1.addItem("방콕(BOK)");
		comboBox_1.addItem("홍콩(HOK)");
		comboBox_1.addItem("타이베이(TPE)");
		comboBox_1.addItem("세부(CEB)");
		comboBox_1.addItem("하노이(HAN)");
		comboBox_1.addItem("싱가포르(SGI)");
		comboBox_1.addItem("코트니키나발루(BKI)");
		comboBox_1.addItem("괌(GUM)");
		comboBox_1.addItem("시드니(SYD)");
		comboBox_1.addItem("사이판(SPN)");
		comboBox_1.setBounds(372, 105, 217, 34);
		panel.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(118, 149, 242, 154);
		panel.add(panel_1);
		
		// 달력
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		 datePicker = new JDatePickerImpl(datePanel);
		datePicker.getJFormattedTextField().setBackground(Color.WHITE);
		panel_1.add(datePicker);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBorder(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(372, 149, 242, 154);
		panel.add(panel_2);
		
		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1);
		datePicker1 = new JDatePickerImpl(datePanel1);
		datePicker1.getJFormattedTextField().setBackground(Color.WHITE);
		panel_2.add(datePicker1);
		
		JLabel lblNewLabel = new JLabel("\uCD5C\uC800\uAC00 \uBE44\uD589\uAE30\uB294 \uC778\uD130\uBE60\uB044");
		lblNewLabel.setForeground(new Color(255, 165, 0));
		lblNewLabel.setFont(new Font("양재둘기체M", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 28, 711, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uACF5\uD56D.JPG"));
		lblNewLabel_1.setBounds(0, 0, 735, 313);
		panel.add(lblNewLabel_1);
		
		
	}
	
}
