package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JFrame;

import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述： 桩锚
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.anchor
 * @author: 拉布拉多
 * @date: 2020年10月12日 下午1:28:49
 */

public class PileAnchor extends FatherFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
					PileAnchor frame = new PileAnchor(new ctgu.Entity.anchorcal.PileAnchor());
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
	public PileAnchor(ctgu.Entity.anchorcal.PileAnchor pAnchor) {
		setTitle("桩锚");
		setBounds(100, 100, 1135, 679);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 576, 393);
		getContentPane().add(panel_1);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u4E09\u6869\u5F0F\u5730\u951A",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setLayout(null);
		Icon icon1 = Tool.getIcon("./resources/anchor/anchor9.png", -1, 360);
		JLabel label = new JLabel(icon1, JLabel.CENTER);
		label.setBounds(14, 28, 552, 352);
		panel_1.add(label);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 433, 576, 171);
		getContentPane().add(panel_2);
		panel_2.setBorder(new TitledBorder(null,
				"\u6869\u627F\u53D7\u7684\u529B\u5BF9\u6869\u4F53\u6784\u6210\u5F2F\u66F2\u5E94\u529B",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>着力点与地面间的距离 a<sub>1</sub>:</html>");
		lblNewLabel.setBounds(14, 25, 191, 30);
		panel_2.add(lblNewLabel);

		textField = new JTextField(String.valueOf(pAnchor.a1));
		textField.setBounds(240, 25, 146, 24);
		panel_2.add(textField);
		textField.setColumns(10);

		JLabel lblCm = new JLabel("mm");
		lblCm.setBounds(400, 28, 46, 18);
		panel_2.add(lblCm);

		JLabel lblC = new JLabel("<html>地面与最大弯矩处间的距离 c<sub>1</sub>:</html>");
		lblC.setBounds(14, 81, 230, 30);
		panel_2.add(lblC);

		textField_1 = new JTextField(String.valueOf(pAnchor.c1));
		textField_1.setColumns(10);
		textField_1.setBounds(240, 83, 146, 24);
		panel_2.add(textField_1);

		JLabel lblMm_1 = new JLabel("mm");
		lblMm_1.setBounds(400, 86, 46, 18);
		panel_2.add(lblMm_1);

		JLabel lblNewLabel_1 = new JLabel("作用于桩锚上的拉力 N:");
		lblNewLabel_1.setBounds(14, 140, 191, 18);
		panel_2.add(lblNewLabel_1);

		textField_2 = new JTextField(String.valueOf(pAnchor.N));
		textField_2.setColumns(10);
		textField_2.setBounds(240, 134, 146, 24);
		panel_2.add(textField_2);

		JLabel lblN = new JLabel("N");
		lblN.setBounds(400, 137, 46, 18);
		panel_2.add(lblN);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null,
				"\u6869\u627F\u53D7\u7684\u529B\u5BF9\u6869\u4F53\u6784\u6210\u5F2F\u66F2\u5E94\u529B",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(600, 11, 485, 222);
		getContentPane().add(panel);
		panel.setLayout(null);

		JRadioButton radioButton = new JRadioButton("< 75 * 8");
		radioButton.setBounds(69, 64, 157, 27);
		panel.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("< 80 * 8");
		radioButton_1.setBounds(298, 64, 157, 27);
		panel.add(radioButton_1);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);

		if (pAnchor.btn1 == 1.0) {
			radioButton.setSelected(true);
		} else if (pAnchor.btn1 == 2.0) {
			radioButton_1.setSelected(true);
		} else {
			pAnchor.btn1 = 1.0;
			radioButton.setSelected(true);
			pAnchor.W = 8190.0;
		}

		JLabel lblw = new JLabel("单根桩的抗弯截面系数 W:");
		lblw.setBounds(14, 33, 200, 18);
		panel.add(lblw);

		JLabel lblNewLabel_2 = new JLabel(String.valueOf(pAnchor.W));
		lblNewLabel_2.setBounds(206, 33, 118, 18);
		panel.add(lblNewLabel_2);

		JLabel lblCm_1 = new JLabel("<html>mm<sup>3</sup></html>");
		lblCm_1.setBounds(338, 24, 72, 27);
		panel.add(lblCm_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Config.ResColor);
		panel_3.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(14, 124, 446, 81);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel label_3 = new JLabel("<html>弯曲应力б<sub>1</sub>：</html>");
		label_3.setBounds(14, 32, 133, 18);
		panel_3.add(label_3);

		textField_3 = new JTextField(String.valueOf(pAnchor.res1));
		textField_3.setColumns(10);
		textField_3.setBounds(111, 28, 146, 24);
		panel_3.add(textField_3);

		JButton button = new JButton("计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField, textField_1, textField_2);
				if (check == ResponseCode.NoData) {

				} else if (check == ResponseCode.UnKnowERR) {

				} else if (check == ResponseCode.DataERR) {

				} else if (check == ResponseCode.UnKnowERR) {

				}
			}
		});
		button.setBounds(271, 27, 113, 27);
		panel_3.add(button);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null,
				"\u6309\u571F\u58E4\u7684\u5141\u8BB8\u7684\u8010\u529B\u8BA1\u7B97\u5355\u6869\u7684\u5BB9\u8BB8\u627F\u8F7D\u529B",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(600, 246, 485, 288);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);

		JLabel label_4 = new JLabel("土壤类型：");
		label_4.setBounds(14, 31, 107, 18);
		panel_4.add(label_4);

		JRadioButton radioButton_2 = new JRadioButton("坚土");
		radioButton_2.setBounds(45, 58, 85, 27);
		panel_4.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("次坚土");
		radioButton_3.setBounds(151, 58, 85, 27);
		panel_4.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("普通土");
		radioButton_4.setBounds(261, 58, 85, 27);
		panel_4.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("软土");
		radioButton_5.setBounds(363, 58, 85, 27);
		panel_4.add(radioButton_5);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton_2);
		buttonGroup2.add(radioButton_3);
		buttonGroup2.add(radioButton_4);
		buttonGroup2.add(radioButton_5);

		if (pAnchor.btn2 == 1.0) {
			radioButton_2.setSelected(true);
		} else if (pAnchor.btn2 == 2.0) {
			radioButton_3.setSelected(true);
		} else if (pAnchor.btn2 == 3.0) {
			radioButton_4.setSelected(true);
		} else if (pAnchor.btn2 == 4.0) {
			radioButton_5.setSelected(true);
		} else {
			pAnchor.btn2 = 1.0;
			radioButton_2.setSelected(true);
		}

		JLabel lbld = new JLabel("<html>单桩地下部分的计算宽度d<sub>1</sub>：</html>");
		lbld.setBounds(14, 96, 234, 34);
		panel_4.add(lbld);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(224, 100, 146, 24);
		panel_4.add(textField_4);

		JLabel lblMm = new JLabel("mm");
		lblMm.setBounds(382, 103, 46, 18);
		panel_4.add(lblMm);

		JLabel lblb = new JLabel("<html>单桩打入地下的深度b<sub>1</sub>：</html>");
		lblb.setBounds(14, 143, 234, 34);
		panel_4.add(lblb);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(224, 147, 146, 24);
		panel_4.add(textField_5);

		JLabel label_5 = new JLabel("mm");
		label_5.setBounds(382, 150, 46, 18);
		panel_4.add(label_5);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Config.ResColor);
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(14, 190, 446, 81);
		panel_4.add(panel_5);

		JLabel lblp = new JLabel("<html>容许承载力P:</html>");
		lblp.setBounds(14, 32, 133, 18);
		panel_5.add(lblp);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(111, 28, 146, 24);
		panel_5.add(textField_6);

		JButton button_1 = new JButton("计算");
		button_1.setBounds(271, 27, 113, 27);
		panel_5.add(button_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(600, 547, 485, 57);
		getContentPane().add(panel_6);
		panel_6.setLayout(null);

		JButton btnNewButton = new JButton("打印");
		btnNewButton.setBounds(48, 13, 113, 27);
		panel_6.add(btnNewButton);

		JButton button_2 = new JButton("保存");
		button_2.setBounds(276, 13, 113, 27);
		panel_6.add(button_2);

	}
}
