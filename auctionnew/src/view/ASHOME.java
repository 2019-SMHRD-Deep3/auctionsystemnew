package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Member;


public class ASHOME {

	private JFrame frame;
	private JPanel panel;
	private ImageIcon icon;
	private Member loginuser ;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public ASHOME(Member member ) {
		this.loginuser = member;
		initialize();
		frame.setVisible(true);
	}


	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1179, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//img//ddddd.JPG";
		ImageIcon icon = new ImageIcon(imgPath4);

		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1163, 58);
		panel_1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//img//23.png";
		lblNewLabel_2.setIcon(new ImageIcon(imgPath5));
		lblNewLabel_2.setBounds(0, 0, 180, 70);
		panel_1.add(lblNewLabel_2);

		panel = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);

			}

		};
		panel.setBounds(10, 57, 1141, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(136, 245, 846, 129);
		panel.add(panel_2);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);

		JButton act = new JButton("");
		act.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Act act = new Act();
			}
		});
		act.setBounds(630, 336, 90, 90);
		frame.getContentPane().add(act);

//<<<<<<< HEAD
//      frame.getContentPane().setLayout(null);
//      
//      JPanel panel_1 = new JPanel();
//      panel_1.setForeground(new Color(255, 255, 255));
//      panel_1.setBounds(0, 20, 1163, 58);
//      panel_1.setBackground(new Color(255, 255, 255));
//      frame.getContentPane().add(panel_1);
//      panel_1.setLayout(null);//
//      
//      
//      JLabel lblNewLabel_2 = new JLabel("");
//      String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//23.png";
//      lblNewLabel_2.setIcon(new ImageIcon(imgPath5));
//      lblNewLabel_2.setBounds(0, 0, 180, 70);
//      panel_1.add(lblNewLabel_2);
//      
//      panel = new JPanel(){
//         protected void paintComponent(Graphics g) {
//            g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
//               setOpaque(false);
//               super.paintComponent(g);
//         
//         }
//         
//         };
//      panel.setBounds(50, 58, 1141, 279);
//      frame.getContentPane().add(panel);
//      panel.setLayout(null);
//      
//      JPanel panel_2 = new JPanel();
//      panel_2.setBounds(136, 245, 846, 129);
//      panel.add(panel_2);
//      panel_2.setBackground(new Color(255, 255, 255));
//      panel_2.setLayout(null);
//      
//      JButton act = new JButton("");
//      act.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {
//         }
//      });
//      act.setBounds(630, 336, 90, 90);
//      frame.getContentPane().add(act);
//=======
		String imgPath = this.getClass().getResource(".").getPath() + "..//..//img//act.JPG";

		act.setIcon(new ImageIcon(imgPath));

		JButton hotel = new JButton();
		hotel.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Hotel hotel = new Hotel();
			}
		});
		hotel.setBounds(400, 336, 90, 90);
		frame.getContentPane().add(hotel);
		
		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//img//ĸó1.JPG";
		hotel.setIcon(new ImageIcon(imgPath1));

		JButton flight = new JButton();
		flight.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				flight fly = new flight();

			}
		});
		flight.setBounds(180, 336, 90, 90);
		frame.getContentPane().add(flight);

		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//flight1.JPG";
		flight.setIcon(new ImageIcon(imgPath2));

		JButton ticket = new JButton("");
		ticket.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Ticket ticket = new Ticket();
			}
		});
		ticket.setBounds(872, 336, 90, 90);
		frame.getContentPane().add(ticket);

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//Ƽ��.jpg";
		ticket.setIcon(new ImageIcon(imgPath3));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 436, 180, 272);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uC557! \uC774\uC2DC\uAD6D\uC5D0 \uC624\uC0AC\uCE74\uB97C?");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Osaka osaka = new Osaka();
			}
		});
		lblNewLabel_1.setFont(new Font("HY����L", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(12, 103, 156, 51);
		panel_3.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("\uD64D\uCF69\uAC08\uB798?");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hongkong hongkong = new Hongkong();
			}
		});
		lblNewLabel_3.setFont(new Font("HY����L", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(12, 143, 156, 51);
		panel_3.add(lblNewLabel_3);

		JLabel label = new JLabel("\uB610\uCE58\uC758 \uC138\uACC4\uC77C\uC8FC 18. \uB85C\uB9C8");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rome rome = new Rome();
			}
		});
		label.setFont(new Font("HY����L", Font.PLAIN, 13));
		label.setBounds(12, 186, 156, 46);
		panel_3.add(label);

		JLabel label_2 = new JLabel("\uCE60\uB808? \uB9DE\uC744\uB808?");
		label_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Chile chile = new Chile();
			}
		});
		label_2.setFont(new Font("HY����L", Font.PLAIN, 13));
		label_2.setBounds(12, 64, 156, 51);
		panel_3.add(label_2);

		JLabel label_3 = new JLabel("\uB108\uB3C4 \uAC08\uB798?");
		label_3.setFont(new Font("HY��M", Font.PLAIN, 17));
		label_3.setBounds(12, 15, 108, 51);
		panel_3.add(label_3);

		JLabel label_1 = new JLabel("\uBC29 \uCF55\uC5D0\uC11C \uBC29\uCF55\uC73C\uB85C~");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Bangkok bangkok = new Bangkok();
			}
		});
		label_1.setFont(new Font("HY����L", Font.PLAIN, 13));
		label_1.setBounds(12, 226, 156, 46);
		panel_3.add(label_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//img//ĸó333.jpg";
		lblNewLabel.setIcon(new ImageIcon(imgPath6));
		lblNewLabel.setBounds(896, 452, 255, 75);
		frame.getContentPane().add(lblNewLabel);

		JLabel label_4 = new JLabel("");
		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//img//ȣĲ��.jpg";
		label_4.setIcon(new ImageIcon(imgPath7));
		label_4.setBounds(896, 538, 255, 75);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("");
		String imgPath8 = this.getClass().getResource(".").getPath() + "..//..//img//ĸó2233232.jpg";
		label_5.setIcon(new ImageIcon(imgPath8));
		label_5.setBounds(896, 624, 255, 75);
		frame.getContentPane().add(label_5);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Spain spain = new Spain();
			}
		});
		String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//img//������.jpg";
		lblNewLabel_5.setIcon(new ImageIcon(imgPath9));
		lblNewLabel_5.setBounds(204, 467, 190, 230);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel label_6 = new JLabel("New label");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Taiwan taiwan = new Taiwan();
			}
		});
		String imgPath10 = this.getClass().getResource(".").getPath() + "..//..//img//�븸.jpg";
		label_6.setIcon(new ImageIcon(imgPath10));
		label_6.setBounds(427, 467, 190, 230);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel("New label");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Danang danang = new Danang();
			}
		});
		String imgPath11 = this.getClass().getResource(".").getPath() + "..//..//img//�ٳ�.jpg";
		label_7.setIcon(new ImageIcon(imgPath11));
		label_7.setBounds(649, 467, 190, 230);
		frame.getContentPane().add(label_7);

