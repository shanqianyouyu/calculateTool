package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.sun.org.apache.bcel.internal.generic.GotoInstruction;

import ctgu.Entity.SquareDerrickCal;
import ctgu.Entity.Square.DerrickSquareEnity;
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

public class DerrickSquare extends FatherFrame implements ActionListener, ItemListener {

	private JPanel contentPane;
	private JTextField textField_36;
	private JTextField textField_39;
	private JTextField textField_40;

	private DerrickSquareEnity derrickSquareEnity = null;

	private JLabel picture1 = null;
	private JTextField textField_6;
	private JTextField textField_41;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_19;

	
	JRadioButton radioButton_2;
	JRadioButton radioButton_3;
	JRadioButton radioButton_8;
	JRadioButton radioButton_9;
	JRadioButton radioButton_10;
	JRadioButton radioButton_11;
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	JRadioButton radioButton_4;
	JRadioButton radioButton_5;
	public double G;
	public double p;
	public double K; 

	public double FT; 
	public double FK;

	public double N; 
	public double MZ; 

	public double FQ; 
	public double DO; 
	public double FH;

	public double Q; 
	public double GO; 

	public double JF;
	public double JGB; 
	public double L; 
	public double L0; 
	public double S;
	public double J;
	public double Z;

	public double JYV;
	public double DZ;
	public double ZF;
	public double TS;
	public double FL;
	public double QH;
	public double M;
	
	public double DO1;
	public double GZ = 2342.44;
	public double FB;
	public double GN;
	public double TD;
	public double FC;

	public double IX1;
	public double Z0;
	public double AS;
	public double L1;
	
	public Double LL1;
	public Double LL2;
	public Double LL3;
	public Double LL4;

	public double IX;
	public double IR;
	public double W;
	public double YX;
	public double Y0X;

	public double w1;
	public double GA;

	public double AY;

	public double DZ1;

	public double JL;
	public double HR;
	public double XO;
	
	public double DCB;

	public double LJJ;

	public double ND;
	public double DW;
	public double DWA;

	public double C;
	public double P;
	public double FS;
	public double FQ1;

	public double LX;
	public double V1;
	public double V2;
	public double XCB;
	public double XAX;
	public double WA;

	public double b1;
	public double b2;
	
	public double I1;
	public double I11;
	public double I2;
	public double I21;

	JRadioButton radioButton_6;
	JRadioButton radioButton_7;

	JComboBox comboBox;
	JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DerrickSquareEnity de = new DerrickSquareEnity();
					DerrickSquare frame = new DerrickSquare(de);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DerrickSquare(DerrickSquareEnity deo) {
		derrickSquareEnity = deo;
		setTitle("正方形格构抱杆");
		System.out.println("初始化成功...");
		initSquare(deo);
		setResizable(false);
		setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	private void initSquare(DerrickSquareEnity deo) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1350, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"抱杆受力示意图", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		Icon icon1 = new ImageIcon(this.getClass().getResource("r1.png"));
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
		panel_1.setBackground(new Color(253, 253, 241));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"力的计算结果", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel_1.setBounds(392, 417, 364, 230);
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
		label_2.setBounds(14, 65, 154, 18);
		panel_1.add(label_2);

		textField_1 = new JTextField("0");
		textField_1.setColumns(10);
		textField_1.setBounds(182, 62, 86, 24);
		panel_1.add(textField_1);

		JLabel label_17 = new JLabel("kgf");
		label_17.setBounds(282, 65, 39, 18);
		panel_1.add(label_17);

		JLabel label_26 = new JLabel("<html><body>顶滑轮的载荷F<sub>H</sub>:</body></html>");
		label_26.setBounds(14, 95, 120, 21);
		panel_1.add(label_26);

		textField_2 = new JTextField("0");
		textField_2.setColumns(10);
		textField_2.setBounds(182, 92, 86, 24);
		panel_1.add(textField_2);

		JLabel label_27 = new JLabel("<html><body>kgf</body></html>");
		label_27.setBounds(282, 84, 39, 32);
		panel_1.add(label_27);

		JLabel label_28 = new JLabel("<html><body>外张线拉力F<sub>B</sub>:</body></html>");
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
		label_35.setBounds(14, 165, 154, 18);
		panel_1.add(label_35);

		textField_16 = new JTextField("0");
		textField_16.setColumns(10);
		textField_16.setBounds(182, 162, 86, 24);
		panel_1.add(textField_16);

		JLabel label_37 = new JLabel("<html><body>kgf</body></html>");
		label_37.setBounds(282, 159, 39, 24);
		panel_1.add(label_37);

		JLabel label_38 = new JLabel("<html><body>承托绳最大张力F<sub>C</sub>:</body></html>");
		label_38.setBounds(14, 199, 154, 21);
		panel_1.add(label_38);

		textField_17 = new JTextField("0");
		textField_17.setColumns(10);
		textField_17.setBounds(182, 196, 86, 24);
		panel_1.add(textField_17);

		JLabel label_39 = new JLabel("<html><body>kgf</body></html>");
		label_39.setBounds(282, 196, 39, 24);
		panel_1.add(label_39);

		JButton button = new JButton("保存");
		button.setBounds(124, 767, 113, 27);
		contentPane.add(button);

		JButton button_1 = new JButton("打印");
		button_1.setBounds(640, 767, 113, 27);
		contentPane.add(button_1);

		JButton button_2 = new JButton("计算");
		button_2.setActionCommand("计算");
		button_2.addActionListener(this);
		button_2.setBounds(1072, 767, 113, 27);
		contentPane.add(button_2);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(253, 253, 241));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"杆身整体稳定性/主材单肢刚度验算", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(770, 215, 555, 150);
		contentPane.add(panel_5);

