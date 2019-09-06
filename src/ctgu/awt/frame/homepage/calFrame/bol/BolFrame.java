package ctgu.awt.frame.homepage.calFrame.bol;

import java.awt.BorderLayout;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ctgu.Entity.boltCal.HighStrength;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog2;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog3;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：螺栓
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.bol
 * @author: 拉布拉多
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
	// 方框内的所有值
	private HighStrength highStrength = new HighStrength();
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel label_31 = new JLabel();
	private JLabel label_32;
	private JLabel label_33;
	private String outPutTxt = "";

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
		txtNv.setText(highStrength.nv == null ? "" : String.valueOf(highStrength.nv));

		txtNv.setBounds(130, 47, 160, 24);
		panel.add(txtNv);
		txtNv.setColumns(10);

		JLabel lblDasdasd = new JLabel("螺栓杆直径 :");
		lblDasdasd.setBounds(14, 101, 101, 18);
		panel.add(lblDasdasd);

		txtD = new JTextField();
		txtD.setText("d");
		txtD.setText(highStrength.d == null ? "" : String.valueOf(highStrength.d));
		txtD.setColumns(10);
		txtD.setBounds(130, 98, 160, 24);
		panel.add(txtD);

		JLabel label_1 = new JLabel("在不同受力方向中一个受力方向承压构件总厚度的较小值 :");
		label_1.setBounds(14, 146, 401, 18);
		panel.add(label_1);

		txtT = new JTextField();
		txtT.setText("t");
		txtT.setText(highStrength.t == null ? "" : String.valueOf(highStrength.t));
		txtT.setBounds(24, 177, 160, 24);
		panel.add(txtT);
		txtT.setColumns(10);

		JLabel label_2 = new JLabel("螺栓的抗剪设计值 :");
		label_2.setBounds(14, 244, 160, 18);
		panel.add(label_2);

		txtFbv = new JTextField();
		txtFbv.setText("Fbv");
		txtFbv.setText(highStrength.fbv == null ? "" : String.valueOf(highStrength.fbv));
		txtFbv.setColumns(10);
		txtFbv.setBounds(188, 241, 160, 24);
		panel.add(txtFbv);

		JLabel label_3 = new JLabel("螺栓承压强度设计值 :");
		label_3.setBounds(14, 287, 160, 18);
		panel.add(label_3);

		txtFbc = new JTextField();
		txtFbc.setText("Fbc");
		txtFbc.setText(highStrength.fbc == null ? "" : String.valueOf(highStrength.fbc));
		txtFbc.setColumns(10);
		txtFbc.setBounds(188, 284, 160, 24);
		panel.add(txtFbc);

		label_6 = new JLabel("普通螺栓受剪承载力设计值 :");
		label_6.setBounds(14, 338, 210, 18);
		panel.add(label_6);

		label_7 = new JLabel("输出");
		label_7.setText(highStrength.o1 == null ? "" : String.valueOf(highStrength.o1));
		label_7.setBounds(253, 338, 200, 18);
		panel.add(label_7);

		label_8 = new JLabel("普通螺栓承压承载力设计值 :");
		label_8.setBounds(14, 380, 210, 18);
		panel.add(label_8);

		label_9 = new JLabel("输出");
		label_9.setText(highStrength.o2 == null ? "" : String.valueOf(highStrength.o2));
		label_9.setBounds(253, 380, 200, 18);
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
		txtDe.setText(highStrength.de == null ? "" : String.valueOf(highStrength.de));
		txtDe.setColumns(10);
		txtDe.setBounds(188, 39, 160, 24);
		panel_1.add(txtDe);

		label_5 = new JLabel("抗拉强度设计值 :");
		label_5.setBounds(29, 78, 212, 18);
		panel_1.add(label_5);

		textField_6 = new JTextField();
		textField_6.setText(highStrength.ftb == null ? "" : String.valueOf(highStrength.ftb));
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
		txtNv_1.setText(highStrength.Cnv == null ? "" : String.valueOf(highStrength.Cnv));
		txtNv_1.setBounds(188, 34, 207, 24);
		panel_2.add(txtNv_1);
		txtNv_1.setColumns(10);

		txtNt = new JTextField();
		txtNt.setText("Nt");
		txtNt.setText(highStrength.Nt == null ? "" : String.valueOf(highStrength.Nt));
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
		txtNvb.setText(highStrength.Nvb == null ? "" : String.valueOf(highStrength.Nvb));
		txtNvb.setColumns(10);
		txtNvb.setBounds(188, 117, 207, 24);
		panel_2.add(txtNvb);

		txtNtb = new JTextField();
		txtNtb.setText("Ntb");
		txtNtb.setText(highStrength.Ntb == null ? "" : String.valueOf(highStrength.Ntb));
		txtNtb.setColumns(10);
		txtNtb.setBounds(188, 155, 207, 24);
		panel_2.add(txtNtb);

		txtNbc = new JTextField();
		txtNbc.setText("Nbc");
		txtNbc.setText(highStrength.Nbc == null ? "" : String.valueOf(highStrength.Nbc));
		txtNbc.setColumns(10);
		txtNbc.setBounds(188, 197, 207, 24);
		panel_2.add(txtNbc);

		label_16 = new JLabel("同时承受剪力和杆轴方向拉力 :");
		label_16.setBounds(14, 244, 212, 18);
		panel_2.add(label_16);

		lblnvnbc = new JLabel("输出小于1并且Nv小于等于Nbc");
		lblnvnbc.setBounds(240, 244, 212, 18);
		panel_2.add(lblnvnbc);

		label_31.setForeground(Color.RED);
		label_31.setFont(new Font("宋体", Font.PLAIN, 13));
		label_31.setBounds(39, 275, 335, 18);
		panel_2.add(label_31);

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
		label_18.setBounds(59, 99, 91, 18);
		panel_5.add(label_18);

		textField_2 = new JTextField();
		textField_2.setBounds(178, 96, 181, 24);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		label_21 = new JLabel("受剪承载力 :");
		label_21.setBounds(14, 192, 98, 18);
		panel_5.add(label_21);

		label_23 = new JLabel("取两值得较小值");
		label_23.setBounds(158, 192, 177, 18);
		panel_5.add(label_23);

		label_22 = new JLabel("受压承载力 :");
		label_22.setBounds(14, 208, 98, 18);
		panel_5.add(label_22);

		label_24 = new JLabel("取两值得较小值");
		label_24.setBounds(158, 208, 177, 18);
		panel_5.add(label_24);

		label_19 = new JLabel("受剪承载力设计值 :");
		label_19.setBounds(14, 225, 136, 18);
		panel_5.add(label_19);

		label_20 = new JLabel("取两值得较小值");
		label_20.setBounds(159, 225, 177, 18);
		panel_5.add(label_20);

		JLabel label_29 = new JLabel("螺栓的抗剪设计值:");
		label_29.setBounds(0, 130, 181, 18);
		panel_5.add(label_29);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(178, 133, 181, 24);
		panel_5.add(textField_7);

		JLabel label_30 = new JLabel("螺栓承压强度设计值 :");
		label_30.setBounds(0, 161, 164, 18);
		panel_5.add(label_30);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(178, 161, 181, 24);
		panel_5.add(textField_8);

		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder("高强度螺栓摩擦型连接"));
		panel_4.setBounds(945, 55, 336, 585);
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
		button_1.setBounds(24, 365, 123, 27);
		panel_4.add(button_1);

		button_2 = new JButton("其他");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BolTableDialog3 bolTableDialog = BolTableDialog3.getIntance();
				bolTableDialog.setVisible(true);
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 13));
		button_2.setBounds(179, 365, 123, 27);
		panel_4.add(button_2);

		label_32 = new JLabel("承载力 :");
		label_32.setBounds(101, 405, 72, 18);
		panel_4.add(label_32);

		label_33 = new JLabel("");
		label_33.setBounds(179, 405, 143, 24);
		panel_4.add(label_33);

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
		// 计算按钮
		button_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = checkOne();
				if (result == ResponseCode.DataERR) {
					JOptionPane.showConfirmDialog(null, "参数不合法");
					return;
				} else if (result == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
					return;
				}

				result = checkTwo();
				if (result == ResponseCode.DataERR) {
					JOptionPane.showConfirmDialog(null, "参数不合法");
					return;
				} else if (result == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
					return;
				}

				result = checkThree();
				if (result == ResponseCode.DataERR) {
					JOptionPane.showConfirmDialog(null, "参数不合法");
					return;
				} else if (result == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
					return;
				}
				result = checkFour();
				if (result == ResponseCode.DataERR) {
					JOptionPane.showConfirmDialog(null, "参数不合法");
					return;
				} else if (result == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
					return;
				}
				result = checkFive();
				if (result == ResponseCode.DataERR) {
					JOptionPane.showConfirmDialog(null, "参数不合法");
					return;
				} else if (result == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
					return;
				}
			}
		});

		button_5 = new JButton("打印");
		// 打印功能
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = "  ";
				String s2 = "      ";
				outPutTxt = "螺栓计算\n" + s1;
				if (highStrength.o1 != null) {
					outPutTxt += "普通螺栓受剪力: \n" + s2 + "受剪面数目:  " + highStrength.nv + "\n" + s2 + "螺栓杆直径:  "
							+ highStrength.d + "\n" + s2 + "在不同手里方向中一个受力方向承压构件总厚度的较小值:  " + highStrength.t + "\n" + s2
							+ "螺栓的抗剪设计值:  " + highStrength.fbv + "\n" + s2 + "螺栓承压强度设计值: " + highStrength.fbc + "\n"
							+ s2 + "普通螺栓受剪承载力设计值: " + highStrength.o1 + "\n" + s2 + "普通螺栓承压载力设计值:  " + highStrength.o2
							+ "\n" + s1;
				}
				if (highStrength.o3 != null) {
					outPutTxt += "普通螺栓受杆轴方向拉力: \n" + s2 + "螺纹处的有效直径: " + highStrength.de + "\n" + s2 + "抗拉强度设计值: "
							+ highStrength.ftb + "\n" + s2 + "承载力设计值: " + highStrength.o3 + "\n" + s1;
				}
				if (highStrength.o4 != null) {
					outPutTxt += "普通螺栓同时承受剪力和杆轴方向拉力:\n" + s2 + "承受剪力: " + highStrength.Cnv + "\n" + s2 + "承受拉力: "
							+ highStrength.Nt + "\n" + s2 + "承剪继承力设计值: " + highStrength.Nvb + "\n" + s2 + "承拉继承力设计值: "
							+ highStrength.Ntb + "\n" + s2 + "成压继承力设计值: " + highStrength.Nbc + "\n" + s2
							+ "同时承受剪力和杆轴方向拉力: " + highStrength.o4 + "\n" + s1;
				}
				if (highStrength.o5 != null) {
					outPutTxt += "高强度螺栓承压型连接: \n" + s2 + "螺栓杆直径: " + highStrength.Hd + "\n" + s2 + "受剪面数: "
							+ highStrength.Hnv + "\n" + s2 + "螺栓的抗剪设计值: " + highStrength.Fbv + "\n" + s2 + "螺栓承压强度设计值: "
							+ highStrength.Fbc + "\n" + s2 + "受剪承载力: " + highStrength.o5 + "\n" + s2 + "受压承载力: "
							+ highStrength.o6 + "\n" + s2 + "受剪承载力设计值: " + highStrength.o7 + "\n" + s1;
				}
				if (highStrength.o8 != null) {
					outPutTxt += "高强度螺栓摩擦型连接: \n" + s2 + "摩擦面数: " + highStrength.nf + "\n" + s2 + "摩擦面的抗滑移系数: "
							+ highStrength.y + "\n" + s2 + "预拉力: " + highStrength.nvb + "\n" + s2 + "承载力: "
							+ highStrength.o8;
				}
