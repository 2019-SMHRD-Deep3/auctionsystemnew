package model;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.MemberManagementService.ServiceCompletion;
import view.disact;

public class 결제창2 {

	private JFrame frame;
	private JTextField cardNumber;
	private JTextField userName;
	private JTextField expiredDate;
	private JTextField emainAddress;
	private JTextField phoneNumber;

	public 결제창2() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 515);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCE74\uB4DC\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(179, 172, 187, 25);
		frame.getContentPane().add(lblNewLabel);
		
		cardNumber = new JTextField();
		cardNumber.setBounds(179, 207, 345, 35);
		frame.getContentPane().add(cardNumber);
		cardNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(12, 172, 83, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		userName = new JTextField();
		userName.setBounds(12, 207, 149, 35);
		frame.getContentPane().add(userName);
		userName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uB9CC\uB8CC\uB0A0\uC9DC        ex)DD.MM.YY");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(538, 172, 180, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		expiredDate = new JTextField();
		expiredDate.setText("");
		expiredDate.setBounds(536, 207, 162, 35);
		frame.getContentPane().add(expiredDate);
		expiredDate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel((String) null);
		lblNewLabel_3.setBounds(596, 172, 122, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uBA54\uC77C \uC8FC\uC18C");
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(12, 252, 96, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		emainAddress = new JTextField();
		emainAddress.setBounds(12, 287, 345, 35);
		frame.getContentPane().add(emainAddress);
		emainAddress.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC804\uD654\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC\r\n");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(377, 252, 187, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		phoneNumber = new JTextField();
		phoneNumber.setBounds(369, 287, 290, 35);
		frame.getContentPane().add(phoneNumber);
		phoneNumber.setColumns(10);
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//캡처.3333jpg";
		lblNewLabel_3.setIcon(new ImageIcon(imgPath3));
		
		JButton btnNewButton = new JButton("\uACB0\uC81C\uD558\uAE30");
		btnNewButton.setBounds(579, 395, 180, 51);
		btnNewButton.addActionListener(this::payButtonOnClick);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(500, 61, 285, 100);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(500, 60, 285, 100);
		frame.getContentPane().add(lblNewLabel_6);
	}
	
	private void payButtonOnClick(ActionEvent e) {
		
		Integer cardNumber = Integer.valueOf(this.cardNumber.getText());
		if (cardNumber == null) { cardNumber = -1; }
		
		Payment payment = new Payment(
				cardNumber.intValue(),
				userName.getText(),
				expiredDate.getText(),
				null
				);
		
		payment.setType("ACT");
		
		MemberManagementService service = new MemberManagementService();
		service.payJoin(payment, new ServiceCompletion() {

			@Override
			public void completion(boolean isSuccessfully) {
				if(isSuccessfully) {
					new disact(payment);
				} else {
					JOptionPane.showMessageDialog(frame, "결제에 실패 했습니다.");
				}
			}
		});
	}
}
