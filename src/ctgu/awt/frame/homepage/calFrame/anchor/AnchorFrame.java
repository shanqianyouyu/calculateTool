package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ctgu.Entity.anchorcal.Anchor;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.component.anchor.Img1;
import ctgu.awt.frame.homepage.component.anchor.Img2;
import ctgu.awt.frame.homepage.component.anchor.Table1;
import ctgu.awt.frame.homepage.component.anchor.Table10;
import ctgu.awt.frame.homepage.component.anchor.Table2;
import ctgu.awt.frame.homepage.component.anchor.Table3;
import ctgu.awt.frame.homepage.component.anchor.Table4;
import ctgu.awt.frame.homepage.component.anchor.Table5;
import ctgu.awt.frame.homepage.component.anchor.Table6;
import ctgu.awt.frame.homepage.component.anchor.Table7;
import ctgu.awt.frame.homepage.component.anchor.Table8;
import ctgu.awt.frame.homepage.component.anchor.Table9;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：地锚窗口
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.anchor
 * @author: 拉布拉多
 */

public class AnchorFrame extends FatherFrame {

	private JPanel contentPane;
	private JTextField A1;
	private JTextField A2;
	private JTextField O2;
	private JTextField A3;
	private JTextField B1;
	private JTextField B4;
	private JTextField B6;
	private JTextField B5;
	private JTextField B2;
	private JTextField B8;
	private JTextField B7;
	private JTextField B3;
	private JTextField C3;
	private JTextField C1;
	private JTextField C2;
	private JTextField C4;
	private JTextField D1;
	private JTextField D2;
	private JTextField D3;
	private JTextField D4;
	private Anchor anchor = null;
	private JLabel O1;
	private JLabel o3;
	private JLabel o4;
	private JLabel o5;
	private String outPutTxt = "";

