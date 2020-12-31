package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.border.TitledBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：钢板地锚计算模型)
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.anchor
 * @author: 拉布拉多
 */

public class SteelAnchor extends FatherFrame {

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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	static {
		try {
			// 设置边框样式为强立体半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			// 引入apple的皮肤包
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("皮肤软件抛出异常");
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SteelAnchor frame = new SteelAnchor(new ctgu.Entity.anchorcal.SteelAnchor());
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

	public SteelAnchor(ctgu.Entity.anchorcal.SteelAnchor sAnchor) {
		setTitle("钢板地锚计算");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1058, 703);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "\u8BA1\u7B97\u6A21\u578B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(14, 13, 529, 339);
		contentPane.add(panel);
		panel.setLayout(null);

		/*
		 * 设置图片
		 */
//		Icon icon1 = new ImageIcon("./resources/anchor/anchor10.png");
		Icon icon1 = new ImageIcon("./resources/anchor/SteelAnchor.png");
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 320, Image.SCALE_DEFAULT);// 缩放图片大小
		((ImageIcon) icon1).setImage(image);

		JLabel label_4 = new JLabel(icon1, JLabel.CENTER);
		label_4.setBounds(14, 19, 499, 307);
		panel.add(label_4);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(14, 355, 529, 283);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblH = new JLabel("地锚的埋置深度 h :");
		lblH.setBounds(14, 76, 145, 18);
		panel_1.add(lblH);

		JLabel label = new JLabel("地锚的受力方向与地面夹角 α:");
		label.setBounds(10, 161, 255, 18);
		panel_1.add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 213, 46, 18);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("地锚的抗拔安全系数 K:");
		label_2.setBounds(10, 195, 237, 18);
		panel_1.add(label_2);

		textField = new JTextField(String.valueOf(sAnchor.h));
		textField.setColumns(10);
		textField.setBounds(268, 73, 136, 24);
		panel_1.add(textField);

		textField_1 = new JTextField(String.valueOf(sAnchor.A));
		textField_1.setColumns(10);
		textField_1.setBounds(268, 158, 136, 24);
		panel_1.add(textField_1);

		textField_2 = new JTextField(String.valueOf(sAnchor.K));
		textField_2.setColumns(10);
		textField_2.setBounds(268, 192, 136, 24);
		panel_1.add(textField_2);

		JLabel lblM = new JLabel("m");
		lblM.setBounds(418, 76, 64, 18);
		panel_1.add(lblM);

		JLabel label_6 = new JLabel("°");
		label_6.setBounds(418, 161, 47, 18);
		panel_1.add(label_6);

		JRadioButton radioButton = new JRadioButton("5T地锚");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton.setBounds(79, 235, 93, 27);
		panel_1.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("10T地锚");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_1.setBounds(193, 235, 93, 27);
		panel_1.add(radioButton_1);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);

		JLabel label_10 = new JLabel("选型:");
		label_10.setBounds(10, 229, 85, 18);
		panel_1.add(label_10);

		JLabel label_11 = new JLabel("计算模式 :");
		label_11.setBounds(10, 13, 85, 18);
		panel_1.add(label_11);

		JRadioButton radioButton_6 = new JRadioButton("桩打入地下深度");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				textField_7.setEnabled(true);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);

				sAnchor.btn = 1.0;
			}
		});
//		radioButton_6.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				textField.setEnabled(true);
//				textField_7.setEnabled(true);
//				textField_11.setEnabled(false);
//				textField_12.setEnabled(false);
//
//				sAnchor.btn = 1.0;
//			}
//		});
		radioButton_6.setBounds(49, 40, 157, 27);
		panel_1.add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton("桩的容许承载力");
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(false);
				textField_7.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);

				sAnchor.btn = 2.0;
			}
		});
