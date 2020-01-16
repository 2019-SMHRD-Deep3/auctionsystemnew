package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

import view.ASlogin;

import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;

public class LA {
	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LA window = new LA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public LA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 951, 458);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(189, 52, 543, 307);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500,1500));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(191, 367, 97, 23);
		panel.add(btnNewButton);
		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//1.jpg";
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//2.jpg";
		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//4.jpg";
		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//5.jpg";
		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//6.jpg";
		String imgPath8 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//7.jpg";
		String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//8.jpg";
		String imgPath10 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//9.jpg";
		String imgPath11 = this.getClass().getResource(".").getPath() + "..//..//img//固林//LA//10.jpg";
	}
}
