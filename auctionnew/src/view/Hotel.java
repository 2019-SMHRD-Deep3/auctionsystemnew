package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hotel {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Hotel() {
		initialize();
	//	frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 752, 353);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uC870\uD68C\uD558\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("����", Font.BOLD, 15));
		btnNewButton.setBounds(543, 249, 181, 55);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(41, 77, 187, 33);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("��õ");
		comboBox.addItem("L.A");
		comboBox.addItem("�����");
		comboBox.addItem("�������ý���");
		comboBox.addItem("����");
		comboBox.addItem("�Ͽ���");
		comboBox.addItem("�ĸ�");
		comboBox.addItem("����");
		comboBox.addItem("�θ�");
		comboBox.addItem("������");
		comboBox.addItem("�ٸ����γ�");
		comboBox.addItem("�ٳ�");
		comboBox.addItem("����");
		comboBox.addItem("ȫ��");
		comboBox.addItem("Ÿ�̺���");
		comboBox.addItem("����");
		comboBox.addItem("�ϳ���");
		comboBox.addItem("�̰�����");
		comboBox.addItem("��Ʈ��Ű���߷�");
		comboBox.addItem("��");
		comboBox.addItem("�õ��");
		comboBox.addItem("������");
		
		JLabel lblNewLabel = new JLabel("\uCD5C\uC800\uAC00 \uD638\uD154\uC740 \uC778\uD130\uBE60\uB044");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����ѱ�üM", Font.BOLD, 23));
		lblNewLabel.setBounds(12, 10, 712, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
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
		panel_1.setOpaque(false);
		panel_1.setBounds(307, 120, 230, 145);
		frame.getContentPane().add(panel_1);
		
		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model1);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel);
		datePicker1.getJFormattedTextField().setBackground(Color.WHITE);
		model1.setDate(2020, 01, 20);
		panel_1.add(datePicker1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uB9C8\uB9AC\uB098\uBCA0\uC774\uC0CC\uC988.JPG"));
		lblNewLabel_1.setBounds(0, 0, 736, 314);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
	}
}