//		radioButton_7.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				textField.setEnabled(false);
//				textField_7.setEnabled(false);
//				textField_11.setEnabled(true);
//				textField_12.setEnabled(true);
//
//				sAnchor.btn = 2.0;
//			}
//		});
		radioButton_7.setBounds(237, 40, 157, 27);
		panel_1.add(radioButton_7);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(radioButton_6);
		buttonGroup4.add(radioButton_7);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_4.setBounds(0, 0, 529, 283);
		panel_1.add(panel_4);

		JLabel label_12 = new JLabel("地锚的埋置深度 h :");
		label_12.setBounds(14, 76, 145, 18);
		panel_4.add(label_12);

		JLabel label_13 = new JLabel("地锚的受力方向与地面夹角 α:");
		label_13.setBounds(10, 161, 255, 18);
		panel_4.add(label_13);

		JLabel label_14 = new JLabel("");
		label_14.setBounds(10, 213, 46, 18);
		panel_4.add(label_14);

		JLabel label_15 = new JLabel("地锚的抗拔安全系数 K:");
		label_15.setBounds(10, 195, 237, 18);
		panel_4.add(label_15);

		textField_8 = new JTextField("null");
		textField_8.setColumns(10);
		textField_8.setBounds(268, 73, 136, 24);
		panel_4.add(textField_8);

		textField_9 = new JTextField("null");
		textField_9.setColumns(10);
		textField_9.setBounds(268, 158, 136, 24);
		panel_4.add(textField_9);

		textField_10 = new JTextField("null");
		textField_10.setColumns(10);
		textField_10.setBounds(268, 192, 136, 24);
		panel_4.add(textField_10);

		JLabel label_16 = new JLabel("m");
		label_16.setBounds(418, 76, 64, 18);
		panel_4.add(label_16);

		JLabel label_17 = new JLabel("°");
		label_17.setBounds(418, 161, 47, 18);
		panel_4.add(label_17);

		JRadioButton radioButton_8 = new JRadioButton("5T地锚");
		radioButton_8.setBounds(79, 235, 93, 27);
		panel_4.add(radioButton_8);

		JRadioButton radioButton_9 = new JRadioButton("10T地锚");
		radioButton_9.setBounds(193, 235, 93, 27);
		panel_4.add(radioButton_9);

		JLabel label_18 = new JLabel("选型:");
		label_18.setBounds(10, 229, 85, 18);
		panel_4.add(label_18);

		JLabel label_19 = new JLabel("计算模式 :");
		label_19.setBounds(10, 13, 85, 18);
		panel_4.add(label_19);

		JRadioButton radioButton_10 = new JRadioButton("桩打入地下深度");
		radioButton_10.setBounds(49, 40, 157, 27);
		panel_4.add(radioButton_10);

		JRadioButton radioButton_11 = new JRadioButton("桩的容许承载力");
		radioButton_11.setBounds(237, 40, 157, 27);
		panel_4.add(radioButton_11);

		JLabel lblF = new JLabel("地锚抗拔力 f:");
		lblF.setBounds(14, 113, 145, 18);
		panel_4.add(lblF);

		textField_11 = new JTextField(String.valueOf(sAnchor.f));
		textField_11.setColumns(10);
		textField_11.setBounds(268, 110, 136, 24);
		panel_4.add(textField_11);

		JLabel lblN = new JLabel("kN");
		lblN.setBounds(418, 113, 64, 18);
		panel_4.add(lblN);
		if (sAnchor.btn1 == 1.0) {
			radioButton.setSelected(true);
		} else if (sAnchor.btn1 == 2.0) {
			radioButton_1.setSelected(true);
		} else {
			sAnchor.btn1 = 1.0;
			radioButton.setSelected(true);
		}

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBounds(591, 13, 394, 329);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblYy = new JLabel("<html>土壤密度 y<sub>0</sub>:</html>");
		lblYy.setBounds(14, 216, 148, 33);
		panel_2.add(lblYy);

		JLabel label_3 = new JLabel("<html>土壤的计算抗拔角 φ<sub>1</sub>:</html>");
		label_3.setBounds(14, 283, 196, 33);
		panel_2.add(label_3);

		textField_5 = new JTextField(String.valueOf(sAnchor.y0));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(178, 219, 136, 24);
		panel_2.add(textField_5);

		textField_6 = new JTextField(String.valueOf(sAnchor.f1));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(178, 286, 136, 24);
		panel_2.add(textField_6);

		JLabel lblKgm = new JLabel("<html>kg/m<sup>3</sup></html>");
		lblKgm.setBounds(319, 213, 72, 27);
		panel_2.add(lblKgm);

		JLabel label_8 = new JLabel("°");
		label_8.setBounds(319, 289, 47, 18);
		panel_2.add(label_8);

//		ButtonGroup buttonGroup = new ButtonGroup();

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("特坚土");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_5.setText("1900");
				textField_6.setText("30");

			}
		});
		rdbtnNewRadioButton_1.setBounds(55, 122, 101, 27);
		panel_2.add(rdbtnNewRadioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("坚土");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("1800");
				textField_6.setText("25");
			}
		});
//		radioButton_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField_5.setText("1800");
//				textField_6.setText("25");
//			}
//		});
		radioButton_2.setBounds(154, 122, 77, 27);
		panel_2.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("次坚土");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("1700");
				textField_6.setText("20");
			}
		});
