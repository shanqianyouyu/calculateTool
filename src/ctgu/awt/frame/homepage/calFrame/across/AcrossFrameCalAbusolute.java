package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLClientInfoException;
import java.text.DecimalFormat;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.xml.transform.Result;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import ctgu.Entity.AcrossCal;
import ctgu.Entity.Across.AcrossEnity;
import ctgu.Entity.Square.SquareEnity;
import ctgu.Entity.boltCal.HighStrength;
import ctgu.awt.controller.XMLData;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.Tool;

public class AcrossFrameCalAbusolute extends FatherFrame implements ActionListener, ItemListener {

	public static void main(String[] args) {
		AcrossFrameCalAbusolute abusolute = new AcrossFrameCalAbusolute(new AcrossEnity());
	}

	private static final long serialVersionUID = 1L;
	private int i = 0;

	// 定义弹窗
	private JButton model = new JButton("显示规范");
	private JButton table1 = new JButton("显示表一");
	private JButton table2 = new JButton("显示表二");
	
	//打印
	private String outPutTxt = "";
	
	//保存
	private AcrossEnity acrossEnity = null;

	// 定义初始图片
	private JLabel picture1 = null;
	JPanel picture = new JPanel();
	private static String Name = "";

	// 下拉框
	private String[] listData = new String[] { "圆形杆件", "平面杆件" };
	private JComboBox<String> comboBox = new JComboBox<String>(listData);
	private String[] listData1 = new String[] { "滚动横梁", "非滚动非金属", "非滚动金属" };
	private JComboBox<String> comboBox1 = new JComboBox<String>(listData1);

	// 没输入名字
	public AcrossFrameCalAbusolute() {
		// String name = "请输入名字!";
	}

	public AcrossFrameCalAbusolute(AcrossEnity AE) {
		acrossEnity = AE;
		setTitle("螺栓计算");
		System.out.println("初始化成功...");
		initSquare(AE);
		setResizable(false);
		setVisible(true);
	}

