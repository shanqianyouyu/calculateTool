package ctgu.awt.frame.homepage.calFrame.bol;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import ctgu.Entity.SquareDerrickManCal;
import ctgu.Entity.boltCal.HighStrength;
import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog2;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog3;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JPanel panel_6;
	private JButton button_3;
	private JButton button_5;
	// 方框内的所有值
	private HighStrength highStrength = null;
	private String outPutTxt = "";
	private JLabel lbld;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JLabel lblNewLabel;
	private JLabel lblMm;
	private JLabel label_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton rdbtnQ;
	private JRadioButton rdbtnQ_1;
	private JLabel lblkn;
	private JLabel lblmm;
	private JPanel panel_1;
	private JLabel label_4;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JLabel label_5;
	private JLabel label_6;
	private JButton button_4;
	private JPanel panel_2;
	private JLabel label_7;
	private JTextField textField;
	private JLabel label_8;
	private JTextField textField_1;
	private JLabel lblt_1;
	private JTextField textField_4;
	private JLabel label_13;
	private JTextField textField_6;
	private JLabel lblN_1;
	private JTextField textField_7;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_7;
	private JRadioButton radioButton_8;
	private JLabel label_21;
	private JLabel lblkn_1;
	private JLabel label_25;
	private JLabel label_26;
	private JRadioButton radioButton_13;
	private JRadioButton radioButton_14;
	private JPanel panel_3;
	private JLabel label;
	private JTextField textField_2;
	private JLabel label_2;
	private JRadioButton radioButton_9;
	private JRadioButton radioButton_10;
	private JButton button;
	private JPanel panel_4;
	private JLabel label_3;
	private JTextField textField_3;
	private JLabel label_9;
	private JTextField textField_5;
	private JLabel lblt;
	private JTextField textField_8;
	private JLabel label_12;
	private JTextField textField_10;
	private JLabel lblN;
	private JTextField textField_14;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_23;
	private JRadioButton radioButton_12;
	private JRadioButton radioButton_15;
	private JRadioButton radioButton_16;
	private JRadioButton radioButton_17;
	private JLabel label_24;
	private JLabel lblKn;
	private JLabel label_28;
	private JLabel label_29;
	private JPanel panel_5;
	private JLabel label_30;
	private JTextField textField_15;
	private JLabel label_31;
	private JRadioButton radioButton_18;
	private JRadioButton radioButton_19;
	private JButton button_1;

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
					BolFrame frame = new BolFrame(new HighStrength());
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
	public BolFrame(HighStrength h) {
		highStrength = h;
		setTitle("螺栓计算");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1494, 914);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 取较小值
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder("普通螺栓受剪力"));
		panel.setBounds(14, 13, 463, 714);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNv = new JLabel("<html>受剪面数目 n<sub>v</sub>:</html>");
		lblNv.setBounds(14, 340, 170, 31);
		panel.add(lblNv);

		txtNv = new JTextField();
		txtNv.setText(highStrength.nv1 == null ? "" : String.valueOf(highStrength.nv1));
		txtNv.setBounds(214, 342, 160, 24);
		panel.add(txtNv);
		txtNv.setColumns(10);

		JLabel lblDasdasd = new JLabel("螺栓杆直径 d:");
		lblDasdasd.setBounds(14, 424, 101, 18);
		panel.add(lblDasdasd);

		txtD = new JTextField();
		txtD.setText(highStrength.t1 == null ? "" : String.valueOf(highStrength.t1));
		txtD.setColumns(10);
		txtD.setBounds(214, 384, 160, 24);
		panel.add(txtD);

		lbld = new JLabel("<html>构件厚度 ∑t :</html>");
		lbld.setBounds(14, 384, 121, 18);
		panel.add(lbld);

		textField_9 = new JTextField();
		textField_9.setText(highStrength.d1 == null ? "" : String.valueOf(highStrength.d1));
		textField_9.setColumns(10);
		textField_9.setBounds(214, 421, 160, 24);
		panel.add(textField_9);

		JLabel lblV = new JLabel("承受剪力 V:");
		lblV.setBounds(14, 462, 101, 18);
		panel.add(lblV);

		textField_11 = new JTextField();
		textField_11.setText(highStrength.V1 == null ? "" : String.valueOf(highStrength.V1));
		textField_11.setColumns(10);
		textField_11.setBounds(214, 459, 160, 24);
		panel.add(textField_11);

		JLabel lblAv = new JLabel("<html>净截面面积 A<sub>n</sub>:</html>");
		lblAv.setBounds(14, 498, 170, 31);
		panel.add(lblAv);

		textField_12 = new JTextField();
		textField_12.setText(highStrength.An1 == null ? "" : String.valueOf(highStrength.An1));
		textField_12.setColumns(10);
		textField_12.setBounds(214, 500, 160, 24);
		panel.add(textField_12);

		lblNewLabel = new JLabel(Tool.getIcon("./resources/bol/bol1.png", -1, 181));
		lblNewLabel.setBounds(14, 24, 412, 181);
		panel.add(lblNewLabel);

		lblMm = new JLabel("mm");
		lblMm.setBounds(388, 387, 72, 18);
		panel.add(lblMm);

		label_1 = new JLabel("mm");
		label_1.setBounds(387, 429, 72, 18);
		panel.add(label_1);

		rdbtnNewRadioButton = new JRadioButton("4.6级、4.8级");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn11 = 1.0;
			}
		});