//<<<<<<< HEAD
//      String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//act.JPG";
//
//      act.setIcon(new ImageIcon(imgPath));
//      
//      JButton hotel = new JButton();
//      hotel.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {
//         }
//      });
//      hotel.setBounds(400, 336, 90, 90);
//      frame.getContentPane().add(hotel);
//      String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//ĸó1.JPG";
//      
//      hotel.setIcon(new ImageIcon(imgPath1));
//
//      
//      JButton flight = new JButton("");
//      flight.addActionListener(new ActionListener() {
//
//         public void actionPerformed(ActionEvent e) {
//            flight fly = new flight();
//
//         }
//      });
//      flight.setForeground(new Color(255, 255, 255));
//      flight.setBounds(180, 336, 90, 90);
//      frame.getContentPane().add(flight);
//
//      String imgPath2 = this.getClass().getResource(".").getPath()+"..//..//img//flight1.JPG";
//      flight.setIcon(new ImageIcon(imgPath2));
//      
//      JButton ticket = new JButton("");
//      ticket.addActionListener(new ActionListener() {
//      
//         public void actionPerformed(ActionEvent e) {
//         }
//      });
//      ticket.setBounds(872, 336, 90, 90);
//      frame.getContentPane().add(ticket);
//      
//       String imgPath3 = this.getClass().getResource(".").getPath()+"..//..//img//ticket.jpg";
//         ticket.setSelectedIcon(new ImageIcon(imgPath3));
//      
//      JPanel panel_3 = new JPanel();
//      panel_3.setBackground(Color.WHITE);
//      panel_3.setBounds(10, 436, 180, 272);
//      frame.getContentPane().add(panel_3);
//      panel_3.setLayout(null);
//      
//      JLabel lblNewLabel_1 = new JLabel("\uC557! \uC774\uC2DC\uAD6D\uC5D0 \uC624\uC0AC\uCE74\uB97C?");
//      lblNewLabel_1.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent e) {
//            Osaka osaka = new Osaka();
//         }
//      });
//      lblNewLabel_1.setFont(new Font("HY����L", Font.PLAIN, 13));
//      lblNewLabel_1.setBounds(12, 103, 156, 51);
//      panel_3.add(lblNewLabel_1);
//      
//      JLabel lblNewLabel_3 = new JLabel("\uD64D\uCF69\uAC08\uB798?");
//      lblNewLabel_3.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent e) {
//            Hongkong hongkong = new Hongkong();
//         }
//      });
//      lblNewLabel_3.setFont(new Font("HY����L", Font.PLAIN, 13));
//      lblNewLabel_3.setBounds(12, 143, 156, 51);
//      panel_3.add(lblNewLabel_3);
//      
//      JLabel label = new JLabel("\uB610\uCE58\uC758 \uC138\uACC4\uC77C\uC8FC 18. \uB85C\uB9C8");
//      label.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent e) {
//            Rome rome = new Rome();
//         }
//      });
//      label.setFont(new Font("HY����L", Font.PLAIN, 13));
//      label.setBounds(12, 186, 156, 46);
//      panel_3.add(label);
//      
//      JLabel label_2 = new JLabel("\uCE60\uB808? \uB9DE\uC744\uB808?");
//      label_2.addMouseListener(new MouseAdapter() {
//         public void mouseClicked(MouseEvent e) {
//         Chile chile = new Chile();
//         }
//      });
//      label_2.setFont(new Font("HY����L", Font.PLAIN, 13));
//      label_2.setBounds(12, 64, 156, 51);
//      panel_3.add(label_2);
//      
//      JLabel label_3 = new JLabel("\uB108\uB3C4 \uAC08\uB798?");
//      label_3.setFont(new Font("HY��M", Font.PLAIN, 17));
//      label_3.setBounds(12, 15, 108, 51);
//      panel_3.add(label_3);
//      
//      JLabel label_1 = new JLabel("\uBC29 \uCF55\uC5D0\uC11C \uBC29\uCF55\uC73C\uB85C~");
//      label_1.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent e) {
//         Bangkok bangkok =new Bangkok();
//         }
//      });
//      label_1.setFont(new Font("HY����L", Font.PLAIN, 13));
//      label_1.setBounds(12, 226, 156, 46);
//      panel_3.add(label_1);
//      
//      JLabel lblNewLabel = new JLabel("New label");
//      lblNewLabel.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent e) {
//         }
//      });
//      lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\ĸó333.JPG"));
//      lblNewLabel.setBounds(896, 452, 255, 75);
//      frame.getContentPane().add(lblNewLabel);
//      
//      JLabel label_4 = new JLabel("");
//      label_4.setIcon(new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\ȣĲ��.JPG"));
//      label_4.setBounds(896, 538, 255, 75);
//      frame.getContentPane().add(label_4);
//      
//      JLabel label_5 = new JLabel("");
//      label_5.setIcon(new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\ĸó2233232.JPG"));
//      label_5.setBounds(896, 624, 255, 75);
//      frame.getContentPane().add(label_5);
//      
//      JLabel lblNewLabel_5 = new JLabel("New label");
//      lblNewLabel_5.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent arg0) {
//            Spain spain = new Spain();
//         }
//      });
//      lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\������.JPG"));
//      lblNewLabel_5.setBounds(204, 467, 190, 230);
//      frame.getContentPane().add(lblNewLabel_5);
//      
//      JLabel label_6 = new JLabel("New label");
//      label_6.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent e) {
//            Taiwan taiwan = new Taiwan();
//         }
//      });
//      label_6.setIcon(new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\�븸.JPG"));
//      label_6.setBounds(427, 467, 190, 230);
//      frame.getContentPane().add(label_6);
//      
//      JLabel label_7 = new JLabel("New label");
//      label_7.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent e) {
//            Danang danang =new Danang();
//         }
//      });
//      label_7.setIcon(new ImageIcon("C:\\Users\\User\\git\\gitRepository\\auctionnew\\auctionnew\\img\\�ٳ�.JPG"));
//      label_7.setBounds(649, 467, 190, 230);
//      frame.getContentPane().add(label_7);
//      
//      
//      
//      }
//}
//=======
	}
}
