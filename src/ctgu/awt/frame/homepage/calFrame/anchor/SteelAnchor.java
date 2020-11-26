package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import javax.swing.border.TitledBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;

/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：钢板地锚计算模型)
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1058, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u6A21\u578B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(14, 13, 529, 339);
		contentPane.add(panel);
		panel.setLayout(null);
		
		/*
		 * 设置图片
		 */
//		Icon icon1 = new ImageIcon("./resources/anchor/anchor8.png");
		Icon icon1 = new ImageIcon("./resources/anchor/anchor10.png");
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 320, Image.SCALE_DEFAULT);//缩放图片大小
		((ImageIcon) icon1).setImage(image);
		
		JLabel label_4 = new JLabel(icon1,JLabel.CENTER);
		label_4.setBounds(14, 19, 499, 307);
		panel.add(label_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u5730\u951A\u5C3A\u5BF8\u53CA\u57CB\u6DF1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(14, 355, 529, 222);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblH = new JLabel("地锚的埋置深度 h :");
		lblH.setBounds(10, 29, 145, 18);
		panel_1.add(lblH);
		
		JLabel label = new JLabel("地锚的受力方向与地面夹角 α:");
		label.setBounds(10, 69, 255, 18);
		panel_1.add(label);
		
		JLabel lblA = new JLabel("钢板地锚长度 a :");
		lblA.setBounds(10, 145, 237, 18);
		panel_1.add(lblA);
		
		JLabel lblB = new JLabel("钢板地锚的宽度b :");
		lblB.setBounds(10, 176, 237, 18);
		panel_1.add(lblB);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 213, 46, 18);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("地锚的抗拔安全系数 K:");
		label_2.setBounds(10, 103, 237, 18);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(268, 29, 136, 24);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 66, 136, 24);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(268, 100, 136, 24);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(268, 142, 136, 24);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(268, 173, 136, 24);
		panel_1.add(textField_4);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(418, 32, 64, 18);
		panel_1.add(lblM);
		
		JLabel label_6 = new JLabel("°");
		label_6.setBounds(418, 69, 47, 18);
		panel_1.add(label_6);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setBounds(418, 145, 64, 18);
		panel_1.add(lblCm);
		
		JLabel label_7 = new JLabel("cm");
		label_7.setBounds(418, 176, 64, 18);
		panel_1.add(label_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u571F\u58E4\u7279\u6027", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(591, 13, 394, 329);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblYy = new JLabel("<html>土壤密度 y<sub>0</sub>:</html>");
		lblYy.setBounds(14, 216, 148, 33);
		panel_2.add(lblYy);
		
		JLabel label_3 = new JLabel("<html>土壤的计算抗拔角 φ<sub>1</sub>:</html>");
		label_3.setBounds(14, 283, 196, 33);
		panel_2.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(178, 219, 136, 24);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(178, 286, 136, 24);
		panel_2.add(textField_6);
		
		JLabel lblKgm = new JLabel("kg/m3");
		lblKgm.setBounds(319, 222, 72, 18);
		panel_2.add(lblKgm);
		
		JLabel label_8 = new JLabel("°");
		label_8.setBounds(319, 289, 47, 18);
		panel_2.add(label_8);
		
		
		JRadioButton rdbtnt_1 = new JRadioButton("10T地锚");
		rdbtnt_1.setBounds(172, 37, 93, 27);
		panel_2.add(rdbtnt_1);
		
		JRadioButton rdbtnt = new JRadioButton("5T地锚");
		rdbtnt.setBounds(58, 37, 93, 27);
		panel_2.add(rdbtnt);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnt);
		buttonGroup.add(rdbtnt_1);
		
		
		JRadioButton radioButton = new JRadioButton("5T地锚");
		radioButton.setBounds(58, 37, 93, 27);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("10T地锚");
		radioButton_1.setBounds(172, 37, 93, 27);
		panel_2.add(radioButton_1);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("特坚土");
		rdbtnNewRadioButton_1.setBounds(55, 124, 101, 27);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("坚土");
		radioButton_2.setBounds(154, 124, 77, 27);
		panel_2.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("次坚土");
		radioButton_3.setBounds(237, 124, 114, 27);
		panel_2.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("普通土");
		radioButton_4.setBounds(74, 156, 106, 27);
		panel_2.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("软土");
		radioButton_5.setBounds(178, 156, 87, 27);
		panel_2.add(radioButton_5);
		
		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_1);
		buttonGroup3.add(radioButton_2);
		buttonGroup3.add(radioButton_3);
		buttonGroup3.add(radioButton_4);
		buttonGroup3.add(radioButton_5);
		
		JLabel label_9 = new JLabel("土壤类型：");
		label_9.setBounds(14, 84, 114, 18);
		panel_2.add(label_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(591, 355, 394, 222);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("地锚抗拔力:");
		lblNewLabel.setBounds(14, 27, 93, 18);
		panel_3.add(lblNewLabel);
		
		JLabel label_5 = new JLabel("验算结果：");
		label_5.setBounds(14, 58, 93, 18);
		panel_3.add(label_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("true");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setBounds(57, 92, 83, 27);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFalse = new JRadioButton("false");
		rdbtnFalse.setBackground(Color.LIGHT_GRAY);
		rdbtnFalse.setBounds(170, 92, 83, 27);
		panel_3.add(rdbtnFalse);
		
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton);
		buttonGroup2.add(rdbtnFalse);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setColumns(10);
		textField_7.setBounds(103, 24, 136, 24);
		panel_3.add(textField_7);
		
		JButton button = new JButton("计算");
		button.setBounds(46, 128, 113, 27);
		panel_3.add(button);
		
		JButton button_1 = new JButton("保存");
		button_1.setBounds(224, 128, 113, 27);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("打印");
		button_2.setBounds(46, 182, 113, 27);
		panel_3.add(button_2);
	}
}

