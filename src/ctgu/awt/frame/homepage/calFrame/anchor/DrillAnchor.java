package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.Entity.anchorcal.DrillItem;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：地钻
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.anchor
 * @author: 拉布拉多
 */

public class DrillAnchor extends FatherFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtC;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtK;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private String outPutTxt = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrillAnchor frame = new DrillAnchor(new DrillItem());
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
	public DrillAnchor(DrillItem item) {
		setTitle("地钻");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1296, 840);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel(Tool.getIcon("./resources/anchor/Dill1.png", -1, 500));
		label.setBounds(14, 13, 222, 517);
		contentPane.add(label);

		JLabel label_1 = new JLabel(Tool.getIcon("./resources/anchor/Drill2.png", -1, 370));
		label_1.setBounds(262, 13, 421, 474);
		contentPane.add(label_1);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(24, 553, 670, 197);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label_2 = new JLabel("计算选型：");
		label_2.setBounds(14, 13, 110, 18);
		panel.add(label_2);

		JRadioButton radioButton = new JRadioButton("计算地钻的竖直抗拔极限承载力");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item.btn1 = 1.0;
				textField_10.setEnabled(true);
				textField_11.setEnabled(false);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
			}
		});
//		radioButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				item.btn1 = 1.0;
//				textField_10.setEnabled(true);
//				textField_11.setEnabled(false);
//				textField_6.setEnabled(true);
//				textField_7.setEnabled(false);
//			}
//		});
		radioButton.setBounds(104, 9, 283, 27);
		panel.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("计算地钻的埋深");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item.btn1 = 2.0;
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_6.setEnabled(false);
				textField_7.setEnabled(true);
			}
		});
//		radioButton_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				item.btn1 = 2.0;
//				textField_10.setEnabled(false);
//				textField_11.setEnabled(true);
//				textField_6.setEnabled(false);
//				textField_7.setEnabled(true);
//			}
//		});
		radioButton_1.setBounds(393, 9, 184, 27);
		panel.add(radioButton_1);

		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton);
		buttonGroup1.add(radioButton_1);
//		if (item.btn1 == 1.0) {//移到最下面
//			radioButton.setSelected(true);
//			textField_10.setEnabled(true);
//			textField_11.setEnabled(false);
//			textField_6.setEnabled(true);
//			textField_7.setEnabled(false);
//		} else {
//			radioButton_1.setSelected(true);
//			textField_10.setEnabled(false);
//			textField_11.setEnabled(true);
//			textField_6.setEnabled(false);
//			textField_7.setEnabled(true);
//		}
		JLabel label_3 = new JLabel("土壤选型：");
		label_3.setBounds(14, 134, 110, 18);
		panel.add(label_3);

		JRadioButton radioButton_2 = new JRadioButton("碎石，粗中砂");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item.btn2 = 1.0;
			}
		});
//		radioButton_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				item.btn2 = 1.0;
//			}
//		});
		radioButton_2.setBounds(10, 161, 157, 27);
		panel.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("细，粉砂");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item.btn2 = 2.0;
			}
		});
//		radioButton_3.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				item.btn2 = 2.0;
//			}
//		});
		radioButton_3.setBounds(173, 161, 138, 27);
		panel.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("坚硬，可塑");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item.btn2 = 3.0;
			}
		});
//		radioButton_4.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				item.btn2 = 3.0;
//			}
//		});
		radioButton_4.setBounds(315, 161, 140, 27);
		panel.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("可塑~软塑的粘性土");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item.btn2 = 4.0;
			}
		});
