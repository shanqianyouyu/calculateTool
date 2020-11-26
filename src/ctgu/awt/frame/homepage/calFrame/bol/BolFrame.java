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

import ctgu.Entity.boltCal.HighStrength;
import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog2;
import ctgu.awt.frame.homepage.component.bolFrame.BolTableDialog3;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
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
	private JLabel label_10;
	private JTextField textField_4;
	private JLabel label_13;
	private JTextField textField_6;
	private JLabel label_14;
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
	private JLabel label_22;
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
		setBounds(100, 100, 1314, 914);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 取较小值
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder("普通螺栓受剪力"));
		panel.setBounds(14, 13, 463, 705);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNv = new JLabel("<html>受剪面数目 n<sub>v</sub>:</html>");
		lblNv.setBounds(14, 340, 170, 31);
		panel.add(lblNv);

		txtNv = new JTextField();
		txtNv.setText(highStrength.nv == null ? "" : String.valueOf(highStrength.nv));
		txtNv.setBounds(214, 342, 160, 24);
		panel.add(txtNv);
		txtNv.setColumns(10);

		JLabel lblDasdasd = new JLabel("螺栓杆直径 d:");
		lblDasdasd.setBounds(14, 424, 101, 18);
		panel.add(lblDasdasd);

		txtD = new JTextField();
		txtD.setText(highStrength.d == null ? "" : String.valueOf(highStrength.d));
		txtD.setColumns(10);
		txtD.setBounds(214, 384, 160, 24);
		panel.add(txtD);

		lbld = new JLabel("<html>构件厚度 ∑t :</html>");
		lbld.setBounds(14, 384, 121, 18);
		panel.add(lbld);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(214, 421, 160, 24);
		panel.add(textField_9);

		JLabel lblV = new JLabel("承受剪力 V:");
		lblV.setBounds(14, 462, 101, 18);
		panel.add(lblV);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(214, 459, 160, 24);
		panel.add(textField_11);

		JLabel lblAv = new JLabel("<html>净截面面积 A<sub>n</sub>:</html>");
		lblAv.setBounds(14, 498, 170, 31);
		panel.add(lblAv);

		textField_12 = new JTextField();
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
		rdbtnNewRadioButton.setBounds(57, 239, 145, 27);
		panel.add(rdbtnNewRadioButton);

		radioButton = new JRadioButton("5.6级");
		radioButton.setBounds(209, 239, 83, 27);
		panel.add(radioButton);

		radioButton_1 = new JRadioButton("8.8级");
		radioButton_1.setBounds(298, 239, 83, 27);
		panel.add(radioButton_1);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);

		rdbtnQ = new JRadioButton("Q235钢");
		rdbtnQ.setBounds(57, 291, 145, 27);
		panel.add(rdbtnQ);

		rdbtnQ_1 = new JRadioButton("Q345钢");
		rdbtnQ_1.setBounds(206, 291, 145, 27);
		panel.add(rdbtnQ_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnQ);
		buttonGroup2.add(rdbtnQ_1);

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

		button_4 = new JButton("计算");
		button_4.setBounds(143, 83, 113, 27);
		panel_1.add(button_4);

		label_5 = new JLabel("螺栓等级 :");
		label_5.setBounds(14, 218, 145, 18);
		panel.add(label_5);

		label_6 = new JLabel("构件材料 :");
		label_6.setBounds(14, 275, 145, 18);
		panel.add(label_6);

		panel_6 = new JPanel();
		panel_6.setBounds(989, 278, 287, 59);
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		setVisible(true);

		button_3 = new JButton("保存");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(highStrength);
			}
		});
		button_3.setBounds(37, 13, 113, 27);
		panel_6.add(button_3);

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

		button_5.setBounds(164, 13, 113, 27);
		panel_6.add(button_5);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null,
				"\u666E\u901A\u87BA\u6813\u6297\u62C9\u6297\u526A\u6216\u9AD8\u5F3A\u87BA\u6813\u8BA1\u7B97",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
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

		label_10 = new JLabel("<html>构件厚度 ∑t :</html>");
		label_10.setBounds(14, 385, 121, 18);
		panel_2.add(label_10);

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

		label_14 = new JLabel("<html>净截面面积 A<sub>n</sub>:</html>");
		label_14.setBounds(14, 521, 170, 31);
		panel_2.add(label_14);

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
		radioButton_4.setBounds(68, 241, 145, 27);
		panel_2.add(radioButton_4);

		radioButton_5 = new JRadioButton("5.6级");
		radioButton_5.setBounds(219, 241, 83, 27);
		panel_2.add(radioButton_5);

		radioButton_6 = new JRadioButton("8.8级");
		radioButton_6.setBounds(309, 241, 83, 27);
		panel_2.add(radioButton_6);


		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(radioButton_4);
		buttonGroup3.add(radioButton_5);
		buttonGroup3.add(radioButton_6);

		radioButton_7 = new JRadioButton("Q235钢");
		radioButton_7.setBounds(66, 300, 145, 27);
		panel_2.add(radioButton_7);

		radioButton_8 = new JRadioButton("Q345钢");
		radioButton_8.setBounds(215, 300, 145, 27);
		panel_2.add(radioButton_8);

		label_21 = new JLabel("<html>kN</html>");
		label_21.setBounds(382, 481, 72, 22);
		panel_2.add(label_21);

		label_22 = new JLabel("<html>mm<sup>2</sup></html>");
		label_22.setBounds(382, 526, 72, 22);
		panel_2.add(label_22);

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
		
		button = new JButton("计算");
		button.setBounds(143, 83, 113, 27);
		panel_3.add(button);

	}

}
