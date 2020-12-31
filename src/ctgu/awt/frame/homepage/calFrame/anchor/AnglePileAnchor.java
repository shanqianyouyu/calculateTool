package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：角钢桩锚
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.anchor
 * @author: 拉布拉多
 */

public class AnglePileAnchor extends FatherFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblNewLabel;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private String outPutTxt = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnglePileAnchor frame = new AnglePileAnchor(new ctgu.Entity.anchorcal.AnglePileAnchor());
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
	public AnglePileAnchor(ctgu.Entity.anchorcal.AnglePileAnchor entity) {
		setTitle("角钢桩锚");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1145, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u7C7B\u522B\u9009\u578B",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(14, 13, 542, 382);
		contentPane.add(panel);
		panel.setLayout(null);

//		JLabel lblNewLabel = new JLabel(Tool.getIcon("./resources/anchor/AnglePile1.png", 496, 276));
		lblNewLabel = new JLabel(Tool.getIcon("./resources/anchor/AnglePile5.png", -1, 293));
		lblNewLabel.setBounds(32, 29, 496, 293);
		panel.add(lblNewLabel);

		JRadioButton radioButton_10 = new JRadioButton("俯视图");
		;
		JRadioButton rdbtnNewRadioButton = new JRadioButton("单角钢桩");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(Tool.getIcon("./resources/anchor/AnglePile5.png", -1, 293));
				radioButton_10.setSelected(false);
			}
		});
		rdbtnNewRadioButton.setBounds(10, 331, 127, 27);
		panel.add(rdbtnNewRadioButton);

		JRadioButton radioButton = new JRadioButton("双联角钢桩");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(Tool.getIcon("./resources/anchor/AnglePile6.png", -1, 272));
				radioButton_10.setSelected(false);
			}
		});
		radioButton.setBounds(143, 331, 133, 27);
		panel.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("三联角钢桩");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(Tool.getIcon("./resources/anchor/AnglePile7.png", -1, 270));
				radioButton_10.setSelected(false);
			}
		});
		radioButton_1.setBounds(282, 331, 127, 27);
		panel.add(radioButton_1);

		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(rdbtnNewRadioButton);
		buttonGroup1.add(radioButton);
		buttonGroup1.add(radioButton_1);

//		radioButton_10 = new JRadioButton("俯视图");
		radioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(Tool.getIcon("./resources/anchor/AnglePile8.png", -1, 267));
			}
		});
		radioButton_10.setBounds(415, 331, 117, 27);
		panel.add(radioButton_10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null,
				"\u6869\u627F\u53D7\u7684\u529B\u5BF9\u6869\u4F53\u6784\u6210\u5F2F\u66F2\u5E94\u529B",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(14, 404, 542, 264);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblh = new JLabel("着力点与地面间的距离 H ：");
		lblh.setBounds(14, 30, 229, 18);
		panel_1.add(lblh);

		textField = new JTextField();
		textField.setBounds(258, 27, 118, 24);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblMm = new JLabel("mm");
		lblMm.setBounds(409, 30, 72, 18);
		panel_1.add(lblMm);

		JLabel lblY = new JLabel("地面与最大弯矩处间的距离 y：");
		lblY.setBounds(14, 61, 229, 18);
		panel_1.add(lblY);

		JLabel lblP = new JLabel("作用于桩锚上的拉力 P ：");
		lblP.setBounds(14, 92, 229, 18);
		panel_1.add(lblP);

		JLabel lblw = new JLabel("单根桩的抗弯截面系数 W ：");
		lblw.setBounds(14, 176, 229, 18);
		panel_1.add(lblw);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(258, 58, 118, 24);
		panel_1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(258, 89, 118, 24);
		panel_1.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(258, 173, 118, 24);
		panel_1.add(textField_3);

		JLabel label_3 = new JLabel("mm");
		label_3.setBounds(409, 61, 72, 18);
		panel_1.add(label_3);

		JLabel lblN = new JLabel("N");
		lblN.setBounds(409, 92, 72, 18);
		panel_1.add(lblN);

		JLabel lblmm = new JLabel("<html>mm<sup>3</sup></html>");
		lblmm.setBounds(409, 168, 72, 24);
		panel_1.add(lblmm);

		JLabel lblDf = new JLabel("容许拉力 δ：");
		lblDf.setBounds(14, 213, 229, 18);
		panel_1.add(lblDf);

		JLabel label = new JLabel("N");
		label.setBounds(409, 213, 72, 18);
		panel_1.add(label);

		textField_4 = new JTextField();
		textField_4.setText("12850");
		textField_4.setBounds(258, 210, 118, 24);
		panel_1.add(textField_4);
		textField_4.setColumns(10);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("<75×8");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("8190");
				textField_4.setText("12850");
				entity.btn2 = 1.0;
				entity.W = 8190.0;
			}
		});