//		radioButton_5.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				item.btn2 = 4.0;
//			}
//		});
		radioButton_5.setBounds(461, 161, 199, 27);
		panel.add(radioButton_5);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton_2);
		buttonGroup2.add(radioButton_3);
		buttonGroup2.add(radioButton_4);
		buttonGroup2.add(radioButton_5);

		if (item.btn2 == 1.0) {
			radioButton_2.setSelected(true);
		} else if (item.btn2 == 2.0) {
			radioButton_3.setSelected(true);
		} else if (item.btn2 == 3.0) {
			radioButton_4.setSelected(true);
		} else if (item.btn2 == 4.0) {
			radioButton_5.setSelected(true);
		}

		JLabel lblHt_1 = new JLabel("<html>地钻的埋深 h<sub>t</sub> :</html>");
		lblHt_1.setBounds(14, 55, 201, 25);
		panel.add(lblHt_1);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(333, 57, 97, 24);
		panel.add(textField_10);

		JLabel lblM_2 = new JLabel("m");
		lblM_2.setBounds(458, 56, 72, 18);
		panel.add(lblM_2);

		JLabel lblFt_1 = new JLabel("<html>地钻的竖直抗拔极限承载力 F<sub>T</sub> :</html>");
		lblFt_1.setBounds(14, 94, 283, 25);
		panel.add(lblFt_1);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(333, 96, 97, 24);
		panel.add(textField_11);

		JLabel lblKn_1 = new JLabel("kN");
		lblKn_1.setBounds(458, 95, 72, 18);
		panel.add(lblKn_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(723, 13, 511, 739);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblC = new JLabel("土体饱和状态下的凝聚力 c:");
		lblC.setBounds(14, 113, 239, 18);
		panel_1.add(lblC);

		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(300, 113, 97, 24);
		panel_1.add(txtC);

		JLabel lblC_1 = new JLabel("kN/m");
		lblC_1.setBounds(425, 116, 72, 18);
		panel_1.add(lblC_1);

		JLabel label_4 = new JLabel("土的容重 γ:");
		label_4.setBounds(14, 150, 239, 18);
		panel_1.add(label_4);

		JLabel lblknm = new JLabel("<html>kN/m<sup>3</sup></html>");
		lblknm.setBounds(425, 144, 72, 24);
		panel_1.add(lblknm);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(300, 144, 97, 24);
		panel_1.add(textField_2);

		JLabel lblGt = new JLabel("<html>地钻的自重力 G<sub>t</sub> :</html>");
		lblGt.setBounds(14, 181, 201, 25);
		panel_1.add(lblGt);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(300, 182, 97, 24);
		panel_1.add(textField_3);

		JLabel lblKn = new JLabel("kN");
		lblKn.setBounds(425, 181, 72, 18);
		panel_1.add(lblKn);

		JRadioButton rdbtnt = new JRadioButton("5t(0.3m)");
		rdbtnt.setBounds(73, 215, 157, 27);
		panel_1.add(rdbtnt);

		JRadioButton rdbtntm = new JRadioButton("10t(0.31m)");
		rdbtntm.setBounds(236, 215, 138, 27);
		panel_1.add(rdbtntm);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnt);
		buttonGroup3.add(rdbtntm);

		JLabel lblA = new JLabel("桩周土与桩之间极限摩擦阻力的上拔折减系数 A:");
		lblA.setBounds(14, 255, 371, 18);
		panel_1.add(lblA);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(354, 251, 97, 24);
		panel_1.add(textField_4);

		JLabel lblD_2 = new JLabel("拉线与地面的夹角 θ:");
		lblD_2.setBounds(14, 323, 239, 18);
		panel_1.add(lblD_2);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 323, 97, 24);
		panel_1.add(textField_5);

		JLabel label_6 = new JLabel("°");
		label_6.setBounds(425, 326, 72, 18);
		panel_1.add(label_6);

		JLabel lblK = new JLabel("<html>分项系数 K<sub>1</sub>:</html>");
		lblK.setBounds(14, 360, 239, 24);
		panel_1.add(lblK);

		txtK = new JTextField();
		txtK.setColumns(10);
		txtK.setBounds(300, 360, 97, 24);
		panel_1.add(txtK);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(14, 419, 483, 267);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblFt = new JLabel("<html>地钻的竖直抗拔极限承载力 F<sub>T</sub>:</html>");
		lblFt.setBounds(14, 29, 259, 24);
		panel_2.add(lblFt);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(287, 28, 97, 24);
		panel_2.add(textField_6);

		JLabel label_7 = new JLabel("kN");
		label_7.setBounds(398, 31, 72, 18);
		panel_2.add(label_7);

		JLabel lblHt = new JLabel("<html>地钻的埋深 h<sub>t</sub>:</html>");
		lblHt.setBounds(14, 75, 259, 24);
		panel_2.add(lblHt);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(287, 74, 97, 24);
		panel_2.add(textField_7);

		JLabel lblM_1 = new JLabel("m");
		lblM_1.setBounds(398, 77, 72, 18);
		panel_2.add(lblM_1);

		JLabel lblFu = new JLabel("<html>地钻锚斜向受拉承载力 F<sub>u</sub>:</html>");
		lblFu.setBounds(14, 125, 259, 24);
		panel_2.add(lblFu);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(287, 124, 97, 24);
		panel_2.add(textField_8);

		JLabel label_5 = new JLabel("kN");
		label_5.setBounds(398, 127, 72, 18);
		panel_2.add(label_5);

		JLabel lblFmax = new JLabel("<html>拉线受拉最大允许值 F<sub>max</sub>:</html>");
		lblFmax.setBounds(14, 172, 259, 24);
		panel_2.add(lblFmax);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(287, 171, 97, 24);
		panel_2.add(textField_9);

		JLabel label_9 = new JLabel("kN");
		label_9.setBounds(398, 174, 72, 18);
		panel_2.add(label_9);

		JButton button = new JButton("计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int check;
				if (item.btn1 == 1.0) {
					check = Tool.checkTextFiled(true, textField, textField_1, textField_2, textField_3, textField_4,
							textField_5, txtC, txtK, textField_10);
				} else {
					check = Tool.checkTextFiled(true, textField, textField_1, textField_2, textField_3, textField_4,
							textField_5, txtC, txtK, textField_11);
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

				item.D = Double.valueOf(textField.getText().trim());
				item.hc = Double.valueOf(textField_1.getText().trim());
				item.c = Double.valueOf(txtC.getText().trim());
				item.Y = Double.valueOf(textField_2.getText().trim());
				item.Gt = Double.valueOf(textField_3.getText().trim());
				item.A = Double.valueOf(textField_4.getText().trim());
				item.o1 = Double.valueOf(textField_5.getText().trim());
				item.K1 = Double.valueOf(txtK.getText().trim());

				if (item.btn1 == 1.0) {
					item.ht = Double.valueOf(textField_10.getText().trim());
					item.calOne();
					textField_6.setText(String.valueOf(item.res1));
					textField_8.setText(String.valueOf(item.Fu));
					textField_9.setText(String.valueOf(item.Fmax));
				} else {
					item.FT = Double.valueOf(textField_11.getText().trim());
					item.calTwo();
					textField_7.setText(String.valueOf(item.res2));
					textField_8.setText(String.valueOf(item.Fu));
					textField_9.setText(String.valueOf(item.Fmax));
				}

			}
		});
		button.setBounds(14, 216, 113, 27);
		panel_2.add(button);

		JLabel lblHc = new JLabel("<html>地钻的上拔临界深度 h<sub>c</sub> :</html>");
		lblHc.setBounds(14, 60, 201, 25);
		panel_1.add(lblHc);

		textField_1 = new JTextField();
		textField_1.setBounds(229, 63, 97, 24);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblD = new JLabel("地钻锚片的直径 D：");
		lblD.setBounds(14, 29, 175, 18);
		panel_1.add(lblD);

		textField = new JTextField();
		textField.setBounds(229, 26, 97, 24);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblM = new JLabel("m");
		lblM.setBounds(354, 29, 72, 18);
		panel_1.add(lblM);

		JLabel lblD_1 = new JLabel("D");
		lblD_1.setBounds(354, 62, 72, 18);
		panel_1.add(lblD_1);

		JLabel lblD_3 = new JLabel("取值0.6-0.8");
		lblD_3.setForeground(Color.RED);
		lblD_3.setBounds(355, 286, 142, 18);
		panel_1.add(lblD_3);

		JButton button_1 = new JButton("保存到历史纪录");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(item);
			}
		});
		button_1.setBounds(40, 699, 190, 27);
		panel_1.add(button_1);

		JButton button_2 = new JButton("下载到桌面");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = "  ";
				String s2 = "      ";
				outPutTxt += "地钻计算: " + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				String type = "";
				if (item.btn2 == 1.0)
					type = "碎石，粗中沙";
				else if (item.btn2 == 2.0)
					type = "细，粉砂";
				else if (item.btn2 == 3.0)
					type = "坚硬，可塑";
				else if (item.btn2 == 4.0)
					type = "可塑~软塑的粘性土";
				if (item.btn1 == 1.0)
					sb.append("地钻的埋深: " + item.ht);
				else
					sb.append("地钻的竖直抗拔极限承载力: " + item.FT);
				sb.append(System.getProperty("line.separator") + s2 + "土壤类型: " + type
						+ System.getProperty("line.separator") + s2 + "地钻锚片的直径: " + item.D + "m"
						+ System.getProperty("line.separator") + s2 + "地钻的上拔临界深度: " + item.hc
						+ System.getProperty("line.separator") + s2 + "土地饱和状态下的凝聚力: " + item.c
						+ System.getProperty("line.separator") + s2 + "土的容重: " + item.Y
						+ System.getProperty("line.separator") + s2 + "地钻的自重力: " + item.Gt
						+ System.getProperty("line.separator") + s2 + "桩周土与桩之间极限摩擦阻力的上拔折减系数: " + item.A
						+ System.getProperty("line.separator") + s2 + "拉线与地面的夹角: " + item.o1
						+ System.getProperty("line.separator") + s2 + "分项系数: " + item.K1);
				if (item.btn1 == 1.0)
					sb.append(System.getProperty("line.separator") + s2 + "地钻的竖直抗拔极限承载力: " + item.res1);
				else
					sb.append(System.getProperty("line.separator") + s2 + "地钻的埋深: " + item.res2);
				sb.append(System.getProperty("line.separator") + s2 + "地钻锚斜向受拉承载力: " + item.Fu
						+ System.getProperty("line.separator") + s2 + "拉线受拉最大允许值: " + item.Fmax);

				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});
		button_2.setBounds(284, 699, 175, 27);
		panel_1.add(button_2);
		if (item.btn1 == 1.0) {
			radioButton.setSelected(true);
			textField_10.setEnabled(true);
			textField_11.setEnabled(false);
			textField_6.setEnabled(true);
			textField_7.setEnabled(false);
		} else {
			radioButton_1.setSelected(true);
			textField_10.setEnabled(false);
			textField_11.setEnabled(true);
			textField_6.setEnabled(false);
			textField_7.setEnabled(true);
		}
	}
}