	private void initSquare(AcrossEnity AE) {
		this.setSize(1630, 980);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 关闭等功能
		this.setLayout(null);
		this.setLocationRelativeTo(null);// 居中

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

	private int B1;
	private int B2;

	
	// 获取下拉列表的值
	private String list1;
	private String list2;
	
	
	// 输入参数
	JTextField oneTxt51 = new JTextField("0", 7);
	private double two51;
	JTextField oneTxt52 = new JTextField("0", 5);
	private double two52;
	JTextField oneTxt53 = new JTextField("0", 5);
	private double two53;
	JTextField oneTxt54 = new JTextField("0", 10);
	private double two54;
	JTextField oneTxt55 = new JTextField("0", 10);
	private double two55;
	JTextField oneTxt56 = new JTextField("0", 7);
	private double two56;
	JTextField oneTxt57 = new JTextField("0", 10);
	private double two57;
	JTextField oneTxt58 = new JTextField("0", 10);
	private double two58;
	JTextField oneTxt59 = new JTextField("0", 10);
	private double two59;

	JTextField oneTxt81 = new JTextField("0", 7);
	private double two81;
	JTextField oneTxt82 = new JTextField("0", 10);
	private double two82;
	JTextField oneTxt83 = new JTextField("0", 10);
	private double two83;
	JTextField oneTxt84 = new JTextField("0", 6);
	private double two84;
	JTextField oneTxt85 = new JTextField("0", 10);
	private double two85;
	JTextField oneTxt86 = new JTextField("0", 7);
	private double two86;
	JTextField oneTxt87 = new JTextField("0", 10);
	private double two87;
	JTextField oneTxt88 = new JTextField("0", 10);
	private double two88;

	JTextField oneTxt1 = new JTextField("0", 10);
	private double two1;
	JTextField oneTxt3 = new JTextField("0", 10);
	private double two3;
	private double two2;
	JTextField oneTxt7 = new JTextField("0", 10);
	private double two7;
	JTextField oneTxt4 = new JTextField("0", 10);
	private double two4;
	JTextField oneTxt5 = new JTextField("0", 10);
	private double two5;
	JTextField oneTxt6 = new JTextField("0", 10);
	private double two6;

	JTextField oneTxt21 = new JTextField("0", 10);
	private double two21;

	JTextField oneTxt31 = new JTextField("0", 10);
	private double two31;
	JTextField oneTxt32 = new JTextField("0", 10);
	private double two32;
	JTextField oneTxt34 = new JTextField("0", 10);
	private double two34;
	JTextField oneTxt37 = new JTextField("0", 10);
	private double two37;
	JTextField oneTxt39 = new JTextField("0", 10);
	private double two39;

	JTextField oneTxt41 = new JTextField("0", 10);
	private double two41;
	JTextField oneTxt42 = new JTextField("0", 10);
	private double two42;
	JTextField oneTxt43 = new JTextField("0", 10);
	private double two43;
	JTextField oneTxt44 = new JTextField("0", 8);
	private double two44;

	JTextField oneTxt61 = new JTextField("0", 10);
	private String two61;
	JTextField oneTxt62 = new JTextField("0", 10);
	private String two62;
	JTextField oneTxt64 = new JTextField("0", 10);
	private String two64;
	JTextField oneTxt65 = new JTextField("0", 10);
	private String two65;
	JTextField oneTxt66 = new JTextField("0", 10);
	private String two66;

	JTextField oneTxt71 = new JTextField("0", 10);
	private String two71;
	JTextField oneTxt72 = new JTextField("0", 10);
	private String two72;
	JTextField oneTxt74 = new JTextField("0", 10);
	private String two74;
	JTextField oneTxt75 = new JTextField("0", 10);
	private String two75;

	// 输出参数
	private double WLS;
	private double ULWP;
	private double HLS;
	private double MHC;
	private double MWS;

	private double MSS;
	private double Rpl;
	private double TRpl;
	private double WDD;
	
	
	//中间变量
	private double L1;
	private double L2;
	private double L3;

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
		B1 = lis1.listenergek2(checkboxk1, checkboxk2);
		right1.add(framecheck);

		J4.setBorder(new TitledBorder("单侧跨越架:"));
		J4.setBounds(0, 93, 390, 385);

		JLabel tank51 = new JLabel("上拉线挂点至运行电力线的垂直距离:");
		tank51.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt51.setText(acrossEnity.OPL == null ? "0" : String.valueOf(acrossEnity.OPL));

		JLabel tank52 = new JLabel("上拉线与运行电力线的最小安全距离:");
		tank52.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt52.setText(acrossEnity.MSD == null ? "0" : String.valueOf(acrossEnity.MSD));

		JLabel tank53 = new JLabel("上层拉线挂点至地面的高度:");
		tank53.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt53.setText(acrossEnity.HHP == null ? "0" : String.valueOf(acrossEnity.HHP));

		JLabel tank54 = new JLabel("运行电力线的下导线至地面高度:");
		tank54.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt54.setText(acrossEnity.RPL1 == null ? "0" : String.valueOf(acrossEnity.RPL1));

		JLabel tank55 = new JLabel("             拉线对地面夹角:");
		tank55.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt55.setText(acrossEnity.ADP == null ? "0" : String.valueOf(acrossEnity.ADP));

		JLabel tank56 = new JLabel("拉线与跨越架横担轴线间的水平夹角:");
		tank56.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt56.setText(acrossEnity.ACB == null ? "0" : String.valueOf(acrossEnity.ACB));

		JLabel tank57 = new JLabel("最小安全距离要求的跨距:");
		tank57.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt57.setText(acrossEnity.RS == null ? "0" : String.valueOf(acrossEnity.RS));

		JLabel tank58 = new JLabel("在建线路的交叉角引起的跨距:");
		tank58.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt58.setText(acrossEnity.SC == null ? "0" : String.valueOf(acrossEnity.SC));

		JLabel tank59 = new JLabel(" 拉线位置引起的跨距:");
		tank59.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt59.setText(acrossEnity.SCD == null ? "0" : String.valueOf(acrossEnity.SCD));

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

		JLabel tank81 = new JLabel("与施工线路任一相邻杆塔的距离:");
		tank81.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt81.setText(acrossEnity.DCL == null ? "0" : String.valueOf(acrossEnity.DCL));

		JLabel tank82 = new JLabel("               水平放线张力:");
		tank82.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt82.setText(acrossEnity.HST == null ? "0" : String.valueOf(acrossEnity.HST));

		JLabel tank83 = new JLabel("施工线路的跨越档档距跨越:");
		tank83.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt83.setText(acrossEnity.SSC == null ? "0" : String.valueOf(acrossEnity.SSC));

		JLabel tank84 = new JLabel("两端悬垂绝缘子串或滑车挂具长度:");
		tank84.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt84.setText(acrossEnity.LOPT == null ? "0" : String.valueOf(acrossEnity.LOPT));

		JLabel tank85 = new JLabel("     导线、地线的单位长度重量:");
		tank85.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt85.setText(acrossEnity.ULW == null ? "0" : String.valueOf(acrossEnity.ULW));

		JLabel tank86 = new JLabel("导线或地线安装的单位长度风荷重:");
		tank86.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt86.setText(acrossEnity.ULWL == null ? "0" : String.valueOf(acrossEnity.ULWL));

		JLabel tank87 = new JLabel("导线或地线直径:");
		tank87.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt87.setText(acrossEnity.DWG == null ? "0" : String.valueOf(acrossEnity.DWG));

		JLabel tank88 = new JLabel("风载体型系数:");
		tank88.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt88.setText(acrossEnity.WCTC == null ? "0" : String.valueOf(acrossEnity.WCTC));
		JLabel tankK13 = new JLabel();
		J69.setLayout(null);
		tankK13.setBounds(0, 0, 390, 30);
		oneTxt88.addFocusListener(new FocusListener() {
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
		J61.add(tank81);
		J62.add(tank82);
		J63.add(tank83);
		J64.add(tank84);
		J65.add(tank85);
		J66.add(tank86);
		J67.add(tank87);
		J68.add(tank88);
		J69.add(tankK13);
		J61.add(oneTxt81);
		J62.add(oneTxt82);
		J63.add(oneTxt83);
		J64.add(oneTxt84);
		J65.add(oneTxt85);
		J66.add(oneTxt86);
		J67.add(oneTxt87);
		J68.add(oneTxt88);
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
//		picture1 = new JLabel();
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
		picture.setBounds(0, 0, 390, 320);
		picture.setLayout(null);
//		image.setImage(image.getImage().getScaledInstance(-1,350, Image.SCALE_DEFAULT));
		Icon icon1 = new ImageIcon(this.getClass().getResource("1.png"));
//		ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(360, 290, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
	    picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(10, 15, 380, 300);
		picture.add(picture1);
		left.add(picture);

		// 示意图选择
		picturecheck.setBorder(new TitledBorder("选择示意图："));
		picturecheck.setBounds(0, 325, 390, 80);
		picturecheck.add(checkBox01);
		picturecheck.add(checkBox02);
		listenerGe2 lis1 = new listenerGe2();
		B2 = lis1.listenerge2(checkBox01, checkBox02);
		left.add(picturecheck);

		// 设置监听
		checkBox01.setActionCommand("事故情况之一");
		checkBox02.setActionCommand("事故情况之二");
		checkBox01.addActionListener(this);
		checkBox02.addActionListener(this);

		// 垂直载荷和均匀载荷
		J1.setBorder(new TitledBorder("垂直载荷和均匀载荷:"));
		J1.setBounds(0, 410, 390, 465);

		JLabel tank1 = new JLabel("       导线线密度，N/m:");
		tank1.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt1.setText(acrossEnity.WLD == null ? "0" : String.valueOf(acrossEnity.WLD));

		JLabel tank2 = new JLabel("        风载体型系数:");
		comboBox.addItemListener(this);

		// 设置默认选中的条目
		if(acrossEnity.WCSC == null || acrossEnity.WCSC == 1.3){
			comboBox.setSelectedIndex(1);
		}		
		else{
			comboBox.setSelectedIndex(0);
		}

		list1 = comboBox.getSelectedItem().toString();

		JLabel tank3 = new JLabel("            子导线根数:");
		tank3.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt3.setText(acrossEnity.NOSR == null ? "0" : String.valueOf(acrossEnity.NOSR));

		JLabel tank7 = new JLabel("          风荷调整系数:");
		tank7.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt7.setText(acrossEnity.WLAC == null ? "0" : String.valueOf(acrossEnity.WLAC));

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
		oneTxt4.setText(acrossEnity.WS == null ? "0" : String.valueOf(acrossEnity.WS));
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
		oneTxt5.setText(acrossEnity.PA == null ? "0" : String.valueOf(acrossEnity.PA));
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
		oneTxt6.setText(acrossEnity.IC == null ? "0" : String.valueOf(acrossEnity.IC));
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
		// // 设置默认选中的条目
		// comboBox1.setSelectedIndex(1);
		// comboBox1.addItemListener(this);
		tank21.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt21.setText(acrossEnity.FC == null ? "0" : String.valueOf(acrossEnity.FC));

		// list2 = comboBox1.getSelectedItem().toString();

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
		J21.add(oneTxt21);
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
		oneTxt31.setText(acrossEnity.HP == null ? "0" : String.valueOf(acrossEnity.HP));

		JLabel tank32 = new JLabel("    与封顶架面的最小垂直距离:");
		tank32.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt32.setText(acrossEnity.MVD == null ? "0" : String.valueOf(acrossEnity.MVD));
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
		oneTxt34.setText(acrossEnity.VA == null ? "0" : String.valueOf(acrossEnity.VA));
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
		oneTxt37.setText(acrossEnity.LS == null ? "0" : String.valueOf(acrossEnity.LS));
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
		oneTxt39.setText(acrossEnity.CW == null ? "0" : String.valueOf(acrossEnity.CW));
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
		oneTxt41.setText(acrossEnity.IWP == null ? "0" : String.valueOf(acrossEnity.IWP));

		JLabel tank42 = new JLabel("     跨越架顶面的最小跨距:");
		tank42.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt42.setText(acrossEnity.Ms == null ? "0" : String.valueOf(acrossEnity.Ms));

		JLabel tank43 = new JLabel("被跨电力线两边线间的水平距离:");
		tank43.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt43.setText(acrossEnity.Hd == null ? "0" : String.valueOf(acrossEnity.Hd));

		JLabel tank44 = new JLabel("金属架至被跨电力线最小水平距离:");
		tank44.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt44.setText(acrossEnity.Mhd == null ? "0" : String.valueOf(acrossEnity.Mhd));
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
		oneTxt61.setText(acrossEnity.WLS == null ? "0" : String.valueOf(acrossEnity.WLS));

		JLabel tank62 = new JLabel("架面风压的均布载荷:");
		tank62.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt62.setText(acrossEnity.ULWP == null ? "0" : String.valueOf(acrossEnity.ULWP));

		JLabel tank63 = new JLabel("滑道绳水平张力,每条绳最大张力值取2500N");
		JLabel tank64 = new JLabel("跨越架的水平荷载:");
		tank64.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt64.setText(acrossEnity.HLS == null ? "0" : String.valueOf(acrossEnity.HLS));

		JLabel tank65 = new JLabel("跨越架的最小高度:");
		tank65.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt65.setText(acrossEnity.MHC == null ? "0" : String.valueOf(acrossEnity.MHC));

		JLabel tank66 = new JLabel("跨越架的最小宽度:");
		tank66.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt66.setText(acrossEnity.MWS == null ? "0" : String.valueOf(acrossEnity.MWS));
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
		fengp.setBounds(7, 300, 395, 185);

		JLabel tank71 = new JLabel("       跨越架顶面的最小跨距:");
		tank71.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt71.setText(acrossEnity.MSS == null ? "0" : String.valueOf(acrossEnity.MSS));

		JLabel tank72 = new JLabel("架外侧至运行电力线的水平距离为:");
		tank72.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt72.setText(acrossEnity.Rpl == null ? "0" : String.valueOf(acrossEnity.Rpl));

		JLabel tank74 = new JLabel("                      风偏距离:");
		tank74.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt74.setText(acrossEnity.TRpl == null ? "0" : String.valueOf(acrossEnity.TRpl));

		JLabel tank75 = new JLabel("两幅跨越架之间的跨距");
		tank75.setHorizontalAlignment(JTextField.RIGHT);
		oneTxt75.setText(acrossEnity.WDD == null ? "0" : String.valueOf(acrossEnity.WDD));
		
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

	// 复选框点击监听事件
	@Override
	public void actionPerformed(ActionEvent e) {

		// 对比
		if (e.getActionCommand().equals("事故情况之一")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon1 = new ImageIcon(this.getClass().getResource("1.png"));
//			ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon1).getImage();
			image = image.getScaledInstance(360, 290, Image.SCALE_DEFAULT);
			((ImageIcon) icon1).setImage(image);
		    picture1 = new JLabel(icon1, JLabel.CENTER);
			picture1.setBounds(10, 15, 380, 300);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了事故情况之一" + "m=" + i);

		}
		if (e.getActionCommand().equals("事故情况之二")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2= new ImageIcon(this.getClass().getResource("2.png"));
//			ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(360, 290, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 15, 380, 300);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("您点击了事故情况之二" + "n=" + i);
		}

		if (e.getActionCommand().equals("显示表一")) {
			String name = "表1";
			TableWindows1 window1 = new TableWindows1();
			window1.setVisible(true);
		}
		if (e.getActionCommand().equals("显示表二")) {
			String name1 = "表2";
			TableWindows2 window2 = new TableWindows2();
			window2.setVisible(true);
		}
		if (e.getActionCommand().equals("显示规范")) {
			String name2 = "宽度规范";
			pictureWindow3 window3 = new pictureWindow3(name2);
		}

		if (e.getActionCommand().equals("计算")) {
			two51 = Double.parseDouble(oneTxt51.getText().trim());
			acrossEnity.OPL = two51;
			two52 = Double.parseDouble(oneTxt52.getText().trim());
			acrossEnity.MSD = two52;
			two53 = Double.parseDouble(oneTxt53.getText().trim());
			acrossEnity.HHP = two53;
			two54 = Double.parseDouble(oneTxt54.getText().trim());
			acrossEnity.RPL1 = two54;
			two55 = Double.parseDouble(oneTxt55.getText().trim());
			acrossEnity.ADP = two55;
			two56 = Double.parseDouble(oneTxt56.getText().trim());
			acrossEnity.ACB = two56;
			two57 = Double.parseDouble(oneTxt57.getText().trim());
			acrossEnity.RS = two57;
			two58 = Double.parseDouble(oneTxt58.getText().trim());
			acrossEnity.SC = two58;
			two59 = Double.parseDouble(oneTxt59.getText().trim());
			acrossEnity.SCD = two59;

			two81 = Double.parseDouble(oneTxt81.getText().trim());
			acrossEnity.DCL = two81;
			two82 = Double.parseDouble(oneTxt82.getText().trim());
			acrossEnity.HST = two82;
			two83 = Double.parseDouble(oneTxt83.getText().trim());
			acrossEnity.SSC = two83;
			two84 = Double.parseDouble(oneTxt84.getText().trim());
			acrossEnity.LOPT = two84;
			two85 = Double.parseDouble(oneTxt85.getText().trim());
			acrossEnity.ULW = two85;
			two86 = Double.parseDouble(oneTxt86.getText().trim());
			acrossEnity.ULWL = two86;
			two87 = Double.parseDouble(oneTxt87.getText().trim());
			acrossEnity.DWG = two87;
			two88 = Double.parseDouble(oneTxt88.getText().trim());
			acrossEnity.WCTC = two88;

			two1 = Double.parseDouble(oneTxt1.getText().trim());
			acrossEnity.WLD = two1;
			two3 = Double.parseDouble(oneTxt3.getText().trim());
			acrossEnity.NOSR = two3;
			two7 = Double.parseDouble(oneTxt7.getText().trim());
			acrossEnity.WLAC = two7;
			two4 = Double.parseDouble(oneTxt4.getText().trim());
			acrossEnity.WS = two4;
			two5 = Double.parseDouble(oneTxt5.getText().trim());
			acrossEnity.PA = two5;
			two6 = Double.parseDouble(oneTxt6.getText().trim());
			acrossEnity.IC = two6;

			two21 = Double.parseDouble(oneTxt21.getText().trim());
			acrossEnity.FC = two6;

			two31 = Double.parseDouble(oneTxt31.getText().trim());
			acrossEnity.HP = two31;
			two32 = Double.parseDouble(oneTxt32.getText().trim());
			acrossEnity.MVD = two32;
			two34 = Double.parseDouble(oneTxt34.getText().trim());
			acrossEnity.VA = two34;
			two37 = Double.parseDouble(oneTxt37.getText().trim());
			acrossEnity.LS = two37;
			two39 = Double.parseDouble(oneTxt39.getText().trim());
			acrossEnity.CW = two39;

			two41 = Double.parseDouble(oneTxt41.getText().trim());
			acrossEnity.IWP = two41;
			two42 = Double.parseDouble(oneTxt41.getText().trim());
			acrossEnity.Ms = two42;
			two43 = Double.parseDouble(oneTxt41.getText().trim());
			acrossEnity.Hd = two43;
			two44 = Double.parseDouble(oneTxt41.getText().trim());
			acrossEnity.Mhd = two44;

			
			acrossEnity.IWP = two41;

			if(list1.equals("圆形杆件")){
				two2 = 0.7;
			}
			else{
				two2 = 1.3;
			}
			
			AcrossCal sq2 = new AcrossCal(two1, two2, two3, two7, two4, two5, two6, two21, two31, two32, two34, two37,
					two39, two41, two42, two43, two44, two51, two52, two53, two54, two55, two56, two57, two58, two59,
					two81, two82, two83, two84, two85, two86, two87, two88);

			two61 = String.format("%.2f", WLS);
			oneTxt61.setText(two61);
			two62 = String.format("%.2f", ULWP);
			oneTxt62.setText(two62);
			two64 = String.format("%.2f", HLS);
			oneTxt64.setText(two64);
			two65 = String.format("%.2f", MHC);
			oneTxt65.setText(two65);
			two66 = String.format("%.2f", MWS);
			oneTxt66.setText(two66);
			two71 = String.format("%.2f", MSS);
			oneTxt71.setText(two71);
			two72 = String.format("%.2f", Rpl);
			oneTxt72.setText(two72);
			two74 = String.format("%.2f", TRpl);
			oneTxt74.setText(two74);
			two75 = String.format("%.2f", WDD);
			oneTxt75.setText(two75);
			// if (e.getActionCommand().equals("保存")) {
			//// XMLData data1 = new XMLData(one1, one2, one3, one4, one5, one6,
			// one21, one22, one23, one24, one25, one26, one27, one28, onek21,
			// onek22, one31, one32, one33, one34, one43, one42, one41, one44,
			// oneR21, oneR22, oneR23, oneC21, oneC22, oneC23, oneC31, oneC32,
			// oneC33, oneC34, oneC35, oneC36, oneC41, oneC42, oneC43, oneC44,
			// oneC45, As, BL, DBc, DBx, BBc, BBc, BBx, QG, FZ1, FQ1, FQ2, FL1,
			// DL1, FZ2, FC1, FZ3, FM1, FAM1, FAY, FAZ);
			// try {
			// Result result = data1.add();
			// if (result != null) {
			// JOptionPane.showMessageDialog(null, "保存成功",
			// "提示",JOptionPane.WARNING_MESSAGE);
			// }
			// } catch (Exception e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// }
			//
			// }
			
			
			
			WLS = Tool.forMat(sq2.setVerticalLoad());
			
			ULWP = 	Tool.forMat(sq2.setUniformLoad());
			
			HLS = Tool.forMat(sq2.setHorizontalLoad());
			
			MHC = Tool.forMat(sq2.setMinimumHeight());
			
			MWS = Tool.forMat(sq2.setMinimumWidth());
			
			L1 = Tool.forMat(sq2.setSpanCaused());
			
			L2 = Tool.forMat(sq2.setMinimumSafety());
			
			L3 = Tool.forMat(sq2.setCrossingAngle());
			
			MSS = Tool.forMat(sq2.setMinimumSpan());
			
			Rpl = Tool.forMat(sq2.setHorizontalDistance());
			
			TRpl = Tool.forMat(sq2.setTwoSpan());
			
			WDD = Tool.forMat(sq2.setWindDeviation());
			
			two86 = Tool.forMat(sq2.setWindLoad());
			
			
			
			oneTxt86.setText(String.format("%.2f", two86));
			
			oneTxt61.setText(String.format("%.2f", WLS));
			oneTxt62.setText(String.format("%.2f", ULWP));
			oneTxt64.setText(String.format("%.2f", HLS));
			oneTxt65.setText(String.format("%.2f", MHC));
			oneTxt66.setText(String.format("%.2f", MWS));
			
			oneTxt71.setText(String.format("%.2f", MSS));
			oneTxt72.setText(String.format("%.2f", Rpl));
			oneTxt74.setText(String.format("%.2f", TRpl));
			oneTxt75.setText(String.format("%.2f", WDD));
			
			
			acrossEnity.WLS = WLS;
			acrossEnity.ULWP = ULWP;
			acrossEnity.HLS = HLS;
			acrossEnity.MHC = MHC;
			acrossEnity.MWS = MWS;
			
			acrossEnity.MSS = MSS;
			acrossEnity.Rpl = Rpl;
			acrossEnity.TRpl= TRpl;
			acrossEnity.WDD = WDD;
			
		}
		
		if (e.getActionCommand().equals("保存")) {
				AnalysisXML.frameToXMl(acrossEnity);	
		}
			
			if (e.getActionCommand().equals("打印")) {
				String s1 = "  ";
				String s2 = "      ";
				outPutTxt = "跨越架计算: " + System.getProperty("line.separator") + s1;
				if (oneTxt61.getText() != null) {
					outPutTxt += "垂直载荷和均匀载荷: "+ System.getProperty("line.separator") + s2 + "导线密度:  " + oneTxt1.getText() + System.getProperty("line.separator") + s2 + "风载体型系数:  "
							+ String.valueOf(two2) + System.getProperty("line.separator") + s2 + "子导线根数:  " + oneTxt3.getText() + System.getProperty("line.separator") + s2
							+ "风荷调整系数:  " + oneTxt7.getText() + System.getProperty("line.separator") + s2 + "路线设计最大风速: " + oneTxt4.getText() + System.getProperty("line.separator")
							+ s2 + "架面1m范围内的投影面积: " + oneTxt5.getText() + System.getProperty("line.separator") + s2 + "冲击系数:  " + oneTxt6.getText()
							+  System.getProperty("line.separator") + s2 + "跨越架的垂直载荷:  " + oneTxt61.getText() + System.getProperty("line.separator") + s2 + "架面风压的均匀载荷:  " + oneTxt62.getText()+ System.getProperty("line.separator") + s1;
				}
				if (oneTxt64.getText() != null) {
					outPutTxt += "跨越架的水平载荷: "+ System.getProperty("line.separator") + s2 + "冲击系数:  " + oneTxt6.getText() + System.getProperty("line.separator") + s2 + "导线或牵引绳对跨越架的摩擦系数: "
							+ oneTxt21.getText() + System.getProperty("line.separator") + s1;
				}
				if (oneTxt65.getText() != null) {
					outPutTxt += "竹木跨越架的安装:" + System.getProperty("line.separator") + s2 + "被跨电力线最高点的对地距离: " + oneTxt31.getText() + System.getProperty("line.separator") + s2 + "不同电压等级的电力线与封顶架面的最小垂直距离: "
							+ oneTxt32.getText()  + System.getProperty("line.separator") + s2 + "跨越架封顶网的弧垂: " + oneTxt34.getText()  + System.getProperty("line.separator") + s2 + "施工线路的线间距离: "
							+ oneTxt37.getText() + System.getProperty("line.separator") + s2 + "跨越架顶面超出施工线路的宽度: " + oneTxt39.getText() + System.getProperty("line.separator") + s2
							+ "施工线路与别跨电力线的交叉角: " + oneTxt41.getText() + System.getProperty("line.separator") + s2 + "被跨电力线两边线间的水平距离: " + oneTxt43.getText()
							+ System.getProperty("line.separator") + s2 + "跨越架内侧主杆或主柱外缘（金属架）至被跨电力线的最小水平距离: " + oneTxt44.getText() + System.getProperty("line.separator") + s2 + "跨越架的最小高度: " + oneTxt65.getText()
							+ System.getProperty("line.separator") + s2 + "跨越架的最小宽度: " + oneTxt66.getText() + System.getProperty("line.separator") + s2 + "跨越架顶面的最小跨距: " + oneTxt71.getText()
							+ System.getProperty("line.separator") + s1;
				}
				if (oneTxt72.getText() != null) {
					outPutTxt += "单侧跨越架: " + System.getProperty("line.separator") + s2 + "跨越家上层拉线挂点至地面的高度: " + oneTxt53.getText()  + System.getProperty("line.separator") + s2 + "上拉线与运行电力线的最小安全距离: "
							+ oneTxt54.getText()  + System.getProperty("line.separator") + s2 + "拉线对地面夹角: " + oneTxt55.getText()  + System.getProperty("line.separator") + s2 + "拉线与跨越架横担轴线间的水平夹角: "
							+ oneTxt56.getText() + System.getProperty("line.separator") + s2 + "跨越架的上拉线挂点至运行电力线的垂直距离: " + oneTxt51.getText() + System.getProperty("line.separator") + s2 + "内侧上拉线与运行电力线的最小安全距离: "
							+ oneTxt52.getText() + System.getProperty("line.separator") + s2 + "拉线至运行线路最小安全距离要求的跨距: " + oneTxt57.getText() + System.getProperty("line.separator") + s2 + "运行电力线与在建线路的交叉角引起的跨距: " + oneTxt58.getText()
							+ System.getProperty("line.separator") + s2 + "拉线位置引起的跨距: " + oneTxt59.getText() + System.getProperty("line.separator") + s2 + "被跨越物与施工线路任一相邻杆塔的距离: " + oneTxt81.getText()
							+ System.getProperty("line.separator") + s2 + "水平放线张力: " + oneTxt82.getText()
							+ System.getProperty("line.separator") + s2 + "施工线路的跨越档档距跨越: " + oneTxt83.getText()
							+ System.getProperty("line.separator") + s2 + "施工线路跨越档两端悬垂绝缘子串或滑车挂具长度: " + oneTxt84.getText() + System.getProperty("line.separator") + s2 + "施工线路跨越档两端悬垂绝缘子串或滑车挂具长度: " + oneTxt84.getText() 
							+ System.getProperty("line.separator") + s2 + "导线、地线的单位长度重量: " + oneTxt85.getText()
							+ System.getProperty("line.separator") + s2 + "导线或地线的单位长度风荷重: " + oneTxt86.getText()
							+ System.getProperty("line.separator") + s2 + "导线或地线直径: " + oneTxt87.getText()
							+ System.getProperty("line.separator") + s2 + "拉线位置引起的跨距: " + String.valueOf(L1)
							+ System.getProperty("line.separator") + s2 + "拉线至运行线路最小安全距离要求的跨距: " + String.valueOf(L2)
							+ System.getProperty("line.separator") + s2 + "运行电力线与在建线路的交叉角引起的跨距: " + String.valueOf(L3)
							+ System.getProperty("line.separator") + s2 + "跨越架跨越架外侧至运行电力线的水平距离: " + oneTxt72.getText()
							+ System.getProperty("line.separator") + s2 + "两副跨越架间的跨距: " + oneTxt74.getText()
							+ System.getProperty("line.separator") + s2 + "风偏距离: " + oneTxt75.getText() + System.getProperty("line.separator") + s1;
				}
//				if(highStrength.)
				if (outPutTxt.length() == 7) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
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
