package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.awt.frame.homepage.component.anchor.Table1;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DerrickFrameN1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public double RetaminResult;
	public double RetaminResult1;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DerrickFrameN1 frame = new DerrickFrameN1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DerrickFrameN1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);// 居中
		
		JLabel lblNewLabel = new JLabel("主材规格:");
		lblNewLabel.setBounds(96, 86, 86, 34);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(215, 91, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("完成输入");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetaminResult = Double.valueOf(textField.getText().trim());
				RetaminResult1 = Double.valueOf(textField_1.getText().trim());
				DerrickN derrickN = new DerrickN();
				derrickN.x1 = RetaminResult;
				derrickN.x2= RetaminResult1;
				setVisible(false);
			}
		});
		button.setBounds(309, 209, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("清空");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		button_1.setBounds(96, 209, 113, 27);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("如∠140x14");
		label.setBounds(96, 33, 119, 34);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("x");
		label_1.setBounds(315, 86, 119, 34);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(336, 91, 86, 24);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("∠");
		label_2.setBounds(175, 86, 26, 34);
		contentPane.add(label_2);
	}
}