		JLabel label_45 = new JLabel("<html><body></body></html>");
		label_45.setBounds(306, 341, 39, 32);
		panel_5.add(label_45);

		textField_36 = new JTextField("0");
		textField_36.setBounds(146, 35, 57, 24);
		panel_5.add(textField_36);
		textField_36.setColumns(10);

		JLabel label_64 = new JLabel("截面换算长细比:");
		label_64.setBounds(29, 38, 154, 18);
		panel_5.add(label_64);

		JLabel label_90 = new JLabel("<html><body>≤120</body></html>");
		label_90.setForeground(Color.RED);
		label_90.setBounds(217, 29, 39, 32);
		panel_5.add(label_90);

		radioButton = new JRadioButton("通过");
		radioButton.setEnabled(false);
		radioButton.setBounds(357, 29, 70, 27);
		panel_5.add(radioButton);

		radioButton_1 = new JRadioButton("未通过");
		radioButton_1.setEnabled(false);
		radioButton_1.setBounds(436, 29, 80, 27);
		panel_5.add(radioButton_1);

		JLabel label_10 = new JLabel("整体稳定安全系数:");
		label_10.setBounds(14, 75, 169, 18);
		panel_5.add(label_10);

		textField_4 = new JTextField("0");
		textField_4.setColumns(10);
		textField_4.setBounds(146, 72, 57, 24);
		panel_5.add(textField_4);

		JLabel label_15 = new JLabel("<html><body>≥2.5</body></html>");
		label_15.setForeground(Color.RED);
		label_15.setBounds(217, 66, 39, 32);
		panel_5.add(label_15);

		radioButton_8 = new JRadioButton("通过");
		radioButton_8.setEnabled(false);
		radioButton_8.setBounds(357, 66, 70, 27);
		panel_5.add(radioButton_8);

		radioButton_9 = new JRadioButton("未通过");
		radioButton_9.setEnabled(false);
		radioButton_9.setBounds(436, 66, 80, 27);
		panel_5.add(radioButton_9);

		JLabel label_16 = new JLabel("单主肢长细比:");
		label_16.setBounds(14, 111, 169, 18);
		panel_5.add(label_16);

		textField_5 = new JTextField("0");
		textField_5.setColumns(10);
		textField_5.setBounds(146, 108, 57, 24);
		panel_5.add(textField_5);

		JLabel label_18 = new JLabel("<html><body>≤0.7倍截面长细比</body></html>");
		label_18.setForeground(Color.RED);
		label_18.setBounds(207, 102, 169, 32);
		panel_5.add(label_18);

