package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class Newyork {

	private JFrame frame;

	public Newyork() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(168, 103, 550, 314);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		frame.setBounds(100, 100, 764, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
