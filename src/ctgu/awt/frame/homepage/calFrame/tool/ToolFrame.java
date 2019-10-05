package ctgu.awt.frame.homepage.calFrame.tool;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.tool
 * @author: 拉布拉多
 */

public class ToolFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolFrame frame = new ToolFrame();
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
	public ToolFrame() {
		setTitle("工器具计算");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder("耳板"));

		panel.setBounds(14, 13, 405, 582);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder("载荷"));
		panel_1.setBounds(14, 29, 377, 270);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("结重要性系数 :");
		lblNewLabel.setBounds(14, 36, 158, 18);
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(136, 30, 206, 31);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel label = new JLabel("分项系数 :");
		label.setBounds(14, 99, 158, 18);
		panel_1.add(label);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 93, 206, 31);
		panel_1.add(textField_1);

		JLabel label_1 = new JLabel("动力系数 :");
		label_1.setBounds(14, 162, 158, 18);
		panel_1.add(label_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 156, 206, 31);
		panel_1.add(textField_2);

		JLabel label_2 = new JLabel("动力系数 :");
		label_2.setBounds(14, 225, 158, 18);
		panel_1.add(label_2);

		JLabel lblV = new JLabel("V");
		lblV.setBounds(136, 225, 158, 18);
		panel_1.add(lblV);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder("主耳板的抗拉、抗剪计算"));
		panel_2.setBounds(14, 312, 377, 257);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblD = new JLabel("d1:");
		lblD.setBounds(14, 37, 99, 18);
		panel_2.add(lblD);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 34, 214, 31);
		panel_2.add(textField_3);

		JLabel label_3 = new JLabel("θ:");
		label_3.setBounds(14, 84, 99, 18);
		panel_2.add(label_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 81, 214, 31);
		panel_2.add(textField_4);

		JLabel label_4 = new JLabel("主耳板的厚度:");
		label_4.setBounds(14, 142, 151, 18);
		panel_2.add(label_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 139, 214, 31);
		panel_2.add(textField_5);

		JLabel lblD_1 = new JLabel("d2:");
		lblD_1.setBounds(14, 202, 99, 18);
		panel_2.add(lblD_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 199, 214, 31);
		panel_2.add(textField_6);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder("耳板"));
		panel_3.setBounds(450, 13, 405, 582);
		contentPane.add(panel_3);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder("主耳板的抗拉、抗剪计算"));
		panel_5.setBounds(14, 24, 377, 125);
		panel_3.add(panel_5);

		JLabel label_10 = new JLabel("主耳板的抗拉力:");
		label_10.setBounds(14, 37, 198, 18);
		panel_5.add(label_10);

		JLabel label_11 = new JLabel("主耳板的抗剪力:");
		label_11.setBounds(14, 84, 186, 18);
		panel_5.add(label_11);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(165, 37, 186, 18);
		panel_5.add(lblNewLabel_1);

		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(165, 84, 186, 18);
		panel_5.add(label_5);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder("主耳板的抗弯计算"));
		panel_4.setBounds(14, 162, 377, 407);
		panel_3.add(panel_4);
		panel_4.setLayout(null);

		JLabel label_6 = new JLabel("<html>当主耳板与外力存在夹角时，主耳板在外力的水平分力作用下的受力状态为悬臂状态，主耳板根部的弯矩值最大，此时主耳板根部的应为: </html>");
		label_6.setBounds(31, 33, 332, 80);
		panel_4.add(label_6);
	}
}