		radioButton_10 = new JRadioButton("通过");
		radioButton_10.setEnabled(false);
		radioButton_10.setBounds(357, 102, 70, 27);
		panel_5.add(radioButton_10);

		radioButton_11 = new JRadioButton("未通过");
		radioButton_11.setEnabled(false);
		radioButton_11.setBounds(436, 102, 80, 27);
		panel_5.add(radioButton_11);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(253, 253, 241));
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"斜缀条计算", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(770, 382, 560, 126);
		contentPane.add(panel_7);

		JLabel label_67 = new JLabel("斜缀条长细比:");
		label_67.setBounds(74, 59, 120, 18);
		panel_7.add(label_67);

		textField_39 = new JTextField("0");
		textField_39.setColumns(10);
		textField_39.setBounds(179, 56, 52, 24);
		panel_7.add(textField_39);

		radioButton_2 = new JRadioButton("通过");
		radioButton_2.setEnabled(false);
		radioButton_2.setBounds(294, 54, 70, 27);
		panel_7.add(radioButton_2);

		radioButton_3 = new JRadioButton("未通过");
		radioButton_3.setEnabled(false);
		radioButton_3.setBounds(373, 54, 80, 27);
		panel_7.add(radioButton_3);

		JLabel label_69 = new JLabel("斜缀条稳定安全系数:");
		label_69.setBounds(46, 90, 157, 18);
		panel_7.add(label_69);

		textField_40 = new JTextField("0");
		textField_40.setColumns(10);
		textField_40.setBounds(208, 87, 52, 24);
		panel_7.add(textField_40);

		radioButton_4 = new JRadioButton("通过");
		radioButton_4.setEnabled(false);
		radioButton_4.setBounds(343, 84, 70, 27);
		panel_7.add(radioButton_4);

		radioButton_5 = new JRadioButton("未通过");
		radioButton_5.setEnabled(false);
		radioButton_5.setBounds(424, 84, 80, 27);
		panel_7.add(radioButton_5);

		JLabel label_3 = new JLabel("<html><body>≤120</body></html>");
		label_3.setForeground(Color.RED);
		label_3.setBounds(245, 51, 39, 32);
		panel_7.add(label_3);

		JLabel label_4 = new JLabel("<html><body>≥2.5</body></html>");
		label_4.setForeground(Color.RED);
		label_4.setBounds(274, 81, 39, 32);
		panel_7.add(label_4);

		JLabel label_7 = new JLabel("单肢轴压力:");
		label_7.setBounds(74, 25, 154, 18);
		panel_7.add(label_7);

		textField_3 = new JTextField("0");
		textField_3.setColumns(10);
		textField_3.setBounds(242, 22, 86, 24);
		panel_7.add(textField_3);

		JLabel label_9 = new JLabel("kgf");
		label_9.setBounds(342, 25, 39, 18);
		panel_7.add(label_9);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"钢材的材质选型", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(392, 13, 364, 74);
		contentPane.add(panel_8);

		radioButton_6 = new JRadioButton("Q235");
		radioButton_6.setBounds(61, 24, 84, 27);
		panel_8.add(radioButton_6);

		radioButton_7 = new JRadioButton("Q345");
		radioButton_7.setBounds(163, 24, 93, 27);
		panel_8.add(radioButton_7);

		radioButton_6.setActionCommand("Q235");
		radioButton_7.setActionCommand("Q345");
		radioButton_6.addActionListener(this);
		radioButton_7.addActionListener(this);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(389, 215, 364, 189);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"抱杆尺寸", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel label_24 = new JLabel("抱杆的总长L:");
		label_24.setBounds(27, 29, 120, 18);
		panel_9.add(label_24);

		textField_6 = new JTextField("0");
		textField_6.setColumns(10);
		textField_6.setBounds(195, 26, 86, 24);
		panel_9.add(textField_6);

		JLabel label_25 = new JLabel("mm");
		label_25.setBounds(295, 29, 39, 18);
		panel_9.add(label_25);

		JLabel label_75 = new JLabel("<html><body>非变截面段总长L<sub>0</sub>:</body></html>");
		label_75.setBounds(27, 56, 154, 21);
		panel_9.add(label_75);

		JLabel label_76 = new JLabel("<html><body>主材单肢计算长度Z:</body></html>");
		label_76.setBounds(27, 86, 154, 18);
		panel_9.add(label_76);

		textField_41 = new JTextField("0");
		textField_41.setColumns(10);
		textField_41.setBounds(195, 53, 86, 24);
		panel_9.add(textField_41);

		textField_43 = new JTextField("0");
		textField_43.setColumns(10);
		textField_43.setBounds(195, 83, 86, 24);
		panel_9.add(textField_43);

		JLabel label_77 = new JLabel("<html><body>mm</body></html>");
		label_77.setBounds(295, 44, 39, 32);
		panel_9.add(label_77);

		JLabel label_78 = new JLabel("<html><body>mm</body></html>");
		label_78.setBounds(295, 74, 39, 32);
		panel_9.add(label_78);

		JLabel label_79 = new JLabel("标准节截面外皮长S:");
		label_79.setBounds(27, 113, 154, 18);
		panel_9.add(label_79);

		textField_44 = new JTextField("0");
		textField_44.setColumns(10);
		textField_44.setBounds(195, 110, 86, 24);
		panel_9.add(textField_44);

		JLabel label_80 = new JLabel("<html><body>mm</body></html>");
		label_80.setBounds(295, 101, 39, 32);
		panel_9.add(label_80);

		JLabel label_81 = new JLabel("<html><body>mm</body></html>");
		label_81.setBounds(295, 131, 39, 32);
		panel_9.add(label_81);

		JLabel label_82 = new JLabel("杆尖截面边长J:");
		label_82.setBounds(27, 143, 154, 18);
		panel_9.add(label_82);

		textField_45 = new JTextField("0");
		textField_45.setColumns(10);
		textField_45.setBounds(195, 140, 86, 24);
		panel_9.add(textField_45);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"抱杆选型", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(392, 104, 364, 98);
		contentPane.add(panel_3);

		JLabel label_14 = new JLabel("主材（主肢）规格:");
		label_14.setBounds(14, 31, 152, 18);
		panel_3.add(label_14);

		JLabel label_21 = new JLabel("斜材规格:");
		label_21.setBounds(14, 65, 138, 18);
		panel_3.add(label_21);

		comboBox = new JComboBox();
		comboBox.addItem("请选择"); // 向下拉列表中添加一项
		comboBox.addItem("∠30x3");
		comboBox.addItem("∠40x3");
		comboBox.addItem("∠40x4");
		comboBox.addItem("∠45x4");
		comboBox.addItem("∠45x5");
		comboBox.addItem("∠50x4");
		comboBox.addItem("∠50x5");
		comboBox.addItem("∠56x4");
		comboBox.addItem("∠56x5");
		comboBox.addItem("∠63x5");
		comboBox.addItem("∠63x6");
		comboBox.addItem("∠70x5");
		comboBox.addItem("∠70x6");
		comboBox.addItem("∠70x7");
		comboBox.addItem("∠75x6");
		comboBox.addItem("∠75x7");
		comboBox.addItem("∠80x6");
		comboBox.addItem("∠80x7");
		comboBox.addItem("∠80x8");
		comboBox.addItem("∠90x6");
		comboBox.addItem("∠90x7");
		comboBox.addItem("∠90x8");
		comboBox.addItem("∠100x8");
		comboBox.addItem("∠100x10");
		comboBox.addItem("∠110x8");
		comboBox.addItem("∠110x10");
		comboBox.addItem("∠125x8");
		comboBox.addItem("∠125x10");
		comboBox.addItem("∠125x12");
		comboBox.addItem("∠140x10");
		comboBox.addItem("∠140x12");
		comboBox.addItem("∠140x14");
		comboBox.addItemListener(this);
		comboBox.setBounds(161, 28, 100, 24);
		panel_3.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.addItem("请选择"); // 向下拉列表中添加一项
		comboBox_1.addItem("∠30x3");
		comboBox_1.addItem("∠40x3");
		comboBox_1.addItem("∠40x4");
		comboBox_1.addItem("∠45x4");
		comboBox_1.addItem("∠45x5");
		comboBox_1.addItem("∠50x4");
		comboBox_1.addItem("∠50x5");
		comboBox_1.addItem("∠56x4");
		comboBox_1.addItem("∠56x5");
		comboBox_1.addItem("∠63x5");
		comboBox_1.addItem("∠63x6");
		comboBox_1.addItem("∠70x5");
		comboBox_1.addItem("∠70x6");
		comboBox_1.addItem("∠70x7");
		comboBox_1.addItem("∠75x6");
		comboBox_1.addItem("∠75x7");
		comboBox_1.addItem("∠80x6");
		comboBox_1.addItem("∠80x7");
		comboBox_1.addItem("∠80x8");
		comboBox_1.addItem("∠90x6");
		comboBox_1.addItem("∠90x7");
		comboBox_1.addItem("∠90x8");
		comboBox_1.addItem("∠100x8");
		comboBox_1.addItem("∠100x10");
		comboBox_1.addItem("∠110x8");
		comboBox_1.addItem("∠110x10");
		comboBox_1.addItem("∠125x8");
		comboBox_1.addItem("∠125x10");
		comboBox_1.addItem("∠125x12");
		comboBox_1.addItem("∠140x10");
		comboBox_1.addItem("∠140x12");
		comboBox_1.addItem("∠140x14");
		comboBox_1.addItemListener(this);
		comboBox_1.setBounds(161, 62, 100, 24);
		panel_3.add(comboBox_1);

		JLabel label_13 = new JLabel("如∠70x7");
		label_13.setBounds(275, 31, 75, 18);
		panel_3.add(label_13);

		JLabel label_19 = new JLabel("如∠50x5");
		label_19.setBounds(275, 65, 75, 18);
		panel_3.add(label_19);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"吊装数据", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(14, 412, 364, 253);
		contentPane.add(panel_4);

		JLabel label_20 = new JLabel("<html><body>控制绳对地夹角K:</body></html>");
		label_20.setBounds(14, 31, 154, 24);
		panel_4.add(label_20);

		textField_9 = new JTextField("0");
		textField_9.setColumns(10);
		textField_9.setBounds(182, 28, 86, 24);
		panel_4.add(textField_9);

		JLabel label_31 = new JLabel("<html><body>货物被拉偏角度p:</body></html>");
		label_31.setBounds(14, 62, 154, 21);
		panel_4.add(label_31);

		textField_11 = new JTextField("0");
		textField_11.setColumns(10);
		textField_11.setBounds(182, 59, 86, 24);
		panel_4.add(textField_11);

		JLabel label_33 = new JLabel("<html><body>杆身倾斜角度q:</body></html>");
		label_33.setBounds(14, 95, 154, 24);
		panel_4.add(label_33);

		textField_12 = new JTextField("0");
		textField_12.setColumns(10);
		textField_12.setBounds(182, 96, 86, 24);
		panel_4.add(textField_12);

		JLabel label_36 = new JLabel("承托绳对地夹角t:");
		label_36.setBounds(14, 132, 154, 18);
		panel_4.add(label_36);

		textField_13 = new JTextField("0");
		textField_13.setColumns(10);
		textField_13.setBounds(182, 129, 86, 24);
		panel_4.add(textField_13);

		JLabel label_43 = new JLabel("<html><body>绳索数（n）:</body></html>");
		label_43.setBounds(14, 166, 154, 21);
		panel_4.add(label_43);

		textField_14 = new JTextField("0");
		textField_14.setColumns(10);
		textField_14.setBounds(182, 163, 86, 24);
		panel_4.add(textField_14);

		JLabel label_46 = new JLabel("<html><body>货物重量G:</body></html>");
		label_46.setBounds(14, 219, 154, 21);
		panel_4.add(label_46);

		textField_19 = new JTextField("0");
		textField_19.setColumns(10);
		textField_19.setBounds(182, 216, 86, 24);
		panel_4.add(textField_19);

		JLabel label_47 = new JLabel("<html><body>kg</body></html>");
		label_47.setBounds(282, 216, 39, 24);
		panel_4.add(label_47);

		JLabel label_22 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_22.setBounds(279, 28, 42, 18);
		panel_4.add(label_22);

		JLabel label_32 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_32.setBounds(279, 59, 42, 18);
		panel_4.add(label_32);

		JLabel label_34 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_34.setBounds(279, 95, 42, 18);
		panel_4.add(label_34);

		JLabel label_42 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_42.setBounds(279, 129, 42, 18);
		panel_4.add(label_42);

		JLabel label_44 = new JLabel("<html><body>根</body></html>");
		label_44.setBounds(279, 163, 42, 18);
		panel_4.add(label_44);

		JLabel label_48 = new JLabel("<html><body>建议初始绳索数为7</body></html>");
		label_48.setForeground(Color.RED);
		label_48.setBounds(14, 185, 169, 32);
		panel_4.add(label_48);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(253, 253, 241));
		panel_2.setBounds(769, 35, 556, 141);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"风载", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel label_11 = new JLabel("<html><body>计算风压   P=90N/m<sup>2</sup></body></html>");
		label_11.setBounds(147, 92, 254, 21);
		panel_2.add(label_11);

		JLabel label_5 = new JLabel("风载q:");
		label_5.setBounds(147, 30, 120, 18);
		panel_2.add(label_5);

		textField_7 = new JTextField("0");
		textField_7.setColumns(10);
		textField_7.setBounds(315, 27, 86, 24);
		panel_2.add(textField_7);

		JLabel label_6 = new JLabel("kgf");
		label_6.setBounds(415, 30, 39, 18);
		panel_2.add(label_6);

		textField_8 = new JTextField("0");
		textField_8.setColumns(10);
		textField_8.setBounds(315, 61, 86, 24);
		panel_2.add(textField_8);

		JLabel label_8 = new JLabel("Pa");
		label_8.setBounds(415, 64, 39, 18);
		panel_2.add(label_8);

		JLabel label_12 = new JLabel("风弯矩M:");
		label_12.setBounds(147, 64, 120, 18);
		panel_2.add(label_12);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		I1 = comboBox.getSelectedIndex();
		System.out.println(I1);

		I2 = comboBox_1.getSelectedIndex();
		System.out.println(I2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Q345")) {
			FS = 215000000;
			FQ1 = 235000000;
			radioButton_6.setSelected(false);
		}
		if (e.getActionCommand().equals("Q235")) {
			FS = 310000000;
			FQ1 = 345000000;
			radioButton_7.setSelected(false);
		}
		
		
		if(e.getActionCommand().equals("计算")) {
			if(!textField.getText().trim().matches("^[0.0-9.0]+$") || !textField_1.getText().trim().matches("^[0.0-9.0]+$") ||
					!textField_2.getText().trim().matches("^[0.0-9.0]+$") || !textField_15.getText().trim().matches("^[0.0-9.0]+$") ||
							!textField_16.getText().trim().matches("^[0.0-9.0]+$")|| !textField_17.getText().trim().matches("^[0.0-9.0]+$") ||
							 !textField_9.getText().trim().matches("^[0.0-9.0]+$") ||
							 !textField_11.getText().trim().matches("^[0.0-9.0]+$") || 
							!textField_12.getText().trim().matches("^[0.0-9.0]+$") || !textField_13.getText().trim().matches("^[0.0-9.0]+$") ||
							!textField_14.getText().trim().matches("^[0.0-9.0]+$") || !textField_19.getText().trim().matches("^[0.0-9.0]+$") || 
							!textField_6.getText().trim().matches("^[0.0-9.0]+$")|| !textField_41.getText().trim().matches("^[0.0-9.0]+$") 
							|| !textField_43.getText().trim().matches("^[0.0-9.0]+$")  || !textField_44.getText().trim().matches("^[0.0-9.0]+$") 
							|| !textField_45.getText().trim().matches("^[0.0-9.0]+$") )
			 {
				JOptionPane.showMessageDialog(null,"输入不合法或者输入为0","ERROR",JOptionPane.ERROR_MESSAGE);
			} else{
				
				K = Double.valueOf(textField_9.getText().trim());
//				 = Double.valueOf(textField_10.getText().trim());
				p = Double.valueOf(textField_11.getText().trim());
				Q = Double.valueOf(textField_12.getText().trim());
				TD = Double.valueOf(textField_13.getText().trim());
				N = Double.valueOf(textField_14.getText().trim());
				G = Double.valueOf(textField_19.getText().trim());
				
				L = Double.valueOf(textField_6.getText().trim());
				L0 = Double.valueOf(textField_41.getText().trim());
				Z = Double.valueOf(textField_43.getText().trim());
				S = Double.valueOf(textField_44.getText().trim());
				J = Double.valueOf(textField_45.getText().trim());
				
				SquareDerrickCal sqc = new SquareDerrickCal(K, p, Q, TD, N, G, L, L0, Z, S, J,FS,FQ1,I1,I2);
				
				FT = sqc.hualun();
				FK = sqc.kongzhi();
				FQ = sqc.qianyin();
				GO = sqc.zongzhong();
				FH = sqc.dinghuaz();
				DO = sqc.dinghuao();
				JYV = sqc.chajie();
				DZ = sqc.gowind();
				ZF = sqc.zongfengli();
				TS = sqc.goujian();
				FL = sqc.fengli();
				QH = sqc.fenghezai();
				M = sqc.dangfengzai();
				LL1 = sqc.middle1();
				LL2 = sqc.middle2();
				LL3 = sqc.middle3();
				LL4 = sqc.middle4();
				FB = sqc.waizhangxian();
				GN = sqc.ganshen();
				FC = sqc.zuida();
				L1 = sqc.jisuanlong();
				IX = sqc.jimianguanxin();
				IR = sqc.huizhuan();
				W = sqc.kangwan();
				
				textField.setText(String.format("%.2f", FK));
				textField_1.setText(String.format("%.2f", FQ));
				textField_2.setText(String.format("%.2f", FH));
				textField_15.setText(String.format("%.2f", FB));
				textField_16.setText(String.format("%.2f", GN));
				textField_17.setText(String.format("%.2f", FC));

				

				
				
				YX = sqc.changxi();
				Y0X = sqc.huansuan();
				w1 = sqc.wendingxi();
				
				AY = sqc.anquan();
				XO = sqc.xiezhuitiao();
				DCB = sqc.danzhi();
				LJJ = sqc.liangcao();
				
				
				ND  = sqc.danzhizhou();
				DW = sqc.danzhiwen();
				DWA = sqc.danzhiwenan();
				LX = sqc.jisuanlonglx();
				V1 = sqc.v1();
				V2 = sqc.v2();
				XCB = sqc.xiezhuichangxibi();
				XAX = sqc.xiewending();
				WA = sqc.xiewendingan();
				if(Y0X <= 120){
					radioButton.setEnabled(true);
					radioButton.setSelected(true);
				}else{
					radioButton_1.setEnabled(true);
					radioButton_1.setSelected(true);
				}
				
				if(AY >= 2.5){
					radioButton_8.setEnabled(true);
					radioButton_8.setSelected(true);
				}else{
					radioButton_9.setEnabled(true);
					radioButton_9.setSelected(true);
				}
				
				if(DCB <= 0.7*YX){
					radioButton_10.setEnabled(true);
					radioButton_10.setSelected(true);
				}else{
					radioButton_11.setEnabled(true);
					radioButton_11.setSelected(true);
				}
				
				if(XCB <= 120){
					radioButton_2.setEnabled(true);
					radioButton_2.setSelected(true);
				}else{
					radioButton_3.setEnabled(true);
					radioButton_3.setSelected(true);
				}
				
				if(WA >= 2.5){
					radioButton_4.setEnabled(true);
					radioButton_4.setSelected(true);
				}else{
					radioButton_5.setEnabled(true);
					radioButton_5.setSelected(true);
				}
				textField_7.setText(String.format("%.2f", QH));
				textField_8.setText(String.format("%.2f", M));
				textField_36.setText(String.format("%.2f", Y0X));
				textField_4.setText(String.format("%.2f", AY));
				textField_5.setText(String.format("%.2f", DCB));
				textField_3.setText(String.format("%.2f", ND));
				textField_39.setText(String.format("%.2f", XCB));
				textField_40.setText(String.format("%.2f", WA));
			}
			
		}

	}
}
