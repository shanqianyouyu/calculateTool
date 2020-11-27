package ctgu.awt.frame.homepage.calFrame.anchor;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.util.ResponseCode;

import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：圆木地锚计算模型（可删）
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.anchor
 * @author: 拉布拉多
 * @date: 2020年9月23日 上午8:48:19
 */

public class LogAnchor extends FatherFrame {

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogAnchor frame = new LogAnchor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogAnchor() {
		init(new ctgu.Entity.anchorcal.LogAnchor());
	}

	public LogAnchor(ctgu.Entity.anchorcal.LogAnchor aLogAnchor) {
		init(aLogAnchor);
	}

	/**
	 * Create the frame.
	 */
	private ctgu.Entity.anchorcal.LogAnchor logAnchor = null;

	private void init(ctgu.Entity.anchorcal.LogAnchor l) {
		logAnchor = l;
		setTitle("圆木地锚计算");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1154, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder("圆木地锚计算模型"));
		panel.setBounds(14, 13, 510, 466);
		contentPane.add(panel);
		panel.setLayout(null);

		// 图片
		Icon icon1 = new ImageIcon("./resources/anchor/anchor6.png");
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 430, Image.SCALE_DEFAULT);// 缩放图片大小
		((ImageIcon) icon1).setImage(image);

		JLabel label = new JLabel(icon1, JLabel.CENTER);
		label.setBounds(14, 26, 486, 427);
		panel.add(label);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder("地锚尺寸及埋深"));
		panel_1.setBounds(14, 492, 510, 133);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblH = new JLabel("地锚的埋置深度 h:");
		lblH.setBounds(14, 27, 148, 18);
		panel_1.add(lblH);

		JLabel lblH_1 = new JLabel("地锚的受力方向与地面夹角 α:");
		lblH_1.setBounds(14, 56, 237, 18);
		panel_1.add(lblH_1);

		JLabel lblH_2 = new JLabel("地锚的抗拔安全系数 K:");
		lblH_2.setBounds(14, 87, 237, 18);
		panel_1.add(lblH_2);

		textField = new JTextField();
		textField.setText(logAnchor.A1);
		textField.setBounds(165, 24, 153, 24);
		panel_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText(logAnchor.A4);
		textField_1.setColumns(10);
		textField_1.setBounds(232, 53, 153, 24);
		panel_1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText(logAnchor.A5);
		textField_2.setColumns(10);
		textField_2.setBounds(182, 84, 153, 24);
		panel_1.add(textField_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder("地锚尺寸及埋深"));
		panel_2.setBounds(558, 13, 494, 98);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblL = new JLabel("地埋木或钢管长度 L :");
		lblL.setBounds(14, 27, 237, 18);
		panel_2.add(lblL);

		JLabel lblD = new JLabel("地埋木或钢管的中度直径 d :");
		lblD.setBounds(14, 58, 237, 18);
		panel_2.add(lblD);

		textField_3 = new JTextField();
		textField_3.setText(logAnchor.A6);
		textField_3.setColumns(10);
		textField_3.setBounds(181, 24, 153, 24);
		panel_2.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText(logAnchor.A7);
		textField_4.setColumns(10);
		textField_4.setBounds(221, 55, 153, 24);
		panel_2.add(textField_4);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u6750\u8D28", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(558, 126, 494, 76);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Φ 230 * 160钢管");
		rdbtnNewRadioButton.setBounds(10, 38, 199, 27);
		panel_3.add(rdbtnNewRadioButton);

		JRadioButton radioButton = new JRadioButton("斜向地埋木");
		radioButton.setBounds(215, 38, 157, 27);
		panel_3.add(radioButton);

		// 添加按钮到按钮组
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(radioButton);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(
				new TitledBorder(null, "\u571F\u58E4\u7279\u6027", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(558, 212, 501, 156);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JLabel label_3 = new JLabel("土壤类别：");
		label_3.setBounds(14, 26, 95, 18);
		panel_4.add(label_3);

		JRadioButton radioButton_1 = new JRadioButton("特坚土");
		radioButton_1.setBounds(10, 42, 127, 27);
		panel_4.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("坚土");
		radioButton_2.setBounds(135, 42, 81, 27);
		panel_4.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("次坚土");
		radioButton_3.setBounds(222, 42, 81, 27);
		panel_4.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("普通土");
		radioButton_4.setBounds(309, 42, 81, 27);
		panel_4.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("软土");
		radioButton_5.setBounds(396, 42, 99, 27);
		panel_4.add(radioButton_5);

		// 添加按钮到按钮组
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(radioButton_1);
		bGroup.add(radioButton_2);
		bGroup.add(radioButton_3);
		bGroup.add(radioButton_4);
		bGroup.add(radioButton_5);

		JLabel label_4 = new JLabel("土壤密度:");
		label_4.setBounds(14, 85, 237, 18);
		panel_4.add(label_4);

		JLabel label_5 = new JLabel("<html>土壤的计算抗拔角:Φ<sub>1</sub>:</html>");
		label_5.setBounds(14, 117, 237, 18);
		panel_4.add(label_5);

		textField_5 = new JTextField();
		textField_5.setText(logAnchor.A2);
		textField_5.setColumns(10);
		textField_5.setBounds(198, 113, 153, 24);
		panel_4.add(textField_5);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(
				new TitledBorder(null, "\u8BA1\u7B97\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(558, 381, 498, 98);
		contentPane.add(panel_5);
		panel_5.setLayout(null);

		JLabel label_6 = new JLabel("<html>地锚抗拔的土壤体积 V<sub>b</sub>:</html>");
		label_6.setBounds(14, 24, 211, 27);
		panel_5.add(label_6);

		JLabel label_7 = new JLabel("地锚的容许抗拔力 P：");
		label_7.setBounds(24, 64, 155, 18);
		panel_5.add(label_7);

		textField_6 = new JTextField();
		textField_6.setText(logAnchor.AO1);
		textField_6.setColumns(10);
		textField_6.setBounds(199, 24, 153, 24);
		panel_5.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText(logAnchor.AO2);
		textField_7.setColumns(10);
		textField_7.setBounds(179, 61, 153, 24);
		panel_5.add(textField_7);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u9A8C\u7B97",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(554, 492, 498, 98);
		contentPane.add(panel_6);

		JRadioButton radioButton_6 = new JRadioButton("通过");
		radioButton_6.setBounds(10, 38, 127, 27);
		panel_6.add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton("未通过");
		radioButton_7.setBounds(297, 38, 127, 27);
		panel_6.add(radioButton_7);

		JButton button = new JButton("计算");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int vis = checkLegal();// 参数是否合法
				System.out.println(vis);
				if (vis == ResponseCode.OK) {
					// 计算
					logAnchor.A1 = textField.getText().trim();
					logAnchor.A4 = textField_1.getText().trim();
					logAnchor.A5 = textField_2.getText().trim();
					logAnchor.A6 = textField_3.getText().trim();
					logAnchor.A7 = textField_4.getText().trim();
					logAnchor.A6 = textField_5.getText().trim();

				} else if (vis == ResponseCode.NoData) {
					JOptionPane.showConfirmDialog(null, "参数不全");
				}
			}
		});
		button.setBounds(113, 659, 113, 27);
		contentPane.add(button);

		JButton button_1 = new JButton("保存");
		button_1.setBounds(501, 659, 113, 27);
		contentPane.add(button_1);

		JButton button_2 = new JButton("打印");
		button_2.setBounds(912, 659, 113, 27);
		contentPane.add(button_2);
	}

	/**
	 * 判断参数是否合法
	 * 
	 * @return Response
	 */
	int checkLegal() {
		if (null == textField_1 || null == textField_2 || null == textField_3 || null == textField_4
				|| null == textField_5 || null == textField) {
			return ResponseCode.NoData;
		}
//		System.out.println(textField.getText().trim().length() + " " + textField_1.getText());
		if (textField_1.getText().trim().length() == 0 || textField_2.getText().trim().length() == 0
				|| textField_3.getText().trim().length() == 0 || textField_4.getText().trim().length() == 0
				|| textField_5.getText().trim().length() == 0 || textField.getText().trim().length() == 0) {
			return ResponseCode.NoData;
		}
		return ResponseCode.OK;
	}
}