//		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField_3.setText("8190");
//				textField_4.setText("12850");
//				entity.btn2 = 1.0;
//				entity.W = 8190.0;
//
//			}
//		});
		rdbtnNewRadioButton_1.setBounds(44, 122, 157, 27);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("<80×8");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("9460");
				textField_4.setText("14850");
				entity.btn2 = 2.0;
				entity.W = 9460.0;
			}
		});
//		radioButton_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField_3.setText("9460");
//				textField_4.setText("14850");
//				entity.btn2 = 2.0;
//				entity.W = 9460.0;
//			}
//		});
		radioButton_2.setBounds(249, 122, 157, 27);
		panel_1.add(radioButton_2);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_1);
		buttonGroup2.add(radioButton_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Config.ResColor);
		panel_2.setBounds(570, 24, 542, 119);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel label_1 = new JLabel("弯曲应力 δ：");
		label_1.setBounds(14, 13, 229, 18);
		panel_2.add(label_1);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(294, 10, 118, 24);
		panel_2.add(textField_5);

		JLabel label_2 = new JLabel("N");
		label_2.setBounds(426, 13, 72, 18);
		panel_2.add(label_2);

		JLabel label_4 = new JLabel("验算：");
		label_4.setBounds(14, 44, 74, 18);
		panel_2.add(label_4);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("通过");
		rdbtnNewRadioButton_2.setBounds(98, 40, 157, 27);
		panel_2.add(rdbtnNewRadioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("未通过");
		radioButton_3.setBounds(272, 43, 157, 27);
		panel_2.add(radioButton_3);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_2);
		buttonGroup3.add(radioButton_3);

		JButton btnJ = new JButton("计算");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int check = Tool.checkTextFiled(true, textField, textField_1, textField_2);

				if (check == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
					return;
				} else if (check == ResponseCode.UnKnowERR) {
					JOptionPane.showConfirmDialog(null, "未知错误");
					return;
				} else if (check == ResponseCode.DataERR) {
					JOptionPane.showConfirmDialog(null, "参数不合法");
					return;
				} else if (check == ResponseCode.NumParseExp) {
					JOptionPane.showConfirmDialog(null, "参数格式错误");
					return;
				}

				entity.H = Double.valueOf(String.valueOf(textField.getText().trim()));
				entity.y = Double.valueOf(String.valueOf(textField_1.getText().trim()));
				entity.P = Double.valueOf(String.valueOf(textField_2.getText().trim()));

				entity.calPartOne();

				textField_5.setText(String.valueOf(entity.f1));

				if (entity.btn3 == 1.0)
					rdbtnNewRadioButton_2.setSelected(true);
				else
					radioButton_3.setSelected(true);

			}
		});
		btnJ.setBounds(14, 75, 113, 27);
		panel_2.add(btnJ);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"\u6309\u571F\u58E4\u7684\u5141\u8BB8\u7684\u8010\u529B\u8BA1\u7B97\u5355\u6869\u7684\u5BB9\u8BB8\u627F\u8F7D\u529B",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(569, 148, 543, 462);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel label_5 = new JLabel("土壤类型 ：");
		label_5.setBounds(14, 21, 95, 27);
		panel_3.add(label_5);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("坚土");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entity.btn4 = 1.0;
				entity.T = 0.4;

			}
		});
		rdbtnNewRadioButton_3.setBounds(24, 45, 87, 27);
		panel_3.add(rdbtnNewRadioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("次坚土");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entity.btn4 = 2.0;
				entity.T = 0.3;
			}
		});
		radioButton_4.setBounds(132, 45, 87, 27);
		panel_3.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("普通土");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entity.btn4 = 3.0;
				entity.T = 0.2;
			}
		});
		radioButton_5.setBounds(252, 45, 87, 27);
		panel_3.add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton("软土");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entity.btn4 = 4.0;
				entity.T = 0.1;
			}
		});
		radioButton_6.setBounds(379, 45, 87, 27);
		panel_3.add(radioButton_6);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton_3);
		buttonGroup.add(radioButton_4);
		buttonGroup.add(radioButton_5);
		buttonGroup.add(radioButton_6);

		JLabel lblt = new JLabel("<html>土壤的允许耐压力 [б]<sub>T</sub> :</html>");
		lblt.setBounds(14, 85, 229, 27);
		panel_3.add(lblt);

		textField_6 = new JTextField();
		textField_6.setBounds(253, 85, 123, 24);
		panel_3.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblKn = new JLabel("N");
		lblKn.setBounds(390, 88, 72, 18);
		panel_3.add(lblKn);

		JLabel lblb = new JLabel("单桩地下部分的计算宽度b ：");
		lblb.setBounds(14, 122, 229, 18);
		panel_3.add(lblb);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(252, 119, 123, 24);
		panel_3.add(textField_7);

		JLabel label_6 = new JLabel("mm");
		label_6.setBounds(390, 122, 72, 18);
		panel_3.add(label_6);

		JLabel lblh_1 = new JLabel("单桩打入地下的深度 h：");
		lblh_1.setBounds(15, 239, 229, 18);
		panel_3.add(lblh_1);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(252, 236, 123, 24);
		panel_3.add(textField_8);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("求单桩容许承载力");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setEnabled(true);
				textField_10.setEnabled(true);
				textField_9.setEnabled(false);
				textField_11.setEnabled(false);

			}
		});
		rdbtnNewRadioButton_4.setBounds(24, 199, 167, 27);
		panel_3.add(rdbtnNewRadioButton_4);

		JLabel label_7 = new JLabel("计算模式 :");
		label_7.setBounds(14, 172, 95, 18);
		panel_3.add(label_7);

		JRadioButton radioButton_7 = new JRadioButton("求单桩容许承载力");
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setEnabled(false);
				textField_10.setEnabled(false);
				textField_9.setEnabled(true);
				textField_11.setEnabled(true);

			}
		});

		radioButton_7.setBounds(232, 199, 167, 27);
		panel_3.add(radioButton_7);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_4);
		buttonGroup4.add(radioButton_7);

		JLabel label_8 = new JLabel("mm");
		label_8.setBounds(394, 234, 72, 18);
		panel_3.add(label_8);

		JLabel lblH = new JLabel("单桩的容许承载力 p：");
		lblH.setBounds(14, 272, 229, 18);
		panel_3.add(lblH);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(252, 265, 123, 24);
		panel_3.add(textField_9);

		JLabel lblN_2 = new JLabel("N");
		lblN_2.setBounds(394, 272, 72, 18);
		panel_3.add(lblN_2);

		ButtonGroup buttonGroup5 = new ButtonGroup();

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Config.ResColor);
		panel_5.setBounds(14, 303, 515, 146);
		panel_3.add(panel_5);
		panel_5.setLayout(null);

		JLabel label_10 = new JLabel("验算：");
		label_10.setBounds(24, 78, 74, 18);
		panel_5.add(label_10);

		JRadioButton radioButton_8 = new JRadioButton("通过");
		radioButton_8.setBounds(108, 74, 157, 27);
		panel_5.add(radioButton_8);
		buttonGroup5.add(radioButton_8);

		JRadioButton radioButton_9 = new JRadioButton("未通过");
		radioButton_9.setBounds(282, 77, 157, 27);
		panel_5.add(radioButton_9);
		buttonGroup5.add(radioButton_9);

		JButton button = new JButton("计算");
		button.setBounds(24, 113, 113, 27);
		panel_5.add(button);

		JLabel lblP_1 = new JLabel("承载力 P：");
		lblP_1.setBounds(14, 20, 229, 18);
		panel_5.add(lblP_1);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(252, 13, 123, 24);
		panel_5.add(textField_10);

		JLabel lblN_1 = new JLabel("N");
		lblN_1.setBounds(389, 20, 72, 18);
		panel_5.add(lblN_1);

		JLabel label_13 = new JLabel("单桩打入地下的深度 h：");
		label_13.setBounds(14, 47, 229, 18);
		panel_5.add(label_13);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(252, 41, 123, 24);
		panel_5.add(textField_11);

		JLabel label_14 = new JLabel("mm");
		label_14.setBounds(389, 47, 72, 18);
		panel_5.add(label_14);

		JLabel label_9 = new JLabel("着力点与地面间的距离 H ：");
		label_9.setBounds(14, 151, 229, 18);
		panel_3.add(label_9);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(252, 156, 118, 24);
		panel_3.add(textField_12);

		JLabel label_11 = new JLabel("mm");
		label_11.setBounds(390, 153, 72, 18);
		panel_3.add(label_11);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check;
				if (entity.btn5 == 1.0) {
					check = Tool.checkTextFiled(true, textField_6, textField_7, textField_12, textField_8);
				} else {
					check = Tool.checkTextFiled(true, textField_6, textField_7, textField_12, textField_9);
				}
				if (check == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
					return;
				} else if (check == ResponseCode.UnKnowERR) {
					JOptionPane.showConfirmDialog(null, "未知错误");
					return;
				} else if (check == ResponseCode.DataERR) {
					JOptionPane.showConfirmDialog(null, "参数不合法");
					return;
				} else if (check == ResponseCode.NumParseExp) {
					JOptionPane.showConfirmDialog(null, "参数格式错误");
					return;
				}

				entity.cT = Double.valueOf(String.valueOf(textField_6.getText().trim()));
				entity.b = Double.valueOf(String.valueOf(textField_7.getText().trim()));
				entity.H2 = Double.valueOf(String.valueOf(textField_12.getText().trim()));
				if (entity.btn5 == 1.0) {
					entity.h = Double.valueOf(String.valueOf(textField_8.getText().trim()));
				} else {
					entity.p = Double.valueOf(String.valueOf(textField_9.getText().trim()));
				}
				entity.calPartTwo();
				if (entity.btn5 == 1.0) {
					textField_10.setText(String.valueOf(entity.res1));
					if (entity.btn6 == 1.0)
						radioButton_8.setSelected(true);
					else
						radioButton_9.setSelected(true);
				} else {
					textField_10.setText(String.valueOf(entity.res2));
				}
			}
		});

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(570, 612, 543, 56);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JButton button_1 = new JButton("保存到历史记录");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(entity);
			}
		});
		button_1.setBounds(14, 13, 188, 27);
		panel_4.add(button_1);

		JButton button_2 = new JButton("下载到桌面");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = "  ";
				String s2 = "      ";

				outPutTxt += "角钢桩锚计算" + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				sb.append("桩承受的力对桩体构成弯曲应力:" + System.getProperty("line.separator") + s2 + "着力点与地面间的距离: " + entity.H
						+ System.getProperty("line.separator") + s2 + "地面与最大弯矩处间的距离: " + entity.y
						+ System.getProperty("line.separator") + s2 + "作用于桩锚上的拉力: " + entity.P
						+ System.getProperty("line.separator") + s2 + "单根桩的抗弯截面系数: " + entity.W
						+ System.getProperty("line.separator") + s2 + "弯曲应力: " + entity.f1
						+ System.getProperty("line.separator") + s1);
				String type = "";
				if (entity.btn4 == 1.0)
					type = "坚土";
				else if (entity.btn4 == 2.0)
					type = "次坚土";
				else if (entity.btn4 == 3.0)
					type = "普通土";
				else
					type = "软土";
				sb.append("按土壤的允许的耐力计算单桩的容许承载力:" + System.getProperty("line.separator") + s2 + "土壤类型: " + type
						+ System.getProperty("line.separator") + s2 + "允许耐压力: " + entity.cT
						+ System.getProperty("line.separator") + s2 + "单桩地下部分的计算宽度: " + entity.b
						+ System.getProperty("line.separator") + s2 + "着力点与地面间的距离: " + entity.H2);
				if (entity.btn5 == 1.0) {
					sb.append(System.getProperty("line.separator") + s2 + "单桩打入地下的深度: " + entity.h
							+ System.getProperty("line.separator") + s2 + "承载力: " + entity.res1);
				} else {
					sb.append(System.getProperty("line.separator") + s2 + "单桩的容许承载力: " + entity.p
							+ System.getProperty("line.separator") + s2 + "单桩打入地下的深度: " + entity.res2);
				}
				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});
		button_2.setBounds(346, 13, 156, 27);
		panel_4.add(button_2);

		if (entity.btn5 == 1.0) {
			rdbtnNewRadioButton_4.setSelected(true);
			textField_8.setEnabled(true);
			textField_10.setEnabled(true);
			textField_9.setEnabled(false);
			textField_11.setEnabled(false);
		} else {
			radioButton_7.setSelected(true);
			textField_8.setEnabled(false);
			textField_10.setEnabled(false);
			textField_9.setEnabled(true);
			textField_11.setEnabled(true);
		}
	}
}
