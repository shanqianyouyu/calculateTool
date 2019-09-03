package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;

public class AcrossFrameCalAbusolute extends FatherFrame implements ActionListener, ItemListener {
	
	public static void main(String[] args) {
		AcrossFrameCalAbusolute abusolute = new AcrossFrameCalAbusolute();
	}

	private static final long serialVersionUID = 1L;
	private int i = 0;

	// 定义弹窗
	private JButton model = new JButton("显示规范");
	private JButton table1 = new JButton("显示表一");
	private JButton table2 = new JButton("显示表二");

	// 定义初始图片
	private JLabel picture1 = null;
	JPanel picture = new JPanel();
	ImageIcon image = new ImageIcon(this.getClass().getResource("1.png"));
	private static String Name = "";

	// 下拉框
	private String[] listData = new String[] { "圆形杆件", "平面杆件" };
	private JComboBox<String> comboBox = new JComboBox<String>(listData);
	private String[] listData1 = new String[] { "滚动横梁", "非滚动非金属", "非滚动金属" };
	private JComboBox<String> comboBox1 = new JComboBox<String>(listData1);

	// 没输入名字
	public AcrossFrameCalAbusolute() {
		this(Name);
		// String name = "请输入名字!";
	}

	public AcrossFrameCalAbusolute(String name2) {
		setVisible(true);
		System.out.println("初始化成功...");
		initSquare(name2);
		setResizable(false);

	}

	private void initSquare(String name2) {
		setTitle(name2);
		setSize(1630, 980);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 关闭等功能
		setLayout(null);
		setLocationRelativeTo(null);// 居中

		// 创建四大面板
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		JPanel right1 = new JPanel();
		JPanel middle = new JPanel();
		JPanel end = new JPanel();

		// 设置长宽
		left.setBounds(0, 0, 390, 875);
		middle.setBounds(395, 0, 410, 875);
		right1.setBounds(805, 0, 410, 875);
		right.setBounds(1215, 0, 410, 875);
		end.setBounds(0, 875, 1630, 110);

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

		add(left);
		add(right);
		add(right1);
		add(middle);
		add(end);
	}

