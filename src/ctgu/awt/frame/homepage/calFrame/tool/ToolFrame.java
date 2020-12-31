package ctgu.awt.frame.homepage.calFrame.tool;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.tool
 * @author: 拉布拉多
 */

public class ToolFrame extends FatherFrame {

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
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_19;
	private JTextField textField_27;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolFrame frame = new ToolFrame(new ctgu.Entity.tool.Tool());
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
	public ToolFrame(ctgu.Entity.tool.Tool tool) {
		setTitle("工器具计算");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1468, 840);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "\u5E73\u884C\u6302\u677F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(15, 27, 346, 757);
		contentPane.add(panel);
		panel.setLayout(null);

		// 图片1
		Icon icon1 = new ImageIcon("./resources/tool/tool1.png");
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 115, Image.SCALE_DEFAULT);// 缩放图片大小
		((ImageIcon) icon1).setImage(image);

		JLabel label = new JLabel(icon1, JLabel.CENTER);
		label.setBounds(15, 29, 295, 124);
		panel.add(label);

		// 图片2
		Icon icon3 = new ImageIcon("./resources/tool/tool2.png");
		Image image3 = ((ImageIcon) icon3).getImage();
		image3 = image3.getScaledInstance(-1, 180, Image.SCALE_DEFAULT);// 缩放图片大小
		((ImageIcon) icon3).setImage(image3);

		JLabel label_2 = new JLabel(icon3, JLabel.CENTER);
		label_2.setBounds(15, 168, 295, 164);
		panel.add(label_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 347, 295, 68);
		panel.add(panel_2);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u6750\u6599\u9009\u578B",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setLayout(null);

		JRadioButton rdbtnQ = new JRadioButton("Q235");
		rdbtnQ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tool.btn1 = 1.0;
			}
		});
		rdbtnQ.setBounds(48, 29, 129, 27);
		panel_2.add(rdbtnQ);

		JRadioButton rdbtnQ_1 = new JRadioButton("Q345");
		rdbtnQ_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tool.btn1 = 2.0;
			}
		});
		if (tool.btn1 == 1.0) {
			rdbtnQ.setSelected(true);
		} else {
			rdbtnQ_1.setSelected(true);
		}

		rdbtnQ_1.setBounds(183, 29, 102, 27);
		panel_2.add(rdbtnQ_1);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnQ);
		buttonGroup.add(rdbtnQ_1);

		JLabel lblR = new JLabel("<html>内径 R<sub>1</sub>：</html>");
		lblR.setBounds(15, 428, 117, 29);
		panel.add(lblR);

		textField = new JTextField();
		textField.setBounds(146, 428, 115, 24);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(149, 472, 115, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblR_1 = new JLabel("<html>外径R<sub>2</sub> ：</html>");
		lblR_1.setBounds(15, 468, 115, 36);
		panel.add(lblR_1);

		JLabel lblF = new JLabel("拉力 F：");
		lblF.setBounds(15, 516, 115, 18);
		panel.add(lblF);

		textField_2 = new JTextField();
		textField_2.setBounds(149, 509, 115, 24);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblT = new JLabel("厚度 t ：");
		lblT.setBounds(15, 550, 104, 18);
		panel.add(lblT);

		textField_3 = new JTextField();
		textField_3.setBounds(149, 547, 117, 24);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(15, 581, 280, 161);
		panel.add(panel_3);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setForeground(Color.LIGHT_GRAY);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8F93\u51FA",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setLayout(null);

		JLabel lbla = new JLabel("<html>强度安全系数 n<sub>1</sub>：<html>");
		lbla.setBounds(14, 31, 164, 26);
		panel_3.add(lbla);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 28, 86, 24);
		panel_3.add(textField_4);

		JLabel lblN = new JLabel("<html>挤压安全系数 n<sub>2</sub>：<html>");
		lblN.setBounds(14, 70, 154, 33);
		panel_3.add(lblN);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(174, 73, 86, 24);
		panel_3.add(textField_5);

		JButton button = new JButton("计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField, textField_1, textField_2, textField_3);

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

				tool.R11 = Double.valueOf(textField.getText().trim());
				tool.R12 = Double.valueOf(textField_1.getText().trim());
				tool.F11 = Double.valueOf(textField_2.getText().trim());
				tool.t11 = Double.valueOf(textField_3.getText().trim());

				tool.calPartOne();
				textField_4.setText(String.valueOf(tool.n11));
				textField_5.setText(String.valueOf(tool.n12));

			}
		});
		button.setBounds(105, 117, 123, 29);
		panel_3.add(button);

		JLabel lblMm = new JLabel("mm");
		lblMm.setBounds(290, 432, 42, 18);
		panel.add(lblMm);

		JLabel label_5 = new JLabel("mm");
		label_5.setBounds(290, 475, 42, 18);
		panel.add(label_5);

		JLabel label_7 = new JLabel("mm");
		label_7.setBounds(290, 550, 42, 18);
		panel.add(label_7);

		JLabel lblN_1 = new JLabel("N");
		lblN_1.setBounds(290, 516, 56, 18);
		panel.add(lblN_1);

		Icon icon2 = new ImageIcon("./resources/tool/tool3.png");
		Image image2 = ((ImageIcon) icon2).getImage();
		image2 = image2.getScaledInstance(-1, 230, Image.SCALE_DEFAULT);// 缩放图片大小
		((ImageIcon) icon2).setImage(image2);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(375, 27, 395, 757);
		contentPane.add(panel_4);
		panel_4.setBorder(new TitledBorder(null, "\u4E09\u89D2\u8054\u677F\u8BA1\u7B97", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_4.setLayout(null);

		JLabel label_1 = new JLabel(icon2, JLabel.CENTER);
		label_1.setBounds(14, 32, 375, 237);
		panel_4.add(label_1);

		JLabel lblF_1 = new JLabel("<html>拉力 F<sub>1</sub>:</html>");
		lblF_1.setBounds(16, 330, 117, 38);
		panel_4.add(lblF_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(112, 334, 179, 24);
		panel_4.add(textField_6);

		JLabel lblR_3 = new JLabel("<html>外径 R<sub>1</sub>：</html>");
		lblR_3.setBounds(16, 373, 117, 38);
		panel_4.add(lblR_3);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(82, 381, 86, 24);
		panel_4.add(textField_7);

		JLabel lblR_2 = new JLabel("<html>外径 R<sub>2</sub>：</html>");
		lblR_2.setBounds(209, 373, 117, 38);
		panel_4.add(lblR_2);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(274, 379, 86, 24);
		panel_4.add(textField_8);

		JLabel lblR_4 = new JLabel("<html>内径 r<sub>1</sub>：</html>");
		lblR_4.setBounds(14, 405, 86, 30);
		panel_4.add(lblR_4);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(82, 411, 86, 24);
		panel_4.add(textField_9);

		JLabel lblR_5 = new JLabel("<html>内径 r<sub>2</sub>：</html>");
		lblR_5.setBounds(209, 409, 77, 30);
		panel_4.add(lblR_5);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(274, 411, 86, 24);
		panel_4.add(textField_10);

		JLabel lblT_1 = new JLabel("厚度 t:");
		lblT_1.setBounds(14, 437, 86, 30);
		panel_4.add(lblT_1);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(82, 443, 86, 24);
		panel_4.add(textField_11);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(11, 517, 367, 227);
		panel_4.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblF_2 = new JLabel("<html> F1孔的挤压安全系数n1:</html>");
		lblF_2.setBounds(15, 26, 207, 31);
		panel_5.add(lblF_2);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(236, 26, 101, 24);
		panel_5.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(236, 63, 101, 24);
		panel_5.add(textField_13);

		JButton button_1 = new JButton("计算");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_6, textField_7, textField_8, textField_9, textField_10,
						textField_11, textField_23, textField_24, textField_25);

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

				tool.F21 = Double.valueOf(textField_6.getText().trim());
				tool.R21 = Double.valueOf(textField_7.getText().trim());
				tool.R22 = Double.valueOf(textField_8.getText().trim());
				tool.r21 = Double.valueOf(textField_9.getText().trim());
				tool.r22 = Double.valueOf(textField_10.getText().trim());
				tool.t21 = Double.valueOf(textField_11.getText().trim());
				tool.a21 = Double.valueOf(textField_23.getText().trim());
				tool.b21 = Double.valueOf(textField_24.getText().trim());
				tool.h21 = Double.valueOf(textField_25.getText().trim());
				tool.calPartTwo();
				textField_12.setText(String.valueOf(tool.n21));
				textField_13.setText(String.valueOf(tool.n22));
				textField_26.setText(String.valueOf(tool.n23));
				textField_19.setText(String.valueOf(tool.n211));
				textField_27.setText(String.valueOf(tool.n2));
			}
		});
		button_1.setBounds(27, 185, 123, 29);
		panel_5.add(button_1);

		JLabel lblFn = new JLabel("<html> F2孔的挤压安全系数n2:</html>");
		lblFn.setBounds(15, 58, 207, 31);
		panel_5.add(lblFn);

		JLabel lblFn_1 = new JLabel("<html> F3孔的挤压安全系数n3:</html>");
		lblFn_1.setBounds(15, 91, 207, 31);
		panel_5.add(lblFn_1);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(236, 96, 101, 24);
		panel_5.add(textField_26);

		JLabel lblN_2 = new JLabel("<html>截面安全系数 n<sub>1-1</sub>:</html>");
		lblN_2.setBounds(15, 125, 207, 26);
		panel_5.add(lblN_2);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(236, 125, 101, 23);
		panel_5.add(textField_19);

		JLabel lblNewLabel = new JLabel("组合应力安全系数 n:");
		lblNewLabel.setBounds(15, 154, 193, 18);
		panel_5.add(lblNewLabel);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(236, 151, 101, 24);
		panel_5.add(textField_27);

		JLabel lblA_2 = new JLabel("a:");
		lblA_2.setBounds(209, 443, 46, 24);
		panel_4.add(lblA_2);

		JLabel lblB_1 = new JLabel("b:");
		lblB_1.setBounds(26, 480, 56, 24);
		panel_4.add(lblB_1);

		JLabel lblC = new JLabel("h:");
		lblC.setBounds(209, 480, 33, 24);
		panel_4.add(lblC);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(274, 443, 86, 24);
		panel_4.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(82, 480, 84, 24);
		panel_4.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(274, 480, 84, 24);
		panel_4.add(textField_25);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(
				new TitledBorder(null, "\u6750\u6599\u9009\u578B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(16, 277, 362, 50);
		panel_4.add(panel_9);
		panel_9.setLayout(null);

		JRadioButton radioButton = new JRadioButton("Q235");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool.btn2 = 1.0;
			}
		});
		radioButton.setBounds(47, 15, 129, 27);
		panel_9.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("Q345");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool.btn2 = 2.0;
			}
		});
		if (tool.btn2 == 1.0)
			radioButton.setSelected(true);
		else
			radioButton_1.setSelected(true);
		radioButton_1.setBounds(208, 14, 102, 27);
		panel_9.add(radioButton_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton);
		buttonGroup2.add(radioButton_1);

		JLabel label_8 = new JLabel("mm");
		label_8.setBounds(179, 382, 72, 18);
		panel_4.add(label_8);

		JLabel label_9 = new JLabel("mm");
		label_9.setBounds(364, 382, 72, 18);
		panel_4.add(label_9);

		JLabel label_10 = new JLabel("mm");
		label_10.setBounds(172, 418, 64, 18);
		panel_4.add(label_10);

		JLabel label_11 = new JLabel("mm");
		label_11.setBounds(364, 417, 46, 18);
		panel_4.add(label_11);

		JLabel label_12 = new JLabel("mm");
		label_12.setBounds(172, 447, 72, 18);
		panel_4.add(label_12);

		JLabel label_16 = new JLabel("N");
		label_16.setBounds(305, 339, 72, 18);
		panel_4.add(label_16);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "\u540A\u73AF\u8BA1\u7B97", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(773, 27, 296, 757);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		Icon icon4 = Tool.getIcon("./resources/tool/tool4.png", -1, 120);
		JLabel label_3 = new JLabel(icon4, JLabel.CENTER);
		label_3.setBounds(15, 28, 268, 153);
		panel_1.add(label_3);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(130, 330, 109, 24);
		panel_1.add(textField_14);

		JLabel lblF_4 = new JLabel("<html>水平拉力 F<sub>1</sub>:</html>");
		lblF_4.setBounds(15, 325, 117, 38);
		panel_1.add(lblF_4);

		JLabel lblF_5 = new JLabel("<html>竖直拉力 F<sub>2</sub>:</html>");
		lblF_5.setBounds(15, 367, 117, 38);
		panel_1.add(lblF_5);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(130, 372, 109, 24);
		panel_1.add(textField_15);

		JLabel lblF_6 = new JLabel("吊环孔径 ф:");
		lblF_6.setBounds(15, 418, 117, 38);
		panel_1.add(lblF_6);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(130, 423, 109, 24);
		panel_1.add(textField_16);

		JLabel lblR_6 = new JLabel("环内半径 R:");
		lblR_6.setBounds(15, 469, 117, 38);
		panel_1.add(lblR_6);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(130, 474, 109, 24);
		panel_1.add(textField_17);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(15, 535, 247, 195);
		panel_1.add(panel_6);

		JLabel lblA = new JLabel("截面强度安全系数 n：");
		lblA.setBounds(15, 26, 275, 38);
		panel_6.add(lblA);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(15, 71, 179, 24);
		panel_6.add(textField_18);

		JButton button_2 = new JButton("计算");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_14, textField_15, textField_16, textField_17);
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

				tool.F31 = Double.valueOf(textField_14.getText().trim());
				tool.F32 = Double.valueOf(textField_15.getText().trim());
				tool.f31 = Double.valueOf(textField_16.getText().trim());
				tool.R31 = Double.valueOf(textField_17.getText().trim());
				tool.calPartThree();

				textField_18.setText(String.valueOf(tool.n31));

			}
		});
		button_2.setBounds(15, 135, 123, 29);
		panel_6.add(button_2);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(
				new TitledBorder(null, "\u6750\u6599\u9009\u578B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(15, 218, 268, 79);
		panel_1.add(panel_10);

		JRadioButton radioButton_2 = new JRadioButton("Q235");
		radioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tool.btn3 = 1.0;
			}
		});
		radioButton_2.setBounds(29, 33, 102, 27);
		panel_10.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("Q345");
		radioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tool.btn3 = 2.0;
			}
		});

		if (tool.btn3 == 1.0) {
			radioButton_2.setSelected(true);
		} else
			radioButton_3.setSelected(true);
		radioButton_3.setBounds(137, 33, 102, 27);
		panel_10.add(radioButton_3);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(radioButton_2);
		buttonGroup3.add(radioButton_3);

		JLabel label_13 = new JLabel("mm");
		label_13.setBounds(253, 438, 72, 18);
		panel_1.add(label_13);

		JLabel label_14 = new JLabel("mm");
		label_14.setBounds(253, 489, 72, 18);
		panel_1.add(label_14);

		JLabel label_17 = new JLabel("N");
		label_17.setBounds(253, 333, 72, 18);
		panel_1.add(label_17);

		JLabel label_18 = new JLabel("N");
		label_18.setBounds(253, 376, 72, 18);
		panel_1.add(label_18);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(
				new TitledBorder(null, "\u62C9\u68D2\u8BA1\u7B97", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(1083, 27, 359, 618);
		contentPane.add(panel_7);
		panel_7.setLayout(null);

		Icon icon5 = Tool.getIcon("./resources/tool/tool5.jpg", -1, 140);
		JLabel label_4 = new JLabel(icon5, JLabel.CENTER);
		label_4.setBounds(15, 29, 329, 154);
		panel_7.add(label_4);

		JLabel lblF_7 = new JLabel("拉力 F");
		lblF_7.setBounds(14, 324, 117, 38);
		panel_7.add(lblF_7);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(129, 329, 130, 24);
		panel_7.add(textField_20);

		JLabel label_6 = new JLabel("拉棒直径ф:");
		label_6.setBounds(14, 383, 117, 38);
		panel_7.add(label_6);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(129, 388, 130, 24);
		panel_7.add(textField_21);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(14, 433, 330, 154);
		panel_7.add(panel_8);

		JLabel lblA_1 = new JLabel("强度校核 δ：");
		lblA_1.setBounds(15, 26, 166, 38);
		panel_8.add(lblA_1);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(132, 37, 179, 24);
		panel_8.add(textField_22);

		JButton button_3 = new JButton("计算");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_21, textField_20);
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

				tool.F41 = Double.valueOf(textField_20.getText().trim());
				tool.O41 = Double.valueOf(textField_21.getText().trim());
				tool.calPartFour();
				textField_22.setText(String.valueOf(tool.n41));

			}
		});
		button_3.setBounds(102, 90, 123, 29);
		panel_8.add(button_3);

		JLabel label_15 = new JLabel("mm");
		label_15.setBounds(271, 393, 72, 18);
		panel_7.add(label_15);

		JLabel label_19 = new JLabel("N");
		label_19.setBounds(271, 334, 72, 18);
		panel_7.add(label_19);

		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(
				new TitledBorder(null, "\u6750\u6599\u9009\u578B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setBounds(15, 214, 319, 79);
		panel_7.add(panel_11);

		JRadioButton radioButton_4 = new JRadioButton("Q235");
		radioButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tool.btn4 = 1.0;
			}
		});
		radioButton_4.setBounds(29, 33, 129, 27);
		panel_11.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("Q345");
		radioButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tool.btn4 = 2.0;
			}
		});
		if (tool.btn4 == 1.0) {
			radioButton_4.setSelected(true);
		} else
			radioButton_5.setSelected(true);
		radioButton_5.setBounds(190, 32, 102, 27);
		panel_11.add(radioButton_5);
		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(radioButton_4);
		buttonGroup4.add(radioButton_5);

		JButton button_4 = new JButton("下载到桌面");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String outPutTxt = "";
				String s1 = "  ";
				String s2 = "      ";
				outPutTxt += "工器具计算" + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				sb.append("平行挂板: " + System.getProperty("line.separator") + s2 + "材料选型: " + (tool.btn1==1.0?"Q235":"Q345")
						+ System.getProperty("line.separator") + s2 + "内径: " + tool.R11
						+ System.getProperty("line.separator") + s2 + "外径: " + tool.R12
						+ System.getProperty("line.separator") + s2 + "拉力: " + tool.F11
						+ System.getProperty("line.separator") + s2 + "厚度: " + tool.t11
						+ System.getProperty("line.separator") + s2 + "强度安全系数: " + tool.n11
						+ System.getProperty("line.separator") + s2 + "挤压安全系数: " + tool.n12
						+ System.getProperty("line.separator") + s1);
				
				sb.append("三角联板计算: " + System.getProperty("line.separator") + s2 + "材料选型: " + (tool.btn2==1.0?"Q235":"Q345")
						+ System.getProperty("line.separator") + s2 + "拉力: " + tool.F21
						+ System.getProperty("line.separator") + s2 + "外径1: " + tool.R21
						+ System.getProperty("line.separator") + s2 + "外径2: " + tool.R22
						+ System.getProperty("line.separator") + s2 + "内径1: " + tool.r21
						+ System.getProperty("line.separator") + s2 + "内径2: " + tool.r22
						+ System.getProperty("line.separator") + s2 + "厚度: " + tool.t11
						+ System.getProperty("line.separator") + s2 + "a: " + tool.a21
						+ System.getProperty("line.separator") + s2 + "b: " + tool.b21
						+ System.getProperty("line.separator") + s2 + "h: " + tool.h21
						+ System.getProperty("line.separator") + s2 + "F1孔的挤压安全系数: " + tool.n21
						+ System.getProperty("line.separator") + s2 + "F2孔的挤压安全系数: " + tool.n22
						+ System.getProperty("line.separator") + s2 + "F3孔的挤压安全系数: " + tool.n23
						+ System.getProperty("line.separator") + s2 + "截面安全系数: " + tool.n211
						+ System.getProperty("line.separator") + s2 + "组合应力安全系数: " + tool.n2
						+ System.getProperty("line.separator") + s1);
				
				sb.append("吊环计算: " + System.getProperty("line.separator") + s2 + "材料选型: " + (tool.btn3==1.0?"Q235":"Q345")
						+ System.getProperty("line.separator") + s2 + "水平拉力: " + tool.F31
						+ System.getProperty("line.separator") + s2 + "竖直拉力: " + tool.F32
						+ System.getProperty("line.separator") + s2 + "吊环孔径: " + tool.f31
						+ System.getProperty("line.separator") + s2 + "环内半径: " + tool.R31
						+ System.getProperty("line.separator") + s2 + "截面强度安全系数: " + tool.n31
						+ System.getProperty("line.separator") + s1);
				
				sb.append("拉棒计算: " + System.getProperty("line.separator") + s2 + "材料选型: " + (tool.btn4==1.0?"Q235":"Q345")
						+ System.getProperty("line.separator") + s2 + "拉力: " + tool.F41
						+ System.getProperty("line.separator") + s2 + "拉棒直径: " + tool.O41
						+ System.getProperty("line.separator") + s2 + "强度校验: " + tool.n41
						+ System.getProperty("line.separator") + s1);
				
				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});
		button_4.setBounds(1083, 658, 174, 29);
		contentPane.add(button_4);

		JButton button_5 = new JButton("保存到历史纪录");
		button_5.setBounds(1083, 700, 174, 29);
		contentPane.add(button_5);
	}
}