//		radioButton_3.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField_5.setText("1700");
//				textField_6.setText("20");
//			}
//		});
		radioButton_3.setBounds(237, 124, 114, 27);
		panel_2.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("普通土");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("1600");
				textField_6.setText("15");
			}
		});
//		radioButton_4.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField_5.setText("1600");
//				textField_6.setText("15");
//			}
//		});
		radioButton_4.setBounds(74, 154, 106, 27);
		panel_2.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("软土");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("1500");
				textField_6.setText("10");
			}
		});
//		radioButton_5.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				textField_5.setText("1500");
//				textField_6.setText("10");
//			}
//		});
		radioButton_5.setBounds(178, 154, 87, 27);
		panel_2.add(radioButton_5);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_1);
		buttonGroup3.add(radioButton_2);
		buttonGroup3.add(radioButton_3);
		buttonGroup3.add(radioButton_4);
		buttonGroup3.add(radioButton_5);

		if (sAnchor.btn2 == 1.0) {
			rdbtnNewRadioButton_1.setSelected(true);
		} else if (sAnchor.btn2 == 2.0) {
			radioButton_2.setSelected(true);
		} else if (sAnchor.btn2 == 3.0) {
			radioButton_3.setSelected(true);
		} else if (sAnchor.btn2 == 4.0) {
			radioButton_4.setSelected(true);
		} else if (sAnchor.btn2 == 5.0) {
			radioButton_5.setSelected(true);
		} else {
			sAnchor.btn2 = 1.0;
			rdbtnNewRadioButton_1.setSelected(true);
		}
		JLabel label_9 = new JLabel("土壤类型：");
		label_9.setBounds(14, 82, 114, 18);
		panel_2.add(label_9);

		textField_3 = new JTextField(String.valueOf(sAnchor.a));
		textField_3.setBounds(178, 25, 136, 24);
		panel_2.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblA = new JLabel("钢板地锚长度 a :");
		lblA.setBounds(14, 28, 166, 18);
		panel_2.add(lblA);

		JLabel lblCm = new JLabel("cm");
		lblCm.setBounds(319, 28, 64, 18);
		panel_2.add(lblCm);

		JLabel lblB = new JLabel("钢板地锚的宽度 b :");
		lblB.setBounds(14, 61, 156, 18);
		panel_2.add(lblB);

		textField_4 = new JTextField(String.valueOf(sAnchor.b));
		textField_4.setBounds(178, 58, 136, 24);
		panel_2.add(textField_4);
		textField_4.setColumns(10);

		JLabel label_7 = new JLabel("cm");
		label_7.setBounds(319, 59, 64, 18);
		panel_2.add(label_7);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Config.ResColor);
		panel_3.setBorder(
				new TitledBorder(null, "\u8BA1\u7B97\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(591, 355, 394, 283);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("地锚抗拔力:");
		lblNewLabel.setBounds(14, 27, 93, 18);
		panel_3.add(lblNewLabel);

		JLabel label_5 = new JLabel("验算结果：");
		label_5.setBounds(14, 119, 93, 18);
		panel_3.add(label_5);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("true");
		rdbtnNewRadioButton.setBackground(Config.ResColor);
		rdbtnNewRadioButton.setBounds(57, 153, 83, 27);
		panel_3.add(rdbtnNewRadioButton);

		JRadioButton rdbtnFalse = new JRadioButton("false");
		rdbtnFalse.setBackground(Config.ResColor);
		rdbtnFalse.setBounds(170, 153, 83, 27);
		panel_3.add(rdbtnFalse);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton);
		buttonGroup2.add(rdbtnFalse);

		if (sAnchor.checkValue == 1.0) {
			rdbtnNewRadioButton.setSelected(true);
		} else if (sAnchor.checkValue == 0.0) {
			rdbtnFalse.setSelected(true);
		} else {
			sAnchor.checkValue = 0.0;
			rdbtnFalse.setSelected(true);
		}

		textField_7 = new JTextField(String.valueOf(sAnchor.f));
		textField_7.setBackground(new Color(253, 253, 241));
		textField_7.setColumns(10);
		textField_7.setBounds(170, 24, 136, 24);
		panel_3.add(textField_7);

		JButton button = new JButton("计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check;
				if (sAnchor.btn == 1.0) {
					check = Tool.checkTextFiled(true, textField, textField_1, textField_2, textField_3, textField_4,
							textField_5, textField_6);
				} else {
					check = Tool.checkTextFiled(true, textField_11, textField_1, textField_2, textField_3, textField_4,
							textField_5, textField_6);
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

				sAnchor.A = Double.valueOf(textField_1.getText().trim());
				sAnchor.K = Double.valueOf(textField_2.getText().trim());
				sAnchor.a = Double.valueOf(textField_3.getText().trim());
				sAnchor.b = Double.valueOf(textField_4.getText().trim());
				sAnchor.y0 = Double.valueOf(textField_5.getText().trim());
				sAnchor.f1 = Double.valueOf(textField_6.getText().trim());

				if (sAnchor.btn == 1.0) {
					sAnchor.h = Double.valueOf(textField.getText().trim());
					sAnchor.getResF();
					textField_7.setText(String.valueOf(sAnchor.res1));
				} else {
					sAnchor.f = Double.valueOf(textField_11.getText().trim());
					sAnchor.getResH();
					textField_12.setText(String.valueOf(sAnchor.res2));
				}

			}
		});
		button.setBounds(46, 189, 113, 27);
		panel_3.add(button);

		JButton button_1 = new JButton("保存到历史记录");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(sAnchor);

			}
		});
		button_1.setBounds(204, 189, 180, 27);
		panel_3.add(button_1);

		JButton button_2 = new JButton("下载到桌面");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String outPutTxt = "";
				String s1 = "  ";
				String s2 = "      ";
				outPutTxt += "钢板地锚计算: " + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				if (sAnchor.btn == 1.0) {
					sb.append("地锚的埋置深度: " + sAnchor.h);
				} else
					sb.append("地锚抗拔力: " + sAnchor.f);
				String type = "";
				if (sAnchor.btn2 == 1.0)
					type = "特坚土";
				else if (sAnchor.btn2 == 2.0)
					type = "坚土";
				else if (sAnchor.btn2 == 3.0)
					type = "次坚土";
				else if (sAnchor.btn2 == 4.0)
					type = "普通坚土";
				else if (sAnchor.btn2 == 5.0)
					type = "软土";

				sb.append(System.getProperty("line.separator") + s2 + "地锚与受力方向与地面夹角: " + sAnchor.A + " °"
						+ System.getProperty("line.separator") + s2 + "地锚的抗拔安全系数: " + sAnchor.K
						+ System.getProperty("line.separator") + s2 + "钢板地锚的长度: " + sAnchor.a + " cm"
						+ System.getProperty("line.separator") + s2 + "钢板地锚的宽度: " + sAnchor.b + " cm"
						+ System.getProperty("line.separator") + s2 + "土壤类型: " + type
						+ System.getProperty("line.separator") + s2 + "土壤密度: " + sAnchor.y0 + " kg/m³"
						+ System.getProperty("line.separator") + s2 + "土壤的计算抗拔角: " + sAnchor.f1 + " °");
				if (sAnchor.btn == 1.0) {
					sb.append(System.getProperty("line.separator") + s2 + "地锚抗拔力: " + sAnchor.res1 + " N");
				} else {
					sb.append(System.getProperty("line.separator") + s2 + "桩打入地下深度: " + sAnchor.res2 + "m");
				}
				sb.append(System.getProperty("line.separator") + s2 + "验算结果: "
						+ (sAnchor.checkValue == 1.0 ? "正确" : "错误"));
				
				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});
		button_2.setBounds(204, 243, 180, 27);
		panel_3.add(button_2);

		JLabel lblH_2 = new JLabel("桩打入地下深度 h:");
		lblH_2.setBounds(14, 61, 164, 18);
		panel_3.add(lblH_2);

		textField_12 = new JTextField(String.valueOf(sAnchor.f));
		textField_12.setColumns(10);
		textField_12.setBackground(new Color(253, 253, 241));
		textField_12.setBounds(170, 58, 136, 24);
		panel_3.add(textField_12);

		JLabel label_21 = new JLabel("N");
		label_21.setBounds(320, 27, 64, 18);
		panel_3.add(label_21);

		JLabel label_22 = new JLabel("m");
		label_22.setBounds(320, 61, 64, 18);
		panel_3.add(label_22);

		if (sAnchor.btn == 1.0) {
			radioButton_6.setSelected(true);

			textField.setEnabled(true);
			textField_7.setEnabled(true);
			textField_11.setEnabled(false);
			textField_12.setEnabled(false);
		} else {
			radioButton_7.setSelected(true);

			textField.setEnabled(false);
			textField_7.setEnabled(false);
			textField_11.setEnabled(true);
			textField_12.setEnabled(true);
		}
	}
}