	public AnchorFrame(Anchor a) {
		anchor = a;
		setTitle("地锚计算");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1781, 943);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder("地锚锚体的强度计算"));
		panel.setBounds(14, 13, 393, 385);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("单位长度上的载荷:");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(14, 34, 209, 18);
		panel.add(label);

		A1 = new JTextField();
		A1.setText(anchor.A1 == null ? "" : String.valueOf(anchor.A1));
		A1.setBounds(154, 31, 209, 24);
		panel.add(A1);
		A1.setColumns(10);

		JLabel label_1 = new JLabel("长度:");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(14, 77, 209, 18);
		panel.add(label_1);

		A2 = new JTextField();
		A2.setText(anchor.A2 == null ? "" : String.valueOf(anchor.A2));
		A2.setColumns(10);
		A2.setBounds(154, 74, 209, 24);
		panel.add(A2);

		JLabel label_4 = new JLabel("容许弯曲应力:");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(14, 230, 209, 18);
		panel.add(label_4);

		JLabel label_5 = new JLabel("中心点最大弯矩:");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(14, 123, 209, 18);
		panel.add(label_5);

		JLabel label_6 = new JLabel("地锚锚体的弯曲应力:");
		label_6.setFont(new Font("宋体", Font.PLAIN, 16));
		label_6.setBounds(14, 298, 226, 18);
		panel.add(label_6);

		O2 = new JTextField();
		O2.setText(anchor.o2 == null ? "" : String.valueOf(anchor.o2));
		O2.setColumns(10);
		O2.setBounds(154, 121, 209, 24);
		panel.add(O2);

		A3 = new JTextField();
		A3.setText(anchor.A3 == null ? "" : String.valueOf(anchor.A3));
		A3.setColumns(10);
		A3.setBounds(154, 167, 209, 24);
		panel.add(A3);

		O1 = new JLabel("");
		O1.setFont(new Font("宋体", Font.BOLD, 15));
		O1.setText(anchor.o1 == null ? "" : String.valueOf(anchor.o1));
		O1.setBounds(191, 298, 226, 18);
		panel.add(O1);

		JLabel label_2 = new JLabel("抗弯截面系数:");
		label_2.setBounds(14, 169, 209, 18);
		panel.add(label_2);
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));

		JComboBox A5 = new JComboBox();
		A5.addItem("<html>1079 N/cm<sup>2</sup> [圆木]</html>");
		A5.addItem("<html><body>15700 N/cm<sup>2</sup> [Q235钢]</body></html>");
		A5.setBounds(127, 219, 231, 37);
		panel.add(A5);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder("拉线基础的抗拔力"));
		panel_1.setBounds(14, 411, 393, 416);
		contentPane.add(panel_1);

		// 第一个图片
		Icon icon1 = new ImageIcon("./resources/anchor/anchor.png");
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 260, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
		JLabel lblNewLabel_2 = new JLabel(icon1, JLabel.CENTER);
		lblNewLabel_2.setBounds(14, 26, 367, 254);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("地锚抗拔力计算,如图:");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(80, 293, 269, 30);
		panel_1.add(lblNewLabel_3);

		JLabel label_15 = new JLabel("中部直径:");
		label_15.setBounds(14, 365, 226, 18);
		panel_1.add(label_15);
		label_15.setFont(new Font("宋体", Font.PLAIN, 16));

		B7 = new JTextField();
		B7.setText(anchor.B7 == null ? "" : String.valueOf(anchor.B7));
		B7.setBounds(153, 363, 209, 24);
		panel_1.add(B7);
		B7.setColumns(10);

		/*
		 * A2 textField_5
		 */

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder("拉线基础的抗拔力"));
		panel_2.setBounds(454, 27, 452, 548);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		B4 = new JTextField(anchor.B4 == null ? "" : String.valueOf(anchor.B4));
		B4.setBounds(167, 175, 209, 24);
		panel_2.add(B4);
		B4.setColumns(10);

		JLabel label_8 = new JLabel("土壤的密度:");
		label_8.setBounds(14, 182, 209, 18);
		panel_2.add(label_8);
		label_8.setFont(new Font("宋体", Font.PLAIN, 16));

		B6 = new JTextField(anchor.B6 == null ? "" : String.valueOf(anchor.B6));
		B6.setBounds(167, 212, 209, 24);
		panel_2.add(B6);
		B6.setColumns(10);

		JLabel label_11 = new JLabel("地锚抗拔安全系数:");
		label_11.setBounds(14, 218, 209, 18);
		panel_2.add(label_11);
		label_11.setFont(new Font("宋体", Font.PLAIN, 16));

		JLabel label_9 = new JLabel("地锚受力方向与地面的夹角:");
		label_9.setBounds(14, 249, 209, 18);
		panel_2.add(label_9);
		label_9.setFont(new Font("宋体", Font.PLAIN, 16));

		B5 = new JTextField(anchor.B5 == null ? "" : String.valueOf(anchor.B5));
		B5.setBounds(167, 274, 209, 24);
		panel_2.add(B5);
		B5.setColumns(10);

		JLabel label_16 = new JLabel("地锚的容许抗拔力:");
		label_16.setBounds(14, 311, 226, 18);
		panel_2.add(label_16);
		label_16.setFont(new Font("宋体", Font.PLAIN, 16));

		o3 = new JLabel(anchor.o3 == null ? "" : String.valueOf(anchor.o3));
		o3.setFont(new Font("宋体", Font.BOLD, 15));
		o3.setBounds(163, 309, 272, 24);
		panel_2.add(o3);

		JLabel label_7 = new JLabel("地锚抗拔的土壤体积:");
		label_7.setBounds(14, 140, 209, 18);
		panel_2.add(label_7);
		label_7.setFont(new Font("宋体", Font.PLAIN, 16));

		B1 = new JTextField(anchor.B1 == null ? "" : String.valueOf(anchor.B1));
		B1.setBounds(167, 138, 209, 24);
		panel_2.add(B1);
		B1.setColumns(10);

		JLabel label_10 = new JLabel("土壤的计算抗拔角:");
		label_10.setBounds(14, 103, 209, 18);
		panel_2.add(label_10);
		label_10.setFont(new Font("宋体", Font.PLAIN, 16));

		B3 = new JTextField(anchor.B3 == null ? "" : String.valueOf(anchor.B3));
		B3.setBounds(167, 101, 209, 24);
		panel_2.add(B3);
		B3.setColumns(10);

		JLabel label_14 = new JLabel("地锚的埋置深度:");
		label_14.setBounds(14, 66, 209, 18);
		panel_2.add(label_14);
		label_14.setFont(new Font("宋体", Font.PLAIN, 16));

		B2 = new JTextField(anchor.B2 == null ? "" : String.valueOf(anchor.B2));
		B2.setBounds(167, 64, 209, 24);
		panel_2.add(B2);
		B2.setColumns(10);

		JLabel label_12 = new JLabel("长度:");
		label_12.setBounds(14, 29, 226, 18);
		panel_2.add(label_12);
		label_12.setFont(new Font("宋体", Font.PLAIN, 16));

		B8 = new JTextField();
		B8.setText(anchor.B8 == null ? "" : String.valueOf(anchor.B8));
		B8.setBounds(167, 27, 209, 24);
		panel_2.add(B8);
		B8.setColumns(10);

		JButton btnNewButton = new JButton("表一");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table1 table1 = new Table1();
				table1.setVisible(true);
			}
		});
		btnNewButton.setBounds(317, 346, 88, 27);
		panel_2.add(btnNewButton);

		JButton button = new JButton("表二");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table2 table2 = new Table2();
				table2.setVisible(true);
			}
		});
		button.setBounds(317, 397, 88, 27);
		panel_2.add(button);

		JButton button_1 = new JButton("表三");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table3 table3 = new Table3();
				table3.setVisible(true);
			}
		});
		button_1.setBounds(317, 440, 88, 27);
		panel_2.add(button_1);

		JButton button_2 = new JButton("表四");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table4 table4 = new Table4();
				table4.setVisible(true);
			}
		});
		button_2.setBounds(317, 496, 88, 27);
		panel_2.add(button_2);

		JLabel label_23 = new JLabel("土壤的分类及简易判别见表一:");
		label_23.setFont(new Font("宋体", Font.PLAIN, 16));
		label_23.setBounds(14, 342, 226, 18);
		panel_2.add(label_23);

		JLabel label_27 = new JLabel("按圆木强度计算地锚的容许拉力：");
		label_27.setFont(new Font("宋体", Font.PLAIN, 16));
		label_27.setBounds(14, 400, 262, 18);
		panel_2.add(label_27);

		JLabel lblkn = new JLabel("<html>∅230×1600钢管地锚斜向的（α=45°）容许抗拔力（kN）:</html>");
		lblkn.setFont(new Font("宋体", Font.PLAIN, 16));
		lblkn.setBounds(14, 437, 300, 46);
		panel_2.add(lblkn);

		JLabel lblkn_1 = new JLabel("<html>斜向地埋木的最小抗拔力（α=45°，kN）：</html>");
		lblkn_1.setFont(new Font("宋体", Font.PLAIN, 16));
		lblkn_1.setBounds(14, 496, 300, 40);
		panel_2.add(lblkn_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder("钢板地锚"));
		panel_3.setBounds(454, 602, 452, 225);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JButton button_3 = new JButton("查看钢板地锚图片");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Img2 img2 = new Img2();
				img2.setVisible(true);
			}
		});
		button_3.setFont(new Font("宋体", Font.PLAIN, 20));
		button_3.setBounds(89, 43, 233, 33);
		panel_3.add(button_3);

		JLabel label_17 = new JLabel("封闭式钢板锚体的容许拉力：");
		label_17.setFont(new Font("宋体", Font.PLAIN, 16));
		label_17.setBounds(14, 89, 251, 18);
		panel_3.add(label_17);

		JLabel label_26 = new JLabel("敞开式钢板锚体的容许拉力：");
		label_26.setFont(new Font("宋体", Font.PLAIN, 16));
		label_26.setBounds(14, 158, 251, 18);
		panel_3.add(label_26);

		JButton button_5 = new JButton("表五");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table5 table5 = new Table5();
				table5.setVisible(true);
			}
		});
		button_5.setBounds(324, 86, 88, 27);
		panel_3.add(button_5);

		JButton button_6 = new JButton("表六");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table6 table6 = new Table6();
				table6.setVisible(true);
			}
		});
		button_6.setBounds(324, 155, 88, 27);
		panel_3.add(button_6);

		ImageIcon imIcon2 = new ImageIcon("./resources/anchor/anchor2.png");
		Image img2 = imIcon2.getImage();
		img2 = img2.getScaledInstance(-1, 300, Image.SCALE_DEFAULT);
		imIcon2.setImage(img2);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder("桩锚的拉力计算"));
		panel_4.setBounds(1357, 37, 393, 790);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JLabel label_18 = new JLabel("土壤的允许耐压力:");
		label_18.setFont(new Font("宋体", Font.PLAIN, 16));
		label_18.setBounds(16, 295, 209, 18);
		panel_4.add(label_18);

		D1 = new JTextField(anchor.D1 == null ? "" : String.valueOf(anchor.D1));
		D1.setColumns(10);
		D1.setBounds(168, 293, 209, 24);
		panel_4.add(D1);

		JLabel label_19 = new JLabel("单桩地下部分的宽度:");
		label_19.setFont(new Font("宋体", Font.PLAIN, 16));
		label_19.setBounds(16, 340, 209, 18);
		panel_4.add(label_19);

		JLabel label_20 = new JLabel("单桩打入地下的深度:");
		label_20.setFont(new Font("宋体", Font.PLAIN, 16));
		label_20.setBounds(16, 397, 209, 18);
		panel_4.add(label_20);

		JLabel lblhh = new JLabel("随H/h变化的系数:");
		lblhh.setFont(new Font("宋体", Font.PLAIN, 16));
		lblhh.setBounds(16, 449, 209, 18);
		panel_4.add(lblhh);

		JLabel label_22 = new JLabel("单桩的容许承载力:");
		label_22.setFont(new Font("宋体", Font.PLAIN, 16));
		label_22.setBounds(12, 502, 209, 18);
		panel_4.add(label_22);

		D2 = new JTextField(anchor.D2 == null ? "" : String.valueOf(anchor.D2));
		D2.setColumns(10);
		D2.setBounds(168, 338, 209, 24);
		panel_4.add(D2);

		D3 = new JTextField(anchor.D3 == null ? "" : String.valueOf(anchor.D3));
		D3.setColumns(10);
		D3.setBounds(168, 395, 209, 24);
		panel_4.add(D3);

		D4 = new JTextField(anchor.D4 == null ? "" : String.valueOf(anchor.D4));
		D4.setColumns(10);
		D4.setBounds(168, 447, 209, 24);
		panel_4.add(D4);

		o5 = new JLabel(anchor.o5 == null ? "" : String.valueOf(anchor.o5));
		o5.setFont(new Font("宋体", Font.BOLD, 15));
		o5.setBounds(151, 503, 226, 18);
		panel_4.add(o5);

		ImageIcon imIcon5 = new ImageIcon("./resources/anchor/anchor5.png");
		Image img5 = imIcon5.getImage();
		img5 = img5.getScaledInstance(300, -1, Image.SCALE_DEFAULT);
		imIcon5.setImage(img5);
		JLabel label_24 = new JLabel("");
		label_24.setIcon(imIcon5);
		label_24.setBounds(39, 533, 314, 244);
		panel_4.add(label_24);

		ImageIcon imIcon4 = new ImageIcon("./resources/anchor/anchor4.png");
		Image img4 = imIcon4.getImage();
		img4 = img4.getScaledInstance(-1, 255, Image.SCALE_DEFAULT);
		imIcon4.setImage(img4);
		JLabel label_25 = new JLabel("");
		label_25.setIcon(imIcon4);

		label_25.setBounds(79, 27, 250, 244);
		panel_4.add(label_25);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder("桩锚本体的强度验算"));
		panel_5.setBounds(920, 220, 412, 607);
		contentPane.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblY = new JLabel("单根桩的抗弯截面系数:");
		lblY.setBounds(14, 227, 209, 18);
		panel_5.add(lblY);
		lblY.setFont(new Font("宋体", Font.PLAIN, 16));

		C4 = new JTextField(anchor.C4 == null ? "" : String.valueOf(anchor.C4));
		C4.setBounds(191, 225, 209, 24);
		panel_5.add(C4);
		C4.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel(
				"<html><body>常用的角钢桩的W值为：<75×8，W<sub>Y0</sub>=8.19 cm<sup>3</sup>;<80×8,W<sub>Y0</sub>=9.46 cm<sup>3</sup></body></html>");
		lblNewLabel_1.setBounds(14, 280, 386, 56);
		panel_5.add(lblNewLabel_1);

		JLabel label_13 = new JLabel("桩承受的力对桩体构成弯曲应力:");
		label_13.setBounds(14, 368, 333, 18);
		panel_5.add(label_13);
		label_13.setFont(new Font("宋体", Font.PLAIN, 16));

		o4 = new JLabel(anchor.o4 == null ? "" : String.valueOf(anchor.o4));
		o4.setFont(new Font("宋体", Font.BOLD, 15));
		o4.setBounds(174, 399, 226, 18);
		panel_5.add(o4);

		JLabel lblp = new JLabel("地面与最大弯矩处间的距离:");
		lblp.setBounds(14, 147, 319, 18);
		panel_5.add(lblp);
		lblp.setFont(new Font("宋体", Font.PLAIN, 16));

		C2 = new JTextField(anchor.C2 == null ? "" : String.valueOf(anchor.C2));
		C2.setBounds(191, 178, 209, 24);
		panel_5.add(C2);
		C2.setColumns(10);

		JLabel lblw = new JLabel("着力点与地面间的距离:");
		lblw.setBounds(14, 99, 226, 18);
		panel_5.add(lblw);
		lblw.setFont(new Font("宋体", Font.PLAIN, 16));

		C1 = new JTextField(anchor.C1 == null ? "" : String.valueOf(anchor.C1));
		C1.setBounds(191, 99, 209, 24);
		panel_5.add(C1);
		C1.setColumns(10);

		JLabel lblmmax = new JLabel("作用于桩锚上的拉力:");
		lblmmax.setBounds(14, 47, 209, 18);
		panel_5.add(lblmmax);
		lblmmax.setFont(new Font("宋体", Font.PLAIN, 16));

		C3 = new JTextField(anchor.C3 == null ? "" : String.valueOf(anchor.C3));
		C3.setBounds(191, 45, 209, 24);
		panel_5.add(C3);
		C3.setColumns(10);

		JLabel label_29 = new JLabel("单根角钢桩的容许承载力表：");
		label_29.setBounds(14, 450, 251, 18);
		panel_5.add(label_29);
		label_29.setFont(new Font("宋体", Font.PLAIN, 16));

		JButton button_8 = new JButton("表八");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table8 table8 = new Table8();
				table8.setVisible(true);
			}
		});
		button_8.setBounds(259, 450, 88, 27);
		panel_5.add(button_8);

		JLabel label_30 = new JLabel("<75×8角钢桩的容许承载力：");
		label_30.setFont(new Font("宋体", Font.PLAIN, 16));
		label_30.setBounds(14, 508, 251, 18);
		panel_5.add(label_30);

		JButton button_9 = new JButton("表九");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table9 table9 = new Table9();
				table9.setVisible(true);
			}
		});
		button_9.setBounds(259, 508, 88, 27);
		panel_5.add(button_9);

		JLabel lblkn_2 = new JLabel("<html>∅50×1600钢管桩的容许承载力（kN）：</html>");
		lblkn_2.setFont(new Font("宋体", Font.PLAIN, 16));
		lblkn_2.setBounds(14, 539, 251, 51);
		panel_5.add(lblkn_2);

		JButton button_10 = new JButton("表十");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table10 table10 = new Table10();
				table10.setVisible(true);
			}
		});
		button_10.setBounds(259, 563, 88, 27);
		panel_5.add(button_10);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder("地钻"));
		panel_6.setBounds(920, 37, 412, 170);
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		JButton button_4 = new JButton("查看地钻图片");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Img1 img1 = new Img1();
				img1.setVisible(true);
			}
		});
		button_4.setFont(new Font("宋体", Font.PLAIN, 20));
		button_4.setBounds(78, 54, 233, 33);
		panel_6.add(button_4);

		JLabel label_28 = new JLabel("地钻型号及额定载荷:");
		label_28.setFont(new Font("宋体", Font.PLAIN, 16));
		label_28.setBounds(14, 129, 251, 18);
		panel_6.add(label_28);

		JButton button_7 = new JButton("表七");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table7 table7 = new Table7();
				table7.setVisible(true);
			}
		});
		button_7.setBounds(230, 126, 88, 27);
		panel_6.add(button_7);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(14, 828, 1736, 55);
		contentPane.add(panel_7);
		panel_7.setLayout(null);

		JButton button_11 = new JButton("保存");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(anchor);
			}
		});
		button_11.setBounds(33, 13, 113, 27);
		panel_7.add(button_11);

		JButton button_12 = new JButton("计算");
		button_12.addActionListener(new ActionListener() {
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
			}
		});
		button_12.setBounds(829, 13, 113, 27);
		panel_7.add(button_12);

		JButton button_13 = new JButton("打印");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = "  ";
				String s2 = "      ";

				outPutTxt += "地锚计算" + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				if (anchor.o1 != null) {
					sb.append("地锚锚体的强度计算:" + System.getProperty("line.separator") + s2 + "单位长度上的载荷: " + anchor.A1
							+ System.getProperty("line.separator") + s2 + "长度: " + anchor.A2
							+ System.getProperty("line.separator") + s2 + "中心点最大弯矩: " + anchor.o2
							+ System.getProperty("line.separator") + s2 + "抗弯截面系数: " + anchor.A3
							+ System.getProperty("line.separator") + s2 + "地锚锚体的弯曲应力" + anchor.o1
							+ System.getProperty("line.separator") + s1);
				}
				if (anchor.o3 != null) {
					sb.append("拉线基础的抗拔力: " + System.getProperty("line.separator") + s2 + "中部直径： " + anchor.B7
							+ System.getProperty("line.separator") + s2 + "长度: " + anchor.B8
							+ System.getProperty("line.separator") + s2 + "地锚的埋置深度: " + anchor.B2
							+ System.getProperty("line.separator") + s2 + "土壤的计算抗拔角: " + anchor.B3
							+ System.getProperty("line.separator") + s2 + "地锚抗拔的土壤体积: " + anchor.B1
							+ System.getProperty("line.separator") + s2 + "土壤的密度: " + anchor.B4
							+ System.getProperty("line.separator") + s2 + "地锚抗拔安全系数: " + anchor.B6
							+ System.getProperty("line.separator") + s2 + "地锚受力方向与地面夹角: " + anchor.B5
							+ System.getProperty("line.separator") + s2 + "地面容许抗拔力: " + anchor.o3
							+ System.getProperty("line.separator") + s1);

				}
				if (anchor.o4 != null) {
					sb.append("桩锚本体的强度验算: " + System.getProperty("line.separator") + s2 + "作用域桩锚上的拉力：" + anchor.C3
							+ System.getProperty("line.separator") + s2 + "着力点与地面间的距离: " + anchor.C1
							+ System.getProperty("line.separator") + s2 + "地面与最大弯矩处间的距离: " + anchor.C2
							+ System.getProperty("line.separator") + s2 + "单根桩的抗弯界面系数: " + anchor.C4
							+ System.getProperty("line.separator") + s2 + "桩承受的力对桩体构成弯曲应力:" + anchor.o5
							+ System.getProperty("line.separator") + s1);
				}
				if (anchor.o5 != null) {
					sb.append("桩锚拉力计算:" + System.getProperty("line.separator") + s2 + "土壤的允许耐压力: " + anchor.D1
							+ System.getProperty("line.separator") + s2 + "单桩地下部分的宽度: " + anchor.D2
							+ System.getProperty("line.separator") + s2 + "单桩打入地下的深度: " + anchor.D3
							+ System.getProperty("line.separator") + s2 + "随H/h变化的系数: " + anchor.D4
							+ System.getProperty("line.separator") + s2 + "单桩的容许承载力: " + anchor.o5);
				}
				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}

			}
		});
		button_13.setBounds(1564, 13, 113, 27);
		panel_7.add(button_13);

	}

	// 第一部分
	int checkOne() {
		if (A1.getText().trim().length() != 0 && A2.getText().trim().length() != 0
				&& A3.getText().trim().length() != 0) {
			try {
				anchor.A1 = Double.valueOf(A1.getText().trim());
				anchor.A2 = Double.valueOf(A2.getText().trim());
				anchor.A3 = Double.valueOf(A3.getText().trim());
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			anchor.part1();
			O1.setText(String.valueOf(anchor.o1));
			O2.setText(String.valueOf(anchor.o2));
			return ResponseCode.OK;
		} else if (A1.getText().trim().length() != 0 || A2.getText().trim().length() != 0
				|| A3.getText().trim().length() != 0) {
			return ResponseCode.NoData;
		}

		return ResponseCode.NULL;
	}

	// 第二部分
	int checkTwo() {
		if (B1.getText().trim().length() != 0 && B2.getText().trim().length() != 0 && B3.getText().trim().length() != 0
				&& B4.getText().trim().length() != 0 && B5.getText().trim().length() != 0
				&& B6.getText().trim().length() != 0 && B7.getText().trim().length() != 0
				&& B8.getText().trim().length() != 0) {
			try {
				anchor.B1 = Double.valueOf(B1.getText().trim());
				anchor.B2 = Double.valueOf(B2.getText().trim());
				anchor.B3 = Double.valueOf(B3.getText().trim());
				anchor.B4 = Double.valueOf(B4.getText().trim());
				anchor.B5 = Double.valueOf(B5.getText().trim());
				anchor.B6 = Double.valueOf(B6.getText().trim());
				anchor.B7 = Double.valueOf(B7.getText().trim());
				anchor.B8 = Double.valueOf(B8.getText().trim());
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			anchor.part2();
			o3.setText(String.valueOf(anchor.o3));
			return ResponseCode.OK;
		} else if (B1.getText().trim().length() != 0 || B2.getText().trim().length() != 0
				|| B3.getText().trim().length() != 0 || B4.getText().trim().length() != 0
				|| B5.getText().trim().length() != 0 || B7.getText().trim().length() != 0
				|| B8.getText().trim().length() != 0) {
			return ResponseCode.NoData;

		}
		return ResponseCode.NULL;
	}

	// 第三部分
	int checkThree() {
		if (C1.getText().trim().length() != 0 && C2.getText().trim().length() != 0 && C3.getText().trim().length() != 0
				&& C4.getText().trim().length() != 0) {
			try {
				anchor.C1 = Double.valueOf(C1.getText().trim());
				anchor.C2 = Double.valueOf(C2.getText().trim());
				anchor.C3 = Double.valueOf(C3.getText().trim());
				anchor.C4 = Double.valueOf(C4.getText().trim());
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			anchor.part3();
			o4.setText(String.valueOf(anchor.o4));
			return ResponseCode.OK;
		} else if (C1.getText().trim().length() != 0 || C2.getText().trim().length() != 0
				|| C3.getText().trim().length() != 0 || C4.getText().trim().length() != 0) {
			return ResponseCode.NoData;
		}
		return ResponseCode.NULL;
	}

	// 第四部分
	int checkFour() {
		if (D1.getText().trim().length() != 0 && D2.getText().trim().length() != 0 && D3.getText().trim().length() != 0
				&& D4.getText().trim().length() != 0) {
			try {
				anchor.D1 = Double.valueOf(D1.getText().trim());
				anchor.D2 = Double.valueOf(D2.getText().trim());
				anchor.D3 = Double.valueOf(D3.getText().trim());
				anchor.D4 = Double.valueOf(D4.getText().trim());
			} catch (NumberFormatException e) {
				return ResponseCode.DataERR;
			}
			anchor.part4();
			o5.setText(String.valueOf(anchor.o5));
			return ResponseCode.OK;
		} else if (D1.getText().trim().length() != 0 || D2.getText().trim().length() != 0
				|| D3.getText().trim().length() != 0 || D4.getText().trim().length() != 0) {
			return ResponseCode.NoData;
		}
		return ResponseCode.NULL;
	}
}