//				if(highStrength.)
				if (outPutTxt.length() == 7) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});

		button_5.setBounds(1073, 13, 113, 27);
		panel_6.add(button_5);

	}

	// 计算第一部分
	int checkOne() {
		if (txtNv.getText().trim().length() != 0 && txtD.getText().trim().length() != 0
				&& txtT.getText().trim().length() != 0 && txtFbv.getText().trim().length() != 0
				&& txtFbc.getText().trim().length() != 0) {
			try {
				highStrength.setNv(Integer.valueOf(txtNv.getText().trim()));
				highStrength.setD(Double.valueOf(txtD.getText().trim()));
				highStrength.setT(Double.valueOf(txtT.getText().trim()));
				highStrength.setFbv(Double.valueOf(txtFbv.getText().trim()));
				highStrength.setFbc(Double.valueOf(txtFbc.getText().trim()));
			} catch (NumberFormatException e) {
				// 参数转化异常
				return ResponseCode.DataERR;
			}
			highStrength.part1();
			label_7.setText(String.valueOf(highStrength.o1));
			label_9.setText(String.valueOf(highStrength.o2));
			return ResponseCode.OK;
		} else if (txtNv.getText().trim().length() != 0 || txtD.getText().trim().length() != 0
				|| txtT.getText().trim().length() != 0 || txtFbv.getText().trim().length() != 0
				|| txtFbc.getText().trim().length() != 0) {
			// 数据缺失
			return ResponseCode.NoData;
		}
		// 数据全空
		return ResponseCode.NULL;
	}

	// 计算第二部分
	int checkTwo() {
		if (txtDe.getText().trim().length() != 0 && textField_6.getText().trim().length() != 0) {
			try {
				highStrength.setDe(Double.valueOf(txtDe.getText().trim()));
				highStrength.setFtb(Double.valueOf(textField_6.getText().trim()));
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			highStrength.part2();
			textField.setText(String.valueOf(highStrength.o3));
			return ResponseCode.OK;
		} else if (txtDe.getText().trim().length() != 0 || textField_6.getText().trim().length() != 0) {
			return ResponseCode.NoData;
		}
		return ResponseCode.NULL;
	}

	// 计算第三部分
	int checkThree() {
		if (txtNv_1.getText().trim().length() != 0 && txtNt.getText().trim().length() != 0
				&& txtNvb.getText().trim().length() != 0 && txtNtb.getText().trim().length() != 0
				&& txtNbc.getText().trim().length() != 0) {

			try {
				highStrength.Cnv = Double.valueOf(txtNv_1.getText().trim());
				highStrength.Nt = Double.valueOf(txtNt.getText().trim());
				highStrength.Nvb = Double.valueOf(txtNvb.getText().trim());
				highStrength.Ntb = Double.valueOf(txtNtb.getText().trim());
				highStrength.Nbc = Double.valueOf(txtNbc.getText().trim());
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			highStrength.part3();
			lblnvnbc.setText(String.valueOf(highStrength.o4));
			if (highStrength.o4 < 1 && highStrength.o4 <= highStrength.Nbc) {
				lblnvnbc.setForeground(Color.BLACK);
			} else {
				label_31.setText("输出小于1并且小于等于承压承载力设计值");
				lblnvnbc.setForeground(Color.RED);
			}
			return ResponseCode.OK;
		} else if (txtNv_1.getText().trim().length() != 0 || txtNt.getText().trim().length() != 0
				|| txtNvb.getText().trim().length() != 0 || txtNtb.getText().trim().length() != 0
				|| txtNbc.getText().trim().length() != 0) {
			return ResponseCode.NoData;
		}
		return ResponseCode.NULL;
	}

	// 计算第四部分
	int checkFour() {
		if (textField_1.getText().trim().length() != 0 && textField_2.getText().trim().length() != 0
				&& textField_7.getText().trim().length() != 0 && textField_8.getText().trim().length() != 0) {
			try {
				highStrength.Hd = Double.valueOf(textField_1.getText().trim());
				highStrength.Hnv = Double.valueOf(textField_2.getText().trim());
				highStrength.Fbv = Double.valueOf(textField_7.getText().trim());
				highStrength.Fbc = Double.valueOf(textField_8.getText().trim());
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			highStrength.part4();
			/*
			 * label_23 label_24 label_20
			 */
			label_23.setText(String.valueOf(highStrength.o5));
			label_24.setText(String.valueOf(highStrength.o6));
			label_20.setText(String.valueOf(highStrength.o7));
			return ResponseCode.OK;
		} else if (textField_1.getText().trim().length() != 0 || textField_2.getText().trim().length() != 0
				|| textField_7.getText().trim().length() != 0 || textField_8.getText().trim().length() != 0) {
			return ResponseCode.NoData;
		}
		return ResponseCode.NULL;
	}

	// 计算第五部分
	int checkFive() {
		/*
		 * textField_3 textField_4 textField_5
		 */
		if (textField_3.getText().trim().length() != 0 && textField_4.getText().trim().length() != 0
				&& textField_5.getText().trim().length() != 0) {
			try {
				highStrength.nf = Double.valueOf(textField_3.getText().trim());
				highStrength.y = Double.valueOf(textField_4.getText().trim());
				highStrength.nvb = Double.valueOf(textField_5.getText().trim());
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			highStrength.part5();
			// label_33
			label_33.setText(String.valueOf(highStrength.o8));
			return ResponseCode.OK;
		} else if (textField_3.getText().trim().length() != 0 || textField_4.getText().trim().length() != 0
				|| textField_5.getText().trim().length() != 0) {
			return ResponseCode.NoData;
		}
		return ResponseCode.NULL;
	}
}