//		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				h.btn11 = 1.0;
//			}
//		});
		rdbtnNewRadioButton.setBounds(57, 239, 145, 27);
		panel.add(rdbtnNewRadioButton);

		radioButton = new JRadioButton("5.6级");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn11 = 2.0;
				rdbtnQ.setSelected(true);
			}
		});
//		radioButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				h.btn11 = 2.0;
//				rdbtnQ.setSelected(true);
//			}
//		});
		radioButton.setBounds(209, 239, 83, 27);
		panel.add(radioButton);

		radioButton_1 = new JRadioButton("8.8级");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn11 = 3.0;
				rdbtnQ_1.setSelected(true);
			}
		});
//		radioButton_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				h.btn11 = 3.0;
//			}
//		});
		radioButton_1.setBounds(298, 239, 83, 27);
		panel.add(radioButton_1);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);

		if (h.btn11 == 1.0) {
			rdbtnNewRadioButton.setSelected(true);
		} else if (h.btn11 == 2.0) {
			radioButton.setSelected(true);

		} else if (h.btn11 == 3.0) {
			radioButton_1.setSelected(true);
		} else {
			rdbtnNewRadioButton.setSelected(true);
			h.btn11 = 1.0;
		}

		rdbtnQ = new JRadioButton("Q235钢");
		rdbtnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn12 = 1.0;
				if(h.btn11 == 3.0) {
					rdbtnQ_1.setSelected(true);
					h.btn12 = 2.0;
				}
			}
		});
//		rdbtnQ.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			
//			}
//		});
		rdbtnQ.setBounds(57, 291, 145, 27);
		panel.add(rdbtnQ);

		rdbtnQ_1 = new JRadioButton("Q345钢");
		rdbtnQ_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn12 = 2.0;
				if(h.btn11 == 2.0) {
					rdbtnQ.setSelected(true);
					h.btn12 = 1.0;
				}
			}
		});
