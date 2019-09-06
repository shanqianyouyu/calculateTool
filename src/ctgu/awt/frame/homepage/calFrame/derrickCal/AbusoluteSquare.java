package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;
import javax.xml.transform.Result;

import ctgu.Entity.SquareCal;
import ctgu.awt.controller.XMLData;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.util.Filewriter;
import javafx.scene.control.Alert;
import jxl.demo.XML;

public class AbusoluteSquare extends FatherFrame implements ActionListener, FocusListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int i = 0;
	// private JFrame jfSquare;
	private JLabel picture1 = null;
	private JButton table1 = new JButton("显示表一");
	JPanel picture = new JPanel();
	ImageIcon image = new ImageIcon(this.getClass().getResource("1.png"));
	private static String Name = "";

	// 没输入名字
	public AbusoluteSquare() {
		this(Name);
		// String name = "请输入名字!";
	}

	public AbusoluteSquare(String name2) {
		initSquare(name2);
		setVisible(true);
		setResizable(false);

	}

	//打印
	private String outPutTxt = "";
		
	private void initSquare(String name2) {
		// jfSquare = new JFrame(name2);
		setSize(1610, 1000);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// 关闭等功能
		dispose();
		setLayout(null);
		setLocationRelativeTo(null);// 居中

		// 创建四大面板
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		JPanel middle = new JPanel();
		JPanel right1 = new JPanel();
		JPanel end = new JPanel();

		// 设置长宽
		left.setBounds(0, 0, 350, 910);
		middle.setBounds(355, 5, 410, 910);
		right1.setBounds(775, 5, 410, 910);
		right.setBounds(1190, 0, 415, 910);
		end.setBounds(0, 900, 1610, 100);

		add(left);
		add(right);
		add(right1);
		add(middle);
		add(end);

		left.setVisible(true);
		middle.setVisible(true);
		right.setVisible(true);
		right1.setVisible(true);
		end.setVisible(true);

		// 分别初始化
		initleft(left);
		initright(right);
		initright1(right1);
		initmiddle(middle);
		initend(end);
	}

	// 获取参数
	private int F1;
	private int F2;
	private int F3;
	private int F4;

	// 参数
	JTextField oneTxt1 = new JTextField("0", 10);
	private double one1;
	JTextField oneTxt2 = new JTextField("0", 10);
	private double one2;
	JTextField oneTxt3 = new JTextField("0", 10);
	private double one3;
	JTextField oneTxt4 = new JTextField("0", 10);
	private double one4;
	JTextField oneTxt5 = new JTextField("0", 10);
	private double one5;
	JTextField oneTxt6 = new JTextField("0", 10);
	private double one6;

	JTextField oneTxt21 = new JTextField("0", 10);
	private double one21;
	JTextField oneTxt22 = new JTextField("0", 10);
	private double one22;
	JTextField oneTxt23 = new JTextField("0", 10);
	private double one23;
	JTextField oneTxt24 = new JTextField("0", 10);
	private double one24;
	JTextField oneTxt25 = new JTextField("0", 10);
	private double one25;
	JTextField oneTxt26 = new JTextField("0", 10);
	private double one26;
	JTextField oneTxt27 = new JTextField("0", 10);
	private double one27;
	JTextField oneTxt28 = new JTextField("0", 10);
	private double one28;
	JTextField oneTxtk21 = new JTextField("0", 10);
	private double onek21;
	JTextField oneTxtk22 = new JTextField("0", 10);
	private double onek22;

	JTextField oneTxt31 = new JTextField("0", 10);
	private double one31;
	JTextField oneTxt32 = new JTextField("0", 10);
	private double one32;
	JTextField oneTxt33 = new JTextField("0", 10);
	private double one33;
	JTextField oneTxt34 = new JTextField("0", 10);
	private double one34;

	JTextField oneTxt42 = new JTextField("0", 10);
	private double one41;
	JTextField oneTxt41 = new JTextField("0", 10);
	private double one42;
	JTextField oneTxt43 = new JTextField("0", 10);
	private double one43;
	JTextField oneTxt44 = new JTextField("0", 10);
	private double one44;

	JTextField oneTxtR21 = new JTextField("0", 10);
	private double oneR21;
	JTextField oneTxtR22 = new JTextField("0", 10);
	private double oneR22;
	JTextField oneTxtR23 = new JTextField("0", 10);
	private double oneR23;

	JTextField oneTxtC21 = new JTextField("0", 10);
	private double oneC21;
	JTextField oneTxtC22 = new JTextField("0", 10);
	private double oneC22;
	JTextField oneTxtC23 = new JTextField("0", 10);
	private double oneC23;

	JTextField oneTxtC31 = new JTextField("0", 10);
	private double oneC31;
	JTextField oneTxtC32 = new JTextField("0", 10);
	private double oneC32;
	JTextField oneTxtC33 = new JTextField("0", 10);
	private double oneC33;
	JTextField oneTxtC34 = new JTextField("0", 10);
	private double oneC34;
	JTextField oneTxtC35 = new JTextField("0", 10);
	private double oneC35;
	JTextField oneTxtC36 = new JTextField("0", 10);
	private double oneC36;

	JTextField oneTxtC41 = new JTextField("0", 7);
	private double oneC41;
	JTextField oneTxtC42 = new JTextField("0", 7);
	private double oneC42;
	JTextField oneTxtC43 = new JTextField("0", 7);
	private double oneC43;
	JTextField oneTxtC44 = new JTextField("0", 7);
	private double oneC44;
	JTextField oneTxtC45 = new JTextField("0", 7);
	private double oneC45;
	
	private double As;
	private double BL;
	private double DBc;
	private double DBx;
	private double BBc;
	private double BBx;

	private double QG;
	private double FZ1;
	private double FZd;
	private double FQ1;
	private double FQ2;
	private double FD1;
	private double FL1;
	private double DL1;
	private double FZ2;
	private double FC1;
	private double FZ3;
	private double FM1;
	private double FAM1;
	private double FAY;
	private double FAZ;

	
	//输出参数
	JTextField oneTxt61 = new JTextField("0", 10);
	JTextField oneTxt62 = new JTextField("0", 10);
	JTextField oneTxt63 = new JTextField("0", 10);
	JTextField oneTxt64 = new JTextField("0", 10);
	JTextField oneTxt65 = new JTextField("0", 10);
	JTextField oneTxt66 = new JTextField("0", 10);
	JTextField oneTxt71 = new JTextField("0", 10);
	JTextField oneTxt72 = new JTextField("0", 10);
	JTextField oneTxt74 = new JTextField("0", 10);
	JTextField oneTxt75 = new JTextField("0", 10);
	JTextField oneTxt76 = new JTextField("0", 10);
	JTextField oneTxt77 = new JTextField("0", 10);
	JTextField oneTxt78 = new JTextField("0", 10);
	JTextField oneTxt79 = new JTextField("0", 10);
	JTextField oneTxt80 = new JTextField("0", 10);
	JTextField oneTxt81 = new JTextField("0", 10);
	JTextField oneTxt82 = new JTextField("0", 10);
	JTextField oneTxt83 = new JTextField("0", 10);
	
	String S61;
	String S62;
	String S63;
	String S64;
	String S65;
	String S66;
	String S71;
	String S72;
	String S74;
	String S75;
	String S76;
	String S77;
	String S78;
	String S79;
	String S80;
	String S81;
	String S82;
	String S83;
	
	private void initright1(JPanel right1) {
		// 设置空布局，即绝对布局
		right1.setOpaque(false);
		right1.setLayout(null);

		// 容许中心压力
		JPanel R1 = new JPanel();
		JPanel R2 = new JPanel();
		JPanel R3 = new JPanel();
		JPanel R4 = new JPanel();

		// R1
		JPanel JR1 = new JPanel();
		JPanel JR2 = new JPanel();
		JPanel JR3 = new JPanel();
		JPanel JR4 = new JPanel();

		// R2
		JPanel J21 = new JPanel();
		JPanel J22 = new JPanel();
		JPanel J23 = new JPanel();

		// R3
		JPanel J31 = new JPanel();
		JPanel J32 = new JPanel();
		JPanel J33 = new JPanel();
		JPanel J34 = new JPanel();
		JPanel J35 = new JPanel();
		JPanel J36 = new JPanel();
		JPanel J37 = new JPanel();

		// R4
		JPanel J41 = new JPanel();
		JPanel J42 = new JPanel();
		JPanel J43 = new JPanel();
		JPanel J44 = new JPanel();
		JPanel J45 = new JPanel();

		// 容许中心压力参数
		R1.setBorder(new TitledBorder("中心压力参数："));
		R1.setBounds(0, 0, 410, 187);
		R1.setLayout(null);

		JLabel tankR21 = new JLabel("受压杆件的稳定系数 :");
		tankR21.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tankR22 = new JLabel("抱杆主材截面面积 :");
		tankR22.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tankR23 = new JLabel("抱杆主材的容许应力:");
		tankR23.setHorizontalAlignment(JTextField.RIGHT);
		JLabel tankR24 = new JLabel();
		JR4.setLayout(null);
		tankR24.setBounds(20, 0, 400, 30);
		oneTxtR23.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankR24.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankR24.setText("LY12(CZ)铝合金11.8KN/CM 2, Q345钢为13.8");
				tankR24.setForeground(Color.RED);
			}
		});

		JR1.setBounds(0, 20, 402, 40);
		JR2.setBounds(0, 60, 402, 40);
		JR3.setBounds(0, 100, 402, 40);
		JR4.setBounds(0, 140, 402, 32);
		JR1.add(tankR21);
		JR2.add(tankR22);
		JR3.add(tankR23);
		JR4.add(tankR24);
		JR1.add(oneTxtR21);
		JR2.add(oneTxtR22);
		JR3.add(oneTxtR23);
		R1.add(JR1);
		R1.add(JR2);
		R1.add(JR3);
		R1.add(JR4);
		right1.add(R1);

		// 按压弯杆件参数
		R2.setBorder(new TitledBorder("压弯杆件参数："));
		R2.setBounds(0, 195, 410, 150);
		R2.setLayout(null);

		JLabel tank21 = new JLabel("抱杆中部断面的惯性矩:");
		tank21.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank22 = new JLabel("中部断面的抗弯断面系数:");
		tank22.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank23 = new JLabel("压杆承受压力的偏心距:");
		tank23.setHorizontalAlignment(JTextField.RIGHT);

		J21.setBounds(0, 20, 400, 40);
		J22.setBounds(0, 60, 400, 40);
		J23.setBounds(0, 100, 400, 40);
		J21.add(tank21);
		J22.add(tank22);
		J23.add(tank23);
		J21.add(oneTxtC21);
		J22.add(oneTxtC22);
		J23.add(oneTxtC23);
		R2.add(J21);
		R2.add(J22);
		R2.add(J23);
		right1.add(R2);

		// 起吊参数3
		R3.setBorder(new TitledBorder("起吊参数3："));
		R3.setBounds(0, 350, 410, 300);
		R3.setLayout(null);

		JLabel tank31 = new JLabel("钢丝绳的工作绳数:");
		tank31.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank32 = new JLabel("合力线与抱杆轴间夹角(辅助拉线):");
		tank32.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank33 = new JLabel("起吊滑车组轴线与铅垂线间的夹角:");
		tank33.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank34 = new JLabel("控制绳对地夹角:");
		tank34.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank35 = new JLabel("被吊构件的重力:");
		tank35.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank36 = new JLabel("  滑车的效率:");
		tank36.setHorizontalAlignment(JTextField.RIGHT);
		JLabel tank37 = new JLabel();
		J37.setLayout(null);
		tank37.setBounds(215, 0, 300, 30);
		oneTxtC36.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tank37.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tank37.setText("建议值为0.96");
				tank37.setForeground(Color.RED);
			}
		});
		J31.setBounds(0, 20, 400, 40);
		J32.setBounds(0, 60, 400, 40);
		J33.setBounds(0, 100, 400, 40);
		J34.setBounds(0, 140, 400, 40);
		J35.setBounds(0, 180, 400, 40);
		J36.setBounds(0, 220, 400, 40);
		J37.setBounds(0, 260, 400, 32);
		J31.add(tank31);
		J32.add(tank32);
		J33.add(tank33);
		J34.add(tank34);
		J35.add(tank35);
		J36.add(tank36);
		J37.add(tank37);
		J31.add(oneTxtC31);
		J32.add(oneTxtC32);
		J33.add(oneTxtC33);
		J34.add(oneTxtC34);
		J35.add(oneTxtC35);
		J36.add(oneTxtC36);
		R3.add(J31);
		R3.add(J32);
		R3.add(J33);
		R3.add(J34);
		R3.add(J35);
		R3.add(J36);
		R3.add(J37);
		right1.add(R3);

		// 起吊参数4
		R4.setBorder(new TitledBorder("起吊参数4："));
		R4.setBounds(0, 655, 410, 230);

		JLabel tank41 = new JLabel("        单条承托绳与抱杆轴线的夹角:");
		tank41.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank42 = new JLabel("单条承托绳与相邻承托绳合力线间夹角:");
		tank42.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank43 = new JLabel("                  抱杆及索具的重力:");
		tank43.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank44 = new JLabel("主要受力拉线的合力与抱杆轴线的夹角:");
		tank44.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank45 = new JLabel("内与辅拉线合力线与抱杆轴线间的夹角:");
		tank45.setHorizontalAlignment(JTextField.RIGHT);

		// 设置内部布局
		R4.setLayout(null);
		J41.setBounds(4, 20, 402, 40);
		J42.setBounds(4, 60, 402, 40);
		J43.setBounds(4, 100, 402, 40);
		J44.setBounds(4, 140, 402, 40);
		J45.setBounds(4, 180, 402, 40);
		J41.add(tank41);
		J42.add(tank42);
		J43.add(tank43);
		J44.add(tank44);
		J45.add(tank45);
		J41.add(oneTxtC41);
		J42.add(oneTxtC42);
		J43.add(oneTxtC43);
		J44.add(oneTxtC44);
		J45.add(oneTxtC45);
		R4.add(J41);
		R4.add(J42);
		R4.add(J43);
		R4.add(J44);
		R4.add(J45);
		right1.add(R4);
	}

	private void initend(JPanel end) {

		// 设置空布局，即绝对布局
		end.setOpaque(false);
		end.setLayout(null);
		JButton button01 = new JButton("保存");
		JButton button02 = new JButton("打印");
		JButton button03 = new JButton("计算");
		button03.setActionCommand("计算");
		button03.addActionListener(this);
		button02.setActionCommand("打印");
		button02.addActionListener(this);
		button01.setActionCommand("保存");
		button01.addActionListener(this);

		button01.setBounds(200, 5, 150, 40);
		button02.setBounds(700, 5, 150, 40);
		button03.setBounds(1300, 5, 150, 40);
		end.add(button01);
		end.add(button02);
		end.add(button03);
	}

	private void initmiddle(JPanel middle) {
		picture1 = new JLabel();
		JPanel picturecheck = new JPanel();
		JPanel tankcheck = new JPanel();
		JPanel cailiao = new JPanel();
		JPanel canshu = new JPanel();

		JPanel J41 = new JPanel();
		JPanel J42 = new JPanel();
		JPanel J43 = new JPanel();
		JPanel J44 = new JPanel();
		JPanel J45 = new JPanel();
		// 钢材
		JCheckBox checkboxc1 = new JCheckBox("主材Q345");
		JCheckBox checkboxc2 = new JCheckBox("辅材Q235");

		// 塔型
		JCheckBox checkBox01 = new JCheckBox("酒杯型");
		JCheckBox checkBox02 = new JCheckBox("吊装猫头");
		JCheckBox checkBox03 = new JCheckBox("紧凑型直线");
		JCheckBox checkBox04 = new JCheckBox("吊装耐张（横担）");
		JCheckBox checkBox05 = new JCheckBox("双回路直线（横担）");

		// 受力
		JRadioButton checkBox06 = new JRadioButton("拉线受力");
		JRadioButton checkBox07 = new JRadioButton("承托绳受力");
		JRadioButton checkBox08 = new JRadioButton("牵引绳在抱杆异侧(竖直)");
		JRadioButton checkBox09 = new JRadioButton("牵引绳在抱杆异侧(倾斜)");
		JRadioButton checkBox10 = new JRadioButton("牵引绳在抱杆同侧(倾斜)");
		JRadioButton checkBox11 = new JRadioButton("牵引绳在抱杆同侧(竖直)");
		// checkBox06.setSelected(true);
		// if(checkBox06.isSelected()){
		// checkBox07.setEnabled(false);
		// }
		// 设置空布局，即绝对布局
		middle.setOpaque(false);
		middle.setLayout(null);

		// 示意图
		picture.setBorder(new TitledBorder("示意图："));
		picture.setBounds(0, 0, 405, 240);
		image.setImage(image.getImage().getScaledInstance(360, 190, Image.SCALE_DEFAULT));
		picture1.setIcon(image);
		picture.add(picture1);
		middle.add(picture);

		// 示意图选择
		picturecheck.setBorder(new TitledBorder("选择示意图："));
		picturecheck.setBounds(0, 245, 405, 210);
		picturecheck.add(checkBox06);
		picturecheck.add(checkBox07);
		picturecheck.add(checkBox08);
		picturecheck.add(checkBox09);
		picturecheck.add(checkBox10);
		picturecheck.add(checkBox11);
		listenerge lis1 = new listenerge();
		F1 = lis1.listenerge1(checkBox06, checkBox07, checkBox08, checkBox09, checkBox10, checkBox11);
		middle.add(picturecheck);

		// 设置监听
		checkBox06.setActionCommand("拉线受力");
		checkBox07.setActionCommand("承托绳受力");
		checkBox08.setActionCommand("牵引绳在抱杆异侧(竖)");
		checkBox09.setActionCommand("牵引绳在抱杆异侧(倾)");
		checkBox10.setActionCommand("牵引绳在抱杆同侧(倾)");
		checkBox11.setActionCommand("牵引绳在抱杆同侧(竖)");
		checkBox06.addActionListener(this);
		checkBox07.addActionListener(this);
		checkBox08.addActionListener(this);
		checkBox09.addActionListener(this);
		checkBox10.addActionListener(this);
		checkBox11.addActionListener(this);

		// 塔形选择
		tankcheck.setBorder(new TitledBorder("塔形："));
		tankcheck.setBounds(0, 465, 405, 103);
		tankcheck.add(checkBox01);
		tankcheck.add(checkBox02);
		tankcheck.add(checkBox03);
		tankcheck.add(checkBox04);
		tankcheck.add(checkBox05);
		listenerge lis = new listenerge();
		F2 = lis.listenergek(checkBox01, checkBox02, checkBox03, checkBox04, checkBox05);
		middle.add(tankcheck);

		// 钢材选择
		cailiao.setBorder(new TitledBorder("钢材："));
		cailiao.setBounds(0, 570, 405, 87);
		cailiao.setLayout(null);
		checkboxc1.setBounds(60, 30, 130, 40);
		cailiao.add(checkboxc1);
		cailiao.add(checkboxc2);
		checkboxc2.setBounds(190, 30, 150, 40);
		listenerge lisc = new listenerge();
		F3 = lisc.listenergeC(checkboxc1, checkboxc2);
		middle.add(cailiao);

		// 输入参数2
		canshu.setBorder(new TitledBorder("起吊参数2："));
		canshu.setBounds(0, 665, 404, 215);

		JLabel tank42 = new JLabel("    抱杆倾斜角为:");
		tank42.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank41 = new JLabel("    拉线对地夹角:");
		tank41.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank43 = new JLabel("起吊滑车组的受力绳数为:");
		tank43.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank44 = new JLabel("起吊滑车组的效率:");
		tank44.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank45 = new JLabel();
		J45.setLayout(null);
		tank45.setBounds(220, 0, 300, 30);
		oneTxt44.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tank45.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tank45.setText("建议值为1.05");
				tank45.setForeground(Color.RED);
			}
		});

		canshu.setLayout(null);
		J43.setBounds(0, 20, 400, 38);
		J42.setBounds(0, 58, 400, 38);
		J41.setBounds(0, 96, 400, 38);
		J44.setBounds(0, 134, 400, 38);
		J45.setBounds(0, 172, 400, 38);
		J43.add(tank43);
		J41.add(tank41);
		J42.add(tank42);
		J44.add(tank44);
		J45.add(tank45);
		J43.add(oneTxt43);
		J41.add(oneTxt41);
		J42.add(oneTxt42);
		J44.add(oneTxt44);
		canshu.add(J43);
		canshu.add(J41);
		canshu.add(J42);
		canshu.add(J44);
		canshu.add(J45);
		middle.add(canshu);
	}

	private void initleft(JPanel left) {

		// 设置空布局，即绝对布局
		left.setOpaque(false);
		left.setLayout(null);
		JPanel J1 = new JPanel();
		JPanel J2 = new JPanel();
		JPanel J3 = new JPanel();
		// j1
		JPanel J11 = new JPanel();
		JPanel J12 = new JPanel();
		JPanel J13 = new JPanel();
		JPanel J14 = new JPanel();
		JPanel J15 = new JPanel();
		JPanel J16 = new JPanel();
		// j2
		JPanel J21 = new JPanel();
		JPanel J22 = new JPanel();
		JPanel J23 = new JPanel();
		JPanel J24 = new JPanel();
		JPanel J25 = new JPanel();
		JPanel J26 = new JPanel();
		JPanel J27 = new JPanel();
		JPanel J28 = new JPanel();
		JPanel J29 = new JPanel();
		JPanel Jk21 = new JPanel();
		JPanel Jk22 = new JPanel();
		JPanel Jk23 = new JPanel();
		// j3
		JPanel J31 = new JPanel();
		JPanel J32 = new JPanel();
		JPanel J33 = new JPanel();
		JPanel J34 = new JPanel();
		JPanel J35 = new JPanel();

		// 塔型输入参数
		J1.setBorder(new TitledBorder("塔型参数："));
		J1.setBounds(0, 0, 345, 245);
		J1.setLayout(null);

		JLabel tank1 = new JLabel("酒杯型塔窗口高度 :");
		tank1.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank2 = new JLabel("横担断面最大高度 :");
		tank2.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank3 = new JLabel("耐张塔头断面边宽 :");
		tank3.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank4 = new JLabel("     吊点绳的高度:");
		tank4.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank5 = new JLabel("起吊滑车组预留长度:");
		tank5.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank6 = new JLabel("     单边横担长度:");
		tank6.setHorizontalAlignment(JTextField.RIGHT);

		J11.setBounds(0, 20, 340, 36);
		J12.setBounds(0, 56, 340, 36);
		J13.setBounds(0, 92, 340, 36);
		J14.setBounds(0, 128, 340, 36);
		J15.setBounds(0, 164, 340, 36);
		J16.setBounds(0, 200, 340, 36);
		J11.add(tank1);
		J12.add(tank2);
		J13.add(tank3);
		J14.add(tank4);
		J15.add(tank5);
		J16.add(tank6);
		J11.add(oneTxt1);
		J12.add(oneTxt2);
		J13.add(oneTxt3);
		J14.add(oneTxt4);
		J15.add(oneTxt5);
		J16.add(oneTxt6);
		J1.add(J11);
		J1.add(J12);
		J1.add(J13);
		J1.add(J14);
		J1.add(J15);
		J1.add(J16);
		left.add(J1);

		// 压杆参数
		J2.setBorder(new TitledBorder("压杆参数："));
		J2.setBounds(0, 248, 345, 453);
		J2.setLayout(null);

		JLabel tank21 = new JLabel("  等截面压杆的长度 :");
		tank21.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank22 = new JLabel("  压杆截面的惯性矩 :");
		tank22.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank23 = new JLabel(" 单肢主材对x轴的惯性矩:");
		tank23.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank24 = new JLabel("   单肢主材截面面积:");
		tank4.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank25 = new JLabel(" 抱杆主材截面面积:");
		tank25.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank26 = new JLabel(" 单肢主材的重心距离:");
		tank26.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank27 = new JLabel("       抱杆断面边宽:");
		tank27.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank28 = new JLabel("压杆长度系数(支承方式):");
		tank28.setHorizontalAlignment(JTextField.RIGHT);
		JLabel tank29 = new JLabel();
		J29.setLayout(null);
		tank29.setBounds(220, 5, 300, 30);
		oneTxt28.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tank29.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tank29.setText("建议值为1.05");
				tank29.setForeground(Color.RED);
			}
		});
		JLabel tankk21 = new JLabel("    单斜材截面面积:");
		tankk21.setHorizontalAlignment(JTextField.RIGHT);
		

		JLabel tankk22 = new JLabel("  压杆长度修正系数:");
		tankk22.setHorizontalAlignment(JTextField.RIGHT);
		Jk23.setLayout(null);
		JLabel tankk29 = new JLabel();
		tankk29.setBounds(200, 2, 300, 30);
		oneTxtk22.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankk29.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankk29.setText("建议值为1.02");
				tankk29.setForeground(Color.RED);
			}
		});

		J21.setBounds(0, 20, 340, 36);
		J22.setBounds(0, 56, 340, 36);
		J23.setBounds(0, 92, 340, 36);
		J24.setBounds(0, 128, 340, 36);
		J25.setBounds(0, 164, 340, 36);
		J26.setBounds(0, 200, 340, 36);
		J27.setBounds(0, 236, 340, 36);
		J28.setBounds(0, 272, 340, 36);
		J29.setBounds(0, 308, 340, 32);
		Jk21.setBounds(0, 340, 340, 36);
		Jk22.setBounds(0, 376, 340, 36);
		Jk23.setBounds(0, 412, 340, 32);
		J21.add(tank21);
		J22.add(tank22);
		J23.add(tank23);
		J24.add(tank24);
		J25.add(tank25);
		J26.add(tank26);
		J27.add(tank27);
		J28.add(tank28);
		J29.add(tank29);
		Jk21.add(tankk21);
		Jk22.add(tankk22);
		Jk23.add(tankk29);
		J21.add(oneTxt21);
		J22.add(oneTxt22);
		J23.add(oneTxt23);
		J24.add(oneTxt24);
		J25.add(oneTxt25);
		J26.add(oneTxt26);
		J27.add(oneTxt27);
		J28.add(oneTxt28);
		Jk21.add(oneTxtk21);
		Jk22.add(oneTxtk22);
		J2.add(J21);
		J2.add(J22);
		J2.add(J23);
		J2.add(J24);
		J2.add(J25);
		J2.add(J26);
		J2.add(J27);
		J2.add(J28);
		J2.add(J29);
		J2.add(Jk21);
		J2.add(Jk22);
		J2.add(Jk23);
		left.add(J2);

		// 起吊参数1
		J3.setBorder(new TitledBorder("起吊参数1："));
		J3.setBounds(0, 702, 345, 198);
		J3.setLayout(null);

		JLabel tank31 = new JLabel("        被吊构件质量 :");
		tank31.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank32 = new JLabel("    攀根绳与地面夹角 :");
		tank32.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank33 = new JLabel("起吊绳中心线与铅垂线夹角:");
		tank33.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank34 = new JLabel("       构件的增重系数:");
		tank34.setHorizontalAlignment(JTextField.RIGHT);
		JLabel tank35 = new JLabel();
		J35.setLayout(null);
		tank35.setBounds(220, 0, 300, 30);
		oneTxt34.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tank35.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tank35.setText("建议值为1.05");
				tank35.setForeground(Color.RED);
			}
		});
		J31.setBounds(0, 20, 340, 36);
		J32.setBounds(0, 56, 340, 36);
		J33.setBounds(0, 92, 340, 36);
		J34.setBounds(0, 128, 340, 36);
		J35.setBounds(0, 164, 340, 30);
		J31.add(tank31);
		J32.add(tank32);
		J33.add(tank33);
		J34.add(tank34);
		J35.add(tank35);
		J31.add(oneTxt31);
		J32.add(oneTxt32);
		J33.add(oneTxt33);
		J34.add(oneTxt34);
		J3.add(J31);
		J3.add(J32);
		J3.add(J33);
		J3.add(J34);
		J3.add(J35);
		left.add(J3);
	}

	private void initright(JPanel right) {
		JPanel tankcheck1 = new JPanel();

		JPanel result = new JPanel();

		JPanel baoganlong = new JPanel();

		JPanel zhangli = new JPanel();
		// 设置空布局，即绝对布局
		right.setOpaque(false);
		right.setLayout(null);

		// 吊装工况
		JCheckBox checkBox11 = new JCheckBox("抱杆倾斜");
		JCheckBox checkBox12 = new JCheckBox("抱杆铅锤");
		JCheckBox checkBox13 = new JCheckBox("吊塔身构件");
		JCheckBox checkBox14 = new JCheckBox("吊横担时");

		// j6
		JPanel J61 = new JPanel();
		JPanel J62 = new JPanel();
		JPanel J63 = new JPanel();
		JPanel J64 = new JPanel();
		JPanel J65 = new JPanel();
		JPanel J66 = new JPanel();
		// j7
		JPanel J71 = new JPanel();
		JPanel J72 = new JPanel();
		JPanel J73 = new JPanel();
		JPanel J74 = new JPanel();
		JPanel J75 = new JPanel();
		JPanel J76 = new JPanel();
		JPanel J77 = new JPanel();
		JPanel J78 = new JPanel();
		JPanel J79 = new JPanel();
		JPanel J80 = new JPanel();
		JPanel J81 = new JPanel();
		JPanel J82 = new JPanel();
		JPanel J83 = new JPanel();

		// 工况选择
		tankcheck1.setBorder(new TitledBorder("吊装工况："));
		tankcheck1.setBounds(0, 0, 405, 103);
		tankcheck1.add(checkBox11);
		tankcheck1.add(checkBox12);
		tankcheck1.add(checkBox13);
		tankcheck1.add(checkBox14);
		listenerge lis = new listenerge();
		F4 = lis.listenergek1(checkBox11, checkBox12, checkBox13, checkBox14);
		right.add(tankcheck1);

		// 输出结果
		result.setBorder(new TitledBorder("计算结果:"));
		result.setBounds(0, 105, 410, 792);

		// 设置内部布局
		result.setLayout(null);
		result.setOpaque(false);

		// 抱杆长度和长细比
		TitledBorder T1 = new TitledBorder("抱杆长度和长细比:");
		baoganlong.setBorder(T1);
		baoganlong.setBounds(9, 20, 395, 272);

		JLabel tank61 = new JLabel("  抱杆长度(多种):");
		tank61.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank62 = new JLabel("等截面抱杆长细比:");
		tank62.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank63 = new JLabel("等截面抱杆惯性矩:");
		tank63.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank64 = new JLabel("变截面抱杆长细比:");
		tank64.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank65 = new JLabel("变截面抱杆惯性矩:");
		tank65.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank66 = new JLabel("变截面抱杆的折算长细比:");
		tank66.setHorizontalAlignment(JTextField.RIGHT);

		// 设置内部布局
		baoganlong.setLayout(null);
		J61.setBounds(0, 20, 390, 40);
		J62.setBounds(0, 60, 390, 40);
		J63.setBounds(0, 100, 390, 40);
		J64.setBounds(0, 140, 390, 40);
		J65.setBounds(0, 180, 390, 40);
		J66.setBounds(0, 220, 390, 40);
		J61.add(tank61);
		J62.add(tank62);
		J63.add(tank63);
		J64.add(tank64);
		J65.add(tank65);
		J66.add(tank66);
		J61.add(oneTxt61);
		J62.add(oneTxt62);
		J63.add(oneTxt63);
		J64.add(oneTxt64);
		J65.add(oneTxt65);
		J66.add(oneTxt66);
		baoganlong.add(J61);
		baoganlong.add(J62);
		baoganlong.add(J63);
		baoganlong.add(J64);
		baoganlong.add(J65);
		baoganlong.add(J66);
		result.add(baoganlong);

		// 张力和轴向压力
		TitledBorder T2 = new TitledBorder("张力和压力:");
		zhangli.setBorder(T2);
		zhangli.setBounds(9, 290, 395, 495);

		JLabel tank71 = new JLabel("               攀根绳的静张力:");
		tank71.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank72 = new JLabel("   起吊滑车组及牵引绳的静张力:");
		tank72.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank73 = new JLabel("               吊点绳的静张力:");
		tank73.setHorizontalAlignment(JButton.RIGHT);
		table1.setActionCommand("显示表一");
		table1.addActionListener(this);

		JLabel tank74 = new JLabel("             抱杆拉线的静张力:");
		tank74.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank75 = new JLabel("           吊装辅助拉线静张力:");
		tank75.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank76 = new JLabel("               抱杆的轴心压力:");
		tank76.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank77 = new JLabel("               承托绳的静张力:");
		tank77.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank78 = new JLabel(" 引至地面时抱杆轴向压力(多种):");
		tank77.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank79 = new JLabel("                 中心压力计算:");
		tank79.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank80 = new JLabel("   按压弯杆件计算容许中心压力:");
		tank80.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank81 = new JLabel("               牵引绳的静张力:");
		tank81.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank82 = new JLabel(" 沿铅垂线引下时增加的拉线张力:");
		tank82.setHorizontalAlignment(JTextField.RIGHT);

		JLabel tank83 = new JLabel("                  综合静拉力:");
		tank83.setHorizontalAlignment(JTextField.RIGHT);

		// 设置内部布局
		zhangli.setLayout(null);
		J71.setBounds(0, 20, 390, 36);
		J72.setBounds(0, 56, 390, 36);
		J81.setBounds(0, 92, 390, 36);
		J73.setBounds(0, 128, 390, 36);
		J74.setBounds(0, 164, 390, 36);
		J75.setBounds(0, 200, 390, 36);
		J76.setBounds(0, 236, 390, 36);
		J77.setBounds(0, 272, 390, 36);
		J78.setBounds(0, 308, 390, 36);
		J79.setBounds(0, 344, 390, 36);
		J80.setBounds(0, 380, 390, 36);
		J82.setBounds(0, 416, 390, 36);
		J83.setBounds(0, 452, 390, 36);
		J71.add(tank71);
		J72.add(tank72);
		J73.add(tank73);
		J74.add(tank74);
		J75.add(tank75);
		J76.add(tank76);
		J77.add(tank77);
		J78.add(tank78);
		J79.add(tank79);
		J80.add(tank80);
		J81.add(tank81);
		J82.add(tank82);
		J83.add(tank83);
		J71.add(oneTxt71);
		J72.add(oneTxt72);
		J73.add(table1);
		J74.add(oneTxt74);
		J75.add(oneTxt75);
		J76.add(oneTxt76);
		J77.add(oneTxt77);
		J78.add(oneTxt78);
		J79.add(oneTxt79);
		J80.add(oneTxt80);
		J81.add(oneTxt81);
		J82.add(oneTxt82);
		J83.add(oneTxt83);
		zhangli.add(J71);
		zhangli.add(J72);
		zhangli.add(J81);
		zhangli.add(J73);
		zhangli.add(J74);
		zhangli.add(J75);
		zhangli.add(J76);
		zhangli.add(J77);
		zhangli.add(J78);
		zhangli.add(J79);
		zhangli.add(J80);
		zhangli.add(J82);
		zhangli.add(J83);
		result.add(zhangli);

		// 添加进右边
		right.add(result);
	}

	// 复选框点击监听事件
	@Override
	public void actionPerformed(ActionEvent e) {

		// 对比
		if (e.getActionCommand().equals("拉线受力")) {
			picture1.setVisible(false);
			ImageIcon IC = new ImageIcon(this.getClass().getResource("1.png"));
			picture1 = new JLabel(IC);
			IC.setImage(IC.getImage().getScaledInstance(360, 190, Image.SCALE_DEFAULT));
			picture1.setIcon(IC);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了拉线受力" + "m=" + i);

		}
		if (e.getActionCommand().equals("承托绳受力")) {
			picture1.setVisible(false);
			ImageIcon icon = new ImageIcon(this.getClass().getResource("2.png"));
			picture1 = new JLabel(icon);
			icon.setImage(icon.getImage().getScaledInstance(360, 190, Image.SCALE_DEFAULT));
			picture1.setIcon(icon);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了承托绳受力" + "n=" + i);
		}
		if (e.getActionCommand().equals("牵引绳在抱杆异侧(竖)")) {
			picture1.setVisible(false);
			ImageIcon icon1 = new ImageIcon(this.getClass().getResource("3.png"));
			picture1 = new JLabel(icon1);
			icon1.setImage(icon1.getImage().getScaledInstance(360, 190, Image.SCALE_DEFAULT));
			picture1.setIcon(icon1);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了牵引绳在抱杆异侧(竖)" + "n=" + i);
		}
		if (e.getActionCommand().equals("牵引绳在抱杆异侧(倾)")) {
			picture1.setVisible(false);
			ImageIcon icon2 = new ImageIcon(this.getClass().getResource("4.png"));
			picture1 = new JLabel(icon2);
			icon2.setImage(icon2.getImage().getScaledInstance(360, 190, Image.SCALE_DEFAULT));
			picture1.setIcon(icon2);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了牵引绳在抱杆异侧(倾)" + "n=" + i);
		}
		if (e.getActionCommand().equals("牵引绳在抱杆同侧(倾)")) {
			picture1.setVisible(false);
			ImageIcon icon3 = new ImageIcon(this.getClass().getResource("6.png"));
			picture1 = new JLabel(icon3);
			icon3.setImage(icon3.getImage().getScaledInstance(360, 190, Image.SCALE_DEFAULT));
			picture1.setIcon(icon3);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了牵引绳在抱杆同侧(倾)" + "n=" + i);
		}
		if (e.getActionCommand().equals("牵引绳在抱杆同侧(竖)")) {
			picture1.setVisible(false);
			ImageIcon icon4 = new ImageIcon(this.getClass().getResource("5.png"));
			picture1 = new JLabel(icon4);
			icon4.setImage(icon4.getImage().getScaledInstance(360, 190, Image.SCALE_DEFAULT));
			picture1.setIcon(icon4);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("牵引绳在抱杆同侧(竖)" + "n=" + i);
		}

		if (e.getActionCommand().equals("显示表一")) {
			String name = "表1";
			pictureWindowk1 window1 = new pictureWindowk1(name);
		}
		
		if (e.getActionCommand().equals("计算")) {
			one1 = Double.parseDouble(oneTxt1.getText());
			one2 = Double.parseDouble(oneTxt2.getText());
			one3 = Double.parseDouble(oneTxt3.getText());
			one4 = Double.parseDouble(oneTxt4.getText());
			one5 = Double.parseDouble(oneTxt5.getText());
			one6 = Double.parseDouble(oneTxt6.getText());
			
			one21 = Double.parseDouble(oneTxt21.getText());
			one22 = Double.parseDouble(oneTxt22.getText());
			one23 = Double.parseDouble(oneTxt23.getText());
			one24 = Double.parseDouble(oneTxt24.getText());
			one25 = Double.parseDouble(oneTxt25.getText());
			one26 = Double.parseDouble(oneTxt26.getText());
			one27 = Double.parseDouble(oneTxt27.getText());
			one28 = Double.parseDouble(oneTxt28.getText());
			
			one31 = Double.parseDouble(oneTxt31.getText());
			one32 = Double.parseDouble(oneTxt32.getText());
			one33 = Double.parseDouble(oneTxt33.getText());
			one34 = Double.parseDouble(oneTxt34.getText());
			
			one41 = Double.parseDouble(oneTxt41.getText());
			one42 = Double.parseDouble(oneTxt42.getText());
			one43 = Double.parseDouble(oneTxt43.getText());
			one44 = Double.parseDouble(oneTxt44.getText());
			
			oneR21 = Double.parseDouble(oneTxtR21.getText());
			oneR22 = Double.parseDouble(oneTxtR22.getText());
			oneR23 = Double.parseDouble(oneTxtR23.getText());
			
			oneC21 = Double.parseDouble(oneTxtC21.getText());
			oneC22 = Double.parseDouble(oneTxtC22.getText());
			oneC22 = Double.parseDouble(oneTxtC22.getText());
			
			oneC31 = Double.parseDouble(oneTxtC31.getText());
			oneC32 = Double.parseDouble(oneTxtC32.getText());
			oneC33 = Double.parseDouble(oneTxtC33.getText());
			oneC34 = Double.parseDouble(oneTxtC34.getText());
			oneC35 = Double.parseDouble(oneTxtC35.getText());
			oneC36 = Double.parseDouble(oneTxtC36.getText());
			
			oneC41 = Double.parseDouble(oneTxtC41.getText());
			oneC42 = Double.parseDouble(oneTxtC42.getText());
			oneC43 = Double.parseDouble(oneTxtC43.getText());
			oneC44 = Double.parseDouble(oneTxtC44.getText());
			oneC45 = Double.parseDouble(oneTxtC45.getText());
			
			SquareCal sq1 = new SquareCal(one1, one2, one3, one4, one5, one6, one21, one22, one23, one24, one25, one26, one27, one28, onek21, onek22, one31, one32, one33, one34, one43, one42, one41, one44, oneR21, oneR22, oneR23, oneC21, oneC22, oneC23, oneC31, oneC32, oneC33, oneC34, oneC35, oneC36, oneC41, oneC42, oneC43, oneC44, oneC45);
			
			//抱杆主材截面面积
			As = sq1.setS();
			
			//抱杆长度
			if(F2 < 4){
				BL = sq1.setHrodLength();
			}else if(F2 == 4){
				BL = sq1.setHrodLengthCat();
			}else{
				BL = sq1.setHrodLengthTen();
			}
			
			//等截面抱杆的长细比
			DBc = sq1.setDslendernessRatio();
			
			//等截面抱杆的惯性矩
			DBx = sq1.setDmomenToFinertia();
			
			//变截面抱杆长细比
			BBc = sq1.setBmomenToFinertia();
			
			//变截面抱杆的折算长细比
			BBx = sq1.setOneMomenToFinertia();
			
			//起吊重力
			QG = sq1.setWeight();
			
			//攀根绳的静张力
			FZ1 = sq1.setPstatictension();
			
			//起吊和牵引绳
			FQ1 = sq1.setDstatictension();
			
			//牵引绳的静张力
			FQ2 = sq1.setQstatictension();
			
			//抱杆拉线的静张力
			if(F4 == 1){
				FL1 = sq1.setLstatictension1();
			}else if(F4 == 2){
				FL1 = sq1.setLstatictension2();
			}else if(F4 == 3){
				FL1 = sq1.setLstatictension3();
			}else{
				FL1 = sq1.setLstatictension4();
			}
				
			//吊装辅助拉线静张力
			DL1 = sq1.setZwireTension();
			
			//抱杆的轴心压力,AFZ变化
			if(F4 == 1){
				FZ2 = sq1.setAxisPressure();
			}else if(F4 == 2){
				FZ2 = sq1.setAxisPressure1();
			}
			
			//承托绳的静张力
			if(F4 == 1){
				FC1 = sq1.setCstatictension();
			}else if(F4 == 2){
				FC1 = sq1.setCstatictension1();
			}
			
			if(F1 == 3){
				FZ3 = sq1.setYaxialPressure1();
			}else if(F1 == 4){
				FZ3 = sq1.setYaxialPressure2();
			}else if(F1 == 6){
				FZ3 = sq1.setYaxialPressure3();
			}else{
				FZ3 = sq1.setYaxialPressure4();
			}
			
			//中心压力的计算
			FM1 = sq1.setCentralPressure();
			
			//按压弯件中心压力的计算
			FAM1 = sq1.setPermissibleCentralPressure();
			
			
			//向下增加的拉力
			FAY = sq1.setZstatictension1();
			
			//综合静拉力
			FAZ = sq1.setZstatictensionZ();
			
			S61 = String.format("%.2f", BL);
			oneTxt61.setText(S61);
			S62 = String.format("%.2f", DBc);
			oneTxt62.setText(S62);
			S63 = String.format("%.2f", DBx);
			oneTxt63.setText(S63);
			S64 = String.format("%.2f", BBc);
			oneTxt64.setText(S64);
			S65 = String.format("%.2f", BBc);
			oneTxt65.setText(S65);
			S66 = String.format("%.2f", BBx);
			oneTxt66.setText(S66);
			S71 = String.format("%.2f", FZ1);
			oneTxt71.setText(S71);
			S72 = String.format("%.2f", FQ1);
			oneTxt72.setText(S71);
			S74 = String.format("%.2f", FQ2);
			oneTxt74.setText(S74);
			S75 = String.format("%.2f", FL1);
			oneTxt75.setText(S75);
			S76 = String.format("%.2f", DL1);
			oneTxt76.setText(S76);
			S77 = String.format("%.2f", FZ2);
			oneTxt77.setText(S77);
			S78 = String.format("%.2f", FC1);
			oneTxt78.setText(S78);
			S79 = String.format("%.2f", FZ3);
			oneTxt79.setText(S79);
			S80 = String.format("%.2f", FM1);
			oneTxt80.setText(S80);
			S81 = String.format("%.2f", FAM1);
			oneTxt81.setText(S81);
			S82 = String.format("%.2f", FAY);
			oneTxt82.setText(S82);
			S83 = String.format("%.2f", FAZ);
			oneTxt83.setText(S83);	
			
		}
		
		if (e.getActionCommand().equals("保存")) {
			XMLData data1 = new XMLData(one1, one2, one3, one4, one5, one6, one21, one22, one23, one24, one25, one26, one27, one28, onek21, onek22, one31, one32, one33, one34, one43, one42, one41, one44, oneR21, oneR22, oneR23, oneC21, oneC22, oneC23, oneC31, oneC32, oneC33, oneC34, oneC35, oneC36, oneC41, oneC42, oneC43, oneC44, oneC45, As, BL, DBc, DBx, BBc, BBc, BBx, QG, FZ1, FQ1, FQ2, FL1, DL1, FZ2, FC1, FZ3, FM1, FAM1, FAY, FAZ);
			try {
				Result result = data1.add();
				if (result != null) {
					JOptionPane.showMessageDialog(null, "保存成功", "提示",JOptionPane.WARNING_MESSAGE);  
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		if (e.getActionCommand().equals("打印")) {
			String s1 = "  ";
			String s2 = "      ";
			outPutTxt = "抱杆计算: " + System.getProperty("line.separator") + s1;
			if (oneTxt61.getText() != null) {
				outPutTxt += "塔型参数: "+ System.getProperty("line.separator") + s2 + "酒杯型塔的窗口高度:  " + oneTxt1.getText() + System.getProperty("line.separator") + s2 + "横担断面的最大高度:  "
						+ oneTxt2.getText() + System.getProperty("line.separator") + s2 + "耐张塔头断面边宽:  " + oneTxt3.getText() + System.getProperty("line.separator") + s2
						+ "吊点绳的高度:  " + oneTxt4.getText() + System.getProperty("line.separator") + s2 + "起吊滑车组预留长度: " + oneTxt5.getText() + System.getProperty("line.separator")
						+ s2 + "单边横担长度: " + oneTxt6.getText() + System.getProperty("line.separator") + s2 + "抱杆长度:  " + oneTxt61.getText()
						+ System.getProperty("line.separator") + s1;
			}
			if (oneTxt62.getText() != null) {
				outPutTxt += "压杆参数: "+ System.getProperty("line.separator") + s2 + "等截面压杆长度:  " + oneTxt21.getText() + System.getProperty("line.separator") + s2 + "压杆截面惯性矩: "
						+ oneTxt22.getText() + System.getProperty("line.separator") + s2 + "单肢主材对X轴惯性矩:  " + oneTxt23.getText()+ System.getProperty("line.separator") + s2 + "单肢主材截面面积:  " + oneTxt24.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆主材截面面积:  " + oneTxt25.getText()
						+ System.getProperty("line.separator") + s2 + "单肢主材重心距离:  " + oneTxt26.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆断面边宽:  " + oneTxt27.getText()
						+ System.getProperty("line.separator") + s2 + "压杆长度系数:  " + oneTxt28.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆斜面为单斜材布置是的单斜材截面面积:  " + oneTxtk21.getText()
						+ System.getProperty("line.separator") + s2 + "压杆截面变化有关的压杆长度修正系数:  " + oneTxtk22.getText()
						+ System.getProperty("line.separator") + s2 + "等截面抱杆长细比:  " + oneTxt62.getText()
						+ System.getProperty("line.separator") + s2 + "等截面抱杆惯性矩:  " + oneTxt63.getText()
						+ System.getProperty("line.separator") + s2 + "变截面抱杆长细比:  " + oneTxt64.getText()
						+ System.getProperty("line.separator") + s2 + "变截面抱杆惯性矩:  " + oneTxt65.getText()
						+ System.getProperty("line.separator") + s2 + "变截面抱杆的折算长细比:  " + oneTxt66.getText()
						+ System.getProperty("line.separator") + s1;
			}
			if (oneTxt71.getText() != null) {
				outPutTxt += "张力和轴心轴向压力:" + System.getProperty("line.separator") + s2 + "被吊构件的质量: " + oneTxt31.getText() + System.getProperty("line.separator") + s2 + "攀根绳与地面的夹角: "
						+ oneTxt32.getText()  + System.getProperty("line.separator") + s2 + "起吊绳中心线与铅垂线之间的夹角: " + oneTxt33.getText()  + System.getProperty("line.separator") + s2 + "构件的增重系数: "
						+ oneTxt34.getText() + System.getProperty("line.separator") + s2 + "起吊滑车组的受力绳数: " + oneTxt43.getText() + System.getProperty("line.separator") + s2
						+ "抱杆倾斜角: " + oneTxt42.getText() + System.getProperty("line.separator") + s2 + "拉线对地夹角: " + oneTxt41.getText()
						+ System.getProperty("line.separator") + s2 + "起吊滑车组的效率: " + oneTxt44.getText() + System.getProperty("line.separator") + s2 + "钢丝绳的工作绳数: " + oneTxtC31.getText()
						+ System.getProperty("line.separator") + s2 + "合力线与抱杆轴间夹角(辅助拉线): " + oneTxtC32.getText() + System.getProperty("line.separator") + s2 + "起吊滑车组轴线与铅垂线之间的夹角: " + oneTxtC33.getText()
						+ System.getProperty("line.separator") + s2 + "控制绳对地夹角: " + oneTxtC34.getText()
						+ System.getProperty("line.separator") + s2 + "被吊构件的重力: " + oneTxtC35.getText()
						+ System.getProperty("line.separator") + s2 + "滑车的效率: " + oneTxtC36.getText()
						+ System.getProperty("line.separator") + s2 + "单条承托绳与抱杆轴线间的夹角: " + oneTxtC41.getText()
						+ System.getProperty("line.separator") + s2 + "单条承托绳与相邻承托绳合力线间夹角: " + oneTxtC42.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆及锁具的重力: " + oneTxtC43.getText()
						+ System.getProperty("line.separator") + s2 + "主要受力拉线的合力与抱杆轴线的夹角: " + oneTxtC44.getText()
						+ System.getProperty("line.separator") + s2 + "内与辅拉线合力线与抱杆轴线间的夹角: " + oneTxtC45.getText()
						+ System.getProperty("line.separator") + s2 + "攀根绳的静张力: " + oneTxt71.getText()
						+ System.getProperty("line.separator") + s2 + "起吊滑车组及牵引绳的静张力: " + oneTxt72.getText()
						+ System.getProperty("line.separator") + s2 + "牵引绳的静张力: " + oneTxt74.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆拉线的静张力: " + oneTxt75.getText()
						+ System.getProperty("line.separator") + s2 + "吊装辅助拉线静张力: " + oneTxt76.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆的轴心压力: " + oneTxt77.getText()
						+ System.getProperty("line.separator") + s2 + "承托绳的静张力: " + oneTxt78.getText()
						+ System.getProperty("line.separator") + s2 + "引至地面时抱杆轴向压力(多种): " + oneTxt79.getText()
						+ System.getProperty("line.separator") + s2 + "延铅垂线引下时增加的拉线张力: " + oneTxt82.getText()
						+ System.getProperty("line.separator") + s2 + "综合静拉力: " + oneTxt83.getText()
						+ System.getProperty("line.separator") + s1;
			}
			if (oneTxt80.getText() != null) {
				outPutTxt += "抱杆容许中心压力: "+ System.getProperty("line.separator") + s2 + "抱杆断面边宽:  " + oneTxt27.getText() + System.getProperty("line.separator") + s2 + "受压杆件的稳定系数: "
						+ oneTxtR21.getText() + System.getProperty("line.separator") + s2 + "抱杆主材截面面积:  " + oneTxtR22.getText()+ System.getProperty("line.separator") + s2 + "抱杆主材的容许应力:  " + oneTxtR23.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆中部断面的惯性矩:  " + oneTxtC21.getText()
						+ System.getProperty("line.separator") + s2 + "抱杆中部断面的抗弯断面系数:  " + oneTxtC22.getText()
						+ System.getProperty("line.separator") + s2 + "压杆承受压力的偏心距:  " + oneTxtC23.getText()
						+ System.getProperty("line.separator") + s2 + "中心压力的计算：  " + oneTxt80.getText()
						+ System.getProperty("line.separator") + s2 + "按压弯杆件计算容许中心压力:  " + oneTxt81.getText()
						+ System.getProperty("line.separator") + s1;
			}
//			if(highStrength.)
			if (outPutTxt.length() == 7) {
				JOptionPane.showConfirmDialog(null, "内容为空！");
			} else {
				Filewriter.printToTxt(outPutTxt);
			}
		}
	}

	@Override
	public void focusGained(FocusEvent e) {

	}

	@Override
	public void focusLost(FocusEvent e) {

	}
}
