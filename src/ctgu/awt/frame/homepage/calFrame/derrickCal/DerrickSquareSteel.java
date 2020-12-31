package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ctgu.Entity.Square.DerrickSquareSteelEnity;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class DerrickSquareSteel extends FatherFrame {

	private JPanel contentPane;
	private JTextField textField_36;
	private JTextField textField_39;
	private JTextField textField_40;

	private DerrickSquareSteelEnity derrickSquareSteelEnity = null;

	private JLabel picture1 = null;
	private JLabel picture2 = null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_19;

	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	JRadioButton radioButton_6;
	JRadioButton radioButton_7;
	private JTextField textField_20;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DerrickSquareSteelEnity des = new DerrickSquareSteelEnity();
					DerrickSquareSteel frame = new DerrickSquareSteel(des);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DerrickSquareSteel(DerrickSquareSteelEnity des) {
		derrickSquareSteelEnity = des;
		setTitle("钢管抱杆");
		System.out.println("初始化成功...");
		initSquare(des);
		setResizable(false);
		setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	private void initSquare(DerrickSquareSteelEnity des) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1314, 828);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"钢管抱杆受力示意图", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		Icon icon1 = new ImageIcon(this.getClass().getResource("w1.png"));
		// ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 321, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
//		picture1 = new JLabel(icon1, JLabel.CENTER);
		// 330
		picture1 = new JLabel(Tool.getIcon("./resources/steel/Derrick1.png", -1, 239));
		picture1.setBounds(14, 23, 336, 356);
		panel.setBounds(14, 13, 364, 386);
		contentPane.add(panel);
		panel.add(picture1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"施工参数", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel_1.setBounds(392, 437, 364, 312);
		contentPane.add(panel_1);

		JLabel label = new JLabel("<html><body>控制绳的张力F<sub>k</sub>:</body></html>");
		label.setBounds(14, 31, 154, 24);
		panel_1.add(label);

		textField = new JTextField("0");
		textField.setColumns(10);
		textField.setBounds(182, 28, 86, 24);
		panel_1.add(textField);

		JLabel label_1 = new JLabel("kgf");
		label_1.setBounds(282, 31, 39, 18);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("牵引绳张力F:");
		label_2.setBounds(14, 95, 154, 18);
		panel_1.add(label_2);

		textField_1 = new JTextField("0");
		textField_1.setColumns(10);
		textField_1.setBounds(182, 62, 86, 24);
		panel_1.add(textField_1);

		JLabel label_17 = new JLabel("kgf");
		label_17.setBounds(282, 65, 39, 18);
		panel_1.add(label_17);

		JLabel label_26 = new JLabel("<html><body>顶滑轮的载荷F<sub>H</sub>:</body></html>");
		label_26.setBounds(14, 65, 120, 21);
		panel_1.add(label_26);

		textField_2 = new JTextField("0");
		textField_2.setColumns(10);
		textField_2.setBounds(182, 92, 86, 24);
		panel_1.add(textField_2);

		JLabel label_27 = new JLabel("<html><body>kgf</body></html>");
		label_27.setBounds(282, 84, 39, 32);
		panel_1.add(label_27);

		JLabel label_28 = new JLabel("<html><body>顶滑组的载荷F<sub>T</sub>:</body></html>");
		label_28.setBounds(14, 128, 154, 24);
		panel_1.add(label_28);

		textField_15 = new JTextField("0");
		textField_15.setColumns(10);
		textField_15.setBounds(182, 129, 86, 24);
		panel_1.add(textField_15);

		JLabel label_29 = new JLabel("<html><body>kgf</body></html>");
		label_29.setBounds(282, 121, 39, 32);
		panel_1.add(label_29);

		JLabel label_35 = new JLabel("杆身轴压力N:");
		label_35.setBounds(14, 269, 154, 18);
		panel_1.add(label_35);

		textField_16 = new JTextField("0");
		textField_16.setColumns(10);
		textField_16.setBounds(182, 162, 86, 24);
		panel_1.add(textField_16);

		JLabel label_37 = new JLabel("<html><body>kgf</body></html>");
		label_37.setBounds(282, 159, 39, 24);
		panel_1.add(label_37);

		JLabel label_38 = new JLabel("<html><body>承托绳张力F<sub>C</sub>:</body></html>");
		label_38.setBounds(14, 199, 154, 21);
		panel_1.add(label_38);

		textField_17 = new JTextField("0");
		textField_17.setColumns(10);
		textField_17.setBounds(182, 196, 86, 24);
		panel_1.add(textField_17);

		JLabel label_39 = new JLabel("<html><body>kgf</body></html>");
		label_39.setBounds(282, 196, 39, 24);
		panel_1.add(label_39);

		JLabel lblG = new JLabel("<html><body>抱杆身部自重 G<sub>1</sub>:</body></html>");
		lblG.setBounds(14, 232, 154, 21);
		panel_1.add(lblG);

		textField_18 = new JTextField("0");
		textField_18.setColumns(10);
		textField_18.setBounds(182, 229, 86, 24);
		panel_1.add(textField_18);

		JLabel label_41 = new JLabel("<html><body>kg</body></html>");
		label_41.setBounds(282, 229, 39, 24);
		panel_1.add(label_41);

		textField_20 = new JTextField("0");
		textField_20.setColumns(10);
		textField_20.setBounds(182, 266, 86, 24);
		panel_1.add(textField_20);

		JLabel label_50 = new JLabel("<html><body>kgf</body></html>");
		label_50.setBounds(282, 266, 39, 24);
		panel_1.add(label_50);

		JLabel label_49 = new JLabel("<html><body>拉线张力F<sub>B</sub>:</body></html>");
		label_49.setBounds(14, 165, 154, 21);
		panel_1.add(label_49);

		JButton button = new JButton("下载到桌面");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String outPutTxt = "";
				String s1 = "  ";
				String s2 = "      ";

				String type;
				if (des.btn1 == 1.0)
					type = "钢管";
				else if (des.btn1 == 2.0)
					type = "六方管";
				else
					type = "八方管";
				outPutTxt += "钢管抱杆" + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				sb.append("工况条件:" + System.getProperty("line.separator") + s2 + "控制绳对地夹角 " + des.K + " °"
						+ System.getProperty("line.separator") + s2 + "杆身倾斜角度: " + des.Q
						+ System.getProperty("line.separator") + s2 + "外拉线对地夹角: " + des.b
						+ System.getProperty("line.separator") + s2 + "货物被拉偏角度" + des.p
						+ System.getProperty("line.separator") + s2 + "承托绳对地夹角: " + des.t
						+ System.getProperty("line.separator") + s2 + "走私绳索数: " + des.n + " m/s"
						+ System.getProperty("line.separator") + s2 + "货物重量: " + des.G + " m/s"
						+ System.getProperty("line.separator") + s2 + "抱杆长度: " + des.L
						+ System.getProperty("line.separator") + s2 + "钢材的材质选型: " + (des.btn1 == 1.0 ? "Q235" : "Q345")
						+ System.getProperty("line.separator") + s2 + "钢管选型: " + type
						+ System.getProperty("line.separator") + s1);

				sb.append("施工参数:" + System.getProperty("line.separator") + s2 + "控制绳的张力: " + des.FK + " m"
						+ System.getProperty("line.separator") + s2 + "顶滑轮的载荷: " + des.FH + " kgf"
						+ System.getProperty("line.separator") + s2 + "牵引绳张力: " + des.F + " kgf"
						+ System.getProperty("line.separator") + s2 + "顶滑组的载荷: " + des.FT + " kgf"
						+ System.getProperty("line.separator") + s2 + "拉线张力: " + des.FB + " kgf"
						+ System.getProperty("line.separator") + s2 + "承托绳张力: " + des.FC + " kgf"
						+ System.getProperty("line.separator") + s2 + "抱杆身部自重: " + des.G1 + " kg"
						+ System.getProperty("line.separator") + s2 + "杆身轴压力: " + des.N + " kgf"
						+ System.getProperty("line.separator") + s1);

				sb.append("输出:" + System.getProperty("line.separator") + s2 + "外径: " + des.D + " mm"
						+ System.getProperty("line.separator") + s2 + "壁厚: " + des.t + " mm"
						+ System.getProperty("line.separator") + s2 + "抱杆两端铰支系数: " + des.u1
						+ System.getProperty("line.separator") + s1);

				sb.append("管身截面特性:" + System.getProperty("line.separator") + s2 + "截面积: " + des.A + " mm²"
						+ System.getProperty("line.separator") + s2 + "惯性矩: " + des.I + " mm⁴"
						+ System.getProperty("line.separator") + s2 + "回转半径: " + des.R + " mm"
						+ System.getProperty("line.separator") + s2 + "抗模弯量: " + des.W + " mm³"
						+ System.getProperty("line.separator") + s1);
				if (null != des.res1 && null !=des.res2)

					sb.append("局部稳定性计算:" + System.getProperty("line.separator") + s2 + "是否合格: "
							+ (des.res1 <= des.res2 ? "是" : "否") + System.getProperty("line.separator") + s1);

				sb.append("整体稳定性计算:" + System.getProperty("line.separator") + s2 + "杆身细比: " + des.res3
						+ System.getProperty("line.separator") + s2 + "杆身整体稳定安全系数: " + des.res4
						+ System.getProperty("line.separator") + s1);

				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});
		button.setBounds(818, 709, 154, 27);
		contentPane.add(button);

		JButton button_1 = new JButton("保存到历史纪录");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(des);
			}
		});
		button_1.setBounds(1070, 709, 154, 27);
		contentPane.add(button_1);

		JButton button_2 = new JButton("计算");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check = Tool.checkTextFiled(true, textField_9, textField_10, textField_11, textField_12,
						textField_13, textField_14, textField_19, textField_4, textField_6, textField_24, textField_5);
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

				des.K = Double.valueOf(String.valueOf(textField_9.getText().trim()));
				des.Q = Double.valueOf(String.valueOf(textField_10.getText().trim()));
				des.b = Double.valueOf(String.valueOf(textField_11.getText().trim()));
				des.p = Double.valueOf(String.valueOf(textField_12.getText().trim()));
				des.dt = Double.valueOf(String.valueOf(textField_13.getText().trim()));
				des.n = Double.valueOf(String.valueOf(textField_14.getText().trim()));
				des.G = Double.valueOf(String.valueOf(textField_19.getText().trim()));
				des.L = Double.valueOf(String.valueOf(textField_4.getText().trim()));
				des.D = Double.valueOf(String.valueOf(textField_6.getText().trim()));
				des.t = Double.valueOf(String.valueOf(textField_24.getText().trim()));
				des.u1 = Double.valueOf(String.valueOf(textField_5.getText().trim()));

				des.cal();
				textField.setText(String.valueOf(des.FK));
				textField_1.setText(String.valueOf(des.FH));
				textField_2.setText(String.valueOf(des.F));
				textField_15.setText(String.valueOf(des.FT));
				textField_16.setText(String.valueOf(des.FB));
				textField_17.setText(String.valueOf(des.FC));
				textField_18.setText(String.valueOf(des.G1));
				textField_20.setText(String.valueOf(des.N));

				textField_7.setText(String.valueOf(des.A));
				textField_8.setText(String.valueOf(des.I));
				textField_22.setText(String.valueOf(des.R));
				textField_23.setText(String.valueOf(des.W));

				textField_36.setText(String.valueOf(des.res1));
				textField_3.setText(String.valueOf(des.res2));
				textField_39.setText(String.valueOf(des.res3));
				textField_40.setText(String.valueOf(des.res4));

				if (des.btn3 == 1.0) {
					radioButton_2.setSelected(true);
				} else
					radioButton_3.setSelected(true);
				if (des.btn4 == 1.0)
					radioButton_4.setSelected(true);
				else
					radioButton_5.setSelected(true);
			}
		});
		button_2.setBounds(818, 669, 113, 27);
		contentPane.add(button_2);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(253, 253, 241));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"局部稳定性计算（前者不大于后者即为合格）", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(818, 438, 469, 74);
		contentPane.add(panel_5);

		JLabel label_45 = new JLabel("<html><body></body></html>");
		label_45.setBounds(306, 341, 39, 32);
		panel_5.add(label_45);

		textField_36 = new JTextField("0");
		textField_36.setBounds(79, 35, 110, 24);
		panel_5.add(textField_36);
		textField_36.setColumns(10);

		JLabel label_64 = new JLabel("D/t = ");
		label_64.setBounds(29, 38, 106, 18);
		panel_5.add(label_64);

		JLabel label_90 = new JLabel("<html><body>≤</body></html>");
		label_90.setForeground(Color.RED);
		label_90.setBounds(203, 29, 23, 32);
		panel_5.add(label_90);

		textField_3 = new JTextField("0");
		textField_3.setColumns(10);
		textField_3.setBounds(345, 35, 110, 24);
		panel_5.add(textField_3);

		JLabel label_7 = new JLabel("<html><body>100*√(235/f<sub>y</sub>)</body></html>");
		label_7.setBounds(225, 36, 130, 25);
		panel_5.add(label_7);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(253, 253, 241));
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"整体稳定性计算", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(818, 554, 476, 102);
		contentPane.add(panel_7);

		JLabel label_67 = new JLabel("杆身长细比λ:");
		label_67.setBounds(14, 34, 120, 18);
		panel_7.add(label_67);

		textField_39 = new JTextField("0");
		textField_39.setColumns(10);
		textField_39.setBounds(119, 31, 52, 24);
		panel_7.add(textField_39);

		radioButton_2 = new JRadioButton("通过");
		radioButton_2.setBounds(296, 30, 70, 27);
		panel_7.add(radioButton_2);

		radioButton_3 = new JRadioButton("未通过");
		radioButton_3.setBounds(375, 30, 80, 27);
		panel_7.add(radioButton_3);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton_2);
		buttonGroup2.add(radioButton_3);
		if (des.btn3 == 1.0)
			radioButton_2.setSelected(true);
		else
			radioButton_3.setSelected(true);

		JLabel label_69 = new JLabel("杆身整体稳定安全系数:");
		label_69.setBounds(14, 65, 168, 18);
		panel_7.add(label_69);

		textField_40 = new JTextField("0");
		textField_40.setColumns(10);
		textField_40.setBounds(184, 62, 52, 24);
		panel_7.add(textField_40);

		radioButton_4 = new JRadioButton("通过");
		radioButton_4.setBounds(296, 65, 70, 27);
		panel_7.add(radioButton_4);

		radioButton_5 = new JRadioButton("未通过");
		radioButton_5.setBounds(375, 65, 80, 27);
		panel_7.add(radioButton_5);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(radioButton_4);
		buttonGroup4.add(radioButton_5);
		if (des.btn4 == 1.0)
			radioButton_4.setSelected(true);
		else
			radioButton_5.setSelected(true);

		JLabel label_3 = new JLabel("<html><body>120≤λ≤150</body></html>");
		label_3.setForeground(Color.RED);
		label_3.setBounds(185, 25, 100, 32);
		panel_7.add(label_3);

		JLabel label_4 = new JLabel("＞2.5");
		label_4.setBounds(244, 58, 42, 32);
		panel_7.add(label_4);
		label_4.setForeground(Color.RED);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"钢材的材质选型", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(392, 13, 389, 74);
		contentPane.add(panel_8);

		radioButton_6 = new JRadioButton("Q235");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				des.btn1 = 1.0;
			}
		});
		radioButton_6.setBounds(99, 25, 84, 27);
		panel_8.add(radioButton_6);

		radioButton_7 = new JRadioButton("Q345");
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				des.btn1 = 2.0;
			}
		});

		if (des.btn1 == 1.0) {
			radioButton_6.setSelected(true);
		} else
			radioButton_7.setSelected(true);
		radioButton_7.setBounds(201, 25, 93, 27);
		panel_8.add(radioButton_7);

		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton_6);
		buttonGroup1.add(radioButton_7);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(
				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u5DE5\u51B5\u6761\u4EF6(\u8F93\u5165)",
						TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(14, 422, 364, 327);
		contentPane.add(panel_4);

		JLabel label_20 = new JLabel("<html><body>控制绳对地夹角K:</body></html>");
		label_20.setBounds(14, 31, 154, 24);
		panel_4.add(label_20);

		textField_9 = new JTextField("");
		textField_9.setColumns(10);
		textField_9.setBounds(182, 28, 86, 24);
		panel_4.add(textField_9);

		JLabel label_23 = new JLabel("外拉线对地夹角b:");
		label_23.setBounds(14, 95, 154, 18);
		panel_4.add(label_23);

		textField_10 = new JTextField("");
		textField_10.setColumns(10);
		textField_10.setBounds(182, 62, 86, 24);
		panel_4.add(textField_10);

		textField_11 = new JTextField("");
		textField_11.setColumns(10);
		textField_11.setBounds(182, 92, 86, 24);
		panel_4.add(textField_11);

		JLabel label_33 = new JLabel("<html><body>杆身倾斜角度q:</body></html>");
		label_33.setBounds(14, 62, 154, 24);
		panel_4.add(label_33);

		textField_12 = new JTextField("");
		textField_12.setColumns(10);
		textField_12.setBounds(182, 129, 86, 24);
		panel_4.add(textField_12);

		JLabel label_36 = new JLabel("承托绳对地夹角t:");
		label_36.setBounds(14, 165, 154, 18);
		panel_4.add(label_36);

		textField_13 = new JTextField("");
		textField_13.setColumns(10);
		textField_13.setBounds(182, 162, 86, 24);
		panel_4.add(textField_13);

		JLabel label_43 = new JLabel("<html><body>走私绳索数（n）:</body></html>");
		label_43.setBounds(14, 199, 154, 21);
		panel_4.add(label_43);

		textField_14 = new JTextField("");
		textField_14.setColumns(10);
		textField_14.setBounds(182, 196, 86, 24);
		panel_4.add(textField_14);

		JLabel label_46 = new JLabel("<html><body>货物重量G:</body></html>");
		label_46.setBounds(14, 252, 154, 21);
		panel_4.add(label_46);

		textField_19 = new JTextField("");
		textField_19.setColumns(10);
		textField_19.setBounds(182, 252, 86, 24);
		panel_4.add(textField_19);

		JLabel label_47 = new JLabel("<html><body>kg</body></html>");
		label_47.setBounds(282, 250, 39, 24);
		panel_4.add(label_47);

		JLabel label_22 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_22.setBounds(279, 28, 42, 18);
		panel_4.add(label_22);

		JLabel label_30 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_30.setBounds(279, 62, 42, 18);
		panel_4.add(label_30);

		JLabel label_32 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_32.setBounds(279, 92, 42, 18);
		panel_4.add(label_32);

		JLabel label_34 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_34.setBounds(279, 128, 42, 18);
		panel_4.add(label_34);

		JLabel label_42 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_42.setBounds(279, 162, 42, 18);
		panel_4.add(label_42);

		JLabel label_44 = new JLabel("<html><body>根</body></html>");
		label_44.setBounds(279, 196, 42, 18);
		panel_4.add(label_44);

		JLabel label_48 = new JLabel("<html><body>建议初始绳索数为5</body></html>");
		label_48.setForeground(Color.RED);
		label_48.setBounds(14, 218, 169, 32);
		panel_4.add(label_48);

		JLabel label_31 = new JLabel("<html><body>货物被拉偏角度p:</body></html>");
		label_31.setBounds(14, 129, 154, 21);
		panel_4.add(label_31);

		JLabel lblg = new JLabel("<html><body>抱杆长度 L:</body></html>");
		lblg.setBounds(14, 290, 154, 21);
		panel_4.add(lblg);

		textField_4 = new JTextField("");
		textField_4.setColumns(10);
		textField_4.setBounds(182, 290, 86, 24);
		panel_4.add(textField_4);

		JLabel lblmm = new JLabel("<html><body>mm</body></html>");
		lblmm.setBounds(282, 288, 39, 24);
		panel_4.add(lblmm);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"管身截面特性", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(818, 187, 392, 197);
		contentPane.add(panel_3);

		JLabel label_8 = new JLabel("<html><body>截面积A:</body></html>");
		label_8.setBounds(44, 54, 154, 21);
		panel_3.add(label_8);

		JLabel label_11 = new JLabel("<html><body>惯性矩I:</body></html>");
		label_11.setBounds(44, 93, 154, 18);
		panel_3.add(label_11);

		textField_7 = new JTextField("0");
		textField_7.setColumns(10);
		textField_7.setBounds(212, 51, 86, 24);
		panel_3.add(textField_7);

		textField_8 = new JTextField("0");
		textField_8.setColumns(10);
		textField_8.setBounds(212, 90, 86, 24);
		panel_3.add(textField_8);

		JLabel label_12 = new JLabel("<html><body>mm<sup>2<sup></body></html>");
		label_12.setBounds(312, 42, 39, 32);
		panel_3.add(label_12);

		JLabel label_13 = new JLabel("<html><body>mm<sup>4<sup></body></html>");
		label_13.setBounds(312, 81, 39, 32);
		panel_3.add(label_13);

		JLabel label_21 = new JLabel("<html><body>mm</body></html>");
		label_21.setBounds(312, 115, 39, 32);
		panel_3.add(label_21);

		JLabel label_24 = new JLabel("回转半径R:");
		label_24.setBounds(44, 127, 154, 18);
		panel_3.add(label_24);

		textField_22 = new JTextField("0");
		textField_22.setColumns(10);
		textField_22.setBounds(212, 124, 86, 24);
		panel_3.add(textField_22);

		JLabel label_51 = new JLabel("抗模弯量W:");
		label_51.setBounds(44, 157, 120, 18);
		panel_3.add(label_51);

		textField_23 = new JTextField("0");
		textField_23.setBounds(212, 154, 86, 24);
		panel_3.add(textField_23);
		textField_23.setColumns(10);

		JLabel label_52 = new JLabel("<html><body>mm<sup>3</sup></body></html>");
		label_52.setBounds(312, 149, 39, 21);
		panel_3.add(label_52);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"管身外型示意图", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		Icon icon2 = new ImageIcon(this.getClass().getResource("w4.png"));
		// ImageIcon image = new ImageIcon();
		Image image1 = ((ImageIcon) icon2).getImage();
		image1 = image1.getScaledInstance(-1, 200, Image.SCALE_DEFAULT);
		((ImageIcon) icon2).setImage(image1);
//		picture2 = new JLabel(icon2, JLabel.CENTER);
		picture2 = new JLabel(Tool.getIcon("./resources/steel/Steel1.png", -1, 175));
		picture2.setBounds(25, 30, 337, 185);
		panel_9.setBounds(392, 187, 389, 228);
		panel_9.add(picture2);
		contentPane.add(panel_9);

		JLabel label_25 = new JLabel("<html><body></body></html>");
		label_25.setBounds(306, 341, 39, 32);
		panel_9.add(label_25);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u94A2\u7BA1\u9009\u578B",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(392, 100, 389, 74);
		contentPane.add(panel_6);

		JRadioButton radioButton = new JRadioButton("钢管");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				des.btn2 = 1.0;
				picture2.setIcon(Tool.getIcon("./resources/steel/Steel1.png", -1, 175));
			}
		});
		radioButton.setActionCommand("Q235");
		radioButton.setBounds(51, 25, 84, 27);
		panel_6.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("六方管");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				des.btn2 = 2.0;
				picture2.setIcon(Tool.getIcon("./resources/steel/Steel2.png", -1, 175));
			}
		});
		radioButton_1.setActionCommand("Q345");
		radioButton_1.setBounds(141, 25, 93, 27);
		panel_6.add(radioButton_1);

		JRadioButton radioButton_8 = new JRadioButton("八方管");
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				des.btn2 = 3.0;
			}
		});

		ButtonGroup buttonGroup = new ButtonGroup();

		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);
		buttonGroup.add(radioButton_8);

		if (des.btn2 == 1.0) {
			picture2.setIcon(Tool.getIcon("./resources/steel/Steel1.png", -1, 175));
			radioButton.setSelected(true);
		} else if (des.btn2 == 2.0) {
			picture2.setIcon(Tool.getIcon("./resources/steel/Steel2.png", -1, 175));
			radioButton_1.setSelected(true);
		} else {

			radioButton_8.setSelected(true);
		}

		radioButton_8.setActionCommand("Q235");
		radioButton_8.setBounds(264, 25, 84, 27);
		panel_6.add(radioButton_8);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(818, 13, 390, 141);
		contentPane.add(panel_10);
		panel_10.setLayout(null);

		JLabel label_5 = new JLabel("外径D:");
		label_5.setBounds(14, 26, 120, 18);
		panel_10.add(label_5);

		textField_6 = new JTextField("");
		textField_6.setBounds(214, 23, 86, 24);
		panel_10.add(textField_6);
		textField_6.setColumns(10);

		JLabel label_6 = new JLabel("mm");
		label_6.setBounds(310, 26, 66, 18);
		panel_10.add(label_6);

		JLabel label_53 = new JLabel("壁厚t:");
		label_53.setBounds(14, 60, 120, 18);
		panel_10.add(label_53);

		textField_24 = new JTextField("");
		textField_24.setBounds(214, 57, 86, 24);
		panel_10.add(textField_24);
		textField_24.setColumns(10);

		JLabel label_54 = new JLabel("<html><body>mm</body></html>");
		label_54.setBounds(310, 57, 66, 21);
		panel_10.add(label_54);

		JLabel lblU = new JLabel("<html><body>抱杆两端铰支系数 u<sub>1</sub>:</body></html>");
		lblU.setBounds(14, 94, 186, 21);
		panel_10.add(lblU);

		textField_5 = new JTextField("");
		textField_5.setColumns(10);
		textField_5.setBounds(214, 91, 86, 24);
		panel_10.add(textField_5);
	}

}