//		rdbtnQ_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				h.btn12 = 2.0;
//			}
//		});
		rdbtnQ_1.setBounds(206, 291, 145, 27);
		panel.add(rdbtnQ_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnQ);
		buttonGroup2.add(rdbtnQ_1);

		if (h.btn12 == 1.0) {
			rdbtnQ.setSelected(true);
		} else if (h.btn12 == 2.0) {
			rdbtnQ_1.setSelected(true);

		} else {
			rdbtnQ.setSelected(true);
			h.btn12 = 1.0;
		}

		lblkn = new JLabel("<html>kN</html>");
		lblkn.setBounds(382, 458, 72, 22);
		panel.add(lblkn);

		lblmm = new JLabel("<html>mm<sup>2</sup></html>");
		lblmm.setBounds(382, 503, 72, 22);
		panel.add(lblmm);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Config.ResColor);
		panel_1.setBounds(14, 542, 406, 125);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblLuoV = new JLabel("螺栓数 n:");
		lblLuoV.setBounds(14, 16, 101, 18);
		panel_1.add(lblLuoV);

		textField_13 = new JTextField();
		textField_13.setText(highStrength.n1 == null ? "" : String.valueOf(highStrength.n1));
		textField_13.setBounds(214, 13, 160, 24);
		panel_1.add(textField_13);
		textField_13.setColumns(10);

		label_4 = new JLabel("验证 :");
		label_4.setBounds(14, 51, 72, 18);
		panel_1.add(label_4);

		radioButton_2 = new JRadioButton("通过");
		radioButton_2.setBounds(67, 47, 109, 27);
		panel_1.add(radioButton_2);

		radioButton_3 = new JRadioButton("未通过");
		radioButton_3.setBounds(182, 47, 109, 27);
		panel_1.add(radioButton_3);
		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(radioButton_2);
		buttonGroup5.add(radioButton_3);

		if (h.btn13 == 1.0) {
			radioButton_2.setSelected(true);
		} else if (h.btn13 == 2.0) {
			radioButton_3.setSelected(true);
		} else {
			radioButton_2.setSelected(true);
			h.btn13 = 1.0;
		}

		button_4 = new JButton("计算");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, txtNv, txtD, textField_9, textField_11, textField_12);
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

				h.nv1 = Double.valueOf(txtNv.getText().trim());
				h.t1 = Double.valueOf(txtD.getText().trim());
				h.d1 = Double.valueOf(textField_9.getText().trim());
				h.V1 = Double.valueOf(textField_11.getText().trim());
				h.An1 = Double.valueOf(textField_12.getText().trim());
				h.calPartOne();
				textField_13.setText(String.valueOf(h.n1));
				if(h.btn13 == 1.0) 
					radioButton_2.setSelected(true);
				else 
					radioButton_3.setSelected(true);

			}
		});
		button_4.setBounds(143, 83, 113, 27);
		panel_1.add(button_4);

		label_5 = new JLabel("螺栓等级 :");
		label_5.setBounds(14, 218, 145, 18);
		panel.add(label_5);

		label_6 = new JLabel("构件材料 :");
		label_6.setBounds(14, 275, 145, 18);
		panel.add(label_6);

		panel_6 = new JPanel();
		panel_6.setBounds(14, 756, 1439, 59);
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		setVisible(true);

		button_3 = new JButton("保存到历史记录");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(highStrength);
			}
		});
		button_3.setBounds(316, 13, 197, 27);
		panel_6.add(button_3);

		button_5 = new JButton("下载到桌面");
		// 打印功能
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String outPutTxt = "";
				String s1 = "  ";
				String s2 = "      ";
				outPutTxt += "螺栓计算" + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				sb.append("普通螺栓受剪力:" + System.getProperty("line.separator") + s2 + "螺栓等级: " + (h.btn11 == 1.0?"4.6级,4.8级":(h.btn11 == 2.0?"5.6级":"8.8级"))
						+ System.getProperty("line.separator") + s2 + "构件材料: " + (h.btn12==1.0?"Q235钢":"Q345钢")
						+ System.getProperty("line.separator") + s2 + "受剪面数目: " +h.nv1
						+ System.getProperty("line.separator") + s2 + "构件厚度: " + h.t1+ " mm"
						+ System.getProperty("line.separator") + s2 + "螺栓杆直径: " + h.d1+ " mm"
						+ System.getProperty("line.separator") + s2 + "承受剪力: " + h.V1+ " kN"
						+ System.getProperty("line.separator") + s2 + "净截面积: " + h.An1+ " mm²"
						+ System.getProperty("line.separator") + s2 + "螺栓数: " + h.n1
						+ System.getProperty("line.separator") + s2 + "是否通过: " + (h.btn13 == 1.0?"通过":"未通过")
						+ System.getProperty("line.separator") + s1);
				
				sb.append("普通螺栓抗拉抗剪:" + System.getProperty("line.separator") + s2 + "螺栓等级: " + (h.btn21 == 1.0?"4.6级,4.8级":(h.btn21 == 2.0?"5.6级":"8.8级"))
						+ System.getProperty("line.separator") + s2 + "构件材料: " + (h.btn22==1.0?"Q235钢":"Q345钢")
						+ System.getProperty("line.separator") + s2 + "受剪面数目: " +h.nv2
						+ System.getProperty("line.separator") + s2 + "在不同受力方向中一个受力方向承压构件总厚度的较小值: " + h.t2+ " mm"
						+ System.getProperty("line.separator") + s2 + "螺栓杆直径: " + h.d2+ " mm"
						+ System.getProperty("line.separator") + s2 + "承受剪力: " + h.V2+ " kN"
						+ System.getProperty("line.separator") + s2 + "承受拉力: " + h.N2+ " mm²"
						+ System.getProperty("line.separator") + s2 + "螺栓数: " + h.n2
						+ System.getProperty("line.separator") + s2 + "是否通过: " + (h.btn23 == 1.0?"通过":"未通过")
						+ System.getProperty("line.separator") + s1);
				
				sb.append("高强度螺栓计算:" + System.getProperty("line.separator") + s2 + "螺栓等级: " + (h.btn31 == 1.0?"8.8级":"10.9级")
						+ System.getProperty("line.separator") + s2 + "构件材料: " + (h.btn32==1.0?"Q235钢":"Q345钢")
						+ System.getProperty("line.separator") + s2 + "受剪面数目: " +h.nv3
						+ System.getProperty("line.separator") + s2 + "承压构件厚度: " + h.t3+ " mm"
						+ System.getProperty("line.separator") + s2 + "螺栓杆直径: " + h.d3+ " mm"
						+ System.getProperty("line.separator") + s2 + "承受剪力: " + h.V3+ " kN"
						+ System.getProperty("line.separator") + s2 + "承受拉力: " + h.N3+ " mm²"
						+ System.getProperty("line.separator") + s2 + "螺栓数: " + h.n3
						+ System.getProperty("line.separator") + s2 + "是否通过: " + (h.btn33 == 1.0?"通过":"未通过")
						+ System.getProperty("line.separator") + s1);
				if (outPutTxt.length() == 7) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});

		button_5.setBounds(1032, 13, 189, 27);
		panel_6.add(button_5);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"\u666E\u901A\u87BA\u6813\u6297\u62C9\u6297\u526A", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel_2.setBounds(503, 13, 463, 714);
		contentPane.add(panel_2);

		label_7 = new JLabel("<html>受剪面数目 n<sub>v</sub>:</html>");
		label_7.setBounds(15, 340, 170, 31);
		panel_2.add(label_7);

		textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		textField.setBounds(214, 342, 160, 24);
		panel_2.add(textField);

		label_8 = new JLabel("螺栓杆直径 d:");
		label_8.setBounds(15, 436, 101, 18);
		panel_2.add(label_8);

		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setColumns(10);
		textField_1.setBounds(214, 384, 160, 24);
		panel_2.add(textField_1);

		lblt_1 = new JLabel("<html>在不同受力方向中一个受力方向承压构件总厚度的较小值 ∑t :</html>");
		lblt_1.setBounds(14, 373, 186, 54);
		panel_2.add(lblt_1);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(215, 433, 160, 24);
		panel_2.add(textField_4);

		label_13 = new JLabel("承受剪力 V:");
		label_13.setBounds(14, 485, 101, 18);
		panel_2.add(label_13);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(214, 482, 160, 24);
		panel_2.add(textField_6);

		lblN_1 = new JLabel("<html>承受拉力 N:</html>");
		lblN_1.setBounds(14, 521, 170, 31);
		panel_2.add(lblN_1);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(214, 523, 160, 24);
		panel_2.add(textField_7);

		label_15 = new JLabel(Tool.getIcon("./resources/bol/bol2.png", -1, 181));
		label_15.setBounds(14, 24, 412, 181);
		panel_2.add(label_15);

		label_16 = new JLabel("mm");
		label_16.setBounds(388, 387, 72, 18);
		panel_2.add(label_16);

		label_17 = new JLabel("mm");
		label_17.setBounds(389, 436, 72, 18);
		panel_2.add(label_17);
		ButtonGroup buttonGroup4 = new ButtonGroup();

		radioButton_4 = new JRadioButton("4.6级、4.8级");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn21 = 1.0;
				
			}
		});
		
		radioButton_4.setBounds(68, 241, 145, 27);
		panel_2.add(radioButton_4);

		radioButton_5 = new JRadioButton("5.6级");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn21 = 2.0;
				radioButton_7.setSelected(true);
			}
		});
		radioButton_5.setBounds(219, 241, 83, 27);
		panel_2.add(radioButton_5);

		radioButton_6 = new JRadioButton("8.8级");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn21 = 3.0;
				radioButton_8.setSelected(true);
			}
		});
		radioButton_6.setBounds(309, 241, 83, 27);
		panel_2.add(radioButton_6);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(radioButton_4);
		buttonGroup3.add(radioButton_5);
		buttonGroup3.add(radioButton_6);

		if (h.btn21 == 1.0) {
			radioButton_4.setSelected(true);
		} else if (h.btn21 == 2.0) {
			radioButton_5.setSelected(true);
		} else if (h.btn21 == 3.0) {
			radioButton_6.setSelected(true);
		}

		radioButton_7 = new JRadioButton("Q235钢");
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn22 = 1.0;
				
				if(h.btn21 == 3.0) {
					radioButton_8.setSelected(true);
					radioButton_6.setSelected(true);
					h.btn22 = 2.0;
				}
			}
		});
		radioButton_7.setBounds(66, 300, 145, 27);
		panel_2.add(radioButton_7);

		radioButton_8 = new JRadioButton("Q345钢");
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.btn22 = 2.0;
				
				if(h.btn21 == 2.0) {
					radioButton_5.setSelected(true);
					radioButton_7.setSelected(true);
					h.btn22 = 1.0;
				}
				
			}
		});
		radioButton_8.setBounds(215, 300, 145, 27);
		panel_2.add(radioButton_8);

		ButtonGroup buttonGroup6 = new ButtonGroup();
		buttonGroup6.add(radioButton_7);
		buttonGroup6.add(radioButton_8);

		if (h.btn22 == 1.0) {
			radioButton_7.setSelected(true);
		} else if (h.btn22 == 2.0) {
			radioButton_8.setSelected(true);
		}

		label_21 = new JLabel("<html>kN</html>");
		label_21.setBounds(382, 481, 72, 22);
		panel_2.add(label_21);

		lblkn_1 = new JLabel("<html>kN</html>");
		lblkn_1.setBounds(382, 526, 72, 22);
		panel_2.add(lblkn_1);

		label_25 = new JLabel("螺栓等级 :");
		label_25.setBounds(24, 214, 145, 18);
		panel_2.add(label_25);

		label_26 = new JLabel("构件材料 :");
		label_26.setBounds(22, 273, 145, 18);
		panel_2.add(label_26);

		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(253, 253, 241));
		panel_3.setBounds(15, 565, 406, 125);
		panel_2.add(panel_3);

		label = new JLabel("螺栓数 n:");
		label.setBounds(14, 16, 101, 18);
		panel_3.add(label);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(214, 13, 160, 24);
		panel_3.add(textField_2);

		label_2 = new JLabel("验证 :");
		label_2.setBounds(14, 51, 72, 18);
		panel_3.add(label_2);

		radioButton_9 = new JRadioButton("通过");
		radioButton_9.setBounds(67, 47, 109, 27);
		panel_3.add(radioButton_9);

		radioButton_10 = new JRadioButton("未通过");
		radioButton_10.setBounds(182, 47, 109, 27);
		panel_3.add(radioButton_10);

		ButtonGroup buttonGroup7 = new ButtonGroup();
		buttonGroup7.add(radioButton_9);
		buttonGroup7.add(radioButton_10);
		if (h.btn23 == 1.0) {
			radioButton_9.setSelected(true);
		} else {
			radioButton_10.setSelected(true);
		}

		button = new JButton("计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField, textField_1, textField_4, textField_6, textField_7);
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

				h.nv2 = Double.valueOf(textField.getText().trim());
				h.t2 = Double.valueOf(textField_1.getText().trim());
				h.d2 = Double.valueOf(textField_4.getText().trim());
				h.V2 = Double.valueOf(textField_6.getText().trim());
				h.N2 = Double.valueOf(textField_7.getText().trim());
				h.calPartTwo();
				textField_2.setText(String.valueOf(h.n2));
				if (h.btn23 == 1.0) {
					radioButton_9.setSelected(true);
				} else if (h.btn23 == 2.0) {
					radioButton_10.setSelected(true);
				}

			}
		});
		button.setBounds(143, 83, 113, 27);
		panel_3.add(button);

		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(
				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u9AD8\u5F3A\u87BA\u6813\u8BA1\u7B97",
						TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(990, 13, 463, 714);
		contentPane.add(panel_4);

		label_3 = new JLabel("<html>受剪面数目 n<sub>v</sub>:</html>");
		label_3.setBounds(15, 340, 170, 31);
		panel_4.add(label_3);

		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setColumns(10);
		textField_3.setBounds(214, 342, 160, 24);
		panel_4.add(textField_3);

		label_9 = new JLabel("螺栓杆直径 d:");
		label_9.setBounds(15, 436, 101, 18);
		panel_4.add(label_9);

		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setColumns(10);
		textField_5.setBounds(214, 384, 160, 24);
		panel_4.add(textField_5);

		lblt = new JLabel("<html>承压构件厚度 ∑t :</html>");
		lblt.setBounds(15, 375, 171, 38);
		panel_4.add(lblt);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(215, 433, 160, 24);
		panel_4.add(textField_8);

		label_12 = new JLabel("承受剪力 V:");
		label_12.setBounds(14, 485, 101, 18);
		panel_4.add(label_12);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(214, 482, 160, 24);
		panel_4.add(textField_10);

		lblN = new JLabel("承受拉力 N ：");
		lblN.setBounds(14, 521, 170, 31);
		panel_4.add(lblN);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(214, 523, 160, 24);
		panel_4.add(textField_14);

		label_19 = new JLabel(Tool.getIcon("./resources/bol/bol2.png", -1, 181));
		label_19.setBounds(14, 24, 412, 181);
		panel_4.add(label_19);

		label_20 = new JLabel("mm");
		label_20.setBounds(388, 387, 72, 18);
		panel_4.add(label_20);

		label_23 = new JLabel("mm");
		label_23.setBounds(389, 436, 72, 18);
		panel_4.add(label_23);

		radioButton_12 = new JRadioButton("8.8级");
		radioButton_12.setBounds(128, 241, 83, 27);
		panel_4.add(radioButton_12);

		radioButton_15 = new JRadioButton("10.9级");
		radioButton_15.setBounds(309, 241, 83, 27);
		panel_4.add(radioButton_15);

		ButtonGroup buttonGroup8 = new ButtonGroup();
		buttonGroup8.add(radioButton_12);
		buttonGroup8.add(radioButton_15);
		if (h.btn31 == 1.0) {
			radioButton_12.setSelected(true);
		} else if (h.btn32 == 2.0) {
			radioButton_15.setSelected(true);
		}

		radioButton_16 = new JRadioButton("Q235钢");
		radioButton_16.setBounds(66, 300, 145, 27);
		panel_4.add(radioButton_16);

		radioButton_17 = new JRadioButton("Q345钢");
		radioButton_17.setBounds(215, 300, 145, 27);
		panel_4.add(radioButton_17);

		ButtonGroup buttonGroup9 = new ButtonGroup();
		buttonGroup9.add(radioButton_16);
		buttonGroup9.add(radioButton_17);

		if (h.btn32 == 1.0) {
			radioButton_16.setSelected(true);
		} else {
			radioButton_17.setSelected(true);
		}

		label_24 = new JLabel("<html>kN</html>");
		label_24.setBounds(382, 481, 72, 22);
		panel_4.add(label_24);

		lblKn = new JLabel("KN");
		lblKn.setBounds(382, 526, 72, 22);
		panel_4.add(lblKn);

		label_28 = new JLabel("螺栓等级 :");
		label_28.setBounds(24, 214, 145, 18);
		panel_4.add(label_28);

		label_29 = new JLabel("构件材料 :");
		label_29.setBounds(22, 273, 145, 18);
		panel_4.add(label_29);

		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(new Color(253, 253, 241));
		panel_5.setBounds(15, 565, 406, 125);
		panel_4.add(panel_5);

		label_30 = new JLabel("螺栓数 n:");
		label_30.setBounds(14, 16, 101, 18);
		panel_5.add(label_30);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(214, 13, 160, 24);
		panel_5.add(textField_15);

		label_31 = new JLabel("验证 :");
		label_31.setBounds(14, 51, 72, 18);
		panel_5.add(label_31);

		radioButton_18 = new JRadioButton("通过");
		radioButton_18.setBounds(67, 47, 109, 27);
		panel_5.add(radioButton_18);

		radioButton_19 = new JRadioButton("未通过");
		radioButton_19.setBounds(182, 47, 109, 27);
		panel_5.add(radioButton_19);

		ButtonGroup buttonGroup10 = new ButtonGroup();
		buttonGroup10.add(radioButton_18);
		buttonGroup10.add(radioButton_19);

		if (h.btn33 == 1.0) {
			radioButton_18.setSelected(true);
		} else {
			radioButton_19.setSelected(true);
		}

		button_1 = new JButton("计算");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_3, textField_5, textField_8, textField_10,
						textField_14);
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

				h.nv3 = Double.valueOf(textField_3.getText().trim());
				h.t3 = Double.valueOf(textField_5.getText().trim());
				h.d3 = Double.valueOf(textField_8.getText().trim());
				h.V3 = Double.valueOf(textField_10.getText().trim());
				h.N3 = Double.valueOf(textField_14.getText().trim());
				h.calPartThree();
				textField_15.setText(String.valueOf(h.n3));
				if (h.btn33 == 1.0) {
					radioButton_18.setSelected(true);
				} else if (h.btn33 == 2.0) {
					radioButton_19.setSelected(true);
				}

			}
		});
		button_1.setBounds(143, 83, 113, 27);
		panel_5.add(button_1);

	}
}
