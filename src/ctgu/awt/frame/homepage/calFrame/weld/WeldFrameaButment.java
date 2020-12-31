package ctgu.awt.frame.homepage.calFrame.weld;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

import ctgu.Entity.WeldButmentCal;
import ctgu.Entity.weld.WeldAngleEntity;
import ctgu.Entity.weld.WeldButmentEntity;
import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class WeldFrameaButment extends FatherFrame implements ActionListener, ItemListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	//变量获取
	private int B1;
	private int B2;
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
	private JTextField textField_29;
	
	
	JRadioButton radioButton;
	JRadioButton radioButton_7;
	JRadioButton radioButton_8;
	JRadioButton radioButton_1;
	JRadioButton radioButton_2;
	JRadioButton radioButton_3;
	JRadioButton radioButton_4;
	JRadioButton radioButton_11;
	JRadioButton radioButton_12;
	JRadioButton radioButton_17;
	JRadioButton radioButton_18;
	JRadioButton radioButton_13;
	JRadioButton radioButton_14;
	JRadioButton radioButton_15;
	JRadioButton radioButton_16;
	JRadioButton radioButton_19;
	JRadioButton radioButton_5;
	JRadioButton radioButton_6;
	JRadioButton radioButton_9;
	JRadioButton radioButton_10;
	
	private double x1;
	private double x2;
	private double x3;
	private double x4;
	private double x5;
	private double x6;
	
	public double LW;
	public double PA;
	public double H1;
	public double FZ;
	
	public double FTW;
	public double FVW;		
	
	public double ZF;
	public double JZ;

	public double FH;
	public double YH;
	public double FW;
	public double YW;
		
	public double M1;
	public double N1;
	public double V1;
	
	
	public double FFW1;
	public double FTW1;
	public double FVW1;
	
	public double SA;
	public double IX;
	public double WX;
	public double SW;
	public double SX;
	
	public double O1;
	public double T1;
	public double JF1;
	public double ZF1;
	public double OS;
	
	public boolean se1;
	
	public boolean se2;
	//打印
	private String outPutTxt = "";
	
	private JLabel picture1 = null;
	
	private JLabel picture2 = null;
	private JTextField textField_2;
	
	
	private WeldButmentEntity weldButmentEntity = null;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_30;
	private JTextField textField_31;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeldButmentEntity wb = new WeldButmentEntity();
					WeldFrameaButment window = new WeldFrameaButment(wb);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WeldFrameaButment(WeldButmentEntity WEB) {
		weldButmentEntity = WEB;
		setTitle("对接焊缝计算");
		System.out.println("初始化成功...");
		initSquare(WEB);
		setResizable(false);
		setVisible(true);
	}
	/**
	 * Create the application.
	 */
	private void initSquare(WeldButmentEntity WEB) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 100, 1443, 1007);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);// 居中
		
		JLabel label = new JLabel("斜对接焊缝");
		label.setBounds(107, 13, 82, 18);
		getContentPane().add(label);
		
		JPanel panel = new JPanel();
		Icon icon1 = new ImageIcon(this.getClass().getResource("f2.png"));
		// ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(296, 321, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
		picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(0, 0, 315, 361);
		panel.setBounds(10, 44, 316, 351);
		getContentPane().add(panel);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"示意图", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(null);
		
		panel.add(picture1);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 561, 316, 151);
		
		getContentPane().add(panel_1);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"焊缝截面信息", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><body>焊缝的计算长度l<sub>w</sub>:</body></html>");
		lblNewLabel.setBounds(14, 27, 154, 21);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField("0");
		textField.setBounds(182, 24, 86, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("0");
		textField_1.setColumns(10);
		textField_1.setBounds(182, 61, 86, 24);
		panel_1.add(textField_1);
		
		JLabel label_1 = new JLabel("斜焊缝与水平角度Θ:");
		label_1.setBounds(14, 64, 164, 18);
		panel_1.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(14, 92, 154, 46);
		panel_1.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("<html><body>焊缝高度t<sub>w</sub>:</body></html>");
		label_2.setBounds(14, 101, 154, 18);
		panel_1.add(label_2);
		
		textField_2 = new JTextField("0");
		textField_2.setBounds(182, 98, 86, 24);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_32 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_32.setBounds(274, 61, 42, 18);
		panel_1.add(label_32);
		
		JLabel label_33 = new JLabel("mm");
		label_33.setBounds(274, 100, 28, 18);
		panel_1.add(label_33);
		
		JLabel label_34 = new JLabel("mm");
		label_34.setBounds(274, 27, 28, 18);
		panel_1.add(label_34);
		
		listenerCe2 list1 = new listenerCe2();
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(253,253,241));
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"计算结果", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(340, 352, 342, 99);
		getContentPane().add(panel_4);
		
		JLabel label_5 = new JLabel("正应力σ:");
		label_5.setBounds(14, 32, 120, 18);
		panel_4.add(label_5);
		
		textField_6 = new JTextField("0");
		textField_6.setColumns(10);
		textField_6.setBounds(182, 29, 86, 24);
		panel_4.add(textField_6);
		
		JLabel label_7 = new JLabel("剪应力τ:");
		label_7.setBounds(14, 66, 120, 18);
		panel_4.add(label_7);
		
		textField_7 = new JTextField("0");
		textField_7.setColumns(10);
		textField_7.setBounds(182, 63, 86, 24);
		panel_4.add(textField_7);
		
		JLabel label_37 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_37.setBounds(282, 32, 46, 18);
		panel_4.add(label_37);
		
		JLabel label_38 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_38.setBounds(282, 60, 46, 24);
		panel_4.add(label_38);
		
		JLabel label_8 = new JLabel("正对接焊缝");
		label_8.setBounds(454, 540, 82, 18);
		getContentPane().add(label_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"示意图", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		Icon icon2 = new ImageIcon(this.getClass().getResource("f1.png"));
		// ImageIcon image = new ImageIcon();
		Image image1 = ((ImageIcon) icon2).getImage();
		image1 = image1.getScaledInstance(330, 215, Image.SCALE_DEFAULT);
		((ImageIcon) icon2).setImage(image1);
		picture2 = new JLabel(icon2, JLabel.CENTER);
		picture2.setBounds(0, 13, 350, 245);
		panel_5.add(picture2);
		panel_5.setBounds(329, 561, 359, 258);
		getContentPane().add(panel_5);
		
		JButton button = new JButton("保存");
		button.setActionCommand("保存");
		button.addActionListener(this);
		button.setBounds(193, 892, 113, 27);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("打印");
		button_1.setActionCommand("打印");
		button_1.addActionListener(this);
		button_1.setBounds(643, 892, 113, 27);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("计算");
		button_2.setActionCommand("计算");
		button_2.addActionListener(this);
		button_2.setBounds(1060, 892, 113, 27);
		getContentPane().add(button_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"焊缝截面信息", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(696, 13, 348, 168);
		getContentPane().add(panel_6);
		
		JLabel label_9 = new JLabel("腹板高H:");
		label_9.setBounds(14, 32, 120, 18);
		panel_6.add(label_9);
		
		textField_8 = new JTextField("0");
		textField_8.setColumns(10);
		textField_8.setBounds(182, 29, 86, 24);
		panel_6.add(textField_8);
		
		JLabel label_10 = new JLabel("翼板宽W:");
		label_10.setBounds(14, 66, 120, 18);
		panel_6.add(label_10);
		
		textField_9 = new JTextField("0");
		textField_9.setColumns(10);
		textField_9.setBounds(182, 63, 86, 24);
		panel_6.add(textField_9);
		
		textField_10 = new JTextField("0");
		textField_10.setColumns(10);
		textField_10.setBounds(182, 97, 86, 24);
		panel_6.add(textField_10);
		
		JLabel label_11 = new JLabel("<html><body>腹板宽t<sub>b</sub>:</body></html>");
		label_11.setBounds(14, 100, 120, 18);
		panel_6.add(label_11);
		
		textField_11 = new JTextField("0");
		textField_11.setColumns(10);
		textField_11.setBounds(182, 131, 86, 24);
		panel_6.add(textField_11);
		
		JLabel label_12 = new JLabel("<html><body>翼板厚t<sub>w</sub>:</body></html>");
		label_12.setBounds(14, 134, 120, 18);
		panel_6.add(label_12);
		
		JLabel label_42 = new JLabel("mm");
		label_42.setBounds(274, 32, 28, 18);
		panel_6.add(label_42);
		
		JLabel label_43 = new JLabel("mm");
		label_43.setBounds(274, 66, 28, 18);
		panel_6.add(label_43);
		
		JLabel label_44 = new JLabel("mm");
		label_44.setBounds(274, 100, 28, 18);
		panel_6.add(label_44);
		
		JLabel label_45 = new JLabel("mm");
		label_45.setBounds(274, 134, 28, 18);
		panel_6.add(label_45);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"焊缝受力", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(696, 180, 348, 140);
		getContentPane().add(panel_7);
		
		JLabel label_13 = new JLabel("弯矩M:");
		label_13.setBounds(14, 32, 120, 18);
		panel_7.add(label_13);
		
		textField_12 = new JTextField("0");
		textField_12.setColumns(10);
		textField_12.setBounds(182, 29, 86, 24);
		panel_7.add(textField_12);
		
		JLabel label_14 = new JLabel("轴力N:");
		label_14.setBounds(14, 66, 120, 18);
		panel_7.add(label_14);
		
		textField_13 = new JTextField("0");
		textField_13.setColumns(10);
		textField_13.setBounds(182, 63, 86, 24);
		panel_7.add(textField_13);
		
		textField_14 = new JTextField("0");
		textField_14.setColumns(10);
		textField_14.setBounds(182, 97, 86, 24);
		panel_7.add(textField_14);
		
		JLabel label_15 = new JLabel("剪力V:");
		label_15.setBounds(14, 100, 120, 18);
		panel_7.add(label_15);
		
		JLabel label_39 = new JLabel("N*mm");
		label_39.setBounds(275, 32, 42, 18);
		panel_7.add(label_39);
		
		JLabel label_40 = new JLabel("N");
		label_40.setBounds(275, 66, 28, 18);
		panel_7.add(label_40);
		
		JLabel label_41 = new JLabel("N");
		label_41.setBounds(275, 100, 28, 18);
		panel_7.add(label_41);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"钢材类型", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(696, 333, 348, 74);
		getContentPane().add(panel_8);
		
		radioButton_1 = new JRadioButton("Q235");
		radioButton_1.setBounds(61, 24, 84, 27);
		panel_8.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("Q345");
		radioButton_2.setBounds(162, 24, 93, 27);
		panel_8.add(radioButton_2);
		
		radioButton_1.setActionCommand("Q2351");
		radioButton_2.setActionCommand("Q3451");
		radioButton_1.addActionListener(this);
		radioButton_2.addActionListener(this);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Config.ResColor);
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
												"焊缝计算截面特性", TitledBorder.LEADING,
												TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9.setBounds(1060, 13, 363, 197);
		getContentPane().add(panel_9);
		
		JLabel label_16 = new JLabel("焊缝面积A:");
		label_16.setBounds(14, 32, 120, 18);
		panel_9.add(label_16);
		
		textField_16 = new JTextField("0");
		textField_16.setColumns(10);
		textField_16.setBounds(182, 29, 86, 24);
		panel_9.add(textField_16);
		
		JLabel label_17 = new JLabel("<html><body>焊缝的截面惯性矩I<sub>w</sub>:</body></html>");
		label_17.setBounds(14, 66, 154, 21);
		panel_9.add(label_17);
		
		textField_17 = new JTextField("0");
		textField_17.setColumns(10);
		textField_17.setBounds(182, 63, 86, 24);
		panel_9.add(textField_17);
		
		textField_18 = new JTextField("0");
		textField_18.setColumns(10);
		textField_18.setBounds(182, 97, 86, 24);
		panel_9.add(textField_18);
		
		JLabel label_18 = new JLabel("<html><body>焊缝的截面模量W<sub>x</sub>:</body></html>");
		label_18.setBounds(14, 100, 154, 24);
		panel_9.add(label_18);
		
		textField_19 = new JTextField("0");
		textField_19.setColumns(10);
		textField_19.setBounds(268, 132, 54, 24);
		panel_9.add(textField_19);
		
		JLabel label_19 = new JLabel("<html><body>焊缝的截面对中性轴的面积距离S<sub>w</sub>:</body></html>");
		label_19.setBounds(14, 133, 254, 24);
		panel_9.add(label_19);
		
		textField_20 = new JTextField("0");
		textField_20.setColumns(10);
		textField_20.setBounds(230, 164, 75, 24);
		panel_9.add(textField_20);
		
		JLabel label_20 = new JLabel("<html><body>翼板对梁中和轴的面积静矩S<sub>1</sub>:</body></html>");
		label_20.setBounds(14, 167, 210, 18);
		panel_9.add(label_20);
		
		JLabel label_46 = new JLabel("<html><body>mm<sup>2</sup></body></html>");
		label_46.setBounds(282, 29, 42, 28);
		panel_9.add(label_46);
		
		JLabel label_47 = new JLabel("<html><body>mm<sup>4</sup></body></html>");
		label_47.setBounds(282, 59, 42, 28);
		panel_9.add(label_47);
		
		JLabel label_48 = new JLabel("<html><body>mm<sup>3</sup></body></html>");
		label_48.setBounds(282, 93, 42, 28);
		panel_9.add(label_48);
		
		JLabel label_49 = new JLabel("<html><body>mm<sup>3</sup></body></html>");
		label_49.setBounds(307, 160, 42, 28);
		panel_9.add(label_49);
		
		JLabel label_50 = new JLabel("<html><body>mm<sup>3</sup></body></html>");
		label_50.setBounds(329, 128, 34, 28);
		panel_9.add(label_50);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(253,253,241));
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"焊缝计算各应力值", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_10.setBounds(1060, 223, 363, 204);
		getContentPane().add(panel_10);
		
		JLabel label_21 = new JLabel("<html><body>腹板端部正应力σ<sub>1</sub>:</body></html>");
		label_21.setBounds(14, 32, 164, 21);
		panel_10.add(label_21);
		
		textField_21 = new JTextField("0");
		textField_21.setColumns(10);
		textField_21.setBounds(182, 29, 112, 24);
		panel_10.add(textField_21);
		
		JLabel label_22 = new JLabel("<html><body>腹板端部剪应力τ<sub>1</sub>:</body></html>");
		label_22.setBounds(14, 66, 164, 21);
		panel_10.add(label_22);
		
		textField_22 = new JTextField("0");
		textField_22.setColumns(10);
		textField_22.setBounds(182, 63, 112, 24);
		panel_10.add(textField_22);
		
		textField_23 = new JTextField("0");
		textField_23.setColumns(10);
		textField_23.setBounds(182, 97, 112, 24);
		panel_10.add(textField_23);
		
		JLabel label_23 = new JLabel("<html><body>剪应力τ<sub>max</sub>:</body></html>");
		label_23.setBounds(14, 94, 138, 32);
		panel_10.add(label_23);
		
		textField_24 = new JTextField("0");
		textField_24.setColumns(10);
		textField_24.setBounds(182, 131, 112, 24);
		panel_10.add(textField_24);
		
		JLabel label_24 = new JLabel("<html><body>正应力σ<sub>max</sub>:</body></html>");
		label_24.setBounds(14, 128, 138, 32);
		panel_10.add(label_24);
		
		JLabel label_29 = new JLabel("<html><body>折算应力σ<sub>zs</sub>:</body></html>");
		label_29.setBounds(14, 171, 120, 21);
		panel_10.add(label_29);
		
		textField_29 = new JTextField("0");
		textField_29.setColumns(10);
		textField_29.setBounds(182, 168, 112, 24);
		panel_10.add(textField_29);
		
		JLabel label_54 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_54.setBounds(308, 32, 55, 21);
		panel_10.add(label_54);
		
		JLabel label_55 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_55.setBounds(308, 66, 55, 21);
		panel_10.add(label_55);
		
		JLabel label_56 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_56.setBounds(308, 97, 55, 21);
		panel_10.add(label_56);
		
		JLabel label_57 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_57.setBounds(308, 131, 55, 21);
		panel_10.add(label_57);
		
		JLabel label_58 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_58.setBounds(308, 165, 55, 21);
		panel_10.add(label_58);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(253,253,241));
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"验算结果", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_11.setBounds(1060, 435, 363, 74);
		getContentPane().add(panel_11);
		
		radioButton_3 = new JRadioButton("通过(true)");
		radioButton_3.setEnabled(false);
		radioButton_3.setBounds(26, 25, 121, 27);
		panel_11.add(radioButton_3);
		
		radioButton_4 = new JRadioButton("未通过（false）");
		radioButton_4.setEnabled(false);
		radioButton_4.setBounds(176, 25, 151, 27);
		panel_11.add(radioButton_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 421, 316, 140);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"焊缝受力", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label_3 = new JLabel("弯矩: M = 0");
		label_3.setBounds(14, 27, 254, 18);
		panel_2.add(label_3);
		
		textField_4 = new JTextField("0");
		textField_4.setColumns(10);
		textField_4.setBounds(182, 61, 86, 24);
		panel_2.add(textField_4);
		
		JLabel label_4 = new JLabel("轴力N:");
		label_4.setBounds(14, 64, 154, 18);
		panel_2.add(label_4);
		
		JLabel label_6 = new JLabel("剪力: V = 0");
		label_6.setBounds(14, 106, 154, 18);
		panel_2.add(label_6);
		
		JLabel label_25 = new JLabel("N");
		label_25.setBounds(274, 64, 28, 18);
		panel_2.add(label_25);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"焊缝厚度与直径（mm）", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_15.setBounds(696, 484, 348, 151);
		getContentPane().add(panel_15);
		
		radioButton_5 = new JRadioButton("≤16");
		radioButton_5.setActionCommand("26");
		radioButton_5.addActionListener(this);
		radioButton_5.setBounds(42, 25, 84, 27);
		panel_15.add(radioButton_5);
		
		radioButton_6 = new JRadioButton("Q235为>16~40,Q345为>16~35");
		radioButton_6.setActionCommand("27");
		radioButton_6.addActionListener(this);
		radioButton_6.setBounds(42, 55, 243, 27);
		panel_15.add(radioButton_6);
		
		radioButton_9 = new JRadioButton("Q235为>40~60,Q345为>35~50");
		radioButton_9.setActionCommand("28");
		radioButton_9.addActionListener(this);
		radioButton_9.setBounds(42, 83, 243, 27);
		panel_15.add(radioButton_9);
		
		radioButton_10 = new JRadioButton("Q235为>60~100,Q345为>50~100");
		radioButton_10.setActionCommand("29");
		radioButton_10.addActionListener(this);
		radioButton_10.setBounds(42, 111, 278, 27);
		panel_15.add(radioButton_10);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"焊缝等级", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_17.setBounds(340, 13, 342, 74);
		getContentPane().add(panel_17);
		
		radioButton_11 = new JRadioButton("一，二级");
		radioButton_11.setActionCommand("一，二级");
		radioButton_11.addActionListener(this);
		radioButton_11.setBounds(81, 25, 110, 27);
		panel_17.add(radioButton_11);
		
		radioButton_12 = new JRadioButton("三级");
		radioButton_12.setActionCommand("三级");
		radioButton_12.addActionListener(this);
		radioButton_12.setBounds(201, 25, 93, 27);
		panel_17.add(radioButton_12);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"焊缝厚度与直径（mm）", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_18.setBounds(340, 85, 342, 151);
		getContentPane().add(panel_18);
		
		radioButton_13 = new JRadioButton("≤16");
		radioButton_13.setActionCommand("16");
		radioButton_13.addActionListener(this);
		radioButton_13.setBounds(42, 25, 84, 27);
		panel_18.add(radioButton_13);
		
		radioButton_14 = new JRadioButton("Q235为>16~40,Q345为>16~35");
		radioButton_14.setActionCommand("17");
		radioButton_14.addActionListener(this);
		radioButton_14.setBounds(42, 55, 243, 27);
		panel_18.add(radioButton_14);
		
		radioButton_15 = new JRadioButton("Q235为>40~60,Q345为>35~50");
		radioButton_15.setActionCommand("18");
		radioButton_15.addActionListener(this);
		radioButton_15.setBounds(42, 83, 243, 27);
		panel_18.add(radioButton_15);
		
		radioButton_16 = new JRadioButton("Q235为>60~100,Q345为>50~100");
		radioButton_16.setActionCommand("19");
		radioButton_16.addActionListener(this);
		radioButton_16.setBounds(42, 111, 267, 27);
		panel_18.add(radioButton_16);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"焊缝等级", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19.setBounds(696, 407, 342, 74);
		getContentPane().add(panel_19);
		
		radioButton_17 = new JRadioButton("一，二级");
		radioButton_17.setActionCommand("一，二");
		radioButton_17.addActionListener(this);
		radioButton_17.setBounds(42, 25, 110, 27);
		panel_19.add(radioButton_17);
		
		radioButton_18 = new JRadioButton("三级");
		radioButton_18.setActionCommand("三");
		radioButton_18.addActionListener(this);
		radioButton_18.setBounds(159, 25, 93, 27);
		panel_19.add(radioButton_18);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(696, 648, 359, 151);
		getContentPane().add(panel_14);
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"材质参数", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label_28 = new JLabel("<html><body>抗拉强度设计值f<sub>t</sub><sup>w</sup>:</body></html>");
		label_28.setBounds(33, 29, 167, 27);
		panel_14.add(label_28);
		
		textField_28 = new JTextField("0");
		textField_28.setColumns(10);
		textField_28.setBounds(214, 29, 86, 24);
		panel_14.add(textField_28);
		
		JLabel label_30 = new JLabel("<html><body>抗剪强度设计值f<sub>v</sub><sup>w</sup>:</body></html>");
		label_30.setBounds(33, 66, 154, 27);
		panel_14.add(label_30);
		
		textField_30 = new JTextField("0");
		textField_30.setColumns(10);
		textField_30.setBounds(214, 63, 86, 24);
		panel_14.add(textField_30);
		
		textField_31 = new JTextField("0");
		textField_31.setColumns(10);
		textField_31.setBounds(214, 103, 86, 24);
		panel_14.add(textField_31);
		
		JLabel label_31 = new JLabel("<html><body>角焊缝强度设计值f<sub>f</sub><sup>w</sup>:</body></html>");
		label_31.setBounds(33, 96, 154, 34);
		panel_14.add(label_31);
		
		JLabel label_51 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_51.setBounds(306, 22, 42, 28);
		panel_14.add(label_51);
		
		JLabel label_52 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_52.setBounds(306, 56, 42, 28);
		panel_14.add(label_52);
		
		JLabel label_53 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_53.setBounds(306, 96, 42, 28);
		panel_14.add(label_53);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(340, 239, 342, 108);
		getContentPane().add(panel_13);
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"焊缝材质参数", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label_26 = new JLabel("<html><body>抗拉强度设计值f<sub>t</sub><sup>w</sup>:</body></html>");
		label_26.setBounds(14, 22, 154, 34);
		panel_13.add(label_26);
		
		textField_26 = new JTextField("0");
		textField_26.setColumns(10);
		textField_26.setBounds(182, 29, 86, 24);
		panel_13.add(textField_26);
		
		JLabel label_27 = new JLabel("<html><body>抗剪强度设计值f<sub>v</sub><sup>w</sup>:</body></html>");
		label_27.setBounds(14, 66, 147, 29);
		panel_13.add(label_27);
		
		textField_27 = new JTextField("0");
		textField_27.setColumns(10);
		textField_27.setBounds(182, 70, 86, 24);
		panel_13.add(textField_27);
		
		JLabel label_35 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_35.setBounds(282, 25, 42, 28);
		panel_13.add(label_35);
		
		JLabel label_36 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_36.setBounds(282, 67, 42, 28);
		panel_13.add(label_36);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(253,253,241));
		panel_16.setLayout(null);
		panel_16.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"验算结果", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_16.setBounds(340, 464, 342, 63);
		getContentPane().add(panel_16);
		
		radioButton_8 = new JRadioButton("通过(true)");
		radioButton_8.setEnabled(false);
		radioButton_8.setBounds(26, 25, 121, 27);
		panel_16.add(radioButton_8);
		
		radioButton_19 = new JRadioButton("未通过（false）");
		radioButton_19.setEnabled(false);
		radioButton_19.setBounds(153, 25, 151, 27);
		panel_16.add(radioButton_19);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"钢材类型", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(10, 725, 316, 74);
		getContentPane().add(panel_3);
		
		radioButton = new JRadioButton("Q235");
		radioButton.setActionCommand("c1");
		radioButton.addActionListener(this);
		radioButton.setBounds(61, 24, 84, 27);
		panel_3.add(radioButton);
		
		radioButton_7 = new JRadioButton("Q345");
		radioButton_7.setActionCommand("c2");
		radioButton_7.addActionListener(this);
		radioButton_7.setBounds(162, 24, 93, 27);
		panel_3.add(radioButton_7);
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1018, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Q2351")) {
			x4 = 1;
			if(x5 == 1 && x6 == 1){
				FTW1 = 215;
				FVW1 = 125;
				FFW1 = 160;
			}else if(x5 == 1 && x6 == 2){
				FTW1 = 205;
				FVW1 = 120;
				FFW1 = 160;
			}else if(x5 == 1 && x6 == 3){
				FTW1 = 200;
				FVW1 = 115;
				FFW1 = 160;
			}else if(x5 == 1 && x6 == 4){
				FTW1 = 190;
				FVW1 = 110;
				FFW1 = 160;
			}else if(x5 == 2 && x6 == 1){
				FTW1 = 185;
				FVW1 = 125;
				FFW1 = 160;
			}else if(x5 == 2 && x6 == 2){
				FTW1 = 175;
				FVW1 = 120;
				FFW1 = 160;
			}else if(x5 == 2 && x6 == 3){
				FTW1 = 170;
				FVW1 = 115;
				FFW1 = 160;
			}else if(x5 == 2 && x6 == 4){
				FTW1 = 160;
				FVW1 = 110;
				FFW1 = 160;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_2.setSelected(false);
		}
		if (e.getActionCommand().equals("Q3451")) {
			x4 = 2;
			if(x5 == 1 && x6 == 1){
				FTW1 = 310;
				FVW1 = 180;
				FFW1 = 200;
			}else if(x5 == 1 && x6 == 2){
				FTW1 = 295;
				FVW1 = 170;
				FFW1 = 200;
			}else if(x5 == 1 && x6 == 3){
				FTW1 = 265;
				FVW1 = 155;
				FFW1 = 200;
			}else if(x5 == 1 && x6 == 4){
				FTW1 = 250;
				FVW1 = 145;
				FFW1 = 200;
			}else if(x5 == 2 && x6 == 1){
				FTW1 = 265;
				FVW1 = 180;
				FFW1 = 200;
			}else if(x5 == 2 && x6 == 2){
				FTW1 = 250;
				FVW1 = 170;
				FFW1 = 200;
			}else if(x5 == 2 && x6 == 3){
				FTW1 = 225;
				FVW1 = 155;
				FFW1 = 200;
			}else if(x5 == 2 && x6 == 4){
				FTW1 = 210;
				FVW1 = 145;
				FFW1 = 200;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_1.setSelected(false);
		}
		if(e.getActionCommand().equals("c1")) {
			x1=1;
			if(x2 == 1 && x3 == 1){
				FTW = 215;
				FVW = 125;
			}else if(x2 == 1 && x3 == 2){
				FTW = 205;
				FVW = 120;
			}else if(x2 == 1 && x3 == 3){
				FTW = 200;
				FVW = 115;
			}else if(x2 == 1 && x3 == 4){
				FTW = 190;
				FVW = 110;
			}else if(x2 == 2 && x3 == 1){
				FTW = 185;
				FVW = 125;
			}else if(x2 == 2 && x3 == 2){
				FTW = 175;
				FVW = 120;
			}else if(x2 == 2 && x3 == 3){
				FTW = 170;
				FVW = 115;
			}else if(x2 == 2 && x3 == 4){
				FTW = 160;
				FVW = 110;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton_7.setSelected(false);
		}
		if(e.getActionCommand().equals("c2")) {
			x1=2;
			if(x2 == 1 && x3 == 1){
				FTW = 310;
				FVW = 180;
			}else if(x2 == 1 && x3 == 2){
				FTW = 295;
				FVW = 170;
			}else if(x2 == 1 && x3 == 3){
				FTW = 265;
				FVW = 155;
			}else if(x2 == 1 && x3 == 4){
				FTW = 250;
				FVW = 145;
			}else if(x2 == 2 && x3 == 1){
				FTW = 265;
				FVW = 180;
			}else if(x2 == 2 && x3 == 2){
				FTW = 250;
				FVW = 170;
			}else if(x2 == 2 && x3 == 3){
				FTW = 225;
				FVW = 155;
			}else if(x2 == 2 && x3 == 4){
				FTW = 210;
				FVW = 145;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton.setSelected(false);
		}
		if (e.getActionCommand().equals("一，二级")) {
			x2=1;
			if(x1 == 1 && x3 == 1){
				FTW = 215;
				FVW = 125;
			}else if(x1 == 1 && x3 == 2){
				FTW = 205;
				FVW = 120;
			}else if(x1 == 1 && x3 == 3){
				FTW = 200;
				FVW = 115;
			}else if(x1 == 1 && x3 == 4){
				FTW = 190;
				FVW = 110;
			}else if(x1 == 2 && x3 == 1){
				FTW = 310;
				FVW = 180;
			}else if(x1 == 2 && x3 == 2){
				FTW = 295;
				FVW = 170;
			}else if(x1 == 2 && x3 == 3){
				FTW = 265;
				FVW = 155;
			}else if(x1 == 2 && x3 == 4){
				FTW = 250;
				FVW = 145;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton_12.setSelected(false);
		}
		if (e.getActionCommand().equals("三级")) {
			x2=2;
			if(x1 == 1 && x3 == 1){
				FTW = 185;
				FVW = 125;
			}else if(x1 == 1 && x3 == 2){
				FTW = 175;
				FVW = 120;
			}else if(x1 == 1 && x3 == 3){
				FTW = 170;
				FVW = 115;
			}else if(x1 == 1 && x3 == 4){
				FTW = 160;
				FVW = 110;
			}else if(x1 == 2 && x3 == 1){
				FTW = 265;
				FVW = 180;
			}else if(x1 == 2 && x3 == 2){
				FTW = 250;
				FVW = 170;
			}else if(x1 == 2 && x3 == 3){
				FTW = 225;
				FVW = 155;
			}else if(x1 == 2 && x3 == 4){
				FTW = 210;
				FVW = 145;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton_11.setSelected(false);
		}
		if (e.getActionCommand().equals("一，二")) {
			x5 = 1;
			if(x4 == 1 && x6 == 1){
				FTW1 = 215;
				FVW1 = 125;
				FFW1 = 160;
			}else if(x4 == 1 && x6 == 2){
				FTW1 = 205;
				FVW1 = 120;
				FFW1 = 160;
			}else if(x4 == 1 && x6 == 3){
				FTW1 = 200;
				FVW1 = 115;
				FFW1 = 160;
			}else if(x4 == 1 && x6 == 4){
				FTW1 = 190;
				FVW1 = 110;
				FFW1 = 160;
			}else if(x4 == 2 && x6 == 1){
				FTW1 = 310;
				FVW1 = 180;
				FFW1 = 200;
			}else if(x4 == 2 && x6 == 2){
				FTW1 = 295;
				FVW1 = 170;
				FFW1 = 200;
			}else if(x4 == 2 && x6 == 3){
				FTW1 = 265;
				FVW1 = 155;
				FFW1 = 200;
			}else if(x4 == 2 && x6 == 4){
				FTW1 = 250;
				FVW1 = 145;
				FFW1 = 200;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_18.setSelected(false);
		}
		if (e.getActionCommand().equals("三")) {
			x5 = 2;
			if(x4 == 1 && x6 == 1){
				FTW1 = 185;
				FVW1 = 125;
				FFW1 = 160;
			}else if(x4 == 1 && x6 == 2){
				FTW1 = 175;
				FVW1 = 120;
				FFW1 = 160;
			}else if(x4 == 1 && x6 == 3){
				FTW1 = 170;
				FVW1 = 115;
				FFW1 = 160;
			}else if(x4 == 1 && x6 == 4){
				FTW1 = 160;
				FVW1 = 110;
				FFW1 = 160;
			}else if(x4 == 2 && x6 == 1){
				FTW1 = 265;
				FVW1 = 180;
				FFW1 = 200;
			}else if(x4 == 2 && x6 == 2){
				FTW1 = 250;
				FVW1 = 170;
				FFW1 = 200;
			}else if(x4 == 2 && x6 == 3){
				FTW1 = 225;
				FVW1 = 155;
				FFW1 = 200;
			}else if(x4 == 2 && x6 == 4){
				FTW1 = 210;
				FVW1 = 145;
				FFW1 = 200;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_17.setSelected(false);
		}
		if (e.getActionCommand().equals("16")) {
			x3 = 1;
			if(x1 == 1 && x2 == 1){
				FTW = 215;
				FVW = 125;
			}else if(x1 == 1 && x2 == 2){
				FTW = 185;
				FVW = 125;
			}else if(x1 == 2 && x2 == 1){
				FTW = 310;
				FVW = 185;
			}else if(x1 == 2 && x2 == 2){
				FTW = 265;
				FVW = 185;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton_14.setSelected(false);
			radioButton_15.setSelected(false);
			radioButton_16.setSelected(false);
		}
		if (e.getActionCommand().equals("17")) {
			x3 = 2;
			if(x1 == 1 && x2 == 1){
				FTW = 205;
				FVW = 120;
			}else if(x1 == 1 && x2 == 2){
				FTW = 175;
				FVW = 120;
			}else if(x1 == 2 && x2 == 1){
				FTW = 295;
				FVW = 170;
			}else if(x1 == 2 && x2 == 2){
				FTW = 250;
				FVW = 170;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton_13.setSelected(false);
			radioButton_15.setSelected(false);
			radioButton_16.setSelected(false);
		}
		if (e.getActionCommand().equals("18")) {
			x3 = 3;
			if(x1 == 1 && x2 == 1){
				FTW = 200;
				FVW = 115;
			}else if(x1 == 1 && x2 == 2){
				FTW = 170;
				FVW = 115;
			}else if(x1 == 2 && x2 == 1){
				FTW = 265;
				FVW = 150;
			}else if(x1 == 2 && x2 == 2){
				FTW = 225;
				FVW = 150;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton_13.setSelected(false);
			radioButton_14.setSelected(false);
			radioButton_16.setSelected(false);
		}
		if (e.getActionCommand().equals("19")) {
			x3 = 4;
			if(x1 == 1 && x2 == 1){
				FTW = 190;
				FVW = 110;
			}else if(x1 == 1 && x2 == 2){
				FTW = 160;
				FVW = 110;
			}else if(x1 == 2 && x2 == 1){
				FTW = 250;
				FVW = 145;
			}else if(x1 == 2 && x2 == 2){
				FTW = 210;
				FVW = 145;
			}
			textField_26.setText(String.valueOf(FTW));
			textField_27.setText(String.valueOf(FVW));
			radioButton_13.setSelected(false);
			radioButton_14.setSelected(false);
			radioButton_15.setSelected(false);
		}
		if (e.getActionCommand().equals("26")) {
			x6 = 1;
			if(x4 == 1 && x5 == 1){
				FTW1 = 215;
				FVW1 = 125;
				FFW1 = 160;
			}else if(x4 == 1 && x5 == 2){
				FTW1 = 185;
				FVW1 = 125;
				FFW1 = 160;
			}else if(x4 == 2 && x5 == 1){
				FTW1 = 310;
				FVW1 = 185;
				FFW1 = 200;
			}else if(x4 == 2 && x5 == 2){
				FTW1 = 265;
				FVW1 = 185;
				FFW1 = 200;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_6.setSelected(false);
			radioButton_9.setSelected(false);
			radioButton_10.setSelected(false);
		}
		if (e.getActionCommand().equals("27")) {
			x6 = 2;
			if(x4 == 1 && x5 == 1){
				FTW1 = 205;
				FVW1 = 120;
				FFW1 = 160;
			}else if(x4 == 1 && x5 == 2){
				FTW1 = 175;
				FVW1 = 120;
				FFW1 = 160;
			}else if(x4 == 2 && x5 == 1){
				FTW1 = 295;
				FVW1 = 170;
				FFW1 = 200;
			}else if(x4 == 2 && x5 == 2){
				FTW1 = 250;
				FVW1 = 170;
				FFW1 = 200;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_5.setSelected(false);
			radioButton_9.setSelected(false);
			radioButton_10.setSelected(false);
		}
		if (e.getActionCommand().equals("28")) {
			x6 = 3;
			if(x4 == 1 && x5 == 1){
				FTW1 = 200;
				FVW1 = 115;
				FFW1 = 160;
			}else if(x4 == 1 && x5 == 2){
				FTW1 = 170;
				FVW1 = 115;
				FFW1 = 160;
			}else if(x4 == 2 && x5 == 1){
				FTW1 = 265;
				FVW1 = 150;
				FFW1 = 200;
			}else if(x4 == 2 && x5 == 2){
				FTW1 = 225;
				FVW1 = 150;
				FFW1 = 200;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_5.setSelected(false);
			radioButton_6.setSelected(false);
			radioButton_10.setSelected(false);
		}
		if (e.getActionCommand().equals("29")) {
			x6 = 4;
			if(x4 == 1 && x5 == 1){
				FTW1 = 190;
				FVW1 = 110;
				FFW1 = 160;
			}else if(x4 == 1 && x5 == 2){
				FTW1 = 160;
				FVW1 = 110;
				FFW1 = 160;
			}else if(x4 == 2 && x5 == 1){
				FTW1 = 250;
				FVW1 = 145;
				FFW1 = 200;
			}else if(x4 == 2 && x5 == 2){
				FTW1 = 210;
				FVW1 = 145;
				FFW1 = 200;
			}
			textField_28.setText(String.valueOf(FTW1));
			textField_30.setText(String.valueOf(FVW1));
			textField_31.setText(String.valueOf(FFW1));
			radioButton_5.setSelected(false);
			radioButton_6.setSelected(false);
			radioButton_9.setSelected(false);
		}
		
		if(e.getActionCommand().equals("计算")) {
			if(!textField.getText().trim().matches("^[0.0-9.0]+$") || !textField_1.getText().trim().matches("^[0.0-9.0]+$") ||
					!textField_2.getText().trim().matches("^[0.0-9.0]+$") || !textField_4.getText().trim().matches("^[0.0-9.0]+$") ||
							!textField_26.getText().trim().matches("^[0.0-9.0]+$")|| !textField_27.getText().trim().matches("^[0.0-9.0]+$") ||
							!textField_8.getText().trim().matches("^[0.0-9.0]+$") || !textField_9.getText().trim().matches("^[0.0-9.0]+$") ||
							!textField_10.getText().trim().matches("^[0.0-9.0]+$") || !textField_11.getText().trim().matches("^[0.0-9.0]+$") || 
							!textField_12.getText().trim().matches("^[0.0-9.0]+$") || !textField_13.getText().trim().matches("^[0.0-9.0]+$") ||
							!textField_28.getText().trim().matches("^[0.0-9.0]+$") || !textField_30.getText().trim().matches("^[0.0-9.0]+$") || 
							!textField_31.getText().trim().matches("^[0.0-9.0]+$"))
			 {
				JOptionPane.showMessageDialog(null,"输入不合法或者输入为0","ERROR",JOptionPane.ERROR_MESSAGE);
			} else{
			
				LW = Double.valueOf(textField.getText().trim());
				PA = Double.valueOf(textField_1.getText().trim());
				H1 = Double.valueOf(textField_2.getText().trim());
				FZ = Double.valueOf(textField_4.getText().trim());
				
				FH = Double.valueOf(textField_8.getText().trim());
				YH = Double.valueOf(textField_9.getText().trim());
				FW = Double.valueOf(textField_10.getText().trim());
				YW = Double.valueOf(textField_11.getText().trim());
				
				M1 = Double.valueOf(textField_12.getText().trim());
				N1 = Double.valueOf(textField_13.getText().trim());
				V1 = Double.valueOf(textField_14.getText().trim());
				
				WeldButmentCal wbc = new WeldButmentCal(LW,PA,H1,FZ,FH,YH,FW,YW,M1,N1,V1);
				
				ZF = wbc.setXT1();
				JZ = wbc.setXO1();
				SA = wbc.setSa();
				IX = wbc.setIX();
				WX = wbc.setWx();
				SW = wbc.setSw();
				SX = wbc.setSx();
				O1 = wbc.setO2();
				T1 = wbc.setT2();
				JF1 = wbc.setTmax();
				ZF1 = wbc.setOmax();
				OS = wbc.setOzs();
				
				if(ZF<=FTW && JZ<=FVW){
					radioButton_8.setEnabled(true);
					radioButton_8.setSelected(true);
					se1 = true;
				}else{
					radioButton_19.setEnabled(true);
					radioButton_19.setSelected(true);
					se1 = false;
				}
				if(OS<=FFW1&&JF1<=FVW1&&ZF1<=FTW1){
					radioButton_3.setEnabled(true);
					radioButton_3.setSelected(true);
					se2 = true;
				}else{
					radioButton_4.setEnabled(true);
					radioButton_4.setSelected(true);
					se2 = false;
				}
				textField_6.setText(String.format("%.2f", ZF));
				textField_7.setText(String.format("%.2f", JZ));
				textField_16.setText(String.format("%.2f", SA));
				textField_17.setText(String.format("%.2f", IX));
				textField_18.setText(String.format("%.2f", WX));
				textField_19.setText(String.format("%.2f", SW));
				textField_20.setText(String.format("%.2f", SX));
				
				textField_21.setText(String.format("%.2f", O1));
				textField_22.setText(String.format("%.2f", T1));
				textField_23.setText(String.format("%.2f", JF1));
				textField_24.setText(String.format("%.2f", ZF1));
				textField_29.setText(String.format("%.2f", OS));
				
			}
			
		}
		
		if(e.getActionCommand().equals("保存")) {
			weldButmentEntity.LW = LW;
			weldButmentEntity.PA = PA;
			weldButmentEntity.H1 = H1;
			weldButmentEntity.FZ = FZ;
			weldButmentEntity.FTW = FTW;
			weldButmentEntity.FVW = FVW;
			weldButmentEntity.ZF = ZF;
			weldButmentEntity.JZ = JZ;
			weldButmentEntity.FH = FH;
			weldButmentEntity.YH = YH;
			weldButmentEntity.FW = FW;
			weldButmentEntity.YW = YW;
			weldButmentEntity.M1 = M1;
			weldButmentEntity.N1 = N1;
			weldButmentEntity.V1 = V1;
			weldButmentEntity.FFW1 = FFW1;
			weldButmentEntity.FTW1 = FTW1;
			weldButmentEntity.FVW1 = FVW1;
			weldButmentEntity.SA = SA;
			weldButmentEntity.IX = IX;
			weldButmentEntity.WX = WX;
			weldButmentEntity.SW = SW;
			weldButmentEntity.SX = SX;
			weldButmentEntity.O1 = O1;
			weldButmentEntity.T1 = T1;
			weldButmentEntity.JF1 = JF1;
			weldButmentEntity.ZF1 = ZF1;
			weldButmentEntity.OS = OS;
			AnalysisXML.frameToXMl(weldButmentEntity);
		}
		if(e.getActionCommand().equals("打印")) {
			String s1 = "  ";
			String s2 = "      ";
			outPutTxt = "对接焊缝计算: " + System.getProperty("line.separator") + s1;
			if (textField_4.getText() != null) {
				outPutTxt += "焊缝受力: " + System.getProperty("line.separator") + s2 + "轴力:  " + textField_4.getText()
				+ System.getProperty("line.separator") + s1;			
			}
			if (textField.getText() != null) {
				outPutTxt += "截面信息: " + System.getProperty("line.separator") + s2 + "焊缝的计算长度:  " + textField.getText()
				+ System.getProperty("line.separator") + s2 + "斜焊缝与水平角度:  " + textField_1.getText()
				+ System.getProperty("line.separator") + s2 + "焊缝高度:  " + textField_2.getText()
				+ System.getProperty("line.separator") + s1;		
			}
			if (textField_26.getText() != null) {
				outPutTxt += "材质属性: " + System.getProperty("line.separator") + s2 + "抗拉强度设计值:  " + textField_26.getText()
				+ System.getProperty("line.separator") + s2 + "抗剪强度设计值:  " + textField_27.getText()
				+ System.getProperty("line.separator") + s1;		
			}
			if (textField_6.getText() != null) {
				outPutTxt += "计算各应力值: " + System.getProperty("line.separator") + s2 + "正应力:  " + textField_6.getText()
				+ System.getProperty("line.separator") + s2 + "剪应力: " + textField_7.getText()
				+ System.getProperty("line.separator") + s1;
			}
			outPutTxt += "正对接焊缝计算: " + System.getProperty("line.separator") + s1;
			if (textField_8.getText() != null) {
				outPutTxt += "截面信息: " + System.getProperty("line.separator") + s2 + "腹板高:  " + textField_8.getText()
				+ System.getProperty("line.separator") + s2 + "翼板宽: " + textField_9.getText()
				+ System.getProperty("line.separator") + s2 + "腹板高: " + textField_10.getText()
				+ System.getProperty("line.separator") + s2 + "翼板厚: " + textField_11.getText()
				+ System.getProperty("line.separator") + s1;
			}
			if (textField_12.getText() != null) {
				outPutTxt += "焊缝受力: " + System.getProperty("line.separator") + s2 + "弯矩:  " + textField_12.getText()
				+ System.getProperty("line.separator") + s2 + "轴力:  " + textField_13.getText()
				+ System.getProperty("line.separator") + s2 + "剪力:  " + textField_14.getText()
				+ System.getProperty("line.separator") + s1;
			}
			if (textField_28.getText() != null) {
				outPutTxt += "焊缝受力: " + System.getProperty("line.separator") + s2 + "抗拉强度设计值:  " + textField_28.getText()
				+ System.getProperty("line.separator") + s2 + "抗剪强度设计值:  " + textField_30.getText()
				+ System.getProperty("line.separator") + s2 + "角焊缝强度设计值:  " + textField_31.getText()
				+ System.getProperty("line.separator") + s1;
			}
			if (textField_16.getText() != null) {
				outPutTxt += "计算截面特性: " + System.getProperty("line.separator") + s2 + "焊缝面积:  " + textField_16.getText()
				+ System.getProperty("line.separator") + s2 + "焊缝的截面惯性矩:  " + textField_17.getText()
				+ System.getProperty("line.separator") + s2 + "焊缝的截面模量:  " + textField_18.getText()
				+ System.getProperty("line.separator") + s2 + "焊缝的截面对中性轴的面积距离:  " + textField_19.getText()
				+ System.getProperty("line.separator") + s2 + "翼板对梁中和轴的面积静矩:  " + textField_20.getText()
				+ System.getProperty("line.separator") + s1;
			}
			if (textField_21.getText() != null) {
				outPutTxt += "计算各应力值: " + System.getProperty("line.separator") + s2 + "腹板端部正应力:  " + textField_21.getText()
				+ System.getProperty("line.separator") + s2 + "腹板端部剪应力:  " + textField_22.getText()
				+ System.getProperty("line.separator") + s2 + "剪应力:  " + textField_23.getText()
				+ System.getProperty("line.separator") + s2 + "正应力:  " + textField_24.getText()
				+ System.getProperty("line.separator") + s2 + "折算应力:  " + textField_29.getText()
				+ System.getProperty("line.separator") + s1;
			}
			// if(highStrength.)
			if (outPutTxt.length() == 7) {
				JOptionPane.showConfirmDialog(null, "内容为空！");
			} else {
				Filewriter.printToTxt(outPutTxt);
			}
		}
		
	}
}
