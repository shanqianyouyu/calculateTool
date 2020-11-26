package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：枕木单柱式立式地锚计算模型（无用，可删）
 * @Package: ctgu.awt.frame.homepage.calFrame.anchor 
 * @author: 拉布拉多   
 */

public class SleeperAnchor extends FatherFrame {

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
	private JTextField textField_23;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SleeperAnchor frame = new SleeperAnchor(new ctgu.Entity.anchorcal.SleeperAnchor());
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
	public SleeperAnchor(ctgu.Entity.anchorcal.SleeperAnchor sleeperAnchor) {
		setTitle("枕木单柱式立式地锚计算模型");
		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1451, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 * 设置图片
		 */
		Icon icon1 = new ImageIcon("./resources/anchor/anchor7.png");
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 400, Image.SCALE_DEFAULT);//缩放图片大小
		((ImageIcon) icon1).setImage(image);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u6A21\u578B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(14, 26, 513, 418);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(icon1,JLabel.CENTER);
		lblNewLabel.setBounds(14, 13, 494, 392);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8F7D\u8377", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(14, 457, 513, 128);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblN = new JLabel("地锚作用载荷 N");
		lblN.setBounds(14, 26, 143, 18);
		panel_1.add(lblN);
		
		JLabel label = new JLabel("<html>地锚作用载荷沿地锚轴向的分力 N<sub>2</sub></html>");
		label.setBounds(14, 57, 293, 32);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("<html>地锚作用载荷对垂直地锚轴向的分力 N<sub>1</sub></html>");
		label_1.setBounds(14, 94, 293, 32);
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(171, 23, 136, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(319, 60, 136, 24);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(319, 97, 136, 24);
		panel_1.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u5730\u951A\u5C3A\u5BF8\u53CA\u57CB\u6DF1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(14, 598, 513, 69);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("地龙柱与挡木间摩擦系数 μ取 0.4");
		label_2.setBounds(14, 28, 281, 18);
		panel_2.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(319, 25, 136, 24);
		panel_2.add(textField_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u5730\u951A\u5C3A\u5BF8\u53CA\u57CB\u6DF1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(541, 26, 467, 415);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblK = new JLabel("地锚抗拔安全系数，取 k > 2");
		lblK.setBounds(14, 23, 225, 18);
		panel_3.add(lblK);
		
		JLabel lblNp = new JLabel("<html>N<sub>1</sub>到 P<sub>1</sub>的轴向距离 a<sub>1</sub></html>");
		lblNp.setBounds(14, 44, 225, 24);
		panel_3.add(lblNp);
		
		JLabel lblPpA = new JLabel("<html>P<sub>1</sub>到 P<sub>2</sub>的轴向距离 a<sub>1</sub></html>");
		lblPpA.setBounds(14, 77, 225, 24);
		panel_3.add(lblPpA);
		
		JLabel label_3 = new JLabel("土壤承载力降低系数 η取 0.25-0.7");
		label_3.setBounds(14, 114, 281, 18);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("<html>上挡木宽度 h<sub>1</sub></html>");
		label_4.setBounds(14, 145, 114, 24);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("<html>下挡木宽度 h<sub>2</sub></html>");
		label_5.setBounds(14, 182, 114, 24);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("<html>上挡木长度 L<sub>1</sub></html>");
		label_6.setBounds(14, 219, 114, 24);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("<html>下挡木宽度 L<sub>2</sub></html>");
		label_7.setBounds(14, 256, 114, 24);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("<html>上挡木深度 H<sub>1</sub></html>");
		label_8.setBounds(14, 293, 114, 24);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("<html>下挡木深度 H<sub>2</sub></html>");
		label_9.setBounds(14, 330, 114, 24);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("地锚作用载荷与垂直地锚轴向的夹角 α");
		label_10.setBounds(16, 367, 281, 18);
		panel_3.add(label_10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(271, 13, 136, 24);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(271, 47, 136, 24);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(271, 76, 136, 24);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(271, 111, 136, 24);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(271, 145, 136, 24);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(271, 181, 136, 24);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(271, 218, 136, 24);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(271, 255, 136, 24);
		panel_3.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(271, 292, 136, 24);
		panel_3.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(271, 329, 136, 24);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(281, 364, 136, 24);
		panel_3.add(textField_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\u622A\u9762\u7279\u6027", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(542, 450, 467, 97);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblp = new JLabel("<html>地龙柱在P<sub>1</sub>作用点的横截面积 A<sub>1</sub></html>");
		lblp.setBounds(15, 28, 237, 24);
		panel_4.add(lblp);
		
		JLabel label_11 = new JLabel("<html>地龙柱在P<sub>1</sub>作用点的横截抵抗拒 W<sub>1</sub></html>");
		label_11.setBounds(15, 59, 237, 24);
		panel_4.add(label_11);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(266, 28, 136, 24);
		panel_4.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(266, 59, 136, 24);
		panel_4.add(textField_16);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u6750\u8D28\u7279\u6027", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(543, 561, 466, 106);
		contentPane.add(panel_5);
		
		JLabel label_12 = new JLabel("<html>深度H<sub>1</sub>处的土壤承载力设计值 f<sub>H</sub><sub>1</sub></html>");
		label_12.setBounds(15, 28, 237, 24);
		panel_5.add(label_12);
		
		JLabel label_13 = new JLabel("<html>深度H<sub>2</sub>处的土壤承载力设计值 f<sub>H</sub><sub>2</sub></html>");
		label_13.setBounds(15, 59, 237, 24);
		panel_5.add(label_13);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(266, 27, 136, 24);
		panel_5.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(266, 58, 136, 24);
		panel_5.add(textField_18);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "\u6750\u8D28\u7279\u6027", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(1022, 26, 397, 69);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel label_14 = new JLabel("<html>木材抗拉﹑抗弯强度设计值f<sub>t</sub></html>");
		label_14.setBounds(14, 23, 237, 24);
		panel_6.add(label_14);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(216, 22, 136, 24);
		panel_6.add(textField_19);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(1022, 108, 397, 208);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html>上挡木的水平反力 P<sub>1</sub></html>");
		lblNewLabel_1.setBounds(14, 23, 155, 24);
		panel_7.add(lblNewLabel_1);
		
		JLabel label_15 = new JLabel("<html>下挡木的水平反力 P<sub>2</sub></html>");
		label_15.setBounds(14, 60, 155, 24);
		panel_7.add(label_15);
		
		JLabel lblNewLabel_2 = new JLabel("<html>N<sub>1</sub>对土地产生的上挡板处压力F<sub>1</sub></html>");
		lblNewLabel_2.setBounds(14, 97, 224, 24);
		panel_7.add(lblNewLabel_2);
		
		JLabel label_16 = new JLabel("<html>N<sub>1</sub>对土地产生的下挡板处压力F<sub>2</sub></html>");
		label_16.setBounds(14, 134, 224, 24);
		panel_7.add(label_16);
		
		JLabel lblNewLabel_3 = new JLabel("地锚强度 f");
		lblNewLabel_3.setBounds(14, 171, 110, 18);
		panel_7.add(lblNewLabel_3);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(165, 22, 136, 24);
		panel_7.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(165, 59, 136, 24);
		panel_7.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(230, 96, 136, 24);
		panel_7.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(230, 133, 136, 24);
		panel_7.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(99, 168, 136, 24);
		panel_7.add(textField_24);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u9A8C\u7B97", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(1022, 329, 397, 338);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel label_17 = new JLabel("地锚的抗拔验算");
		label_17.setBounds(14, 33, 129, 18);
		panel_8.add(label_17);
		
		JLabel label_18 = new JLabel("<html>N<sub>1</sub>对土地产生的压力验算</html>");
		label_18.setBounds(14, 114, 181, 43);
		panel_8.add(label_18);
		
		JLabel label_19 = new JLabel("地锚的强度验算");
		label_19.setBounds(14, 219, 122, 18);
		panel_8.add(label_19);
		
		JRadioButton rdbtnTrue = new JRadioButton("true");
		rdbtnTrue.setBounds(14, 70, 86, 27);
		panel_8.add(rdbtnTrue);
		
		JRadioButton rdbtnFalse = new JRadioButton("false");
		rdbtnFalse.setBounds(122, 70, 86, 27);
		panel_8.add(rdbtnFalse);
		
		JRadioButton radioButton = new JRadioButton("true");
		radioButton.setBounds(14, 166, 86, 27);
		panel_8.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("false");
		radioButton_1.setBounds(122, 166, 86, 27);
		panel_8.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("true");
		radioButton_2.setBounds(14, 257, 86, 27);
		panel_8.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("false");
		radioButton_3.setBounds(122, 257, 86, 27);
		panel_8.add(radioButton_3);
	}
}

