package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Member;
import model.MemberManagementService;

public class ASJoin최종 {

	   private JFrame frame;
	   private JTextField id;
	   private JPasswordField pw;
	   private JTextField name;
	   private JTextField email;
	   private JTextField birth;
	   private JRadioButton male;
	   private JRadioButton female;
	   private MemberManagementService service = new MemberManagementService();

	   /**
	    * Launch the application.
	    */


	   /**
	    * Create the application.
	    */
	   public ASJoin최종() {
	      initialize();
	      frame.setVisible(true);
	   }

	   /**
	    * Initialize the contents of the frame.
	    */
	   private void initialize() {
	      frame = new JFrame();
	      frame.getContentPane().setBackground(SystemColor.textHighlightText);
	      frame.setBounds(100, 100, 473, 675);
	      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      frame.getContentPane().setLayout(null);
	      
	      JPanel id_panel = new JPanel();
	      id_panel.setBackground(SystemColor.activeCaption);
	      id_panel.setBounds(62, 138, 254, 38);
	      frame.getContentPane().add(id_panel);
	      id_panel.setLayout(new GridLayout(0, 2, 22, 0));
	      
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
	      
	      pw = new JPasswordField();
	      pw_panel.add(pw);
	      
	      JPanel name_panel = new JPanel();
	      name_panel.setBackground(SystemColor.activeCaption);
	      name_panel.setBounds(62, 271, 340, 38);
	      frame.getContentPane().add(name_panel);
	      name_panel.setLayout(new GridLayout(1, 0, -60, 0));
	      
	      JLabel lblNewLabel_3 = new JLabel("         Name");
	      lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
	      lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
	      name_panel.add(lblNewLabel_3);
	      
	      name = new JTextField();
	      name_panel.add(name);
	      name.setColumns(10);
	      
	      JButton btnNewButton = new JButton("Join");
	      btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
	      
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
	      
	      email = new JTextField();
	      email.setColumns(10);
	      email_panel.add(email);
	      
	      JPanel birth_panel = new JPanel();
	      birth_panel.setBackground(SystemColor.activeCaption);
	      birth_panel.setBounds(62, 338, 340, 38);
	      frame.getContentPane().add(birth_panel);
	      birth_panel.setLayout(new GridLayout(1, 0, -60, 0));
	      
	      JLabel lblBirth = new JLabel("          Birth");
	      lblBirth.setHorizontalAlignment(SwingConstants.LEFT);
	      lblBirth.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
	      birth_panel.add(lblBirth);
	      
	      birth = new JTextField();
	      birth.setColumns(10);
	      birth_panel.add(birth);
	      
	      JPanel birth_panel1 = new JPanel();
	      birth_panel1.setBackground(SystemColor.activeCaption);
	      birth_panel1.setBounds(62, 338, 340, 38);
	      frame.getContentPane().add(birth_panel1);
	      birth_panel1.setLayout(new GridLayout(1, 0, -60, 0));
	      
	      JLabel lblBirth1 = new JLabel("          Birth");
	      lblBirth1.setHorizontalAlignment(SwingConstants.LEFT);
	      lblBirth1.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
	      birth_panel1.add(lblBirth1);
	      
	      JTextField textField_4 = new JTextField();
	      textField_4.setColumns(10);
	      birth_panel1.add(textField_4);
	      
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
	      
	 
	      ButtonGroup group = new ButtonGroup();
	      group.add(male);
	      group.add(female);
	      
	      JButton vaildcheck = new JButton("\uC911\uBCF5 \uD655\uC778");
	      vaildcheck.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent arg0) {
	      		String infoid = id.getText();
	      		Member member = new Member(infoid);
	      		boolean result1 = service.idCheck(member);
	               if(result1) {
	                  // https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html 들어가서 맘에 드는 디자인 코드 복사 붙여넣기
	                  JOptionPane.showMessageDialog(frame, "가입 가능한 아이디 입니다.");  
	                 
	               }
	            else {
	               JOptionPane.showMessageDialog(frame, "이미 존재하는 아이디입니다.");
	            }
	      	}
	      	
	      });
	      vaildcheck.setBounds(308, 138, 105, 38);
	      frame.getContentPane().add(vaildcheck);
	      btnNewButton.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseClicked(MouseEvent arg0) {
		        	 String infoid = id.getText(); 
						String infopw = pw.getText();
						String infoname = name.getText();
						String infobirth = birth.getText();
						String infoemail = email.getText();
						int sex = 0;
						if(male.isSelected()) {
							sex = 1;
						} else if(female.isSelected()) {
							sex=2;
						}
						// 멤버 객체를 생성
						Member member = new Member(infoid,infopw,infoname,infobirth,infoemail,sex);
						//컨트롤러한테 회원가입 요청 
						boolean result = service.memberJoin(member);
						if(result) {
							JOptionPane.showMessageDialog(frame,
								    "회원 가입에 성공 했습니다.");
							frame.dispose();
						} else {
							JOptionPane.showMessageDialog(frame,
								    "회원 가입에 실패 했습니다.");
						}
		         }
		         
		      });
	      
	   }
	}