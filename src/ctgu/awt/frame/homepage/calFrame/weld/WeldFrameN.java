package ctgu.awt.frame.homepage.calFrame.weld;

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

public class WeldFrameN extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	private double table;
	private double table1;
	private double table3;
	private double table4;
	private double table5;
	private double result;
	private double result1;
	private double result2;
	public double RetaminResult;
	public double RetaminResult1;
	public double RetaminResult2;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeldFrameN frame = new WeldFrameN();
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
	public WeldFrameN() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 603, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);// 居中
		
		JLabel lblNewLabel = new JLabel("<html><body>焊脚尺寸h<sub>f</sub>:</body></html>");
		lblNewLabel.setBounds(14, 37, 102, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><body>焊缝的计算长度l<sub>w</sub>:</body></html>");
		lblNewLabel_1.setBounds(14, 119, 143, 24);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(114, 41, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 118, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("<html><body>角焊缝有效截面面积A<sub>f</sub>:</body></html>");
		lblNewLabel_2.setBounds(282, 119, 197, 24);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(445, 118, 86, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("计算");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table = Double.valueOf(textField.getText().trim());
				table1 = Double.valueOf(textField_1.getText().trim());
				result = table*table1+table3;
				result1 = table*table1*table1*table1+table4;
				result2 = table*table1*table1+table5;
				textField_2.setText(String.valueOf(result));
				table4 = result1;
				table3 = result;
				table5 = result2;
			}
		});
		btnNewButton.setBounds(58, 209, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("完成计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetaminResult = result;
				RetaminResult1 = result1;
				RetaminResult2 = result2;
				Weldn wa = new Weldn();
				wa.R1 = RetaminResult;
				wa.R2 = RetaminResult1;
				wa.R3 = RetaminResult2;
				setVisible(false);
			}
		});
		button.setBounds(418, 209, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("清空");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		button_1.setBounds(235, 209, 113, 27);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_3 = new JLabel("mm");
		lblNewLabel_3.setBounds(214, 44, 24, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel("mm");
		label.setBounds(244, 121, 24, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("<html><body>mm<sub>2</sub></body></html>");
		label_1.setBounds(545, 119, 24, 24);
		contentPane.add(label_1);
	}
}