	private void initright1(JPanel right1) {
		// 跨越架选择
		JPanel framecheck = new JPanel();

		// 单侧跨越架
		JPanel J4 = new JPanel();

		// 风偏
		JPanel J5 = new JPanel();

		// 小块单侧跨越架
		JPanel J51 = new JPanel();
		JPanel J52 = new JPanel();
		JPanel J53 = new JPanel();
		JPanel J54 = new JPanel();
		JPanel J55 = new JPanel();
		JPanel J56 = new JPanel();
		JPanel J57 = new JPanel();
		JPanel J58 = new JPanel();
		JPanel J59 = new JPanel();

		// 小块风偏
		JPanel J61 = new JPanel();
		JPanel J62 = new JPanel();
		JPanel J63 = new JPanel();
		JPanel J64 = new JPanel();
		JPanel J65 = new JPanel();
		JPanel J66 = new JPanel();
		JPanel J67 = new JPanel();
		JPanel J68 = new JPanel();
		JPanel J69 = new JPanel();

		JCheckBox checkboxk1 = new JCheckBox("竹木跨越架");
		JCheckBox checkboxk2 = new JCheckBox("金属跨越架");

		right1.setOpaque(false);
		right1.setLayout(null);

		framecheck.setBorder(new TitledBorder("跨越架选择："));
		framecheck.setBounds(0, 0, 405, 87);
		framecheck.setLayout(null);
		checkboxk1.setBounds(60, 30, 130, 40);
		framecheck.add(checkboxk1);
		framecheck.add(checkboxk2);
		checkboxk2.setBounds(190, 30, 150, 40);
		listenerGe2 lis1 = new listenerGe2();
		lis1.listenergek2(checkboxk1, checkboxk2);
		right1.add(framecheck);

		J4.setBorder(new TitledBorder("单侧跨越架:"));
		J4.setBounds(0, 93, 390, 385);

		JLabel tank51 = new JLabel("最小安全距离要求的跨距:");
		tank51.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt51 = new JTextField("0", 7);

		JLabel tank52 = new JLabel("在建线路的交叉角引起的跨距:");
		tank52.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt52 = new JTextField("0", 10);

		JLabel tank53 = new JLabel("上层拉线挂点至地面的高度:");
		tank53.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt53 = new JTextField("0", 10);

		JLabel tank54 = new JLabel("运行电力线的下导线至地面高度:");
		tank54.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt54 = new JTextField("0", 10);

		JLabel tank55 = new JLabel("             拉线对地面夹角:");
		tank55.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt55 = new JTextField("0", 10);

		JLabel tank56 = new JLabel("拉线与跨越架横担轴线间的水平夹角:");
		tank56.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt56 = new JTextField("0", 7);

		JLabel tank57 = new JLabel("上拉线挂点至运行电力线的垂直距离:");
		tank57.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt57 = new JTextField("0", 5);

		JLabel tank58 = new JLabel("上拉线与运行电力线的最小安全距离:");
		tank58.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt58 = new JTextField("0", 5);

		JLabel tank59 = new JLabel(" 拉线位置引起的跨距:");
		tank59.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt59 = new JTextField("0", 10);

		// 设置内部布局
		J4.setLayout(null);
		J4.setOpaque(false);
		J51.setBounds(0, 20, 380, 40);
		J52.setBounds(0, 60, 380, 40);
		J53.setBounds(0, 100, 380, 40);
		J54.setBounds(0, 140, 380, 40);
		J55.setBounds(0, 180, 380, 40);
		J56.setBounds(0, 220, 380, 40);
		J57.setBounds(0, 260, 380, 40);
		J58.setBounds(0, 300, 380, 40);
		J59.setBounds(0, 340, 380, 40);
		J51.add(tank51);
		J52.add(tank52);
		J53.add(tank53);
		J54.add(tank54);
		J55.add(tank55);
		J56.add(tank56);
		J57.add(tank57);
		J58.add(tank58);
		J59.add(tank59);
		J51.add(oneTxt51);
		J52.add(oneTxt52);
		J53.add(oneTxt53);
		J54.add(oneTxt54);
		J55.add(oneTxt55);
		J56.add(oneTxt56);
		J57.add(oneTxt57);
		J58.add(oneTxt58);
		J59.add(oneTxt59);
		J4.add(J51);
		J4.add(J52);
		J4.add(J53);
		J4.add(J54);
		J4.add(J55);
		J4.add(J56);
		J4.add(J57);
		J4.add(J58);
		J4.add(J59);
		right1.add(J4);

		J5.setBorder(new TitledBorder("单侧跨越架:"));
		J5.setBounds(0, 483, 390, 385);

		JLabel tank61 = new JLabel("与施工线路任一相邻杆塔的距离:");
		tank61.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt61 = new JTextField("0", 7);

		JLabel tank62 = new JLabel("               水平放线张力:");
		tank62.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt62 = new JTextField("0", 10);

		JLabel tank63 = new JLabel("施工线路的跨越档档距跨越:");
		tank63.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt63 = new JTextField("0", 10);

		JLabel tank64 = new JLabel("两端悬垂绝缘子串或滑车挂具长度:");
		tank64.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt64 = new JTextField("0", 6);

		JLabel tank65 = new JLabel("     导线、地线的单位长度重量:");
		tank65.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt65 = new JTextField("0", 10);

		JLabel tank66 = new JLabel("导线或地线安装的单位长度风荷重:");
		tank66.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt66 = new JTextField("0", 7);

		JLabel tank67 = new JLabel("导线或地线直径:");
		tank67.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt67 = new JTextField("0", 10);

		JLabel tank68 = new JLabel("风载体型系数:");
		tank68.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt68 = new JTextField("0", 10);
		JLabel tankK13 = new JLabel();
		J69.setLayout(null);
		tankK13.setBounds(0, 0, 390, 30);
		oneTxt68.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK13.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK13.setText("当d≤17mm时,K＝1.2;当d＞17mm时,K＝1.1");
				tankK13.setForeground(Color.RED);
			}
		});

		// 设置内部布局
		J5.setLayout(null);
		J5.setOpaque(false);
		J61.setBounds(0, 20, 380, 40);
		J62.setBounds(0, 60, 380, 40);
		J63.setBounds(0, 100, 380, 40);
		J64.setBounds(0, 140, 380, 40);
		J65.setBounds(0, 180, 380, 40);
		J66.setBounds(0, 220, 380, 40);
		J67.setBounds(0, 260, 380, 40);
		J68.setBounds(0, 300, 380, 40);
		J69.setBounds(0, 340, 380, 40);
		J61.add(tank61);
		J62.add(tank62);
		J63.add(tank63);
		J64.add(tank64);
		J65.add(tank65);
		J66.add(tank66);
		J67.add(tank67);
		J68.add(tank68);
		J69.add(tankK13);
		J61.add(oneTxt61);
		J62.add(oneTxt62);
		J63.add(oneTxt63);
		J64.add(oneTxt64);
		J65.add(oneTxt65);
		J66.add(oneTxt66);
		J67.add(oneTxt67);
		J68.add(oneTxt68);
		J5.add(J61);
		J5.add(J62);
		J5.add(J63);
		J5.add(J64);
		J5.add(J65);
		J5.add(J66);
		J5.add(J67);
		J5.add(J68);
		J5.add(J69);
		right1.add(J5);
	}

	private void initleft(JPanel left) {
		// 示意图选择
		picture1 = new JLabel();
		JPanel picturecheck = new JPanel();

		// 垂直载荷和均匀载荷
		JPanel J1 = new JPanel();

		// 事故和最小安全距离
		JPanel J2 = new JPanel();

		// 小块J2
		JPanel J11 = new JPanel();
		JPanel J12 = new JPanel();
		JPanel J13 = new JPanel();
		JPanel J14 = new JPanel();
		JPanel J15 = new JPanel();
		JPanel J16 = new JPanel();
		JPanel J17 = new JPanel();
		JPanel J18 = new JPanel();
		JPanel J19 = new JPanel();
		JPanel J20 = new JPanel();
		JPanel J21 = new JPanel();

		// 示意图选择参数
		JRadioButton checkBox01 = new JRadioButton("事故情况之一");
		JRadioButton checkBox02 = new JRadioButton("事故情况之二");

		// 设置空布局，即绝对布局
		left.setOpaque(false);
		left.setLayout(null);
		//
		// button1.setBounds(0, 500, 100, 40);
		// button1.setActionCommand("弹窗测试");
		// button1.addActionListener(this);
		// left.add(button1);

		// 示意图
		picture.setBorder(new TitledBorder("示意图："));
		picture.setBounds(0, 0, 390, 280);
		image.setImage(image.getImage().getScaledInstance(375, 245, Image.SCALE_DEFAULT));
		picture1.setIcon(image);
		picture.add(picture1);
		left.add(picture);

		// 示意图选择
		picturecheck.setBorder(new TitledBorder("选择示意图："));
		picturecheck.setBounds(0, 285, 390, 80);
		picturecheck.add(checkBox01);
		picturecheck.add(checkBox02);
		listenerGe2 lis1 = new listenerGe2();
		lis1.listenerge2(checkBox01, checkBox02);
		left.add(picturecheck);

		// 设置监听
		checkBox01.setActionCommand("事故情况之一");
		checkBox02.setActionCommand("事故情况之二");
		checkBox01.addActionListener(this);
		checkBox02.addActionListener(this);

		// 垂直载荷和均匀载荷
		J1.setBorder(new TitledBorder("垂直载荷和均匀载荷:"));
		J1.setBounds(0, 370, 390, 465);

		JLabel tank1 = new JLabel("       导线线密度，N/m:");
		tank1.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt1 = new JTextField("0", 10);

		JLabel tank2 = new JLabel("        风载体型系数:");
		comboBox.addItemListener(this);

		// 设置默认选中的条目
		comboBox.setSelectedIndex(1);

		JLabel tank3 = new JLabel("            子导数根数:");
		tank3.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt3 = new JTextField("0", 10);

		JLabel tank7 = new JLabel("          风荷调整系数:");
		tank7.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt7 = new JTextField("0", 10);
		JLabel tankK1 = new JLabel();
		J18.setLayout(null);
		tankK1.setBounds(100, 0, 400, 30);
		oneTxt7.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK1.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK1.setText("高度30m以下取1.1，30~50取1.5;");
				tankK1.setForeground(Color.RED);
			}
		});

		JLabel tank4 = new JLabel("      路线设计最大风速:");
		tank4.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt4 = new JTextField("0", 10);
		JLabel tankK2 = new JLabel();
		J19.setLayout(null);
		tankK2.setBounds(200, 0, 400, 30);
		oneTxt4.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK2.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK2.setText("取值一般为25~30");
				tankK2.setForeground(Color.RED);
			}
		});

		JLabel tank5 = new JLabel("  架面1m范围的投影面积:");
		tank5.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt5 = new JTextField("0", 10);
		JLabel tankK3 = new JLabel();
		J20.setLayout(null);
		tankK3.setBounds(20, 0, 400, 30);
		oneTxt5.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK3.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK3.setText("一般可取架面架面轮廓面积的30%到40%，");
				tankK3.setForeground(Color.RED);
			}
		});

		JLabel tank6 = new JLabel("              冲击系数:");
		tank6.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt6 = new JTextField("0", 10);
		JLabel tankK4 = new JLabel();
		J21.setLayout(null);
		tankK4.setBounds(200, 0, 400, 30);
		oneTxt6.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK4.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK4.setText("一般取值为1.3~ 1.5");
				tankK4.setForeground(Color.RED);
			}
		});

		// 设置内部布局
		J1.setLayout(null);
		J1.setOpaque(false);
		J11.setBounds(0, 20, 380, 40);
		J12.setBounds(0, 60, 380, 40);
		J13.setBounds(0, 100, 380, 40);
		J17.setBounds(0, 140, 380, 40);
		J18.setBounds(0, 180, 380, 40);
		J14.setBounds(0, 220, 380, 40);
		J19.setBounds(0, 260, 380, 40);
		J15.setBounds(0, 300, 380, 40);
		J20.setBounds(0, 340, 380, 40);
		J16.setBounds(0, 380, 380, 40);
		J21.setBounds(0, 420, 380, 40);
		J11.add(tank1);
		J12.add(tank2);
		J13.add(tank3);
		J14.add(tank4);
		J15.add(tank5);
		J16.add(tank6);
		J17.add(tank7);
		J18.add(tankK1);
		J19.add(tankK2);
		J20.add(tankK3);
		J21.add(tankK4);
		J11.add(oneTxt1);
		J12.add(comboBox);
		J13.add(oneTxt3);
		J14.add(oneTxt4);
		J15.add(oneTxt5);
		J16.add(oneTxt6);
		J17.add(oneTxt7);
		J1.add(J11);
		J1.add(J12);
		J1.add(J13);
		J1.add(J17);
		J1.add(J18);
		J1.add(J14);
		J1.add(J19);
		J1.add(J15);
		J1.add(J20);
		J1.add(J16);
		J1.add(J21);
		left.add(J1);
	}

	private void initmiddle(JPanel middle) {

		// 设置空布局，即绝对布局
		middle.setOpaque(false);
		middle.setLayout(null);

		// 事故和最小安全距离
		JPanel J2 = new JPanel();

		// 跨越架的安装
		JPanel J3 = new JPanel();

		// 小块J2
		JPanel J21 = new JPanel();
		JPanel J22 = new JPanel();
		JPanel J23 = new JPanel();
		JPanel J24 = new JPanel();

		// 小块J3
		JPanel J31 = new JPanel();
		JPanel J32 = new JPanel();
		JPanel J33 = new JPanel();
		JPanel J34 = new JPanel();
		JPanel J35 = new JPanel();
		JPanel J36 = new JPanel();
		JPanel J37 = new JPanel();
		JPanel J38 = new JPanel();
		JPanel J39 = new JPanel();
		JPanel J40 = new JPanel();
		JPanel J41 = new JPanel();
		JPanel J42 = new JPanel();
		JPanel J43 = new JPanel();
		JPanel J44 = new JPanel();
		JPanel J45 = new JPanel();

		// 事故，架顶宽度，最小安全距离
		J2.setBorder(new TitledBorder("事故,架顶宽度,最小安全距离:"));
		J2.setBounds(0, 0, 405, 230);

		JLabel tank21 = new JLabel("摩擦系数:");
		// 设置默认选中的条目
		comboBox1.setSelectedIndex(1);
		comboBox1.addItemListener(this);

		JLabel tank22 = new JLabel("架顶宽度规范:");
		model.setActionCommand("显示规范");
		model.addActionListener(this);

		JLabel tank23 = new JLabel("与被跨越物的最小安全距离:");
		table1.setActionCommand("显示表一");
		table1.addActionListener(this);

		JLabel tank24 = new JLabel("与带电梯最小安全距离:");
		table2.setActionCommand("显示表二");
		table2.addActionListener(this);

		J21.add(tank21);
		J22.add(tank22);
		J23.add(tank23);
		J24.add(tank24);
		J21.add(comboBox1);
		J22.add(model);
		J23.add(table1);
		J24.add(table2);
		J2.add(J21);
		J2.add(J22);
		J2.add(J23);
		J2.add(J24);
		middle.add(J2);

		// 跨越架的安装
		J3.setBorder(new TitledBorder("木竹跨越架的安装:"));
		J3.setBounds(0, 235, 405, 640);

		JLabel tank31 = new JLabel("  被跨电力线最高点的对地距离:");
		tank31.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt31 = new JTextField("0", 10);

		JLabel tank32 = new JLabel("    与封顶架面的最小垂直距离:");
		tank32.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt32 = new JTextField("0", 10);
		JLabel tankK5 = new JLabel();
		J33.setLayout(null);
		tankK5.setBounds(50, 0, 380, 30);
		oneTxt32.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK5.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK5.setText("(不同等级电压的电力线)详情见表二");
				tankK5.setForeground(Color.RED);
			}
		});

		JLabel tank34 = new JLabel("         跨越架封顶网的弧垂:");
		tank34.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt34 = new JTextField("0", 10);
		JLabel tankK6 = new JLabel();
		JLabel tankK7 = new JLabel();
		J35.setLayout(null);
		tankK6.setBounds(90, 0, 380, 30);
		tankK7.setBounds(90, 30, 380, 30);
		oneTxt34.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK6.setText("");
				tankK7.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK6.setText("封顶用竹、木杆时,f = 0;");
				tankK7.setText("对于尼龙网,f = 1-2m(视跨距选择)");
				tankK6.setForeground(Color.RED);
				tankK7.setForeground(Color.RED);
			}
		});

		JLabel tank37 = new JLabel("         施工线路的线间距离:");
		tank37.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt37 = new JTextField("0", 10);
		JLabel tankK8 = new JLabel();
		JLabel tankK9 = new JLabel();
		J38.setLayout(null);
		tankK8.setBounds(90, 0, 380, 30);
		tankK9.setBounds(90, 30, 380, 30);
		oneTxt37.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK8.setText("");
				tankK9.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK8.setText("对于单线,1取0.5m;对于双线,为线间");
				tankK9.setText("距离;对于三相线,为两边线的距离;");
				tankK8.setForeground(Color.RED);
				tankK9.setForeground(Color.RED);
			}
		});
		JLabel tank39 = new JLabel("跨越架顶面超出施工线路的宽度:");
		tank39.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt39 = new JTextField("0", 10);
		JLabel tankK10 = new JLabel();
		JLabel tankK11 = new JLabel();
		J40.setLayout(null);
		tankK10.setBounds(100, 0, 380, 30);
		tankK11.setBounds(100, 30, 380, 30);
		oneTxt39.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK10.setText("");
				tankK11.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK10.setText("一般跨越架,为1.5m;对于");
				tankK11.setText("不停电架线跨越架,为2.0m");
				tankK10.setForeground(Color.RED);
				tankK11.setForeground(Color.RED);
			}
		});
		JLabel tank41 = new JLabel("施工线路与别跨电力线的交叉角:");
		tank41.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt41 = new JTextField("0", 10);

		JLabel tank42 = new JLabel("     跨越架顶面的最小跨距:");
		tank42.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt42 = new JTextField("0", 10);

		JLabel tank43 = new JLabel("被跨电力线两边线间的水平距离:");
		tank43.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt43 = new JTextField("0", 10);

		JLabel tank44 = new JLabel("金属架至被跨电力线最小水平距离:");
		tank44.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt44 = new JTextField("0", 8);
		JLabel tankK12 = new JLabel();
		J45.setLayout(null);
		tankK12.setBounds(20, 0, 380, 30);
		oneTxt44.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				tankK12.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				tankK12.setText("(跨越架内侧主杆或主柱外缘)详情见表二");
				tankK12.setForeground(Color.RED);
			}
		});
		// 设置内部布局
		J3.setLayout(null);
		J3.setOpaque(false);
		J31.setBounds(4, 20, 380, 40);
		J32.setBounds(4, 60, 380, 40);
		J33.setBounds(4, 100, 380, 40);
		J34.setBounds(4, 140, 380, 40);
		J35.setBounds(4, 180, 380, 60);
		J37.setBounds(4, 240, 380, 40);
		J38.setBounds(4, 280, 380, 60);
		J39.setBounds(4, 340, 380, 40);
		J40.setBounds(4, 380, 380, 60);
		J41.setBounds(4, 440, 380, 40);
		J42.setBounds(4, 480, 380, 40);
		J43.setBounds(4, 520, 380, 40);
		J44.setBounds(4, 560, 380, 40);
		J45.setBounds(4, 600, 380, 32);
		J31.add(tank31);
		J32.add(tank32);
		J33.add(tankK5);
		J34.add(tank34);
		J35.add(tankK6);
		J35.add(tankK7);
		J37.add(tank37);
		J38.add(tankK8);
		J38.add(tankK9);
		J39.add(tank39);
		J40.add(tankK10);
		J40.add(tankK11);
		J41.add(tank41);
		J42.add(tank42);
		J43.add(tank43);
		J44.add(tank44);
		J45.add(tankK12);
		J31.add(oneTxt31);
		J32.add(oneTxt32);
		J34.add(oneTxt34);
		J37.add(oneTxt37);
		J39.add(oneTxt39);
		J41.add(oneTxt41);
		J42.add(oneTxt42);
		J43.add(oneTxt43);
		J44.add(oneTxt44);
		J3.add(J31);
		J3.add(J32);
		J3.add(J33);
		J3.add(J34);
		J3.add(J35);
		J3.add(J37);
		J3.add(J38);
		J3.add(J39);
		J3.add(J40);
		J3.add(J41);
		J3.add(J42);
		J3.add(J43);
		J3.add(J44);
		J3.add(J45);
		middle.add(J3);
	}

	private void initright(JPanel right) {

		JPanel tankcheck1 = new JPanel();

		JPanel result = new JPanel();

		JPanel jichu = new JPanel();

		JPanel fengp = new JPanel();
		// 设置空布局，即绝对布局
		right.setOpaque(false);
		right.setLayout(null);

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

		// 输出结果
		result.setBorder(new TitledBorder("计算结果:"));
		result.setBounds(0, 0, 410, 787);

		// 设置内部布局
		result.setLayout(null);
		result.setOpaque(false);

		// 基本结果
		TitledBorder T1 = new TitledBorder("基本结果:");
		jichu.setBorder(T1);
		jichu.setBounds(5, 25, 395, 272);

		JLabel tank61 = new JLabel("跨越架的垂直载荷:");
		tank61.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt61 = new JTextField("0", 10);

		JLabel tank62 = new JLabel("架面风压的均布载荷:");
		tank62.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt62 = new JTextField("0", 10);

		JLabel tank63 = new JLabel("滑道绳水平张力,每条绳最大张力值取2500N");
		JLabel tank64 = new JLabel("跨越架的水平荷载:");
		tank64.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt64 = new JTextField("0", 10);

		JLabel tank65 = new JLabel("跨越架的最小高度:");
		tank65.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt65 = new JTextField("0", 10);

		JLabel tank66 = new JLabel("跨越架的最小宽度:");
		tank66.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt66 = new JTextField("0", 10);
		// 设置内部布局
		jichu.setLayout(null);
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
		J64.add(oneTxt64);
		J65.add(oneTxt65);
		J66.add(oneTxt66);
		jichu.add(J61);
		jichu.add(J62);
		jichu.add(J63);
		jichu.add(J64);
		jichu.add(J65);
		jichu.add(J66);
		result.add(jichu);

		// 安装与风偏计算
		TitledBorder T2 = new TitledBorder("安装与风偏计算:");
		fengp.setBorder(T2);
		fengp.setBounds(7, 300, 395, 155);

		JLabel tank71 = new JLabel("       跨越架顶面的最小跨距:");
		tank71.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt71 = new JTextField("0", 10);

		JLabel tank72 = new JLabel("架外侧至运行电力线的水平距离为:");
		tank72.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt72 = new JTextField("0", 10);

		JLabel tank74 = new JLabel("                      风偏距离:");
		tank74.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt74 = new JTextField("0", 10);

		JLabel tank75 = new JLabel("两幅跨越架之间的跨距");
		tank75.setHorizontalAlignment(JTextField.RIGHT);
		JTextField oneTxt75 = new JTextField("0", 10);
		// 设置内部布局
		fengp.setLayout(null);
		J71.setBounds(0, 20, 390, 38);
		J72.setBounds(0, 58, 390, 38);
		J74.setBounds(0, 96, 390, 38);
		J75.setBounds(0, 137, 390, 38);
		J71.add(tank71);
		J72.add(tank72);
		J74.add(tank74);
		J75.add(tank75);
		J71.add(oneTxt71);
		J72.add(oneTxt72);
		J73.add(table1);
		J74.add(oneTxt74);
		J75.add(oneTxt75);
		fengp.add(J71);
		fengp.add(J72);
		fengp.add(J74);
		fengp.add(J75);
		result.add(fengp);

		// 添加进右边
		right.add(result);

	}

	private void initend(JPanel end) {
		// 设置空布局，即绝对布局
		end.setOpaque(false);
		end.setLayout(null);

		JButton button01 = new JButton("保存");
		JButton button02 = new JButton("打印");
		JButton button03 = new JButton("计算");

		button01.setBounds(200, 5, 150, 40);
		button02.setBounds(700, 5, 150, 40);
		button03.setBounds(1300, 5, 150, 40);
		end.add(button01);
		end.add(button02);
		end.add(button03);

	}

	// 复选框点击监听事件
	@Override
	public void actionPerformed(ActionEvent e) {

		// 对比
		if (e.getActionCommand().equals("事故情况之一")) {
			picture1.setVisible(false);
			ImageIcon IC = new ImageIcon(this.getClass().getResource("1.png"));
			picture1 = new JLabel(IC);
			IC.setImage(IC.getImage().getScaledInstance(375, 245, Image.SCALE_DEFAULT));
			picture1.setIcon(IC);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了事故情况之一" + "m=" + i);

		}
		if (e.getActionCommand().equals("事故情况之二")) {
			picture1.setVisible(false);
			ImageIcon icon = new ImageIcon(this.getClass().getResource("2.png"));
			picture1 = new JLabel(icon);
			icon.setImage(icon.getImage().getScaledInstance(375, 245, Image.SCALE_DEFAULT));
			picture1.setIcon(icon);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了事故情况之二" + "n=" + i);
		}

		if (e.getActionCommand().equals("显示表一")) {
			String name = "表1";
			pictureWindow1 window1 = new pictureWindow1(name);
		}
		if (e.getActionCommand().equals("显示表二")) {
			String name1 = "表2";
			pictureWindow2 window2 = new pictureWindow2(name1);
		}
		if (e.getActionCommand().equals("显示规范")) {
			String name2 = "宽度规范";
			pictureWindow3 window3 = new pictureWindow3(name2);
		}
	}

	// 添加条目选中状态改变的监听器
	@Override
	public void itemStateChanged(ItemEvent e) {
		// 只处理选中的状态
		if (e.getStateChange() == ItemEvent.SELECTED) {
			System.out.println("选中: " + comboBox.getSelectedIndex() + " = " + comboBox.getSelectedItem());
		}
	}
	
	
	
}


