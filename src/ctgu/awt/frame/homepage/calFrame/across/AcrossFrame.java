package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.Entity.Across.Across;
import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.calFrame.across
 * @author: 拉布拉多
 */

public class AcrossFrame extends FatherFrame {

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
	private JTextField textField_23;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_22;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcrossFrame frame = new AcrossFrame(new Across());
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
	public AcrossFrame(Across item) {
		setTitle("跨越架计算");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1646, 825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(Tool.getIcon("./resources/across/Across1.png", -1, 238));
		lblNewLabel.setBounds(14, 13, 446, 242);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u8DE8\u8D8A\u67B6\u7684\u57FA\u672C\u53C2\u6570\u8BA1\u7B97",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(14, 268, 454, 502);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblN = new JLabel("子导数根数 n：");
		lblN.setBounds(14, 29, 131, 18);
		panel.add(lblN);

		textField = new JTextField();
		textField.setBounds(178, 27, 108, 24);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblQ = new JLabel("导线线密度 q：");
		lblQ.setBounds(14, 62, 131, 18);
		panel.add(lblQ);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(178, 60, 108, 24);
		panel.add(textField_1);

		JLabel lblNm = new JLabel("N/m");
		lblNm.setBounds(300, 63, 72, 18);
		panel.add(lblNm);

		JLabel lblUs = new JLabel("<html>风荷调整系数 u<sub>s</sub>：</html>");
		lblUs.setBounds(14, 93, 157, 24);
		panel.add(lblUs);

		JLabel lblmm = new JLabel("高度30m以下取1.1，30~50m取1.5");
		lblmm.setForeground(Color.RED);
		lblmm.setBounds(24, 118, 273, 18);
		panel.add(lblmm);
		lblmm.setVisible(false);
		textField_2 = new JTextField();
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblmm.setVisible(true);

			}

