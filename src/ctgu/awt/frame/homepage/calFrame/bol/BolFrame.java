package ctgu.awt.frame.homepage.calFrame.bol;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog2;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog3;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：螺栓界面
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.bol
 * @author: 拉布拉多
 * @date: 2019年7月7日 上午10:12:12
 */

public class BolFrame extends FatherFrame {

	private JPanel contentPane;
	private JTextField txtNv;
	private JTextField txtD;
	private JTextField txtT;
	private JTextField txtFbv;
	private JTextField txtFbc;
	private JPanel panel_1;
	private JLabel label_4;
	private JTextField txtDe;
	private JLabel label_5;
	private JTextField textField_6;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JPanel panel_2;
	private JLabel label_10;
	private JTextField textField;
	private JLabel label_11;
	private JLabel label_12;
	private JTextField txtNv_1;
	private JTextField txtNt;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JTextField txtNvb;
	private JTextField txtNtb;
	private JTextField txtNbc;
	private JLabel label_16;
	private JLabel lblnvnbc;
	private JPanel panel_3;
	private JLabel label_17;
	private JTextField textField_1;
	private JLabel lblInfo;
	private JLabel label_18;
	private JTextField textField_2;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JPanel panel_4;
	private JLabel lblGb;
	private JLabel label_25;
	private JTextField textField_3;
	private JLabel label_26;
	private JTextField textField_4;
	private JLabel label_27;
	private JTextField textField_5;
	private JLabel lblGbnvbncb;
	private JLabel label_28;
	private JPanel panel_5;
	private JButton button_2;
	private JPanel panel_6;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BolFrame frame = new BolFrame();
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
	public BolFrame() {
		setTitle("螺栓计算");
		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1314, 760);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 取较小值
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder("普通螺栓受剪力"));
		panel.setBounds(14, 24, 415, 425);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("受剪面数目 :");
		label.setBounds(14, 50, 101, 18);
		panel.add(label);

		txtNv = new JTextField();
		txtNv.setText("nv");
		txtNv.setBounds(130, 47, 160, 24);
		panel.add(txtNv);
		txtNv.setColumns(10);

		JLabel lblDasdasd = new JLabel("螺栓杆直径 :");
		lblDasdasd.setBounds(14, 101, 101, 18);
		panel.add(lblDasdasd);

		txtD = new JTextField();
		txtD.setText("d");
		txtD.setColumns(10);
		txtD.setBounds(130, 98, 160, 24);
		panel.add(txtD);

		JLabel label_1 = new JLabel("在不同受力方向中一个受力方向承压构件总厚度的较小值 :");
		label_1.setBounds(14, 146, 401, 18);
		panel.add(label_1);

		txtT = new JTextField();
		txtT.setText("t");
		txtT.setBounds(24, 177, 160, 24);
		panel.add(txtT);
		txtT.setColumns(10);

		JLabel label_2 = new JLabel("螺栓的抗剪设计值 :");
		label_2.setBounds(14, 244, 160, 18);
		panel.add(label_2);

		txtFbv = new JTextField();
		txtFbv.setText("Fbv");
		txtFbv.setColumns(10);
		txtFbv.setBounds(188, 241, 160, 24);
		panel.add(txtFbv);

		JLabel label_3 = new JLabel("螺栓承压强度设计值 :");
		label_3.setBounds(14, 287, 160, 18);
		panel.add(label_3);

		txtFbc = new JTextField();
		txtFbc.setText("Fbc");
		txtFbc.setColumns(10);
		txtFbc.setBounds(188, 284, 160, 24);
		panel.add(txtFbc);

		label_6 = new JLabel("普通螺栓受剪承载力设计值 :");
		label_6.setBounds(14, 338, 210, 18);
		panel.add(label_6);

		label_7 = new JLabel("输出");
		label_7.setBounds(253, 338, 72, 18);
		panel.add(label_7);

		label_8 = new JLabel("普通螺栓承压承载力设计值 :");
		label_8.setBounds(14, 380, 210, 18);
		panel.add(label_8);

		label_9 = new JLabel("输出");
		label_9.setBounds(253, 380, 72, 18);
		panel.add(label_9);

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder("普通螺栓受杆轴方向拉力"));
		panel_1.setBounds(14, 476, 415, 164);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		label_4 = new JLabel("螺纹处的有效直径 :");
		label_4.setBounds(14, 42, 160, 18);
		panel_1.add(label_4);

		txtDe = new JTextField();
		txtDe.setText("De");
		txtDe.setColumns(10);
		txtDe.setBounds(188, 39, 160, 24);
		panel_1.add(txtDe);

		label_5 = new JLabel("抗拉强度设计值 :");
		label_5.setBounds(29, 78, 212, 18);
		panel_1.add(label_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(188, 76, 160, 24);
		panel_1.add(textField_6);

		label_10 = new JLabel("承载力设计值 ：");
		label_10.setBounds(41, 109, 136, 18);
		panel_1.add(label_10);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(188, 109, 160, 24);
		panel_1.add(textField);

		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder("普通螺栓同时承受剪力和杆轴方向拉力"));
		panel_2.setBounds(455, 38, 464, 305);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		label_11 = new JLabel("承受剪力 :");
		label_11.setBounds(73, 37, 96, 18);
		panel_2.add(label_11);

		label_12 = new JLabel("承受拉力 :");
		label_12.setBounds(73, 82, 96, 18);
		panel_2.add(label_12);

		txtNv_1 = new JTextField();
		txtNv_1.setText("Nv");
		txtNv_1.setBounds(188, 34, 207, 24);
		panel_2.add(txtNv_1);
		txtNv_1.setColumns(10);

		txtNt = new JTextField();
		txtNt.setText("Nt");
		txtNt.setColumns(10);
		txtNt.setBounds(188, 76, 207, 24);
		panel_2.add(txtNt);

		label_13 = new JLabel("承剪继承力设计值 :");
		label_13.setBounds(14, 120, 141, 18);
		panel_2.add(label_13);

		label_14 = new JLabel("承拉继承力设计值 :");
		label_14.setBounds(14, 158, 141, 18);
		panel_2.add(label_14);

		label_15 = new JLabel("承压继承力设计值 :");
		label_15.setBounds(14, 200, 141, 18);
		panel_2.add(label_15);

		txtNvb = new JTextField();
		txtNvb.setText("Nvb");
		txtNvb.setColumns(10);
		txtNvb.setBounds(188, 117, 207, 24);
		panel_2.add(txtNvb);

		txtNtb = new JTextField();
		txtNtb.setText("Ntb");
		txtNtb.setColumns(10);
		txtNtb.setBounds(188, 155, 207, 24);
		panel_2.add(txtNtb);

		txtNbc = new JTextField();
		txtNbc.setText("Nbc");
		txtNbc.setColumns(10);
		txtNbc.setBounds(188, 197, 207, 24);
		panel_2.add(txtNbc);

		label_16 = new JLabel("同时承受剪力和杆轴方向拉力 :");
		label_16.setBounds(14, 260, 212, 18);
		panel_2.add(label_16);

		lblnvnbc = new JLabel("输出小于1并且Nv小于等于Nbc");
		lblnvnbc.setBounds(240, 260, 212, 18);
		panel_2.add(lblnvnbc);

		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder("高强度螺栓承压型连接"));
		panel_3.setBounds(455, 356, 464, 284);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		panel_5 = new JPanel();
		panel_5.setBounds(14, 28, 436, 243);
		panel_3.add(panel_5);
		panel_5.setLayout(null);

		lblGbnvbncb = new JLabel("GB规定：单个承压型高强螺栓的受剪承载力设计值取受剪");
		lblGbnvbncb.setBounds(14, 13, 405, 18);
		panel_5.add(lblGbnvbncb);
		lblGbnvbncb.setFont(new Font("宋体", Font.BOLD, 15));

		label_28 = new JLabel("或承压承载力的较小值");
		label_28.setBounds(14, 32, 405, 18);
		panel_5.add(label_28);
		label_28.setFont(new Font("宋体", Font.BOLD, 15));

		label_17 = new JLabel("螺栓杆直径 :");
		label_17.setBounds(14, 53, 91, 18);
		panel_5.add(label_17);

		textField_1 = new JTextField();
		textField_1.setBounds(144, 50, 181, 24);
		panel_5.add(textField_1);
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblInfo.setText("当剪切面在螺纹处时，应取螺纹处有效直径!");
			}

			@Override
			public void focusLost(FocusEvent e) {
				lblInfo.setText("");
			}
		});
		textField_1.setColumns(10);

		lblInfo = new JLabel();
		lblInfo.setBounds(24, 73, 335, 18);
		panel_5.add(lblInfo);
		lblInfo.setForeground(Color.RED);
		lblInfo.setFont(new Font("宋体", Font.PLAIN, 13));

		label_18 = new JLabel("受剪面数 :");
		label_18.setBounds(34, 99, 91, 18);
		panel_5.add(label_18);

		textField_2 = new JTextField();
		textField_2.setBounds(144, 96, 181, 24);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		label_21 = new JLabel("受剪承载力 :");
		label_21.setBounds(14, 143, 98, 18);
		panel_5.add(label_21);

		label_23 = new JLabel("取两值得较小值");
		label_23.setBounds(154, 143, 177, 18);
		panel_5.add(label_23);

		label_22 = new JLabel("受压承载力 :");
		label_22.setBounds(14, 174, 98, 18);
		panel_5.add(label_22);

		label_24 = new JLabel("取两值得较小值");
		label_24.setBounds(154, 174, 177, 18);
		panel_5.add(label_24);

		label_19 = new JLabel("受剪承载力设计值 :");
		label_19.setBounds(14, 212, 136, 18);
		panel_5.add(label_19);

		label_20 = new JLabel("取两值得较小值");
		label_20.setBounds(154, 212, 177, 18);
		panel_5.add(label_20);

		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder("高强度螺栓摩擦型连接"));
		panel_4.setBounds(945, 55, 336, 473);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		lblGb = new JLabel("GB规定摩擦型高强螺栓的承载力仅受剪力");
		lblGb.setFont(new Font("宋体", Font.BOLD, 15));
		lblGb.setBounds(14, 42, 308, 18);
		panel_4.add(lblGb);

		label_25 = new JLabel("摩擦面数 :");
		label_25.setBounds(82, 130, 90, 18);
		panel_4.add(label_25);

		textField_3 = new JTextField();
		textField_3.setBounds(179, 127, 123, 24);
		panel_4.add(textField_3);
		textField_3.setColumns(10);

		label_26 = new JLabel("摩擦面的抗滑移系数 :");
		label_26.setBounds(14, 203, 170, 18);
		panel_4.add(label_26);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(179, 200, 123, 24);
		panel_4.add(textField_4);

		label_27 = new JLabel("预拉力 :");
		label_27.setBounds(101, 312, 72, 18);
		panel_4.add(label_27);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(179, 309, 123, 24);
		panel_4.add(textField_5);

		JButton button = new JButton("查看系数表");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BolTableDialog bolTableDialog = BolTableDialog.getInstance();
				bolTableDialog.setVisible(true);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 13));
		button.setBounds(179, 254, 113, 27);
		panel_4.add(button);

		JButton button_1 = new JButton("查看预拉力表");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BolTableDialog2 bolTableDialog = BolTableDialog2.getInstance();
				bolTableDialog.setVisible(true);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 13));
		button_1.setBounds(179, 367, 123, 27);
		panel_4.add(button_1);

		button_2 = new JButton("其他");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BolTableDialog3 bolTableDialog = BolTableDialog3.getIntance();
				bolTableDialog.setVisible(true);
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 13));
		button_2.setBounds(179, 407, 123, 27);
		panel_4.add(button_2);

		panel_6 = new JPanel();
		panel_6.setBounds(24, 653, 1232, 59);
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		button_3 = new JButton("保存");
		button_3.setBounds(14, 13, 113, 27);
		panel_6.add(button_3);

		button_4 = new JButton("计算");
		button_4.setBounds(515, 13, 113, 27);
		panel_6.add(button_4);

		button_5 = new JButton("打印");
		button_5.setBounds(1073, 13, 113, 27);
		panel_6.add(button_5);
	}
}
