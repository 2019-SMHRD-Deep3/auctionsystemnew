package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import model.Member;
import model.MemberManagementService;

public class ASlogin {

	private JFrame frame;
	private ImageIcon icon;
	JPanel panel;
	JPanel panel_1 ;
	private JLabel idfield;
	private JTextField id;
	private JPanel pw_pannel;
	private JLabel pwfield;
	private JPasswordField pw;
	private JButton confirm;
	private JButton cancel;
	JPanel panel_3 = new JPanel();
	private JButton join;
	private MemberManagementService service = new MemberManagementService();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASlogin window = new ASlogin();
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
	public ASlogin() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 494, 561);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ImageIcon icon = new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\INTERBBAKK.PNG");
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
//		panel_1 = new JPanel() {
//			
//				protected void paintComponent(Graphics g) {
//					// TODO Auto-generated method stub
//					g.drawImage(icon.getImage(),0,0,panel_1.getWidth(),panel_1.getHeight(),null);
//					setOpaque(false);
//					super.paintComponent(g);
//				}
//		};
//		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 56, SpringLayout.NORTH, frame.getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, panel_1, 46, SpringLayout.WEST, frame.getContentPane());
//		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 191, SpringLayout.NORTH, frame.getContentPane());
//		springLayout.putConstraint(SpringLayout.EAST, panel_1, 599, SpringLayout.WEST, frame.getContentPane());
//		panel_1.setBackground(SystemColor.textHighlightText);
//
//		frame.getContentPane().add(panel_1);
//		
		JPanel id_panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, id_panel, 221, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, id_panel, -63, SpringLayout.EAST, frame.getContentPane());
		id_panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(id_panel);
		id_panel.setLayout(new GridLayout(0, 2, -50, 0));
		
		idfield = new JLabel("             ID");
		idfield.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		idfield.setHorizontalAlignment(SwingConstants.LEFT);
		id_panel.add(idfield);
		
		id = new JTextField();
		id_panel.add(id);
		id.setColumns(10);
		
		pw_pannel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, id_panel, -29, SpringLayout.NORTH, pw_pannel);
		springLayout.putConstraint(SpringLayout.NORTH, pw_pannel, 288, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, id_panel, 0, SpringLayout.WEST, pw_pannel);
		springLayout.putConstraint(SpringLayout.WEST, pw_pannel, 75, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, pw_pannel, -63, SpringLayout.EAST, frame.getContentPane());
		pw_pannel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(pw_pannel);
		pw_pannel.setLayout(new GridLayout(0, 2, -50, 0));
		
		pwfield = new JLabel("      Password");
		pwfield.setHorizontalAlignment(SwingConstants.LEFT);
		pwfield.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		pw_pannel.add(pwfield);
		
		pw = new JPasswordField();
		pw_pannel.add(pw);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 92, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -77, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, pw_pannel, -61, SpringLayout.NORTH, panel_2);
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 387, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -89, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		confirm = new JButton("\uD655\uC778");
		confirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//로그인 기능
				//id, pw를 컴포넌트에서 가져오기
				String infoid = id.getText();
				String infopw = pw.getText();
				// Member 객체 생성
				Member member = new Member(infoid,infopw);
				Member loginuser =service.memberlogin(member);
				if(loginuser==null) {
					JOptionPane.showMessageDialog(frame,
						    "로그인에 실패 했습니다.");
				}else {
					JOptionPane.showMessageDialog(frame,
						    "로그인에 성공 했습니다.");
					ASHOME main = new ASHOME(loginuser);
					frame.dispose();
				}
			}
		});
		panel_2.add(confirm);
		
		cancel = new JButton("\uCDE8\uC18C");
		
		join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ASJoin최종 join1 = new ASJoin최종();
			}
		});
		panel_2.add(join);
		
		panel_3 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(icon.getImage(),0,0,panel_3.getWidth(),panel_3.getHeight(),null);
				// 1이미지소스 2좌표값 좌상단 0.0
				setOpaque(false);
				//4,5jpanal 크기에 맞게 변경
				super.paintComponent(g);
				
			}
		};
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 69, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 46, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -62, SpringLayout.NORTH, id_panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, -37, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_3);
		
		
		
		
		
		
		
		}
	}