			@Override
			public void focusLost(FocusEvent e) {
				lblmm.setVisible(false);
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(178, 93, 108, 24);
		panel.add(textField_2);

		JRadioButton radioButton = new JRadioButton("圆形杆件");
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn1 = 1.0;
				item.b1z = 0.7;
				textField_3.setText("0.7");

			}
		});
		radioButton.setBounds(20, 140, 144, 27);
		panel.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("平面杆件");
		radioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn1 = 2.0;
				item.b1z = 1.3;
				textField_3.setText("1.3");
			}
		});

		radioButton_1.setBounds(163, 140, 123, 27);
		panel.add(radioButton_1);

		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton);
		buttonGroup1.add(radioButton_1);

		JLabel lblUs_1 = new JLabel("<html>风载体型系数 β<sub>z</sub>：</html>");
		lblUs_1.setBounds(14, 177, 182, 24);
		panel.add(lblUs_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(178, 176, 94, 24);
		panel.add(textField_3);
		if (item.btn1 == 1.0) {
			radioButton.setSelected(true);
			item.b1z = 0.7;
			textField_3.setText("0.7");
		} else {
			radioButton_1.setSelected(true);
			item.b1z = 1.3;
			textField_3.setText("1.3");
		}

		JLabel lblV = new JLabel("路线设计最大风速 V：");
		lblV.setBounds(14, 217, 182, 18);
		panel.add(lblV);

		JLabel label = new JLabel("取值为25~30");

		label.setForeground(Color.RED);
		label.setBounds(14, 240, 273, 18);
		panel.add(label);
		label.setVisible(false);
		textField_4 = new JTextField();
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				label.setVisible(true);
			}

			@Override
			public void focusLost(FocusEvent e) {
				label.setVisible(false);
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(178, 214, 94, 24);
		panel.add(textField_4);

		JLabel lblMs = new JLabel("m/s");
		lblMs.setBounds(274, 217, 72, 18);
		panel.add(lblMs);

		JLabel lblmAs = new JLabel("<html>架面1m范围的投影面积 A<sub>s</sub>：</html>");
		lblmAs.setBounds(14, 271, 215, 33);
		panel.add(lblmAs);
		JLabel label_1 = new JLabel("一般可取架面架面轮廓面积的30%到40%");
		textField_5 = new JTextField();
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				label_1.setVisible(true);
			}

			@Override
			public void focusLost(FocusEvent e) {
				label_1.setVisible(false);
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(203, 274, 108, 24);
		panel.add(textField_5);

		JLabel label_2 = new JLabel("m/s");
		label_2.setBounds(325, 277, 45, 18);
		panel.add(label_2);

		label_1.setForeground(Color.RED);
		label_1.setBounds(24, 299, 315, 18);
		panel.add(label_1);
		label_1.setVisible(false);

		JLabel lblz = new JLabel("<html>冲击系数 K<sub>1</sub>：</html>");
		lblz.setBounds(14, 333, 182, 24);
		panel.add(lblz);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(203, 330, 108, 24);
		panel.add(textField_6);

		JLabel label_3 = new JLabel("取值为1.3~1.5");
		label_3.setForeground(Color.RED);
		label_3.setBounds(24, 356, 273, 18);
		panel.add(label_3);

		JLabel lblAs = new JLabel("<html>导线或牵引绳对跨越架的摩擦系数 u<sub>0</sub>：</html>");
		lblAs.setBounds(14, 377, 263, 32);
		panel.add(lblAs);

		textField_7 = new JTextField();
		textField_7.setBounds(291, 380, 108, 24);
		panel.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblu = new JLabel(
				"<html>架顶为滚动横梁，u<sub>0</sub>=0.2〜0.3;<br>架顶为非滚动横梁，且为非金属材料，u<sub>0</sub>=0.7~1.0;<br>架顶力非滚动横梁，且为金属材料，u<sub>0</sub>=0.4~0.5<br></html>");
		lblu.setBounds(14, 411, 391, 78);
		panel.add(lblu);
		lblu.setForeground(Color.RED);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(482, 13, 389, 323);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(14, 13, 364, 307);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(Config.ResColor);

		JLabel lblWc = new JLabel("<html>跨越架的垂直载荷 W<sub>c</sub>：</html>");
		lblWc.setBounds(14, 25, 194, 24);
		panel_2.add(lblWc);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(191, 24, 69, 24);
		panel_2.add(textField_8);

		JLabel lblN_1 = new JLabel("N");
		lblN_1.setBounds(274, 25, 42, 18);
		panel_2.add(lblN_1);

		JLabel lblQf = new JLabel("<html>架面风压的均布载荷 q<sub>F</sub>：</html>");
		lblQf.setBounds(14, 52, 194, 24);
		panel_2.add(lblQf);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(190, 52, 69, 24);
		panel_2.add(textField_9);

		JLabel lblKnm = new JLabel("KN/m");
		lblKnm.setBounds(274, 52, 42, 18);
		panel_2.add(lblKnm);

		JLabel lblP = new JLabel("跨越架的水平荷载 P：");
		lblP.setBounds(14, 86, 176, 18);
		panel_2.add(lblP);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(190, 83, 69, 24);
		panel_2.add(textField_10);

		JLabel label_4 = new JLabel("N");
		label_4.setBounds(274, 84, 42, 18);
		panel_2.add(label_4);

		JLabel lblW = new JLabel("架顶宽度 W规范：");
		lblW.setBounds(14, 121, 176, 18);
		panel_2.add(lblW);

		JButton btnW = new JButton("查看规范");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name2 = "宽度规范";
				pictureWindow3 window3 = new pictureWindow3(name2);
			}
		});
		btnW.setBounds(157, 117, 113, 27);
		panel_2.add(btnW);

		JLabel lblS = new JLabel("<html>跨越架与铁路、公路及弱电线的最小安全距离 S<sub>1</sub>：</html>");
		lblS.setBounds(14, 152, 363, 35);
		panel_2.add(lblS);

		JButton button = new JButton("查看规范");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = "表1";
				TableWindows1 window1 = new TableWindows1();
				window1.setVisible(true);
			}
		});
		button.setBounds(157, 184, 113, 27);
		panel_2.add(button);

		JLabel lblS_1 = new JLabel("<html>跨越架与带电体之间的最小安全距离 S<sub>2</sub>：</html>");
		lblS_1.setBounds(14, 213, 363, 27);
		panel_2.add(lblS_1);

		JButton button_1 = new JButton("查看规范");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name1 = "表2";
				TableWindows2 window2 = new TableWindows2();
				window2.setVisible(true);
			}
		});
		button_1.setBounds(157, 241, 113, 27);
		panel_2.add(button_1);

		JButton button_2 = new JButton("计算");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int check = Tool.checkTextFiled(true, textField, textField_1, textField_2, textField_3, textField_4,
						textField_5, textField_6, textField_7);

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
				
				item.n11 = Double.valueOf(textField.getText().trim());
				item.q11 = Double.valueOf(textField_1.getText().trim());
				item.u1s = Double.valueOf(textField_2.getText().trim());
				item.b1z = Double.valueOf(textField_3.getText().trim());
				item.V11 = Double.valueOf(textField_4.getText().trim());
				item.A1s = Double.valueOf(textField_5.getText().trim());
				item.K11 = Double.valueOf(textField_6.getText().trim());
				item.u10 = Double.valueOf(textField_7.getText().trim());

				item.calPartOne();
				textField_8.setText(String.valueOf(item.W1c));
				textField_9.setText(String.valueOf(item.q1F));
				textField_10.setText(String.valueOf(item.P11));
			}
		});
		button_2.setBounds(14, 270, 113, 27);
		panel_2.add(button_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"\u7AF9\u3001\u6728\u6746\u8DE8\u8D8A\u67B6\u7684\u5B89\u88C5\u8BA1\u7B97", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(482, 352, 405, 433);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblHmax = new JLabel("<html>被跨电力线最高点的对地距离 H<sub>max</sub>：</html>");
		lblHmax.setBounds(14, 26, 271, 24);
		panel_3.add(lblHmax);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(263, 25, 63, 24);
		panel_3.add(textField_11);

		JLabel lblM = new JLabel("m");
		lblM.setBounds(340, 28, 42, 18);
		panel_3.add(lblM);

		JLabel lblkv = new JLabel("被跨越电力线电压(KV):");
		lblkv.setBounds(14, 48, 178, 24);
		panel_3.add(lblkv);

		JRadioButton radioButton_2 = new JRadioButton("≦10");
		radioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn2 = 1.0;
			}
		});
		radioButton_2.setBounds(24, 69, 79, 27);
		panel_3.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("35");
		radioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn2 = 2.0;
			}
		});
		radioButton_3.setBounds(109, 69, 63, 27);
		panel_3.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("60-110");
		radioButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn2 = 3.0;
			}
		});
		radioButton_4.setBounds(178, 69, 88, 27);
		panel_3.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("220");
		radioButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn2 = 4.0;
			}
		});
		radioButton_5.setBounds(263, 69, 63, 27);
		panel_3.add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton("330");
		radioButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn2 = 5.0;
			}
		});
		radioButton_6.setBounds(332, 69, 63, 27);
		panel_3.add(radioButton_6);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton_2);
		buttonGroup2.add(radioButton_3);
		buttonGroup2.add(radioButton_4);
		buttonGroup2.add(radioButton_5);
		buttonGroup2.add(radioButton_6);

		if (item.btn2 == 1.0)
			radioButton_2.setSelected(true);
		else if (item.btn2 == 2.0)
			radioButton_3.setSelected(true);
		else if (item.btn2 == 3.0)
			radioButton_4.setSelected(true);
		else if (item.btn2 == 4.0)
			radioButton_5.setSelected(true);
		else if (item.btn2 == 5.0)
			radioButton_6.setSelected(true);

		JRadioButton radioButton_7 = new JRadioButton("无地线");
		radioButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn3 = 1.0;
			}
		});
		radioButton_7.setBounds(79, 94, 108, 27);
		panel_3.add(radioButton_7);

		JRadioButton radioButton_8 = new JRadioButton("有地线");
		radioButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn3 = 2.0;
			}
		});
		radioButton_8.setBounds(216, 94, 108, 27);
		panel_3.add(radioButton_8);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(radioButton_7);
		buttonGroup3.add(radioButton_8);

		if (item.btn3 == 1.0)
			radioButton_7.setSelected(true);
		else if (item.btn3 == 2.0)
			radioButton_8.setSelected(true);

		JRadioButton radioButton_9 = new JRadioButton("封顶杆");
		radioButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn4 = 1.0;
			}
		});
		radioButton_9.setBounds(79, 126, 108, 27);
		panel_3.add(radioButton_9);

		JRadioButton radioButton_10 = new JRadioButton("封顶网");
		radioButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				item.btn4 = 2.0;
			}
		});
		radioButton_10.setBounds(216, 126, 108, 27);
		panel_3.add(radioButton_10);
		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(radioButton_9);
		buttonGroup4.add(radioButton_10);

		if (item.btn4 == 1.0)
			radioButton_9.setSelected(true);
		else if (item.btn4 == 2.0)
			radioButton_10.setSelected(true);

		JLabel lblF = new JLabel("跨越架封顶网的弧垂 f:");
		lblF.setBounds(14, 203, 178, 24);
		panel_3.add(lblF);

		JLabel lblFfm = new JLabel("<html>封顶用竹、木杆时，  f=0;<br>对于尼龙网，f=1~2m;</html>");
		lblFfm.setBounds(24, 227, 202, 46);
		panel_3.add(lblFfm);
		lblFfm.setForeground(Color.RED);

		textField_12 = new JTextField();
		textField_12.setBounds(192, 203, 108, 24);
		panel_3.add(textField_12);
		textField_12.setColumns(10);

		JLabel label_5 = new JLabel("m");
		label_5.setBounds(314, 206, 42, 18);
		panel_3.add(label_5);

		JLabel lblB = new JLabel("<html>施工线路的线间距离 B<sub>1</sub>：</html>");
		lblB.setBounds(14, 273, 194, 24);
		panel_3.add(lblB);

		textField_13 = new JTextField();
		textField_13.setBounds(192, 272, 108, 24);
		panel_3.add(textField_13);
		textField_13.setColumns(10);

		JLabel label_6 = new JLabel("m");
		label_6.setBounds(314, 275, 42, 18);
		panel_3.add(label_6);

		JLabel lblbmfm = new JLabel(
				"<html>对于单线，B<sub>1</sub>取0.5m;<br>对于双线，B<sub>1</sub>为线间距离;<br>对于三相线，B<sub>1</sub>为两边线的距离;</html>");
		lblbmfm.setBounds(24, 298, 235, 66);
		panel_3.add(lblbmfm);
		lblbmfm.setFont(new Font("宋体", Font.PLAIN, 13));
		lblbmfm.setForeground(Color.RED);

		JRadioButton rdbtnD = new JRadioButton("一般跨越架");
		rdbtnD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_14.setText("1.5");
			}
		});
		rdbtnD.setBounds(14, 366, 157, 27);
		panel_3.add(rdbtnD);

		JRadioButton radioButton_11 = new JRadioButton("不停电架线跨越架");
		radioButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_14.setText("1.7");
			}
		});
		radioButton_11.setBounds(189, 366, 180, 27);
		panel_3.add(radioButton_11);

		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(rdbtnD);
		buttonGroup5.add(radioButton_11);

		textField_14 = new JTextField();
		textField_14.setBounds(262, 402, 57, 24);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		if (item.btn5 == 1.0) {
			rdbtnD.setSelected(true);
			textField_14.setText("1.5");
		} else {
			radioButton_11.setSelected(true);
			textField_14.setText("1.7");
		}

		JLabel lblM_1 = new JLabel("跨越架顶面超出施工线路的宽度 M:");
		lblM_1.setBounds(14, 402, 259, 24);
		panel_3.add(lblM_1);

		JLabel label_7 = new JLabel("m");
		label_7.setBounds(333, 405, 42, 18);
		panel_3.add(label_7);

		JLabel label_40 = new JLabel("不同电压等级的电力线与封顶架面的最小垂直距离 a:");
		label_40.setBounds(14, 150, 375, 24);
		panel_3.add(label_40);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(14, 176, 108, 24);
		panel_3.add(textField_45);

		JLabel label_41 = new JLabel("m");
		label_41.setBounds(136, 179, 42, 18);
		panel_3.add(label_41);

		JButton button_8 = new JButton("获取");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vis1 = Integer.valueOf(String.valueOf(item.btn2.intValue()));
				int vis2 = Integer.valueOf(String.valueOf(item.btn3.intValue()));
				int vis3 = Integer.valueOf(String.valueOf(item.btn4.intValue()));
				Double res1 = null, res2 = null;
				switch (vis1) {
				case 1:
					res2 = 1.5;
					switch (vis2) {
					case 1:
						if (vis3 == 1.0)
							res1 = 2.0;
						else
							res1 = 3.0;
						break;
					case 2:
						if (vis3 == 1.0)
							res1 = 1.0;
						else
							res1 = 2.0;
						break;
					}
					break;
				case 2:
					res2 = 1.5;
					switch (vis2) {
					case 1:
						if (vis3 == 1.0)
							res1 = 2.0;
						else
							res1 = 3.0;
						break;
					case 2:
						if (vis3 == 1.0)
							res1 = 1.0;
						else
							res1 = 2.0;
						break;
					}
					break;
				case 3:
					res2 = 2.0;
					switch (vis2) {
					case 1:
						if (vis3 == 1.0)
							res1 = 2.5;
						else
							res1 = 3.5;
						break;
					case 2:
						if (vis3 == 1.0)
							res1 = 1.5;
						else
							res1 = 2.5;
						break;
					}
					break;
				case 4:
					res2 = 2.5;
					switch (vis2) {
					case 1:
						if (vis3 == 1.0)
							res1 = 3.0;
						else
							res1 = 4.0;
						break;
					case 2:
						if (vis3 == 1.0)
							res1 = 2.0;
						else
							res1 = 3.0;
						break;
					}
					break;
				case 5:
					res2 = 3.5;
					switch (vis2) {
					case 1:
						if (vis3 == 1.0)
							res1 = 4.0;
						else
							res1 = 5.0;
						break;
					case 2:
						if (vis3 == 1.0)
							res1 = 2.5;
						else
							res1 = 3.5;
						break;
					}
					break;
				}

				textField_45.setText(String.valueOf(res1));
				textField_17.setText(String.valueOf(res2));
			}
		});
		button_8.setBounds(154, 175, 77, 27);
		panel_3.add(button_8);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(885, 13, 359, 306);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JLabel label_8 = new JLabel("施工线路与别跨电力线的交叉角 β:");
		label_8.setBounds(14, 13, 259, 24);
		panel_4.add(label_8);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(263, 13, 57, 24);
		panel_4.add(textField_15);

		JLabel label_9 = new JLabel("°");
		label_9.setBounds(333, 16, 42, 18);
		panel_4.add(label_9);

		JLabel lblB_1 = new JLabel("<html>被跨电力线两边线间的水平距离 B<sub>2</sub>：</html>");
		lblB_1.setBounds(14, 36, 286, 24);
		panel_4.add(lblB_1);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(24, 63, 118, 24);
		panel_4.add(textField_16);

		JLabel label_10 = new JLabel("m");
		label_10.setBounds(146, 66, -4, 18);
		panel_4.add(label_10);

		JLabel lblD = new JLabel("<html>跨越架内侧主杆或主柱外缘（金属架）至被跨电力线的最小水平距离 D:</html>");
		lblD.setBounds(14, 84, 310, 60);
		panel_4.add(lblD);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(207, 115, 57, 24);
		panel_4.add(textField_17);

		JLabel label_11 = new JLabel("m");
		label_11.setBounds(278, 121, 42, 18);
		panel_4.add(label_11);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Config.ResColor);
		panel_5.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(14, 142, 331, 153);
		panel_4.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblH = new JLabel("跨越架的最小高度 h:");
		lblH.setBounds(14, 16, 168, 18);
		panel_5.add(lblH);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(190, 13, 54, 24);
		panel_5.add(textField_18);

		JLabel label_12 = new JLabel("m");
		label_12.setBounds(258, 16, 42, 18);
		panel_5.add(label_12);

		JLabel lblB_2 = new JLabel("跨越架的最小宽度 b:");
		lblB_2.setBounds(14, 51, 168, 18);
		panel_5.add(lblB_2);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(190, 47, 54, 24);
		panel_5.add(textField_19);

		JLabel label_13 = new JLabel("m");
		label_13.setBounds(258, 51, 42, 18);
		panel_5.add(label_13);

		JLabel lblL = new JLabel("跨越架顶面的最小跨距 L:");
		lblL.setBounds(14, 85, 195, 18);
		panel_5.add(lblL);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(190, 82, 54, 24);
		panel_5.add(textField_20);

		JLabel label_14 = new JLabel("m");
		label_14.setBounds(258, 85, 42, 18);
		panel_5.add(label_14);

		JButton button_3 = new JButton("计算");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_11, textField_12, textField_13, textField_14,
						textField_15, textField_16, textField_17, textField_45);

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

				item.H2max = Double.valueOf(textField_11.getText().trim());
				item.f21 = Double.valueOf(textField_12.getText().trim());
				item.B21 = Double.valueOf(textField_13.getText().trim());
				item.M21 = Double.valueOf(textField_14.getText().trim());
				item.b21 = Double.valueOf(textField_15.getText().trim());
				item.B22 = Double.valueOf(textField_16.getText().trim());
				item.D21 = Double.valueOf(textField_17.getText().trim());
				item.a21 = Double.valueOf(textField_45.getText().trim());

				item.calPartTwo();
				textField_18.setText(String.valueOf(item.h21));
				textField_19.setText(String.valueOf(item.b2));
				textField_20.setText(String.valueOf(item.L21));

			}
		});
		button_3.setBounds(14, 116, 113, 27);
		panel_5.add(button_3);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(1258, 13, 349, 280);
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Config.ResColor);
		panel_8.setBounds(14, 104, 327, 169);
		panel_6.add(panel_8);
		panel_8.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setLayout(null);

		JLabel lblH_3 = new JLabel("跨越架的最小高度 h:");
		lblH_3.setBounds(14, 23, 178, 24);
		panel_8.add(lblH_3);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(192, 23, 92, 24);
		panel_8.add(textField_33);

		JLabel label_33 = new JLabel("m");
		label_33.setBounds(298, 26, 41, 18);
		panel_8.add(label_33);

		JLabel lblLb = new JLabel("<html>单侧跨越架对电力线的距离 L<sub>b</sub>:</html>");
		lblLb.setBounds(14, 57, 178, 42);
		panel_8.add(lblLb);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(192, 74, 92, 24);
		panel_8.add(textField_34);

		JLabel label_34 = new JLabel("m");
		label_34.setBounds(298, 81, 41, 18);
		panel_8.add(label_34);

		JLabel lblL_5 = new JLabel("两副跨越架间的跨距 L:");
		lblL_5.setBounds(14, 103, 178, 24);
		panel_8.add(lblL_5);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(192, 103, 92, 24);
		panel_8.add(textField_35);

		JLabel label_35 = new JLabel("m");
		label_35.setBounds(298, 106, 41, 18);
		panel_8.add(label_35);

		JButton button_4 = new JButton("计算");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_21, textField_23, textField_27, textField_28,
						textField_29, textField_30, textField_32, textField_22, textField_24);
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

				item.H3max = Double.valueOf(textField_21.getText().trim());
				item.f31 = Double.valueOf(textField_23.getText().trim());
				item.H31 = Double.valueOf(textField_27.getText().trim());
				item.h31 = Double.valueOf(textField_28.getText().trim());
				item.A31 = Double.valueOf(textField_29.getText().trim());
				item.y31 = Double.valueOf(textField_30.getText().trim());
				item.L30 = Double.valueOf(textField_32.getText().trim());
				item.b31 = Double.valueOf(textField_22.getText().trim());
				item.B32 = Double.valueOf(textField_24.getText().trim());

				item.calPartThree();

				textField_33.setText(String.valueOf(item.h3));
				textField_34.setText(String.valueOf(item.L3b));
				textField_35.setText(String.valueOf(item.L3));

			}
		});
		button_4.setBounds(14, 127, 113, 27);
		panel_8.add(button_4);

		JLabel label_18 = new JLabel("施工线路与别跨电力线的交叉角 β:");
		label_18.setBounds(14, 24, 259, 24);
		panel_6.add(label_18);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(263, 24, 57, 24);
		panel_6.add(textField_22);

		JLabel label_22 = new JLabel("°");
		label_22.setBounds(333, 27, 42, 18);
		panel_6.add(label_22);

		JLabel label_23 = new JLabel("<html>被跨电力线两边线间的水平距离 B<sub>2</sub>：</html>");
		label_23.setBounds(14, 52, 286, 24);
		panel_6.add(label_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(14, 77, 108, 24);
		panel_6.add(textField_24);

		JLabel label_24 = new JLabel("m");
		label_24.setBounds(136, 80, 42, 18);
		panel_6.add(label_24);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "\u8DE8\u8D8A\u67B6\u98CE\u504F\u8BA1\u7B97", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_9.setBounds(1258, 306, 373, 426);
		contentPane.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblX = new JLabel("<html>被跨越物与施工线路任一相邻杆塔的距离 x:</html>");
		lblX.setBounds(14, 24, 192, 42);
		panel_9.add(lblX);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(220, 40, 92, 24);
		panel_9.add(textField_36);

		JLabel label_36 = new JLabel("m");
		label_36.setBounds(326, 47, 41, 18);
		panel_9.add(label_36);

		JLabel lblH_4 = new JLabel("水平放线张力 H:");
		lblH_4.setBounds(14, 70, 178, 24);
		panel_9.add(lblH_4);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(220, 69, 92, 24);
		panel_9.add(textField_37);

		JLabel lblN_2 = new JLabel("N");
		lblN_2.setBounds(326, 72, 41, 18);
		panel_9.add(lblN_2);

		JLabel lblL_6 = new JLabel("<html>施工线路的跨越档档距跨越 l:</html>");
		lblL_6.setBounds(14, 92, 192, 42);
		panel_9.add(lblL_6);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(220, 108, 92, 24);
		panel_9.add(textField_38);

		JLabel label_38 = new JLabel("m");
		label_38.setBounds(326, 115, 41, 18);
		panel_9.add(label_38);

		JLabel label_32 = new JLabel("<html>施工线路跨越档两端悬垂绝缘子串或滑车挂具长度 λ:</html>");
		label_32.setBounds(14, 136, 202, 41);
		panel_9.add(label_32);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(220, 152, 92, 24);
		panel_9.add(textField_39);

		JLabel label_39 = new JLabel("m");
		label_39.setBounds(326, 159, 41, 18);
		panel_9.add(label_39);

		JLabel lblW_1 = new JLabel("<html>导线、地线的单位长度重量 W<sub>1</sub>:</html>");
		lblW_1.setBounds(14, 176, 192, 42);
		panel_9.add(lblW_1);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(220, 192, 92, 24);
		panel_9.add(textField_40);

		JLabel lblNm_1 = new JLabel("N/m");
		lblNm_1.setBounds(326, 199, 41, 18);
		panel_9.add(lblNm_1);

		JLabel lblD_1 = new JLabel("导线或地线直径 d:");
		lblD_1.setBounds(14, 223, 178, 24);
		panel_9.add(lblD_1);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(220, 222, 92, 24);
		panel_9.add(textField_41);

		JLabel lblMm = new JLabel("mm");
		lblMm.setBounds(326, 225, 41, 18);
		panel_9.add(lblMm);

		JLabel lblK = new JLabel("风载体型系数 K:");
		lblK.setBounds(14, 250, 178, 24);
		panel_9.add(lblK);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(220, 249, 92, 24);
		panel_9.add(textField_42);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Config.ResColor);
		panel_10.setBorder(new TitledBorder(null, "\u8F93\u51FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(14, 276, 353, 148);
		panel_9.add(panel_10);
		panel_10.setLayout(null);

		JLabel lblmsW = new JLabel("<html>在安装气象条件(风速10m／s) 下导线或地线的单位长度风荷重 W<sub>4(10)</sub>:</html>");
		lblmsW.setBounds(14, 23, 257, 52);
		panel_10.add(lblmsW);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(247, 46, 61, 24);
		panel_10.add(textField_43);

		JLabel label_37 = new JLabel("N/m");
		label_37.setBounds(312, 49, 41, 18);
		panel_10.add(label_37);

		JLabel lblZx = new JLabel("<html>风偏距离 Z<sub>x</sub></html>");
		lblZx.setBounds(14, 74, 178, 24);
		panel_10.add(lblZx);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(247, 74, 61, 24);
		panel_10.add(textField_44);

		JLabel lblM_2 = new JLabel("m");
		lblM_2.setBounds(312, 77, 41, 18);
		panel_10.add(lblM_2);

		JButton button_5 = new JButton("计算");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_36, textField_37, textField_38, textField_39,
						textField_40, textField_41, textField_42);

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

				item.x41 = Double.valueOf(textField_36.getText().trim());
				item.H41 = Double.valueOf(textField_37.getText().trim());
				item.l41 = Double.valueOf(textField_38.getText().trim());
				item.y41 = Double.valueOf(textField_39.getText().trim());
				item.W41 = Double.valueOf(textField_40.getText().trim());
				item.d41 = Double.valueOf(textField_41.getText().trim());
				item.K41 = Double.valueOf(textField_42.getText().trim());

				item.calPartFour();
				textField_43.setText(String.valueOf(item.W4410));
				textField_44.setText(String.valueOf(item.Z4x));

			}
		});
		button_5.setBounds(14, 108, 113, 27);
		panel_10.add(button_5);

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(
				new TitledBorder(null, "\u91D1\u5C5E\u7ED3\u6784\u8DE8\u8D8A\u67B6\u7684\u5B89\u88C5\u8BA1\u7B97",
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_12.setBounds(895, 332, 349, 453);
		contentPane.add(panel_12);
		panel_12.setLayout(null);

		JLabel label_15 = new JLabel("<html>被跨电力线最高点的对地距离 H<sub>max</sub>：</html>");
		label_15.setBounds(14, 27, 271, 24);
		panel_12.add(label_15);

		textField_21 = new JTextField();
		textField_21.setBounds(14, 52, 70, 24);
		panel_12.add(textField_21);
		textField_21.setColumns(10);

		JLabel label_16 = new JLabel("m");
		label_16.setBounds(98, 55, 42, 18);
		panel_12.add(label_16);

		JLabel label_19 = new JLabel("跨越架封顶网的弧垂 f:");
		label_19.setBounds(14, 89, 178, 24);
		panel_12.add(label_19);

		JLabel label_20 = new JLabel("<html>封顶用竹、木杆时，  f=0;<br>对于尼龙网，f=1~2m;</html>");
		label_20.setBounds(24, 111, 202, 46);
		panel_12.add(label_20);
		label_20.setForeground(Color.RED);

		textField_23 = new JTextField();
		textField_23.setBounds(192, 89, 70, 24);
		panel_12.add(textField_23);
		textField_23.setColumns(10);

		JLabel label_21 = new JLabel("m");
		label_21.setBounds(264, 92, 42, 18);
		panel_12.add(label_21);

		JLabel lblH_1 = new JLabel("<html>跨越架上层拉线挂点至地面的高度 H:</html>");
		lblH_1.setBounds(14, 168, 194, 39);
		panel_12.add(lblH_1);

		textField_27 = new JTextField();
		textField_27.setBounds(202, 183, 60, 24);
		panel_12.add(textField_27);
		textField_27.setColumns(10);

		JLabel label_25 = new JLabel("m");
		label_25.setBounds(264, 189, 42, 18);
		panel_12.add(label_25);

		JLabel lblH_2 = new JLabel("<html>运行电力线的下导线至地面高度 h<sub>1</sub>:</html>");
		lblH_2.setBounds(14, 220, 194, 39);
		panel_12.add(lblH_2);

		textField_28 = new JTextField();
		textField_28.setBounds(202, 235, 60, 24);
		panel_12.add(textField_28);
		textField_28.setColumns(10);

		JLabel label_27 = new JLabel("m");
		label_27.setBounds(264, 241, 42, 18);
		panel_12.add(label_27);

		JLabel lblA_1 = new JLabel("拉线对地面夹角 α:");
		lblA_1.setBounds(14, 272, 178, 24);
		panel_12.add(lblA_1);

		textField_29 = new JTextField();
		textField_29.setBounds(202, 272, 60, 24);
		panel_12.add(textField_29);
		textField_29.setColumns(10);

		JLabel label_26 = new JLabel("゜");
		label_26.setBounds(264, 278, 42, 18);
		panel_12.add(label_26);

		JLabel label_28 = new JLabel("<html>拉线与跨越架横担轴线间的水平夹角 γ:</html>");
		label_28.setBounds(14, 309, 194, 39);
		panel_12.add(label_28);

		textField_30 = new JTextField();
		textField_30.setBounds(202, 320, 60, 24);
		panel_12.add(textField_30);
		textField_30.setColumns(10);

		JLabel label_29 = new JLabel("゜");
		label_29.setBounds(264, 323, 42, 24);
		panel_12.add(label_29);

		JLabel lblL_4 = new JLabel("<html>内侧上拉线与运行电力线的最小安全距离 L<sub>0</sub>:</html>");
		lblL_4.setBounds(14, 380, 194, 39);
		panel_12.add(lblL_4);

		textField_32 = new JTextField();
		textField_32.setBounds(202, 395, 60, 24);
		panel_12.add(textField_32);
		textField_32.setColumns(10);

		JLabel label_30 = new JLabel("m");
		label_30.setBounds(264, 401, 42, 18);
		panel_12.add(label_30);

		JButton button_6 = new JButton("下载到桌面");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String outPutTxt = "";
				String s1 = "  ";
				String s2 = "      ";

				outPutTxt += "跨越架计算" + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				sb.append("跨越架基本参数的计算:" + System.getProperty("line.separator") + s2 + "子导数根数: " + item.n11
						+ System.getProperty("line.separator") + s2 + "导线线密度: " + item.q11+ " N/m"
						+ System.getProperty("line.separator") + s2 + "风荷调整系数: " + item.u1s 
						+ System.getProperty("line.separator") + s2 + "抱杆类型: " + (item.btn1==1.0?"圆型抱杆":"平面抱杆")
						+ System.getProperty("line.separator") + s2 + "风载体型系数: " + item.b1z
						+ System.getProperty("line.separator") + s2 + "路线设计最大风速: " + item.V11 + " m/s"
						+ System.getProperty("line.separator") + s2 + "架面1m范围的投影面积: " + item.A1s + " m/s"
						+ System.getProperty("line.separator") + s2 + "冲击系数: " + item.K11
						+ System.getProperty("line.separator") + s2 + "导线或牵引绳对跨越架的摩擦系数: " + item.u10
						+ System.getProperty("line.separator") + s2 + "跨越架的垂直载荷: " + item.W1c+" N"
						+ System.getProperty("line.separator") + s2 + "架面风压的均布载荷: " + item.q1F+" KN/m"
						+ System.getProperty("line.separator") + s2 + "跨越架的水平载荷: " + item.P11+" N"
						+ System.getProperty("line.separator") + s1);
				
				String type="";
				if(item.btn2 == 1.0) type = "小于等于10";
				else if(item.btn2 == 2.0) type = "等于35";
				else if(item.btn2 == 3.0) type = "60~110";
				else if(item.btn2 == 4.0) type = "等于220";
				else if(item.btn2 == 5.0) type = "等于330";
				
				sb.append("竹木杆跨越架的安装计算:" + System.getProperty("line.separator") + s2 + "被跨电力线最高店的对地距离: " + item.H2max + " m"
						+ System.getProperty("line.separator") + s2 + "被跨越电力线电压: " + type
						+ System.getProperty("line.separator") + s2 + "选型1: " + (item.btn3 ==1.0?"无地线":"有地线")
						+ System.getProperty("line.separator") + s2 + "选型2: " + (item.btn4==1.0?"封顶杆":"封顶网")
						+ System.getProperty("line.separator") + s2 + "不同电压等级的电力线与封顶架面的最小垂直距离: " + item.a21 + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架封顶网的弧垂: " + item.f21 + " m"
						+ System.getProperty("line.separator") + s2 + "施工线路的线间距离: " + item.B21 + " m"
						+ System.getProperty("line.separator") + s2 + "选型3: " + (item.btn5 ==1.0?"一般跨越架":"不停电跨越架")
						+ System.getProperty("line.separator") + s2 + "跨越架顶面超出施工线路的宽度: " + item.M21 + " m"
						+ System.getProperty("line.separator") + s2 + "施工线路与别跨电力线的交叉角: " + item.b21+" 度"
						+ System.getProperty("line.separator") + s2 + "被跨电力线两边线的水平距离: " + item.B22 + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架内侧主杆外缘（金属架）至被跨电力线的最小水平距离: " + item.D21 + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架的最小高度: " + item.h21 + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架的最小宽度: " + item.b2 + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架顶面的最小跨距: " + item.L21 + " m"
						+ System.getProperty("line.separator") + s1);
				
				sb.append("金属结构跨越架的安装计算:" + System.getProperty("line.separator") + s2 + "被跨电力线最高点的对地距离: " + item.H3max + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架封顶网的弧垂: " + item.f31  + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架上层拉线挂点至地面的高度: " + item.H31 + " m"
						+ System.getProperty("line.separator") + s2 + "运行电力线的下导线至地面高度: " + item.h31  + " m"
						+ System.getProperty("line.separator") + s2 + "拉线对地面夹角: " + item.A31 + " 度"
						+ System.getProperty("line.separator") + s2 + "拉线与跨越架横担轴线间的水平夹角: " + item.y31 + " 度"
						+ System.getProperty("line.separator") + s2 + "内侧上拉线与运行电力线的最小安全距离: " + item.L30 + " m"
						+ System.getProperty("line.separator") + s2 + "施工线路与别跨电力线的交叉角: " + item.b31+ " 度"
						+ System.getProperty("line.separator") + s2 + "被跨电力线两边线间的水平距离: " + item.B32 + " m"
						+ System.getProperty("line.separator") + s2 + "跨越架的最小高度: " + item.h3 + " m"
						+ System.getProperty("line.separator") + s2 + "单侧跨越架对电力线的距离: " + item.L3b + " m"
						+ System.getProperty("line.separator") + s2 + "两幅跨越架间的跨距: " + item.L3 + " m"
						+ System.getProperty("line.separator") + s1);
				
				sb.append("跨越架风偏计算:" + System.getProperty("line.separator") + s2 + "被跨越物与施工线路任一相邻杆塔的距离: " + item.x41 + " m"
						+ System.getProperty("line.separator") + s2 + "水平放线张力: " + item.H41  + " N"
						+ System.getProperty("line.separator") + s2 + "施工线路的跨越档档距离: " + item.l41 + " m"
						+ System.getProperty("line.separator") + s2 + "施工线路跨越档两端悬垂绝缘子串或滑车挂具长度: " + item.y41 + " m"
						+ System.getProperty("line.separator") + s2 + "导线，地线的单位长度重量: " + item.W41 + " N/m"
						+ System.getProperty("line.separator") + s2 + "导线或地线直径: " + item.d41 + " mm"
						+ System.getProperty("line.separator") + s2 + "风载体型系数: " + item.K41 
						+ System.getProperty("line.separator") + s2 + "在安装气象条件（风速10m/s）下导线或地线的单位长度风荷重: " + item.W4410 + " N/m"
						+ System.getProperty("line.separator") + s2 + "风偏距离: " + item.Z4x + " m"
						+ System.getProperty("line.separator") + s1);
				
				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
			
			
		});
		button_6.setBounds(1260, 745, 151, 27);
		contentPane.add(button_6);

		JButton button_7 = new JButton("保存到历史纪录");
		button_7.setBounds(1441, 745, 166, 27);
		contentPane.add(button_7);
	}
}
