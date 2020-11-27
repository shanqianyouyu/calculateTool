package ctgu.awt.frame.homepage.calFrame.tool;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import ctgu.awt.util.Tool;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
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
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1664, 1047);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "\u5E73\u884C\u6302\u677F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(15, 27, 435, 876);
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
		panel_2.setBounds(15, 347, 261, 90);
		panel.add(panel_2);
		panel_2.setBorder(
				new TitledBorder(null, "\u6750\u6599\u53C2\u6570", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(null);

		JRadioButton rdbtnQ = new JRadioButton("Q235");
		rdbtnQ.setBounds(10, 42, 129, 27);
		panel_2.add(rdbtnQ);

		JRadioButton rdbtnQ_1 = new JRadioButton("Q345");
		rdbtnQ_1.setBounds(152, 42, 102, 27);
		panel_2.add(rdbtnQ_1);

		JLabel lblR = new JLabel("<html>内径 R<sub>1</sub>：</html>");
		lblR.setBounds(25, 448, 117, 38);
		panel.add(lblR);

		textField = new JTextField();
		textField.setBounds(161, 453, 115, 24);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(161, 509, 115, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblR_1 = new JLabel("<html>外径R<sub>2</sub> ：</html>");
		lblR_1.setBounds(27, 505, 115, 36);
		panel.add(lblR_1);

		JLabel lblF = new JLabel("拉力 F：");
		lblF.setBounds(27, 563, 115, 18);
		panel.add(lblF);

		textField_2 = new JTextField();
		textField_2.setBounds(161, 556, 115, 24);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblT = new JLabel("厚度 t ：");
		lblT.setBounds(27, 614, 119, 18);
		panel.add(lblT);

		textField_3 = new JTextField();
		textField_3.setBounds(161, 611, 115, 24);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(15, 659, 354, 161);
		panel.add(panel_3);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setForeground(Color.LIGHT_GRAY);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8F93\u51FA",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setLayout(null);

		JLabel lbla = new JLabel("截面净面积 A：");
		lbla.setBounds(14, 31, 164, 18);
		panel_3.add(lbla);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 28, 150, 24);
		panel_3.add(textField_4);

		JLabel lblN = new JLabel("<html>n<sub>1</sub>：<html>");
		lblN.setBounds(24, 64, 115, 33);
		panel_3.add(lblN);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(174, 73, 150, 24);
		panel_3.add(textField_5);

		JButton button = new JButton("计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(105, 117, 123, 29);
		panel_3.add(button);

		Icon icon2 = new ImageIcon("./resources/tool/tool3.png");
		Image image2 = ((ImageIcon) icon2).getImage();
		image2 = image2.getScaledInstance(-1, 230, Image.SCALE_DEFAULT);// 缩放图片大小
		((ImageIcon) icon2).setImage(image2);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(454, 27, 395, 876);
		contentPane.add(panel_4);
		panel_4.setBorder(new TitledBorder(null, "\u4E09\u89D2\u8054\u677F\u8BA1\u7B97", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_4.setLayout(null);

		JLabel label_1 = new JLabel(icon2, JLabel.CENTER);
		label_1.setBounds(14, 32, 390, 237);
		panel_4.add(label_1);

		JLabel lblF_1 = new JLabel("<html>拉力 F<sub>1</sub>:</html>");
		lblF_1.setBounds(14, 287, 117, 38);
		panel_4.add(lblF_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(110, 291, 179, 24);
		panel_4.add(textField_6);

		JLabel lblR_3 = new JLabel("<html>外径 R<sub>1</sub>：</html>");
		lblR_3.setBounds(14, 351, 117, 38);
		panel_4.add(lblR_3);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(110, 355, 179, 24);
		panel_4.add(textField_7);

		JLabel lblR_2 = new JLabel("<html>外径 R<sub>2</sub>：</html>");
		lblR_2.setBounds(14, 404, 117, 38);
		panel_4.add(lblR_2);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(110, 409, 179, 24);
		panel_4.add(textField_8);

		JLabel lblR_4 = new JLabel("<html>内径 r<sub>1</sub>：</html>");
		lblR_4.setBounds(14, 457, 117, 38);
		panel_4.add(lblR_4);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(110, 461, 179, 24);
		panel_4.add(textField_9);

		JLabel lblR_5 = new JLabel("<html>内径 r<sub>2</sub>：</html>");
		lblR_5.setBounds(14, 510, 117, 38);
		panel_4.add(lblR_5);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(110, 514, 179, 24);
		panel_4.add(textField_10);

		JLabel lblT_1 = new JLabel("厚度 t:");
		lblT_1.setBounds(14, 563, 117, 38);
		panel_4.add(lblT_1);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(110, 567, 179, 24);
		panel_4.add(textField_11);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(14, 634, 330, 172);
		panel_4.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblF_2 = new JLabel("<html> F<sub>2</sub>:</html>");
		lblF_2.setBounds(15, 26, 117, 38);
		panel_5.add(lblF_2);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(111, 30, 179, 24);
		panel_5.add(textField_12);

		JLabel lblF_3 = new JLabel("<html> F<sub>3</sub>:</html>");
		lblF_3.setBounds(15, 70, 117, 38);
		panel_5.add(lblF_3);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(111, 74, 179, 24);
		panel_5.add(textField_13);

		JButton button_1 = new JButton("计算");
		button_1.setBounds(104, 128, 123, 29);
		panel_5.add(button_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "\u540A\u73AF\u8BA1\u7B97", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(882, 27, 359, 770);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		Icon icon4 = Tool.getIcon("./resources/tool/tool4.png", -1, 120);
		JLabel label_3 = new JLabel(icon4, JLabel.CENTER);
		label_3.setBounds(15, 28, 333, 153);
		panel_1.add(label_3);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(130, 228, 179, 24);
		panel_1.add(textField_14);

		JLabel lblF_4 = new JLabel("<html>水平拉力 F<sub>1</sub>:</html>");
		lblF_4.setBounds(15, 223, 117, 38);
		panel_1.add(lblF_4);

		JLabel lblF_5 = new JLabel("<html>竖直拉力 F<sub>1</sub>:</html>");
		lblF_5.setBounds(15, 281, 117, 38);
		panel_1.add(lblF_5);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(130, 286, 179, 24);
		panel_1.add(textField_15);

		JLabel lblF_6 = new JLabel("吊环孔径 ф:");
		lblF_6.setBounds(15, 347, 117, 38);
		panel_1.add(lblF_6);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(130, 352, 179, 24);
		panel_1.add(textField_16);

		JLabel lblR_6 = new JLabel("环内半径 R:");
		lblR_6.setBounds(15, 400, 117, 38);
		panel_1.add(lblR_6);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(130, 405, 179, 24);
		panel_1.add(textField_17);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(18, 466, 330, 278);
		panel_1.add(panel_6);

		JLabel lblA = new JLabel("截面强度安全系数 a：");
		lblA.setBounds(15, 26, 275, 38);
		panel_6.add(lblA);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(111, 68, 179, 24);
		panel_6.add(textField_18);

		JLabel lblB = new JLabel("b ：");
		lblB.setBounds(15, 176, 117, 38);
		panel_6.add(lblB);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(111, 180, 179, 24);
		panel_6.add(textField_19);

		JButton button_2 = new JButton("计算");
		button_2.setBounds(104, 234, 123, 29);
		panel_6.add(button_2);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(
				new TitledBorder(null, "\u62C9\u68D2\u8BA1\u7B97", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(1246, 27, 359, 518);
		contentPane.add(panel_7);
		panel_7.setLayout(null);

		Icon icon5 = Tool.getIcon("./resources/tool/tool5.png", -1, 70);
		JLabel label_4 = new JLabel(icon5, JLabel.CENTER);
		label_4.setBounds(15, 29, 329, 154);
		panel_7.add(label_4);
		
		JLabel lblF_7 = new JLabel("拉力 F");
		lblF_7.setBounds(15, 226, 117, 38);
		panel_7.add(lblF_7);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(130, 231, 179, 24);
		panel_7.add(textField_20);
		
		JLabel label_6 = new JLabel("拉棒直径ф:");
		label_6.setBounds(15, 285, 117, 38);
		panel_7.add(label_6);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(130, 290, 179, 24);
		panel_7.add(textField_21);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(15, 335, 330, 154);
		panel_7.add(panel_8);
		
		JLabel lblA_1 = new JLabel("强度校核 δ：");
		lblA_1.setBounds(15, 26, 166, 38);
		panel_8.add(lblA_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(132, 37, 179, 24);
		panel_8.add(textField_22);
		
		JButton button_3 = new JButton("计算");
		button_3.setBounds(102, 90, 123, 29);
		panel_8.add(button_3);
	}
}
