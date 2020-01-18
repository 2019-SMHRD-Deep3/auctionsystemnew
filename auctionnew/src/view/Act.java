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

public class Act {

	private JFrame frame;
	
	public Act() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 87, 165, 36);
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
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 133, 268, 153);
		frame.getContentPane().add(panel);
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel1);
		datePicker.getJFormattedTextField().setBackground(Color.WHITE);
		model.setDate(2020, 01, 20);
		panel.add(datePicker);
		
		JButton btnNewButton = new JButton("\uC870\uD68C\uD558\uAE30");
		btnNewButton.setBounds(324, 133, 155, 49);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("\uCD5C\uC800\uAC00 \uC5D1\uD2F0\uBE44\uD2F0\uB294 \uC778\uD130\uBE60\uB044");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("����ѱ�üM", Font.BOLD, 23));
		lblNewLabel_1.setBounds(12, 28, 711, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uB099\uD558\uC0B0.jpg"));
		lblNewLabel.setBounds(0, 0, 736, 314);
		frame.getContentPane().add(lblNewLabel);
	}
}
