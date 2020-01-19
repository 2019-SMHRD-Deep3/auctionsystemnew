package model;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.MemberManagementService.ServiceCompletion;
import view.Disact;

public class 비행기결제 {

	private JFrame frame;
	private JTextField name;
	private JTextField cardnum;
	private JTextField expire;
	private JTextField email;
	private JTextField phone;
	private JTextField passport;
	//private MemberManagementService loginuser;
	Member member;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public 비행기결제(Member member) {
		this.member = member;
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
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(12, 207, 149, 35);
		frame.getContentPane().add(name);
		
		cardnum = new JTextField();
		cardnum.setColumns(10);
		cardnum.setBounds(179, 207, 345, 35);
		frame.getContentPane().add(cardnum);
		
		expire = new JTextField();
		expire.setText("");
		expire.setColumns(10);
		expire.setBounds(536, 207, 162, 35);
		frame.getContentPane().add(expire);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(12, 171, 83, 25);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC");
		label_1.setBounds(179, 172, 187, 25);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uB9CC\uB8CC\uB0A0\uC9DC        ex)DD.MM.YY");
		label_2.setBounds(537, 171, 180, 25);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC774\uBA54\uC77C \uC8FC\uC18C");
		label_3.setBounds(12, 249, 96, 25);
		frame.getContentPane().add(label_3);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(12, 284, 345, 35);
		frame.getContentPane().add(email);
		
		JLabel label_4 = new JLabel("\uC804\uD654\uBC88\uD638           -\uC5C6\uC774 \uC22B\uC790\uB9CC\r\n");
		label_4.setBounds(371, 249, 187, 25);
		frame.getContentPane().add(label_4);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(369, 284, 290, 35);
		frame.getContentPane().add(phone);
		
		JLabel label_5 = new JLabel("\uC5EC\uAD8C\uBC88\uD638");
		label_5.setBounds(12, 330, 96, 35);
		frame.getContentPane().add(label_5);
		
		passport = new JTextField();
		passport.setColumns(10);
		passport.setBounds(12, 375, 345, 35);
		frame.getContentPane().add(passport);
		
		JButton button = new JButton("\uACB0\uC81C\uD558\uAE30");
		button.addActionListener(this::payButtonOnClick);
		button.setBounds(590, 386, 180, 51);
		frame.getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(500, 60, 285, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 285, 100);
		panel.add(lblNewLabel);
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//캡처.3333jpg";
		lblNewLabel.setIcon(new ImageIcon(imgPath3));
	}

	private void payButtonOnClick(ActionEvent e) {
		String infoname = name.getText(); 
		Integer infocardnum = Integer.valueOf(cardnum.getText());
		if (infocardnum == null) { infocardnum = -1; }
		
		String infoexpire = expire.getText();
		String infopass = passport.getText();
		
		// 멤버 객체를 생성
		Payment payment = new Payment(
				infocardnum.intValue(), 
				infoname,
				infoexpire, 
				infopass);
		//컨트롤러한테 회원가입 요청 
		
		MemberManagementService service = new MemberManagementService();
		service.payJoin(payment, new ServiceCompletion() {

			@Override
			public void completion(boolean isSuccessfully) {
				if(isSuccessfully) {
					new Disact(payment);
				} else {
					JOptionPane.showMessageDialog(frame, "결제에 실패 했습니다.");
				}
			}
		});
	}
}
