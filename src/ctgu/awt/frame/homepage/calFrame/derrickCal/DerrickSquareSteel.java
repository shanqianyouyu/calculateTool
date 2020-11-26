package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ctgu.Entity.Square.DerrickSquareEnity;
import ctgu.Entity.Square.DerrickSquareSteelEnity;
import ctgu.Entity.weld.WeldObliqueEntity;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.calFrame.weld.WeldFrameN;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class DerrickSquareSteel extends FatherFrame implements ActionListener, ItemListener {

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

	JRadioButton radioButton_6;
	JRadioButton radioButton_7;

	JRadioButton radioButton_12;
	JRadioButton radioButton_13;
	private JTextField textField_20;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_3;

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
		setTitle("钢管抱杆（根附着或者漂浮）");
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
		setBounds(100, 100, 1300, 950);
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
		picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(14, 13, 336, 366);
		panel.setBounds(14, 13, 364, 386);
		contentPane.add(panel);
		panel.add(picture1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"施工参数", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel_1.setBounds(14, 400, 364, 312);
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

		JLabel label_40 = new JLabel("<html><body>抱杆身部自重:</body></html>");
		label_40.setBounds(14, 232, 154, 21);
		panel_1.add(label_40);

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

		JButton button = new JButton("保存");
		button.setBounds(119, 840, 113, 27);
		contentPane.add(button);

		JButton button_1 = new JButton("打印");
		button_1.setBounds(635, 840, 113, 27);
		contentPane.add(button_1);

		JButton button_2 = new JButton("计算");
		button_2.setBounds(1067, 840, 113, 27);
		contentPane.add(button_2);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(253,253,241));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"局部稳定性计算（前者不大于后者即为合格）", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(804, 248, 469, 74);
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
		panel_7.setBackground(new Color(253,253,241));
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"整体稳定性计算", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(804, 335, 476, 102);
		contentPane.add(panel_7);

		JLabel label_67 = new JLabel("杆身长细比λ:");
		label_67.setBounds(14, 34, 120, 18);
		panel_7.add(label_67);

		textField_39 = new JTextField("0");
		textField_39.setColumns(10);
		textField_39.setBounds(119, 31, 52, 24);
		panel_7.add(textField_39);

		JRadioButton radioButton_2 = new JRadioButton("通过");
		radioButton_2.setBounds(296, 30, 70, 27);
		panel_7.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("未通过");
		radioButton_3.setBounds(375, 30, 80, 27);
		panel_7.add(radioButton_3);

		JLabel label_69 = new JLabel("杆身整体稳定安全系数:");
		label_69.setBounds(14, 65, 168, 18);
		panel_7.add(label_69);

		textField_40 = new JTextField("0");
		textField_40.setColumns(10);
		textField_40.setBounds(184, 62, 52, 24);
		panel_7.add(textField_40);

		JRadioButton radioButton_4 = new JRadioButton("通过");
		radioButton_4.setBounds(296, 65, 70, 27);
		panel_7.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("未通过");
		radioButton_5.setBounds(375, 65, 80, 27);
		panel_7.add(radioButton_5);

		JLabel label_3 = new JLabel("<html><body>120≤λ≤150</body></html>");
		label_3.setForeground(Color.RED);
		label_3.setBounds(185, 25, 100, 32);
		panel_7.add(label_3);
		
				JLabel label_4 = new JLabel("<2.5");
				label_4.setBounds(244, 58, 42, 32);
				panel_7.add(label_4);
				label_4.setForeground(Color.RED);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"钢材的材质选型", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(392, 100, 389, 74);
		contentPane.add(panel_8);

		radioButton_6 = new JRadioButton("Q235");
		radioButton_6.setBounds(99, 25, 84, 27);
		panel_8.add(radioButton_6);

		radioButton_7 = new JRadioButton("Q345");
		radioButton_7.setBounds(201, 25, 93, 27);
		panel_8.add(radioButton_7);

		radioButton_6.setActionCommand("Q235");
		radioButton_7.setActionCommand("Q345");
		radioButton_6.addActionListener(this);
		radioButton_7.addActionListener(this);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"工况条件", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(389, 191, 392, 299);
		contentPane.add(panel_4);

		JLabel label_20 = new JLabel("<html><body>控制绳对地夹角K:</body></html>");
		label_20.setBounds(14, 31, 154, 24);
		panel_4.add(label_20);

		textField_9 = new JTextField("0");
		textField_9.setColumns(10);
		textField_9.setBounds(182, 28, 86, 24);
		panel_4.add(textField_9);

		JLabel label_23 = new JLabel("外拉线对地夹角b:");
		label_23.setBounds(14, 95, 154, 18);
		panel_4.add(label_23);

		textField_10 = new JTextField("0");
		textField_10.setColumns(10);
		textField_10.setBounds(182, 62, 86, 24);
		panel_4.add(textField_10);

		textField_11 = new JTextField("0");
		textField_11.setColumns(10);
		textField_11.setBounds(182, 92, 86, 24);
		panel_4.add(textField_11);

		JLabel label_33 = new JLabel("<html><body>杆身倾斜角度q:</body></html>");
		label_33.setBounds(14, 62, 154, 24);
		panel_4.add(label_33);

		textField_12 = new JTextField("0");
		textField_12.setColumns(10);
		textField_12.setBounds(182, 129, 86, 24);
		panel_4.add(textField_12);

		JLabel label_36 = new JLabel("承托绳对地夹角t:");
		label_36.setBounds(14, 165, 154, 18);
		panel_4.add(label_36);

		textField_13 = new JTextField("0");
		textField_13.setColumns(10);
		textField_13.setBounds(182, 162, 86, 24);
		panel_4.add(textField_13);

		JLabel label_43 = new JLabel("<html><body>走私绳索数（n）:</body></html>");
		label_43.setBounds(14, 199, 154, 21);
		panel_4.add(label_43);

		textField_14 = new JTextField("0");
		textField_14.setColumns(10);
		textField_14.setBounds(182, 196, 86, 24);
		panel_4.add(textField_14);

		JLabel label_46 = new JLabel("<html><body>货物重量G:</body></html>");
		label_46.setBounds(14, 252, 154, 21);
		panel_4.add(label_46);

		textField_19 = new JTextField("0");
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
		
						"管身是否焊管", TitledBorder.LEADING,
		
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(392, 13, 389, 74);
		contentPane.add(panel_2);
		
		radioButton_12 = new JRadioButton("无缝管（W）");
		radioButton_12.setActionCommand("无缝管");
		radioButton_12.setBounds(61, 24, 131, 27);
		panel_2.add(radioButton_12);
		
		radioButton_13 = new JRadioButton("焊管（H）");
		radioButton_13.setActionCommand("焊管");
		radioButton_13.setBounds(198, 24, 145, 27);
		panel_2.add(radioButton_13);
		
		radioButton_12.addActionListener(this);
		radioButton_13.addActionListener(this);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
		
						"管身截面特性", TitledBorder.LEADING,
		
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(389, 489, 392, 238);
		contentPane.add(panel_3);
		
		JLabel label_5 = new JLabel("外径D:");
		label_5.setBounds(44, 27, 120, 18);
		panel_3.add(label_5);
		
		textField_6 = new JTextField("0");
		textField_6.setColumns(10);
		textField_6.setBounds(212, 24, 86, 24);
		panel_3.add(textField_6);
		
		JLabel label_6 = new JLabel("mm");
		label_6.setBounds(312, 27, 39, 18);
		panel_3.add(label_6);
		
		JLabel label_8 = new JLabel("<html><body>截面积A:</body></html>");
		label_8.setBounds(44, 54, 154, 21);
		panel_3.add(label_8);
		
		JLabel label_11 = new JLabel("<html><body>惯性矩I:</body></html>");
		label_11.setBounds(44, 84, 154, 18);
		panel_3.add(label_11);
		
		textField_7 = new JTextField("0");
		textField_7.setColumns(10);
		textField_7.setBounds(212, 51, 86, 24);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField("0");
		textField_8.setColumns(10);
		textField_8.setBounds(212, 81, 86, 24);
		panel_3.add(textField_8);
		
		JLabel label_12 = new JLabel("<html><body>mm<sup>2<sup></body></html>");
		label_12.setBounds(312, 42, 39, 32);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("<html><body>mm<sup>4<sup></body></html>");
		label_13.setBounds(312, 72, 39, 32);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("单重:");
		label_14.setBounds(44, 111, 154, 18);
		panel_3.add(label_14);
		
		textField_21 = new JTextField("0");
		textField_21.setColumns(10);
		textField_21.setBounds(212, 108, 86, 24);
		panel_3.add(textField_21);
		
		JLabel label_19 = new JLabel("<html><body>kg/mm</body></html>");
		label_19.setBounds(312, 99, 39, 32);
		panel_3.add(label_19);
		
		JLabel label_21 = new JLabel("<html><body>mm</body></html>");
		label_21.setBounds(312, 129, 39, 32);
		panel_3.add(label_21);
		
		JLabel label_24 = new JLabel("回转半径R:");
		label_24.setBounds(44, 141, 154, 18);
		panel_3.add(label_24);
		
		textField_22 = new JTextField("0");
		textField_22.setColumns(10);
		textField_22.setBounds(212, 138, 86, 24);
		panel_3.add(textField_22);
		
		JLabel label_51 = new JLabel("抗模弯量W:");
		label_51.setBounds(44, 171, 120, 18);
		panel_3.add(label_51);
		
		textField_23 = new JTextField("0");
		textField_23.setBounds(212, 168, 86, 24);
		panel_3.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel label_52 = new JLabel("<html><body>mm<sup>3</sup></body></html>");
		label_52.setBounds(312, 163, 39, 21);
		panel_3.add(label_52);
		
		JLabel label_54 = new JLabel("<html><body>mm</body></html>");
		label_54.setBounds(312, 197, 39, 21);
		panel_3.add(label_54);
		
		textField_24 = new JTextField("0");
		textField_24.setBounds(212, 197, 86, 24);
		panel_3.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel label_53 = new JLabel("壁厚t:");
		label_53.setBounds(44, 200, 120, 18);
		panel_3.add(label_53);
		
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
		picture2 = new JLabel(icon2, JLabel.CENTER);
		picture2.setBounds(25, 30, 416, 185);
		panel_9.setBounds(805, 13, 469, 228);
		panel_9.add(picture2);
		contentPane.add(panel_9);
		
		JLabel label_25 = new JLabel("<html><body></body></html>");
		label_25.setBounds(306, 341, 39, 32);
		panel_9.add(label_25);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Q345")) {
			radioButton_6.setSelected(false);
		}
		if (e.getActionCommand().equals("Q235")) {
			radioButton_7.setSelected(false);
		}

		if (e.getActionCommand().equals("无缝管")) {
			radioButton_13.setSelected(false);
		}
		else if (e.getActionCommand().equals("焊管")) {
			radioButton_12.setSelected(false);
		}
		
	
	}
}
