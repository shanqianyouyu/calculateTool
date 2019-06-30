package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;

public class AbusoluteSquare1 extends FatherFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
//	static {
//		try {
//			// 设置边框样式为强立体半透明
//			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
//			// 引入apple的皮肤包
//			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (Exception e) {
//			System.out.println("皮肤软件抛出异常");
//		}
//	}
	private int i = 0;
	// 主窗体
	private JFrame jfSquare;
	private JLabel picture1 = null;
	JPanel picture = new JPanel();
	ImageIcon image = new ImageIcon(this.getClass().getResource("1.png"));
	private static String Name = "正方形抱杆计算";

	// 没输入名字
	public AbusoluteSquare1() {
		this(Name);
		
		// String name = "请输入名字!";

	}

	public AbusoluteSquare1(String name2) {
		setVisible(true);
		System.out.println("初始化成功...");
		initSquare(name2);
		jfSquare.setVisible(true);
		jfSquare.setResizable(false);

	}

	private void initSquare(String name2) {
		
		jfSquare = new JFrame(name2);
		jfSquare.setSize(1188, 930);
		jfSquare.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 关闭等功能
//		jfSquare.dispose();
		jfSquare.setLayout(null);
		jfSquare.setLocationRelativeTo(null);// 居中

		// 创建四大面板
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		JPanel middle = new JPanel();
		JPanel end = new JPanel();

		// 设置长宽
		left.setBounds(0, 0, 350, 825);
		middle.setBounds(355, 5, 410, 825);
		right.setBounds(770, 0, 415, 825);
		end.setBounds(0, 825, 1188, 110);

		jfSquare.add(left);
		jfSquare.add(right);
		jfSquare.add(middle);
		jfSquare.add(end);

		left.setVisible(true);
		middle.setVisible(true);
		right.setVisible(true);
		end.setVisible(true);

		// 分别初始化
		initleft(left);
		initright(right);
		initmiddle(middle);
		initend(end);
	}

	private void initend(JPanel end) {

		// 设置空布局，即绝对布局
		end.setOpaque(false);
		end.setLayout(null);

		JButton button01 = new JButton("保存");
		JButton button02 = new JButton("打印");
		JButton button03 = new JButton("计算");

		button01.setBounds(100, 5, 150, 40);
		button02.setBounds(500, 5, 150, 40);
		button03.setBounds(900, 5, 150, 40);
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
		lis1.listenerge1(checkBox06, checkBox07, checkBox08, checkBox09, checkBox10, checkBox11);
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
		lis.listenergek(checkBox01, checkBox02, checkBox03, checkBox04, checkBox05);
		middle.add(tankcheck);

		// 钢材选择
		cailiao.setBorder(new TitledBorder("钢材："));
		cailiao.setBounds(0, 570, 405, 87);
		cailiao.setLayout(null);
		checkboxc1.setBounds(60, 30, 130, 40);
		cailiao.add(checkboxc1);
		cailiao.add(checkboxc2);
		checkboxc2.setBounds(190, 30, 150, 40);
		middle.add(cailiao);

		// 输入参数2
		canshu.setBorder(new TitledBorder("起吊参数2："));
		canshu.setBounds(0, 665, 405, 120);

		JLabel tank41 = new JLabel("    拉线对地夹角:");
		tank41.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt41 = new JTextField("0", 10);

		JLabel tank42 = new JLabel("    抱杆倾斜角为:");
		tank42.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt42 = new JTextField("0", 10);

		J41.add(tank41);
		J42.add(tank42);
		J41.add(oneTxt41);
		J42.add(oneTxt42);
		canshu.add(J41);
		canshu.add(J42);
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

		// j3
		JPanel J31 = new JPanel();
		JPanel J32 = new JPanel();
		JPanel J33 = new JPanel();
		JPanel J34 = new JPanel();

		// 塔型输入参数
		J1.setBorder(new TitledBorder("塔型参数："));
		J1.setBounds(0, 0, 345, 305);

		JLabel tank1 = new JLabel("酒杯型塔窗口高度 :");
		tank1.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt1 = new JTextField("0", 10);

		JLabel tank2 = new JLabel("横担断面最大高度 :");
		tank2.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt2 = new JTextField("0", 10);

		JLabel tank3 = new JLabel("耐张塔头断面边宽 :");
		tank3.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt3 = new JTextField("0", 10);

		JLabel tank4 = new JLabel("     吊点绳的高度:");
		tank4.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt4 = new JTextField("0", 10);

		JLabel tank5 = new JLabel("起吊滑车组预留长度:");
		tank5.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt5 = new JTextField("0", 10);

		JLabel tank6 = new JLabel("     单边横担长度:");
		tank6.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt6 = new JTextField("0", 10);

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
		J2.setBounds(0, 305, 345, 303);

		JLabel tank21 = new JLabel(" 等截面压杆的长度 :");
		tank21.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt21 = new JTextField("0", 10);

		JLabel tank22 = new JLabel(" 压杆截面的惯性矩 :");
		tank22.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt22 = new JTextField("0", 10);

		JLabel tank23 = new JLabel("单肢主材对x轴的惯性矩:");
		tank23.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt23 = new JTextField("0", 10);

		JLabel tank24 = new JLabel("  单肢主材截面面积:");
		tank4.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt24 = new JTextField("0", 10);

		JLabel tank25 = new JLabel("起吊滑车组预留长度:");
		tank25.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt25 = new JTextField("0", 10);

		JLabel tank26 = new JLabel("单肢主材的重心距离:");
		tank26.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt26 = new JTextField("0", 10);

		J21.add(tank21);
		J22.add(tank22);
		J23.add(tank23);
		J24.add(tank24);
		J25.add(tank25);
		J26.add(tank26);
		J21.add(oneTxt21);
		J22.add(oneTxt22);
		J23.add(oneTxt23);
		J24.add(oneTxt24);
		J25.add(oneTxt25);
		J26.add(oneTxt26);
		J2.add(J21);
		J2.add(J22);
		J2.add(J23);
		J2.add(J24);
		J2.add(J25);
		J2.add(J26);
		left.add(J2);

		// 起吊参数1
		J3.setBorder(new TitledBorder("起吊参数1："));
		J3.setBounds(0, 607, 345, 220);

		JLabel tank31 = new JLabel("        被吊构件质量 :");
		tank1.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt31 = new JTextField("0", 10);

		JLabel tank32 = new JLabel("    攀根绳与地面夹角 :");
		tank2.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt32 = new JTextField("0", 10);

		JLabel tank33 = new JLabel("起吊绳中心线与铅垂线夹角:");
		tank3.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt33 = new JTextField("0", 10);

		JLabel tank34 = new JLabel("起吊滑车组的受力绳数 :");
		tank34.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt34 = new JTextField("0", 10);

		J31.add(tank31);
		J32.add(tank32);
		J33.add(tank33);
		J34.add(tank34);
		J31.add(oneTxt31);
		J32.add(oneTxt32);
		J33.add(oneTxt33);
		J34.add(oneTxt34);
		J3.add(J31);
		J3.add(J32);
		J3.add(J33);
		J3.add(J34);
		left.add(J3);
	}

	private void initright(JPanel right) {
		JPanel canshuend = new JPanel();

		JPanel result = new JPanel();

		JPanel baoganlong = new JPanel();

		JPanel zhangli = new JPanel();
		// 设置空布局，即绝对布局
		right.setOpaque(false);
		right.setLayout(null);

		// j5
		JPanel J51 = new JPanel();
		JPanel J52 = new JPanel();
		JPanel J53 = new JPanel();
		JPanel J54 = new JPanel();
		JPanel J55 = new JPanel();

		// j6
		JPanel J61 = new JPanel();
		JPanel J62 = new JPanel();
		JPanel J63 = new JPanel();
		JPanel J64 = new JPanel();

		// j7
		JPanel J71 = new JPanel();
		JPanel J72 = new JPanel();
		JPanel J73 = new JPanel();
		JPanel J74 = new JPanel();
		JPanel J75 = new JPanel();
		JPanel J76 = new JPanel();
		JPanel J77 = new JPanel();
		JPanel J78 = new JPanel();

		// 起吊参数3
		canshuend.setBorder(new TitledBorder("起吊参数3："));
		canshuend.setBounds(0, 0, 410, 230);

		JLabel tank51 = new JLabel("        单条承托绳与抱杆轴线的夹角:");
		tank51.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt51 = new JTextField("0", 7);

		JLabel tank52 = new JLabel("单条承托绳与相邻承托绳合力线间夹角:");
		tank52.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt52 = new JTextField("0", 7);

		JLabel tank53 = new JLabel("                  抱杆及索具的重力:");
		tank53.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt53 = new JTextField("0", 7);

		JLabel tank54 = new JLabel("主要受力拉线的合力与抱杆轴线的夹角:");
		tank54.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt54 = new JTextField("0", 7);

		JLabel tank55 = new JLabel("  未知未知未知未知未知未知未知未知:");
		tank55.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt55 = new JTextField("0", 7);

		// 设置内部布局
		canshuend.setLayout(null);
		J51.setBounds(4, 20, 402, 40);
		J52.setBounds(4, 60, 402, 40);
		J53.setBounds(4, 100, 402, 40);
		J54.setBounds(4, 140, 402, 40);
		J55.setBounds(4, 180, 402, 40);
		J51.add(tank51);
		J52.add(tank52);
		J53.add(tank53);
		J54.add(tank54);
		J55.add(tank55);
		J51.add(oneTxt51);
		J52.add(oneTxt52);
		J53.add(oneTxt53);
		J54.add(oneTxt54);
		J55.add(oneTxt55);
		canshuend.add(J51);
		canshuend.add(J52);
		canshuend.add(J53);
		canshuend.add(J54);
		canshuend.add(J55);
		right.add(canshuend);

		// 输出结果
		result.setBorder(new TitledBorder("计算结果:"));
		result.setBounds(0, 230, 410, 590);

		// 设置内部布局
		result.setLayout(null);
		result.setOpaque(false);

		// 抱杆长度和长细比
		TitledBorder T1 = new TitledBorder("抱杆长度和长细比:");
		baoganlong.setBorder(T1);
		baoganlong.setBounds(5, 25, 395, 202);

		JLabel tank61 = new JLabel("  抱杆长度(多种):");
		tank61.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt61 = new JTextField("0", 10);

		JLabel tank62 = new JLabel("等截面抱杆长细比:");
		tank62.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt62 = new JTextField("0", 10);

		JLabel tank63 = new JLabel("等截面抱杆惯性矩:");
		tank63.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt63 = new JTextField("0", 10);

		JLabel tank64 = new JLabel("变截面抱杆长细比:");
		tank64.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt64 = new JTextField("0", 10);
		// 设置内部布局
		baoganlong.setLayout(null);
		J61.setBounds(5, 20, 390, 40);
		J62.setBounds(5, 60, 390, 40);
		J63.setBounds(5, 100, 390, 40);
		J64.setBounds(5, 140, 390, 40);
		J61.add(tank61);
		J62.add(tank62);
		J63.add(tank63);
		J64.add(tank64);
		J61.add(oneTxt61);
		J62.add(oneTxt62);
		J63.add(oneTxt63);
		J64.add(oneTxt64);
		baoganlong.add(J61);
		baoganlong.add(J62);
		baoganlong.add(J63);
		baoganlong.add(J64);
		result.add(baoganlong);

		// 张力和轴向压力
		TitledBorder T2 = new TitledBorder("张力和轴向压力:");
		zhangli.setBorder(T2);
		zhangli.setBounds(7, 230, 395, 350);

		JLabel tank71 = new JLabel("               攀根绳的静张力:");
		tank71.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt71 = new JTextField("0", 10);

		JLabel tank72 = new JLabel("   起吊滑车组及牵引绳的静张力:");
		tank72.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt72 = new JTextField("0", 10);

		JLabel tank73 = new JLabel("               吊点绳的静张力:");
		tank73.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt73 = new JTextField("0", 10);

		JLabel tank74 = new JLabel("             抱杆拉线的静张力:");
		tank74.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt74 = new JTextField("0", 10);

		JLabel tank75 = new JLabel("           吊装辅助拉线静张力:");
		tank75.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt75 = new JTextField("0", 10);

		JLabel tank76 = new JLabel("               抱杆的轴心压力:");
		tank76.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt76 = new JTextField("0", 10);

		JLabel tank77 = new JLabel("               承托绳的静张力:");
		tank77.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt77 = new JTextField("0", 10);

		JLabel tank78 = new JLabel(" 引至地面时抱杆轴向压力(多种):");
		tank77.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt78 = new JTextField("0", 10);

		// 设置内部布局
		zhangli.setLayout(null);
		J71.setBounds(5, 20, 390, 40);
		J72.setBounds(5, 60, 390, 40);
		J73.setBounds(5, 100, 390, 40);
		J74.setBounds(5, 140, 390, 40);
		J75.setBounds(5, 180, 390, 40);
		J76.setBounds(5, 220, 390, 40);
		J77.setBounds(5, 260, 390, 40);
		J78.setBounds(5, 300, 390, 40);
		J71.add(tank71);
		J72.add(tank72);
		J73.add(tank73);
		J74.add(tank74);
		J75.add(tank75);
		J76.add(tank76);
		J77.add(tank77);
		J78.add(tank78);
		J71.add(oneTxt71);
		J72.add(oneTxt72);
		J73.add(oneTxt73);
		J74.add(oneTxt74);
		J75.add(oneTxt75);
		J76.add(oneTxt76);
		J77.add(oneTxt77);
		J78.add(oneTxt78);
		zhangli.add(J71);
		zhangli.add(J72);
		zhangli.add(J73);
		zhangli.add(J74);
		zhangli.add(J75);
		zhangli.add(J76);
		zhangli.add(J77);
		zhangli.add(J78);
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

	}

}
