package view;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.awt.Label;

public class flight {

	private JFrame frame;
	private DefaultComboBoxModel comboBoxModel;
	
	public flight() {
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
		panel.setBounds(0, 0, 735, 313);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC778\uCC9C(ICN)", "L.A(LAX)", "\uBC34\uCFE0\uBC84(YVR)", "\uC0CC\uD504\uB780\uC2DC\uC2A4\uCF54(SFO)", "\uB274\uC695(JFF)", "\uD558\uC640\uC774(KAO)", "\uD30C\uB9AC(PAR)", "\uB7F0\uB358(LOM)", "\uB85C\uB9C8(ROM)", "\uD504\uB77C\uD558(PRG)", "\uBC14\uB974\uC140\uB85C\uB098(BCN)", "\uB2E4\uB0AD(DAN)", "\uBC29\uCF55(BOK)", "\uD64D\uCF69(HOK)", "\uD0C0\uC774\uBCA0\uC774(TPE)", "\uC138\uBD80(CEB)", "\uD558\uB178\uC774(HAN)", "\uC2F1\uAC00\uD3EC\uB974(SGI)", "\uCF54\uD2B8\uB2C8\uD0A4\uB098\uBC1C\uB8E8(BKI)", "\uAD0C(GUM)", "\uC2DC\uB4DC\uB2C8(SYD)", "\uC0AC\uC774\uD310(SPN)"}));
		comboBox.setBounds(12, 70, 242, 34);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC778\uCC9C(ICN)", "L.A(LAX)", "\uBC34\uCFE0\uBC84(YVR)", "\uC0CC\uD504\uB780\uC2DC\uC2A4\uCF54(SFO)", "\uB274\uC695(JFF)", "\uD558\uC640\uC774(KAO)", "\uD30C\uB9AC(PAR)", "\uB7F0\uB358(LOM)", "\uB85C\uB9C8(ROM)", "\uD504\uB77C\uD558(PRG)", "\uBC14\uB974\uC140\uB85C\uB098(BCN)", "\uB2E4\uB0AD(DAN)", "\uBC29\uCF55(BOK)", "\uD64D\uCF69(HOK)", "\uD0C0\uC774\uBCA0\uC774(TPE)", "\uC138\uBD80(CEB)", "\uD558\uB178\uC774(HAN)", "\uC2F1\uAC00\uD3EC\uB974(SGI)", "\uCF54\uD2B8\uB2C8\uD0A4\uB098\uBC1C\uB8E8(BKI)", "\uAD0C(GUM)", "\uC2DC\uB4DC\uB2C8(SYD)", "\uC0AC\uC774\uD310(SPN)"}));
		comboBox_1.setBounds(288, 70, 217, 34);
		panel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.setBounds(605, 246, 97, 34);
		panel.add(btnNewButton);
		
		Label label = new Label("");
		label.setBounds(10, 0, 715, 52);
		panel.add(label);
		
	
		
		
	}
}
