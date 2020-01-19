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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Member;
import model.MemberManagementService;
import model.����â��;
import model.��������;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JComponent btnNewButton; 
	
	
	
	
	
	
	public flight() {
	//	this.loginuser = member;
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC778\uCC9C(ICN)", "L.A(LAX)", "\uBC34\uCFE0\uBC84(YVR)", "\uC0CC\uD504\uB780\uC2DC\uC2A4\uCF54(SFO)", "\uB274\uC695(JFK)", "\uD558\uC640\uC774(KAO)", "\uD30C\uB9AC(PAR)", "\uB7F0\uB358(LOM)", "\uC624\uC0AC\uCE74(KIX)", "\uB85C\uB9C8(ROM)", "\uD504\uB77C\uD558(PRG)", "\uBC14\uB974\uC140\uB85C\uB098(BCN)", "\uB2E4\uB0AD(DAN)", "\uBC29\uCF55(BOK)", "\uD64D\uCF69(HOK)", "\uD0C0\uC774\uBCA0\uC774(TPE)", "\uC138\uBD80(CEB)", "\uD558\uB178\uC774(HAN)", "\uC2F1\uAC00\uD3EC\uB974(SGI)", "\uCF54\uD2B8\uB2C8\uD0A4\uB098\uBC1C\uB8E8(BKI)", "\uAD0C(GUM)", "\uC2DC\uB4DC\uB2C8(SYD)", "\uC0AC\uC774\uD310(SPN)"}));
		comboBox.addItem("��õ(ICN)");
		comboBox.addItem("L.A(LAX)");
		comboBox.addItem("�����(YVR)");
		comboBox.addItem("�������ý���(SFO)");
		comboBox.addItem("����(JFK)");
		comboBox.addItem("�Ͽ���(KAO)");
		comboBox.addItem("�ĸ�(PAR)");
		comboBox.addItem("����(LOM)");
		comboBox.addItem("�θ�(ROM)");
		comboBox.addItem("������(PRG)");
		comboBox.addItem("�ٸ����γ�(BCN)");
		comboBox.addItem("�ٳ�(DAN)");
		comboBox.addItem("����(BOK)");
		comboBox.addItem("ȫ��(HOK)");
		comboBox.addItem("Ÿ�̺���(TPE)");
		comboBox.addItem("����(CEB)");
		comboBox.addItem("�ϳ���(HAN)");
		comboBox.addItem("�̰�����(SGI)");
		comboBox.addItem("��Ʈ��Ű���߷�(BKI)");
		comboBox.addItem("��(GUM)");
		comboBox.addItem("�õ��(SYD)");
		comboBox.addItem("������(SPN)");
		
		
		comboBox.setBounds(128, 105, 242, 34);
		panel.add(comboBox);
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(12, 105, 104, 34);
		panel.add(comboBox_2);
		
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox_2.addItem("�ƽþƳ�");
		comboBox_2.addItem("�����װ�");
		JButton btnNewButton = new JButton("\uACB0\uC81C");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String i1 = (String)comboBox_2.getSelectedItem();
				if(i1=="�ƽþƳ�") {
		            	�������� bills = new ��������();
		            }else if (i1 == "�����װ�") {
		            	����â�� bills = new ����â��();
		            }
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(626, 269, 97, 34);
		panel.add(btnNewButton);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC778\uCC9C(ICN)", "L.A(LAX)", "\uBC34\uCFE0\uBC84(YVR)", "\uC0CC\uD504\uB780\uC2DC\uC2A4\uCF54(SFO)", "\uB274\uC695(JFK)", "\uD558\uC640\uC774(KAO)", "\uD30C\uB9AC(PAR)", "\uB7F0\uB358(LOM)", "\uB85C\uB9C8(ROM)", "\uC624\uC0AC\uCE74(KIX)", "\uD504\uB77C\uD558(PRG)", "\uBC14\uB974\uC140\uB85C\uB098(BCN)", "\uB2E4\uB0AD(DAN)", "\uBC29\uCF55(BOK)", "\uD64D\uCF69(HOK)", "\uD0C0\uC774\uBCA0\uC774(TPE)", "\uC138\uBD80(CEB)", "\uD558\uB178\uC774(HAN)", "\uC2F1\uAC00\uD3EC\uB974(SGI)", "\uCF54\uD2B8\uB2C8\uD0A4\uB098\uBC1C\uB8E8(BKI)", "\uAD0C(GUM)", "\uC2DC\uB4DC\uB2C8(SYD)", "\uC0AC\uC774\uD310(SPN)"}));
		comboBox_1.addItem("��õ(ICN)");
		comboBox_1.addItem("L.A(LAX)");
		comboBox_1.addItem("�����(YVR)");
		comboBox_1.addItem("�������ý���(SFO)");
		comboBox_1.addItem("����(JFK)");
		comboBox_1.addItem("�Ͽ���(KAO)");
		comboBox_1.addItem("�ĸ�(PAR)");
		comboBox_1.addItem("����(LOM)");
		comboBox_1.addItem("�θ�(ROM)");
		comboBox_1.addItem("������(PRG)");
		comboBox_1.addItem("�ٸ����γ�(BCN)");
		comboBox_1.addItem("�ٳ�(DAN)");
		comboBox_1.addItem("����(BOK)");
		comboBox_1.addItem("ȫ��(HOK)");
		comboBox_1.addItem("Ÿ�̺���(TPE)");
		comboBox_1.addItem("����(CEB)");
		comboBox_1.addItem("�ϳ���(HAN)");
		comboBox_1.addItem("�̰�����(SGI)");
		comboBox_1.addItem("��Ʈ��Ű���߷�(BKI)");
		comboBox_1.addItem("��(GUM)");
		comboBox_1.addItem("�õ��(SYD)");
		comboBox_1.addItem("������(SPN)");
		comboBox_1.setBounds(397, 105, 217, 34);
		panel.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(128, 149, 242, 154);
		panel.add(panel_1);
		
		// �޷�
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
		lblNewLabel.setFont(new Font("����ѱ�üM", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 28, 711, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
//<<<<<<< HEAD
//		String imgPath1 = this.getClass().getResource(".").getPath()+"..//..//img//����.jpg";
//	    lblNewLabel_1.setIcon(new ImageIcon(imgPath1));
//=======
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM020\\git\\auctionsystemnew1\\auctionnew\\img\\\uACF5\uD56D.JPG"));
		String imgPath5 = this.getClass().getResource(".").getPath()+"..//..//img//����.jpg";
		lblNewLabel_1.setIcon(new ImageIcon(imgPath5));
//>>>>>>> branch 'master' of https://github.com/khornejp/auctionsystemnew
		lblNewLabel_1.setBounds(0, 0, 735, 313);
		panel.add(lblNewLabel_1);
		
		
		
	}
	
}
