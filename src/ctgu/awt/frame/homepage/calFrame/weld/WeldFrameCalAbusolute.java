package ctgu.awt.frame.homepage.calFrame.weld;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.border.TitledBorder;

import ctgu.Entity.WeldCal;
import ctgu.Entity.Across.AcrossEnity;
import ctgu.Entity.weld.WeldEntity;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.Tool;

import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;

public class WeldFrameCalAbusolute extends FatherFrame implements ActionListener, ItemListener {

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
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
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
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;

	// 保存
	private WeldEntity weldEntity = null;
	
	//打印
	private String outPutTxt = "";

	private double TWT11;
	private double SDV1;
	private double TOT1;
	private double MFs1;
	private double MFs11;
	private double ETo1;
	private double CLw1;
	private double Af1;
	private double SLf1;

	private double SOF1;
	private double FFW1;
	private double TFw1;
	private double LOf1;

	private double SOE1;
	private double AWA1;
	private double LB1;
	private double e11;
	private double K11;
	private double K21;
	private double N1;
	private double SFOf1;
	private double m11;
	private double m21;
	private double LW1;
	private double SAL1;
	private double R11;
	private double IP1;

	private double H11;
	private double FV1;
	private double Me1;
	private double AS1;

	private double T11;
	private double WW1;
	private double SW1;
	private double IW1;

	private double PWL1;
	private double PTWL1;
	private double SSW1;
	private double IFB1;
	private double N11;
	private double N21;
	private double L11;
	private double L21;
	private double NC1;
	private double FM1;
	private double AFM1;
	private double AFM11;
	private double FFC1;
	private double FOBS1;
	private double FTBS1;
	private double FTCS1;
	private double FSCS1;
	private double FT1;
	private double FAT1;
	private double FLT1;
	private double FLTC1;
	private double FNC1;
	private double FNBS1;
	private double FNCS1;

	private JLabel picture1 = null;
	JPanel picture = new JPanel();
	private int i = 0;
	private int B1;
	private int B2;
	private JTextField textField_58;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					WeldEntity W = new WeldEntity();
					WeldFrameCalAbusolute frame = new WeldFrameCalAbusolute(new WeldEntity());
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
	public WeldFrameCalAbusolute(WeldEntity W) {
		weldEntity = W;
		setTitle("焊缝计算");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 100, 1983, 884);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 372, 489);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"\u76F4\u89D2\u89D2\u710A\u7F1D\u5F3A\u5EA6\u8BA1\u7B97\u53C2\u6570", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("dsad");
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("较厚焊件厚度:");
		label.setBounds(10, 30, 139, 21);
		panel.add(label);

		textField = new JTextField("0");
		textField.setText(weldEntity.TWT == null ? "0" : String.valueOf(weldEntity.TWT));
		textField.setBounds(149, 28, 185, 24);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(10, 59, 330, 21);
		panel.add(lblNewLabel);

		JLabel label_1 = new JLabel();
		label_1.setBounds(10, 80, 330, 21);
		panel.add(label_1);

		JLabel label_2 = new JLabel();
		label_2.setBounds(4, 102, 330, 21);
		panel.add(label_2);

		JLabel lblNewLabel_1 = new JLabel("较薄焊件的厚度:");
		lblNewLabel_1.setBounds(10, 169, 139, 21);
		panel.add(lblNewLabel_1);
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel.setText("");
				label_1.setText("");
				label_2.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel.setText("自动焊熔深较大，可减小1mm；T形连接的单面 角焊缝");
				lblNewLabel.setForeground(Color.RED);
				label_1.setText("应增加1mm；当焊件厚度小于或等于4mm时，则取与");
				label_1.setForeground(Color.RED);
				label_2.setText("焊件厚度相同");
				label_2.setForeground(Color.RED);
			}
		});

		textField_1 = new JTextField("0");
		textField_1.setText(weldEntity.TOT == null ? "0" : String.valueOf(weldEntity.TOT));

		textField_1.setBounds(149, 166, 185, 27);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(10, 205, 314, 21);
		panel.add(lblNewLabel_2);

		JLabel label_3 = new JLabel();
		label_3.setBounds(10, 230, 314, 21);
		panel.add(label_3);

		JLabel lblNewLabel_3 = new JLabel("焊脚尺寸:");
		lblNewLabel_3.setBounds(10, 257, 90, 21);
		panel.add(lblNewLabel_3);

		textField_2 = new JTextField("0");
		textField_2.setText(weldEntity.MFs == null ? "0" : String.valueOf(weldEntity.MFs));
		textField_2.setEnabled(false);
		textField_2.setBounds(100, 254, 66, 27);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("直角角焊缝的有效厚度:");
		lblNewLabel_4.setBounds(10, 293, 211, 21);
		panel.add(lblNewLabel_4);

		textField_3 = new JTextField("0");
		textField_3.setText(weldEntity.ETo == null ? "0" : String.valueOf(weldEntity.ETo));
		textField_3.setBounds(238, 290, 96, 27);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("焊缝的计算长度:");
		lblNewLabel_5.setBounds(10, 329, 185, 21);
		panel.add(lblNewLabel_5);

		textField_4 = new JTextField("0");
		textField_4.setText(weldEntity.CLw == null ? "0" : String.valueOf(weldEntity.CLw));
		textField_4.setBounds(149, 326, 185, 27);
		panel.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setBounds(0, 357, 324, 29);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("轴心力:");
		lblNewLabel_7.setBounds(10, 386, 139, 29);
		panel.add(lblNewLabel_7);

		textField_5 = new JTextField("0");
		textField_5.setText(weldEntity.Af == null ? "0" : String.valueOf(weldEntity.Af));
		textField_5.setBounds(149, 387, 185, 27);
		panel.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("正面角焊缝的强度增大系数：");
		lblNewLabel_8.setBounds(10, 423, 234, 21);
		panel.add(lblNewLabel_8);

		textField_6 = new JTextField("0");
		textField_6.setText(weldEntity.SLf == null ? "0" : String.valueOf(weldEntity.SLf));
		textField_6.setBounds(256, 420, 78, 27);
		panel.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel();
		lblNewLabel_9.setBounds(10, 453, 362, 36);
		panel.add(lblNewLabel_9);

		JLabel lblNewLabel_11 = new JLabel("角焊缝的强度设计值:");
		lblNewLabel_11.setBounds(14, 133, 181, 21);
		panel.add(lblNewLabel_11);

		textField_8 = new JTextField("0");
		textField_8.setText(weldEntity.SDV == null ? "0" : String.valueOf(weldEntity.SDV));
		textField_8.setBounds(238, 130, 96, 27);
		panel.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_61 = new JLabel("----");
		lblNewLabel_61.setBounds(181, 257, 81, 21);
		panel.add(lblNewLabel_61);

		textField_58 = new JTextField("0");
		textField_58.setText(weldEntity.MFs1 == null ? "0" : String.valueOf(weldEntity.MFs1));
		textField_58.setBounds(238, 252, 66, 29);
		textField_58.setEnabled(false);
		panel.add(textField_58);
		textField_58.setColumns(10);

		textField_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_9.setText("<html><body>β<sub>f</sub>=1.22,直接承受动力荷载结构中的角焊缝,β<sub>f</sub>=1.0</body></html>");
				lblNewLabel_9.setForeground(Color.RED);
			}

			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel_9.setText("");
			}
		});

		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_6.setText("<html><body>各条焊缝的实际长度每端减去h<sub>f</sub>计算</body></html>");
				lblNewLabel_6.setForeground(Color.RED);
			}

			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel_6.setText("");
			}
		});

		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel_2.setText("");
				label_3.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_2.setText("对板件边缘的角焊缝，当板件厚度t＞6mm时，取hf");
				lblNewLabel_2.setForeground(Color.RED);
				label_3.setText("≤t-(1~2)mm，当t≤6mm时，取hf≤t");
				label_3.setForeground(Color.RED);
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(62, 760, 1748, 72);
		contentPane.add(panel_1);

		JButton btnNewButton = new JButton("保存");
		btnNewButton.setBounds(307, 15, 94, 42);
		btnNewButton.setActionCommand("保存");
		btnNewButton.addActionListener(this);
		panel_1.setLayout(null);
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("打印");
		btnNewButton_1.setActionCommand("打印");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(832, 15, 94, 42);
		panel_1.add(btnNewButton_1);

		Review revi = new Review();
		revi.syncItem(textField, textField_2);

		Review revi1 = new Review();
		revi1.syncItem1(textField, textField_58);

		JButton btnNewButton_2 = new JButton("计算");
		btnNewButton_2.setActionCommand("计算");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(1364, 15, 94, 42);
		panel_1.add(btnNewButton_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 488, 362, 98);
		panel_2.setBorder(
				new TitledBorder(null, "\u710A\u7F1D\u79CD\u7C7B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JCheckBox checkBox = new JCheckBox("正面角焊缝");
		checkBox.setBounds(24, 22, 149, 29);
		panel_2.add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("侧面角焊缝");
		checkBox_1.setBounds(202, 22, 149, 29);
		panel_2.add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("三面围焊角焊缝");
		checkBox_2.setBounds(97, 58, 159, 29);
		panel_2.add(checkBox_2);

		listenerCe2 list1 = new listenerCe2();
		B2 = list1.listenergeK2(checkBox, checkBox_1, checkBox_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(387, 5, 433, 574);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"\u89D2\u710A\u7F1D\u8FDE\u63A5\u7684\u8BA1\u7B97\u53C2\u65701", TitledBorder.LEADING, TitledBorder.TOP,
				null, new Color(0, 0, 0)));
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_10 = new JLabel("连接一侧正面角焊缝计算长度的总和:");
		lblNewLabel_10.setBounds(15, 30, 320, 29);
		panel_3.add(lblNewLabel_10);

		textField_7 = new JTextField("0");
		textField_7.setText(weldEntity.SOE == null ? "0" : String.valueOf(weldEntity.SOE));
		textField_7.setBounds(322, 31, 96, 27);
		panel_3.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("焊缝与轴心力之间的夹角:");
		lblNewLabel_12.setBounds(15, 75, 233, 21);
		panel_3.add(lblNewLabel_12);

		textField_9 = new JTextField("0");
		textField_9.setText(weldEntity.AWA == null ? "0" : String.valueOf(weldEntity.AWA));
		textField_9.setBounds(322, 74, 96, 27);
		panel_3.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("肢宽:");
		lblNewLabel_13.setBounds(15, 111, 81, 21);
		panel_3.add(lblNewLabel_13);

		textField_10 = new JTextField("0");
		textField_10.setText(weldEntity.LB == null ? "0" : String.valueOf(weldEntity.LB));
		textField_10.setBounds(183, 108, 235, 27);
		panel_3.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("角钢的形心距:");
		lblNewLabel_14.setBounds(15, 148, 139, 21);
		panel_3.add(lblNewLabel_14);

		textField_11 = new JTextField("0");
		textField_11.setText(weldEntity.e1 == null ? "0" : String.valueOf(weldEntity.e1));
		textField_11.setBounds(183, 145, 235, 27);
		panel_3.add(textField_11);
		textField_11.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("角钢肢背的内力分配系数:");
		lblNewLabel_15.setBounds(15, 184, 216, 21);
		panel_3.add(lblNewLabel_15);

		textField_12 = new JTextField("0");
		textField_12.setText(weldEntity.K1 == null ? "0" : String.valueOf(weldEntity.K1));
		textField_12.setBounds(260, 181, 158, 27);
		panel_3.add(textField_12);
		textField_12.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("肢尖焊缝的内力分配系数:");
		lblNewLabel_16.setBounds(15, 225, 216, 21);
		panel_3.add(lblNewLabel_16);

		textField_13 = new JTextField("0");
		textField_13.setText(weldEntity.K2 == null ? "0" : String.valueOf(weldEntity.K2));
		textField_13.setBounds(260, 223, 158, 27);
		panel_3.add(textField_13);
		textField_13.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("角焊缝受到的轴心拉力：");
		lblNewLabel_17.setBounds(15, 261, 233, 21);
		panel_3.add(lblNewLabel_17);

		textField_14 = new JTextField("0");
		textField_14.setText(weldEntity.N == null ? "0" : String.valueOf(weldEntity.N));
		textField_14.setBounds(260, 258, 158, 27);
		panel_3.add(textField_14);
		textField_14.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("角焊缝受到的剪力:");
		lblNewLabel_18.setBounds(15, 297, 197, 21);
		panel_3.add(lblNewLabel_18);

		textField_15 = new JTextField("0");
		textField_15.setText(weldEntity.SFOf == null ? "0" : String.valueOf(weldEntity.SFOf));
		textField_15.setBounds(260, 294, 158, 27);
		panel_3.add(textField_15);
		textField_15.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("角焊缝的承受弯矩: ");
		lblNewLabel_19.setBounds(15, 339, 165, 21);
		panel_3.add(lblNewLabel_19);

		textField_16 = new JTextField("0");
		textField_16.setText(weldEntity.m1 == null ? "0" : String.valueOf(weldEntity.m1));
		textField_16.setBounds(260, 336, 158, 27);
		panel_3.add(textField_16);
		textField_16.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("全部焊缝所承受的弯矩：");
		lblNewLabel_20.setBounds(15, 381, 248, 21);
		panel_3.add(lblNewLabel_20);

		textField_17 = new JTextField("0");
		textField_17.setText(weldEntity.m2 == null ? "0" : String.valueOf(weldEntity.m2));
		textField_17.setBounds(260, 378, 158, 27);
		panel_3.add(textField_17);
		textField_17.setColumns(10);

		JLabel lblNewLabel_21 = new JLabel("全部焊缝有效截面对中和轴的惯性矩：");
		lblNewLabel_21.setBounds(15, 417, 306, 21);
		panel_3.add(lblNewLabel_21);

		textField_18 = new JTextField("0");
		textField_18.setText(weldEntity.LW == null ? "0" : String.valueOf(weldEntity.LW));
		textField_18.setBounds(322, 414, 96, 27);
		panel_3.add(textField_18);
		textField_18.setColumns(10);

		JLabel lblNewLabel_22 = new JLabel("腹板焊缝有效截面之和：");
		lblNewLabel_22.setBounds(15, 450, 216, 21);
		panel_3.add(lblNewLabel_22);

		textField_19 = new JTextField("0");
		textField_19.setText(weldEntity.SAL == null ? "0" : String.valueOf(weldEntity.SAL));
		textField_19.setBounds(260, 448, 158, 27);
		panel_3.add(textField_19);
		textField_19.setColumns(10);

		JLabel lblNewLabel_23 = new JLabel("圆心至焊缝有效截面中线的距离：");
		lblNewLabel_23.setBounds(15, 485, 287, 21);
		panel_3.add(lblNewLabel_23);

		textField_20 = new JTextField("0");
		textField_20.setText(weldEntity.R1 == null ? "0" : String.valueOf(weldEntity.R1));
		textField_20.setBounds(322, 482, 96, 27);
		panel_3.add(textField_20);
		textField_20.setColumns(10);

		JLabel lblNewLabel_24 = new JLabel("焊缝有效截面的惯性矩：");
		lblNewLabel_24.setBounds(15, 520, 220, 21);
		panel_3.add(lblNewLabel_24);

		textField_21 = new JTextField("0");
		textField_21.setText(weldEntity.IP == null ? "0" : String.valueOf(weldEntity.IP));
		textField_21.setBounds(322, 515, 96, 27);
		panel_3.add(textField_21);
		textField_21.setColumns(10);

		picture = new JPanel();
		picture.setBorder(
				new TitledBorder(null, "\u793A\u610F\u56FE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		picture.setBounds(835, 15, 541, 234);
		picture.setLayout(null);
		// image.setImage(image.getImage().getScaledInstance(-1,350,
		// Image.SCALE_DEFAULT));
		Icon icon1 = new ImageIcon(this.getClass().getResource("1.png"));
		// ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(520, 220, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
		picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(0, 0, 530, 230);
		picture.add(picture1);
		contentPane.add(picture);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(1387, 15, 537, 730);
		contentPane.add(panel_5);
		panel_5.setLayout(null);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(
				new TitledBorder(null, "\u8BA1\u7B97\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(5, 15, 527, 715);
		panel_5.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblNewLabel_32 = new JLabel("垂直焊缝长度方向的应力：");
		lblNewLabel_32.setBounds(0, 27, 216, 21);
		panel_9.add(lblNewLabel_32);

		textField_29 = new JTextField("0");
		textField_29.setText(weldEntity.PWL == null ? "0" : String.valueOf(weldEntity.PWL));
		textField_29.setBounds(210, 24, 96, 27);
		panel_9.add(textField_29);
		textField_29.setColumns(10);

		JLabel lblNewLabel_33 = new JLabel("平行焊缝长度方向的应力：");
		lblNewLabel_33.setBounds(0, 58, 223, 21);
		panel_9.add(lblNewLabel_33);

		textField_30 = new JTextField("0");
		textField_30.setText(weldEntity.PTWL == null ? "0" : String.valueOf(weldEntity.PTWL));
		textField_30.setColumns(10);
		textField_30.setBounds(210, 55, 96, 27);
		panel_9.add(textField_30);

		JLabel lblNewLabel_34 = new JLabel("正面角焊缝所承担的内力(三面围焊): ");
		lblNewLabel_34.setBounds(0, 116, 306, 21);
		panel_9.add(lblNewLabel_34);

		textField_31 = new JTextField("0");
		textField_31.setText(weldEntity.IFB == null ? "0" : String.valueOf(weldEntity.IFB));
		textField_31.setBounds(311, 113, 75, 27);
		panel_9.add(textField_31);
		textField_31.setColumns(10);

		JLabel lblNewLabel_35 = new JLabel("侧面角焊缝的强度(三面围焊)：");
		lblNewLabel_35.setBounds(0, 86, 297, 21);
		panel_9.add(lblNewLabel_35);

		textField_32 = new JTextField("0");
		textField_32.setText(weldEntity.SSW == null ? "0" : String.valueOf(weldEntity.SSW));
		textField_32.setBounds(311, 83, 75, 27);
		panel_9.add(textField_32);
		textField_32.setColumns(10);

		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(175, 156, 1, 1);
		panel_9.add(horizontalGlue);

		JButton btnNewButton_3 = new JButton("验算");
		btnNewButton_3.setBounds(318, 23, 123, 25);
		panel_9.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("验算");
		btnNewButton_4.setBounds(318, 54, 123, 25);
		panel_9.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("验算");
		btnNewButton_5.setBounds(389, 84, 123, 25);
		panel_9.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("验算");
		btnNewButton_6.setBounds(389, 115, 123, 25);
		panel_9.add(btnNewButton_6);

		JLabel lblNewLabel_36 = new JLabel("角钢肢背承受的轴力：");
		lblNewLabel_36.setBounds(0, 144, 190, 21);
		panel_9.add(lblNewLabel_36);

		textField_33 = new JTextField("0");
		textField_33.setText(weldEntity.N1 == null ? "0" : String.valueOf(weldEntity.N1));
		textField_33.setBounds(175, 142, 52, 27);
		panel_9.add(textField_33);
		textField_33.setColumns(10);

		JLabel lblNewLabel_37 = new JLabel("肢尖承受的轴力：");
		lblNewLabel_37.setBounds(242, 144, 144, 21);
		panel_9.add(lblNewLabel_37);

		textField_34 = new JTextField("0");
		textField_34.setText(weldEntity.N2 == null ? "0" : String.valueOf(weldEntity.N2));
		textField_34.setBounds(389, 141, 52, 27);
		panel_9.add(textField_34);
		textField_34.setColumns(10);

		JLabel lblNewLabel_38 = new JLabel("一个角钢肢背上的侧面角焊缝的计算长度：");
		lblNewLabel_38.setBounds(0, 179, 355, 21);
		panel_9.add(lblNewLabel_38);

		textField_39 = new JTextField("0");
		textField_39.setText(weldEntity.L1 == null ? "0" : String.valueOf(weldEntity.L1));
		textField_39.setBounds(370, 176, 96, 27);
		panel_9.add(textField_39);
		textField_39.setColumns(10);

		JLabel lblNewLabel_43 = new JLabel("一个角钢肢尖上的侧面角焊缝的计算长度：");
		lblNewLabel_43.setBounds(0, 212, 355, 21);
		panel_9.add(lblNewLabel_43);

		textField_40 = new JTextField("0");
		textField_40.setText(weldEntity.L2 == null ? "0" : String.valueOf(weldEntity.L2));
		textField_40.setBounds(370, 208, 96, 27);
		panel_9.add(textField_40);
		textField_40.setColumns(10);

		JLabel lblNewLabel_44 = new JLabel("角钢端部的轴心力：");
		lblNewLabel_44.setBounds(5, 248, 271, 21);
		panel_9.add(lblNewLabel_44);

		textField_41 = new JTextField("0");
		textField_41.setText(weldEntity.NC == null ? "0" : String.valueOf(weldEntity.NC));
		textField_41.setBounds(370, 240, 96, 27);
		panel_9.add(textField_41);
		textField_41.setColumns(10);

		JLabel lblNewLabel_45 = new JLabel("弯矩M产生的应力：");
		lblNewLabel_45.setBounds(5, 279, 156, 21);
		panel_9.add(lblNewLabel_45);

		textField_42 = new JTextField("0");
		textField_42.setText(weldEntity.FM == null ? "0" : String.valueOf(weldEntity.FM));
		textField_42.setBounds(370, 273, 96, 27);
		panel_9.add(textField_42);
		textField_42.setColumns(10);

		JLabel lblNewLabel_46 = new JLabel("A点垂直于焊缝方向的应力：");
		lblNewLabel_46.setBounds(5, 309, 271, 21);
		panel_9.add(lblNewLabel_46);

		textField_43 = new JTextField("0");
		textField_43.setText(weldEntity.AFM == null ? "0" : String.valueOf(weldEntity.AFM));
		textField_43.setBounds(236, 306, 96, 27);
		panel_9.add(textField_43);
		textField_43.setColumns(10);

		JLabel lblNewLabel_47 = new JLabel("剪力Ny在A点处产生平行于焊缝长度方向的应力：");
		lblNewLabel_47.setBounds(5, 343, 413, 21);
		panel_9.add(lblNewLabel_47);

		textField_44 = new JTextField("0");
		textField_44.setText(weldEntity.AFM1 == null ? "0" : String.valueOf(weldEntity.AFM1));
		textField_44.setBounds(403, 340, 109, 27);
		panel_9.add(textField_44);
		textField_44.setColumns(10);

		JLabel lblNewLabel_48 = new JLabel("焊缝的强度计算式：");
		lblNewLabel_48.setBounds(5, 374, 386, 21);
		panel_9.add(lblNewLabel_48);

		textField_45 = new JTextField("0");
		textField_45.setText(weldEntity.FFC == null ? "0" : String.valueOf(weldEntity.FFC));
		textField_45.setBounds(403, 371, 109, 27);
		panel_9.add(textField_45);
		textField_45.setColumns(10);

		JLabel lblNewLabel_49 = new JLabel("最大弯曲应力发生在翼缘焊缝的最外纤维处的应力：");
		lblNewLabel_49.setBounds(5, 406, 403, 21);
		panel_9.add(lblNewLabel_49);

		textField_46 = new JTextField("0");
		textField_46.setText(weldEntity.FOBS == null ? "0" : String.valueOf(weldEntity.FOBS));
		textField_46.setBounds(416, 403, 96, 27);
		panel_9.add(textField_46);
		textField_46.setColumns(10);

		JLabel lblNewLabel_50 = new JLabel("腹板焊缝承受两种应力的共同作用的弯曲应力：");
		lblNewLabel_50.setBounds(5, 437, 413, 21);
		panel_9.add(lblNewLabel_50);

		textField_47 = new JTextField("0");
		textField_47.setText(weldEntity.FTBS == null ? "0" : String.valueOf(weldEntity.FTBS));
		textField_47.setBounds(416, 434, 96, 27);
		panel_9.add(textField_47);
		textField_47.setColumns(10);

		JLabel lblNewLabel_51 = new JLabel("腹板焊缝承受两种应力的共同作用的剪应力：");
		lblNewLabel_51.setBounds(5, 467, 381, 21);
		panel_9.add(lblNewLabel_51);

		textField_48 = new JTextField("0");
		textField_48.setText(weldEntity.FTCS == null ? "0" : String.valueOf(weldEntity.FTCS));
		textField_48.setBounds(416, 464, 96, 27);
		panel_9.add(textField_48);
		textField_48.setColumns(10);

		JLabel lblNewLabel_52 = new JLabel("有效截面的任一点上所受切线方向的剪应力：");
		lblNewLabel_52.setBounds(0, 495, 386, 21);
		panel_9.add(lblNewLabel_52);

		textField_49 = new JTextField("0");
		textField_49.setText(weldEntity.FSCS == null ? "0" : String.valueOf(weldEntity.FSCS));
		textField_49.setBounds(355, 492, 65, 27);
		panel_9.add(textField_49);
		textField_49.setColumns(10);

		JButton btnNewButton_7 = new JButton("验算");
		btnNewButton_7.setBounds(426, 491, 86, 29);
		panel_9.add(btnNewButton_7);

		JLabel lblNewLabel_53 = new JLabel("在扭矩T作用下，A点（或点）的应力：");
		lblNewLabel_53.setBounds(10, 525, 306, 21);
		panel_9.add(lblNewLabel_53);

		textField_50 = new JTextField("0");
		textField_50.setText(weldEntity.FT == null ? "0" : String.valueOf(weldEntity.FT));
		textField_50.setBounds(322, 522, 96, 27);
		panel_9.add(textField_50);
		textField_50.setColumns(10);

		JButton btnNewButton_8 = new JButton("如图");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pictureWindowW3 p3 = new pictureWindowW3();
			}
		});
		btnNewButton_8.setBounds(425, 521, 87, 29);
		panel_9.add(btnNewButton_8);

		JLabel lblNewLabel_54 = new JLabel("A点引起的应力:");
		lblNewLabel_54.setBounds(5, 555, 203, 21);
		panel_9.add(lblNewLabel_54);

		textField_51 = new JTextField("0");
		textField_51.setText(weldEntity.FAT == null ? "0" : String.valueOf(weldEntity.FAT));
		textField_51.setBounds(134, 551, 86, 27);
		panel_9.add(textField_51);
		textField_51.setColumns(10);

		JLabel lblNewLabel_55 = new JLabel("垂直于焊缝长度方向的应力:");
		lblNewLabel_55.setBounds(223, 555, 243, 21);
		panel_9.add(lblNewLabel_55);

		textField_52 = new JTextField("0");
		textField_52.setText(weldEntity.FLT == null ? "0" : String.valueOf(weldEntity.FLT));
		textField_52.setBounds(450, 553, 72, 27);
		panel_9.add(textField_52);
		textField_52.setColumns(10);

		JLabel lblNewLabel_56 = new JLabel("A点的应力满足的强度条件:");
		lblNewLabel_56.setBounds(5, 585, 222, 21);
		panel_9.add(lblNewLabel_56);

		textField_53 = new JTextField("0");
		textField_53.setText(weldEntity.FLTC == null ? "0" : String.valueOf(weldEntity.FLTC));
		textField_53.setBounds(236, 582, 96, 27);
		panel_9.add(textField_53);
		textField_53.setColumns(10);

		JButton btnNewButton_9 = new JButton("验算");

		btnNewButton_9.setBounds(343, 581, 123, 29);
		panel_9.add(btnNewButton_9);

		JLabel lblNewLabel_57 = new JLabel("轴心力作用的对接焊缝应力：");
		lblNewLabel_57.setBounds(5, 615, 311, 21);
		panel_9.add(lblNewLabel_57);

		textField_54 = new JTextField("0");
		textField_54.setText(weldEntity.FNC == null ? "0" : String.valueOf(weldEntity.FNC));
		textField_54.setBounds(416, 612, 96, 27);
		panel_9.add(textField_54);
		textField_54.setColumns(10);

		JLabel lblNewLabel_58 = new JLabel("轴心力作用的对接焊缝的正应力：");
		lblNewLabel_58.setBounds(5, 648, 271, 21);
		panel_9.add(lblNewLabel_58);

		textField_55 = new JTextField("0");
		textField_55.setText(weldEntity.FNBS == null ? "0" : String.valueOf(weldEntity.FNBS));
		textField_55.setBounds(416, 645, 96, 27);
		panel_9.add(textField_55);
		textField_55.setColumns(10);

		JLabel lblNewLabel_59 = new JLabel("轴心力作用的对接焊缝的剪应力：");
		lblNewLabel_59.setBounds(5, 680, 292, 21);
		panel_9.add(lblNewLabel_59);

		textField_56 = new JTextField("0");
		textField_56.setText(weldEntity.FNCS == null ? "0" : String.valueOf(weldEntity.FNCS));
		textField_56.setBounds(270, 677, 96, 27);
		panel_9.add(textField_56);
		textField_56.setColumns(10);

		JButton btnNewButton_10 = new JButton("验算折算应力");
		btnNewButton_10.setBounds(382, 676, 144, 29);
		panel_9.add(btnNewButton_10);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(387, 580, 433, 175);
		panel_6.setBorder(new TitledBorder(null, "\u89D2\u710A\u7F1D\u8FDE\u63A5\u7684\u8BA1\u7B97\u53C2\u65702",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_25 = new JLabel("角焊缝的相关力矩：");
		lblNewLabel_25.setBounds(15, 31, 162, 21);
		panel_6.add(lblNewLabel_25);

		textField_22 = new JTextField("0");
		textField_22.setText(weldEntity.H1 == null ? "0" : String.valueOf(weldEntity.H1));
		textField_22.setBounds(192, 28, 223, 27);
		panel_6.add(textField_22);
		textField_22.setColumns(10);

		JLabel lblNewLabel_26 = new JLabel("平行于焊缝的力：");
		lblNewLabel_26.setBounds(15, 68, 162, 21);
		panel_6.add(lblNewLabel_26);

		textField_23 = new JTextField("0");
		textField_23.setText(weldEntity.FV == null ? "0" : String.valueOf(weldEntity.FV));
		textField_23.setBounds(192, 65, 223, 27);
		panel_6.add(textField_23);
		textField_23.setColumns(10);

		JLabel lblNewLabel_27 = new JLabel("角焊缝的扭矩：");
		lblNewLabel_27.setBounds(15, 104, 147, 21);
		panel_6.add(lblNewLabel_27);

		textField_24 = new JTextField("0");
		textField_24.setText(weldEntity.Me == null ? "0" : String.valueOf(weldEntity.Me));
		textField_24.setBounds(192, 101, 223, 27);
		panel_6.add(textField_24);
		textField_24.setColumns(10);

		JLabel lblNewLabel_60 = new JLabel("角焊缝的面积：");
		lblNewLabel_60.setBounds(15, 139, 147, 21);
		panel_6.add(lblNewLabel_60);

		textField_57 = new JTextField("0");
		textField_57.setText(weldEntity.AS == null ? "0" : String.valueOf(weldEntity.AS));
		textField_57.setBounds(192, 136, 223, 27);
		panel_6.add(textField_57);
		textField_57.setColumns(10);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "\u793A\u610F\u56FE\u9009\u62E9", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_8.setBounds(835, 260, 541, 171);
		contentPane.add(panel_8);
		panel_8.setLayout(null);

		JRadioButton radioButton = new JRadioButton("直角焊缝截面");
		radioButton.setBounds(11, 29, 141, 29);
		panel_8.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("斜角焊缝截面");
		radioButton_1.setBounds(178, 29, 141, 29);
		panel_8.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("对接焊缝的坡口形式");
		radioButton_2.setBounds(340, 29, 201, 29);
		panel_8.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("最大焊脚尺寸");
		radioButton_3.setBounds(11, 65, 141, 29);
		panel_8.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("承受轴心力的盖板连接");
		radioButton_4.setBounds(178, 65, 241, 29);
		panel_8.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("承受斜向轴心力");
		radioButton_5.setBounds(11, 101, 159, 29);
		panel_8.add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton("角钢与节点板的连接");
		radioButton_6.setBounds(178, 101, 212, 29);
		panel_8.add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton("承受偏心斜拉力的角焊缝");
		radioButton_7.setBounds(11, 137, 231, 29);
		panel_8.add(radioButton_7);

		JRadioButton radioButton_8 = new JRadioButton("工字形梁的脚焊缝连接");
		radioButton_8.setBounds(242, 137, 288, 29);
		panel_8.add(radioButton_8);

		// 设置监听
		radioButton.setActionCommand("直角焊缝截面");
		radioButton_1.setActionCommand("斜角焊缝截面");
		radioButton_2.setActionCommand("对接焊缝的坡口形式");
		radioButton_3.setActionCommand("最大焊脚尺寸");
		radioButton_4.setActionCommand("承受轴心力的盖板连接");
		radioButton_5.setActionCommand("承受斜向轴心力");
		radioButton_6.setActionCommand("角钢与节点板的连接");
		radioButton_7.setActionCommand("承受偏心斜拉力的角焊缝");
		radioButton_8.setActionCommand("工字形梁的脚焊缝连接");
		radioButton.addActionListener(this);
		radioButton_1.addActionListener(this);
		radioButton_2.addActionListener(this);
		radioButton_3.addActionListener(this);
		radioButton_4.addActionListener(this);
		radioButton_5.addActionListener(this);
		radioButton_6.addActionListener(this);
		radioButton_7.addActionListener(this);
		radioButton_8.addActionListener(this);

		listenerCe2 lis1 = new listenerCe2();
		B1 = lis1.listenerge2(radioButton, radioButton_1, radioButton_2, radioButton_3, radioButton_4, radioButton_5,
				radioButton_6, radioButton_7, radioButton_8);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(835, 437, 541, 201);
		contentPane.add(panel_7);
		panel_7.setBorder(new TitledBorder(null, "\u5BF9\u63A5\u710A\u7F1D\u7684\u6784\u9020\u548C\u8BA1\u7B97",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setLayout(null);

		JLabel lblNewLabel_28 = new JLabel("对接接头中为连接件的较小厚度：");
		lblNewLabel_28.setBounds(15, 34, 277, 21);
		panel_7.add(lblNewLabel_28);

		textField_25 = new JTextField("0");
		textField_25.setText(weldEntity.T1 == null ? "0" : String.valueOf(weldEntity.T1));
		textField_25.setBounds(317, 31, 158, 27);
		panel_7.add(textField_25);
		textField_25.setColumns(10);

		JLabel lblNewLabel_29 = new JLabel();
		lblNewLabel_29.setBounds(15, 57, 439, 21);
		panel_7.add(lblNewLabel_29);

		JLabel lblNewLabel_30 = new JLabel("焊缝的截面模量：");
		lblNewLabel_30.setBounds(15, 88, 144, 21);
		panel_7.add(lblNewLabel_30);

		textField_26 = new JTextField("0");
		textField_26.setText(weldEntity.WW == null ? "0" : String.valueOf(weldEntity.WW));
		textField_26.setBounds(317, 85, 158, 27);
		panel_7.add(textField_26);
		textField_26.setColumns(10);

		JLabel label_4 = new JLabel("焊缝的截面面积矩：");
		label_4.setBounds(15, 122, 169, 21);
		panel_7.add(label_4);

		textField_27 = new JTextField("0");
		textField_27.setText(weldEntity.SW == null ? "0" : String.valueOf(weldEntity.SW));
		textField_27.setBounds(317, 118, 158, 27);
		panel_7.add(textField_27);
		textField_27.setColumns(10);

		JLabel lblNewLabel_31 = new JLabel("焊缝的截面惯性矩：");
		lblNewLabel_31.setBounds(15, 154, 230, 21);
		panel_7.add(lblNewLabel_31);

		textField_28 = new JTextField("0");
		textField_28.setText(weldEntity.IW == null ? "0" : String.valueOf(weldEntity.IW));
		textField_28.setBounds(317, 151, 158, 27);
		panel_7.add(textField_28);
		textField_28.setColumns(10);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "\u89D2\u710A\u7F1D\u8FDE\u63A5\u7684\u8BA1\u7B97\u53C2\u6570",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(15, 590, 357, 165);
		contentPane.add(panel_10);
		panel_10.setLayout(null);

		JLabel lblNewLabel_39 = new JLabel("正面角焊缝的焊脚尺寸：");
		lblNewLabel_39.setBounds(5, 28, 226, 21);
		panel_10.add(lblNewLabel_39);

		textField_35 = new JTextField("0");
		textField_35.setText(weldEntity.SOF == null ? "0" : String.valueOf(weldEntity.SOF));
		textField_35.setBounds(246, 25, 96, 27);
		panel_10.add(textField_35);
		textField_35.setColumns(10);

		JLabel lblNewLabel_40 = new JLabel("肢背焊缝的焊脚尺寸: ");
		lblNewLabel_40.setBounds(5, 60, 226, 21);
		panel_10.add(lblNewLabel_40);

		JLabel lblNewLabel_41 = new JLabel("肢尖焊缝的焊脚尺寸: ");
		lblNewLabel_41.setBounds(5, 91, 194, 21);
		panel_10.add(lblNewLabel_41);

		textField_36 = new JTextField("0");
		textField_36.setText(weldEntity.FFW == null ? "0" : String.valueOf(weldEntity.FFW));
		textField_36.setBounds(246, 55, 96, 27);
		panel_10.add(textField_36);
		textField_36.setColumns(10);

		textField_37 = new JTextField("0");
		textField_37.setText(weldEntity.TFw == null ? "0" : String.valueOf(weldEntity.TFw));
		textField_37.setBounds(246, 87, 96, 27);
		panel_10.add(textField_37);
		textField_37.setColumns(10);

		JLabel lblNewLabel_42 = new JLabel("角钢端部的正面角焊缝的长度：");
		lblNewLabel_42.setBounds(5, 125, 252, 21);
		panel_10.add(lblNewLabel_42);

		textField_38 = new JTextField("0");
		textField_38.setText(weldEntity.LOf == null ? "0" : String.valueOf(weldEntity.LOf));
		textField_38.setBounds(272, 122, 70, 27);
		panel_10.add(textField_38);
		textField_38.setColumns(10);

		textField_25.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel_29.setText("");
			}

			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_29.setText("T形接头中为腹板厚度。");
				lblNewLabel_29.setForeground(Color.RED);
			}
		});

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 对比
		if (e.getActionCommand().equals("直角焊缝截面")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon1 = new ImageIcon(this.getClass().getResource("1.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon1).getImage();
			image = image.getScaledInstance(520, 220, Image.SCALE_DEFAULT);
			((ImageIcon) icon1).setImage(image);
			picture1 = new JLabel(icon1, JLabel.CENTER);
			picture1.setBounds(0, 0, 530, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("直角焊缝截面" + "m=" + i);

		}
		if (e.getActionCommand().equals("斜角焊缝截面")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("2.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 210, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 10, 530, 220);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("斜角焊缝截面" + "n=" + i);
		}
		if (e.getActionCommand().equals("对接焊缝的坡口形式")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("3.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 220, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 15, 530, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("对接焊缝的坡口形式" + "n=" + i);
		}
		if (e.getActionCommand().equals("最大焊脚尺寸")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("4.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 220, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 15, 530, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("最大焊脚尺寸" + "n=" + i);
		}
		if (e.getActionCommand().equals("承受轴心力的盖板连接")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("5.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 220, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 15, 520, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("承受轴心力的盖板连接" + "n=" + i);
		}
		if (e.getActionCommand().equals("承受斜向轴心力")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("6.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 210, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 5, 520, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("承受斜向轴心力" + "n=" + i);
		}
		if (e.getActionCommand().equals("角钢与节点板的连接")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("7.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 220, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(5, 5, 520, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("角钢与节点板的连接" + "n=" + i);
		}
		if (e.getActionCommand().equals("承受偏心斜拉力的角焊缝")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("8.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 220, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 10, 530, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("承受偏心斜拉力的角焊缝" + "n=" + i);
		}
		if (e.getActionCommand().equals("工字形梁的脚焊缝连接")) {
			picture1.setVisible(false);
			picture.setLayout(null);
			Icon icon2 = new ImageIcon(this.getClass().getResource("9.png"));
			// ImageIcon image = new ImageIcon();
			Image image = ((ImageIcon) icon2).getImage();
			image = image.getScaledInstance(520, 230, Image.SCALE_DEFAULT);
			((ImageIcon) icon2).setImage(image);
			picture1 = new JLabel(icon2, JLabel.CENTER);
			picture1.setBounds(10, 10, 520, 230);
			picture.add(picture1);
			picture1.setVisible(true);
			System.out.println("工字形梁的脚焊缝连接" + "n=" + i);
		}

		if (e.getActionCommand().equals("计算")) {
			TWT11 = Double.valueOf(textField.getText().trim());
			SDV1 = Double.valueOf(textField_8.getText().trim());
			TOT1 = Double.valueOf(textField_1.getText().trim());
			MFs1 = Double.valueOf(textField_2.getText().trim());
			MFs11 = Double.valueOf(textField_58.getText().trim());
			ETo1 = Double.valueOf(textField_3.getText().trim());
			CLw1 = Double.valueOf(textField_4.getText().trim());
			Af1 = Double.valueOf(textField_5.getText().trim());
			SLf1 = Double.valueOf(textField_6.getText().trim());

			SOF1 = Double.valueOf(textField_35.getText().trim());
			FFW1 = Double.valueOf(textField_36.getText().trim());
			TFw1 = Double.valueOf(textField_37.getText().trim());
			LOf1 = Double.valueOf(textField_38.getText().trim());

			SOE1 = Double.valueOf(textField_7.getText().trim());
			AWA1 = Double.valueOf(textField_9.getText().trim());
			LB1 = Double.valueOf(textField_10.getText().trim());
			e11 = Double.valueOf(textField_11.getText().trim());
			K11 = Double.valueOf(textField_12.getText().trim());
			K21 = Double.valueOf(textField_13.getText().trim());
			N1 = Double.valueOf(textField_14.getText().trim());
			SFOf1 = Double.valueOf(textField_15.getText().trim());
			m11 = Double.valueOf(textField_16.getText().trim());
			m21 = Double.valueOf(textField_17.getText().trim());
			LW1 = Double.valueOf(textField_18.getText().trim());
			SAL1 = Double.valueOf(textField_19.getText().trim());
			R11 = Double.valueOf(textField_20.getText().trim());
			IP1 = Double.valueOf(textField_21.getText().trim());

			H11 = Double.valueOf(textField_22.getText().trim());
			FV1 = Double.valueOf(textField_23.getText().trim());
			Me1 = Double.valueOf(textField_24.getText().trim());
			AS1 = Double.valueOf(textField_57.getText().trim());

			T11 = Double.valueOf(textField_25.getText().trim());
			WW1 = Double.valueOf(textField_26.getText().trim());
			SW1 = Double.valueOf(textField_27.getText().trim());
			IW1 = Double.valueOf(textField_28.getText().trim());

			WeldCal weld = new WeldCal(TWT11, SDV1, TOT1, MFs1, MFs11, ETo1, CLw1, Af1, SLf1, SOF1, FFW1, TFw1, LOf1,
					SOE1, AWA1, LB1, e11, K11, K21, N1, SFOf1, m11, m21, LW1, SAL1, R11, IP1, H11, FV1, Me1, AS1, T11,
					WW1, SW1, IW1);

			// 具体计算
			PWL1 = Tool.forMat(weld.setF1());
			PTWL1 = Tool.forMat(weld.setF2());
			IFB1 = Tool.forMat(weld.setF12());
			SSW1 = Tool.forMat(weld.setF13());
			N11 = Tool.forMat(weld.setF21());
			N21 = Tool.forMat(weld.setF22());
			L11 = Tool.forMat(weld.setFL1());
			L21 = Tool.forMat(weld.setFL2());
			NC1 = Tool.forMat(weld.setF23());
			FM1 = Tool.forMat(weld.setF24());
			AFM1 = Tool.forMat(weld.setF25());
			AFM11 = Tool.forMat(weld.setF26());
			FFC1 = Tool.forMat(weld.setF27());
			FOBS1 = Tool.forMat(weld.setF31());
			FTBS1 = Tool.forMat(weld.setF32());
			FTCS1 = Tool.forMat(weld.setF33());
			FSCS1 = Tool.forMat(weld.setF34());
			FT1 = Tool.forMat(weld.setF41());
			FAT1 = Tool.forMat(weld.setF42());
			FLT1 = Tool.forMat(weld.setF43());
			FLTC1 = Tool.forMat(weld.setF44());
			FNC1 = Tool.forMat(weld.setF45());
			FNBS1 = Tool.forMat(weld.setF46());
			FNCS1 = Tool.forMat(weld.setF47());

			//
			textField_29.setText(String.format("%.2f", PWL1));
			textField_30.setText(String.format("%.2f", PTWL1));
			textField_32.setText(String.format("%.2f", IFB1));
			textField_31.setText(String.format("%.2f", SSW1));
			textField_33.setText(String.format("%.2f", N11));
			textField_34.setText(String.format("%.2f", N21));
			textField_39.setText(String.format("%.2f", L11));
			textField_40.setText(String.format("%.2f", L21));
			textField_41.setText(String.format("%.2f", NC1));
			textField_42.setText(String.format("%.2f", FM1));
			textField_43.setText(String.format("%.2f", AFM1));
			textField_44.setText(String.format("%.2f", AFM11));
			textField_45.setText(String.format("%.2f", FFC1));
			textField_46.setText(String.format("%.2f", FOBS1));
			textField_47.setText(String.format("%.2f", FTBS1));
			textField_48.setText(String.format("%.2f", FTCS1));
			textField_49.setText(String.format("%.2f", FSCS1));
			textField_50.setText(String.format("%.2f", FT1));
			textField_51.setText(String.format("%.2f", FAT1));
			textField_52.setText(String.format("%.2f", FLT1));
			textField_53.setText(String.format("%.2f", FLTC1));
			textField_54.setText(String.format("%.2f", FNC1));
			textField_55.setText(String.format("%.2f", FNBS1));
			textField_56.setText(String.format("%.2f", FNCS1));



		}
		if (e.getActionCommand().equals("保存")) {
			weldEntity.TWT = TWT11;
			weldEntity.SDV = SDV1;
			weldEntity.TOT = TOT1;
			weldEntity.MFs = MFs1;
			weldEntity.MFs1 = MFs11;
			weldEntity.ETo = ETo1;;
			weldEntity.CLw = CLw1;
			weldEntity.Af = Af1;
			weldEntity.SLf = SLf1;
			weldEntity.SOF = SOF1;
			weldEntity.FFW = FFW1;
			weldEntity.TFw = TFw1;
			weldEntity.LOf = LOf1;
			weldEntity.SOE = SOE1;
			weldEntity.AWA = AWA1;
			weldEntity.LB = LB1;
			weldEntity.e1 = e11;
			weldEntity.K1 = K11;
			weldEntity.K2 = K21;
			weldEntity.N = N1;
			weldEntity.SFOf = SFOf1;
			weldEntity.m1 = m11;
			weldEntity.m2 = m21;
			weldEntity.LW = LW1;
			weldEntity.SAL = SAL1;
			weldEntity.R1 = R11;
			weldEntity.IP = IP1;
			weldEntity.H1 = H11;
			weldEntity.FV = FV1;
			weldEntity.Me = Me1;
			weldEntity.AS = AS1;
			weldEntity.T1 = T11;
			weldEntity.WW = WW1;
			weldEntity.SW = SW1;
			weldEntity.IW = IW1;
			
			weldEntity.PWL = PWL1;
			weldEntity.PTWL = PTWL1;
			weldEntity.SSW = SSW1;
			weldEntity.IFB = IFB1;
			weldEntity.N1 = N11;
			weldEntity.N2 = N21;
			weldEntity.L1 = L11;
			weldEntity.L2 = L21;
			weldEntity.NC = NC1;
			weldEntity.FM = FM1;
			weldEntity.AFM = AFM1;
			weldEntity.AFM1 = AFM11;
			weldEntity.FFC = FFC1;
			weldEntity.FOBS = FOBS1;
			weldEntity.FTBS = FTBS1;
			weldEntity.FTCS = FTCS1;
			weldEntity.FSCS = FSCS1;
			weldEntity.FT = FT1;
			weldEntity.FAT = FAT1;
			weldEntity.FLT = FLT1;
			weldEntity.FLTC = FLTC1;
			weldEntity.FNC = FNC1;
			weldEntity.FNBS = FNBS1;
			weldEntity.FNCS = FNCS1;
			AnalysisXML.frameToXMl(weldEntity);
		}
		
		if (e.getActionCommand().equals("打印")) {
			String s1 = "  ";
			String s2 = "      ";
			outPutTxt = "焊缝计算: " + System.getProperty("line.separator") + s1;
			if (textField.getText() != null) {
				outPutTxt += "直角角焊缝强度计算参数: "+ System.getProperty("line.separator") + s2 + "较厚焊件厚度:  " + textField.getText() + System.getProperty("line.separator") + s2 + "角焊缝的强度设计值:  "
						+ String.valueOf(SDV1) + System.getProperty("line.separator") + s2 + "较薄焊件的厚度:  " + textField_1.getText() + System.getProperty("line.separator") + s2
						+ "最大焊脚尺寸:  " + textField_58.getText() + System.getProperty("line.separator") + s2 + "直角角焊缝的有效厚度: " + textField_3.getText() + System.getProperty("line.separator")
						+ s2 + "焊缝的计算长度: " + textField_4.getText() + System.getProperty("line.separator") + s2 + "轴心力:  " + textField_5.getText()
						+  System.getProperty("line.separator") + s2 + "正面角焊缝的强度增大系数:  " + textField_6.getText() + System.getProperty("line.separator") + s1;
			}
			if (textField_35.getText() != null) {
				outPutTxt += "角焊缝连接的计算参数: "+ System.getProperty("line.separator") + s2 + "正面角焊缝的焊脚尺寸:  " + textField_35.getText() + System.getProperty("line.separator") + s2 + "肢背角焊缝的焊脚尺寸: "
						+ textField_36.getText() + System.getProperty("line.separator") + s2 + "肢尖角焊缝的焊脚尺寸:  " + textField_37.getText() + System.getProperty("line.separator")+ s2 + "角钢端部的正面角焊缝的长度:  " + textField_38.getText() + System.getProperty("line.separator") + s1;
			}
			if (textField_7.getText() != null) {
				outPutTxt += "角焊缝连接的计算参数1:" + System.getProperty("line.separator") + s2 + "连接一侧正面角焊缝计算长度的总和: " + textField_7.getText() + System.getProperty("line.separator") + s2 + "焊缝与轴心力之间的夹角: "
						+ textField_9.getText()  + System.getProperty("line.separator") + s2 + "肢宽: " + textField_10.getText()  + System.getProperty("line.separator") + s2 + "角钢的形心矩: "
						+ textField_11.getText() + System.getProperty("line.separator") + s2 + "角钢肢背的内力分配系数: " + textField_12.getText() + System.getProperty("line.separator") + s2
						+ "角钢肢尖的内力分配系数: " + textField_13.getText() + System.getProperty("line.separator") + s2 + "角焊缝受到的轴心拉力: " + textField_14.getText()
						+ System.getProperty("line.separator") + s2 + "角焊缝受到的剪力: " + textField_15.getText() + System.getProperty("line.separator") + s2 + "角焊缝的承受弯矩: " + textField_16.getText()
						+ System.getProperty("line.separator") + s2 + "全部焊缝的承受弯矩: " + textField_17.getText() + System.getProperty("line.separator") + s2 + "全部焊缝有效截面面对中和轴的惯性矩: " + textField_18.getText()
						+ System.getProperty("line.separator")  + s2 + "腹板焊缝有效截面之和: " + textField_19.getText() + System.getProperty("line.separator")
						 + s2 + "圆心至焊缝有效截面中线的距离: " + textField_20.getText() + System.getProperty("line.separator")
						 + s2 + "焊缝有效截面的惯性矩: " + textField_21.getText() + System.getProperty("line.separator")+ s1;
			}
			if (textField_22.getText() != null) {
				outPutTxt += "角焊缝连接的计算参数2: "+ System.getProperty("line.separator") + s2 + "角焊缝的相关力矩:  " + textField_22.getText() + System.getProperty("line.separator") + s2 + "平行于焊缝的力: "
						+ textField_23.getText() + System.getProperty("line.separator") + s2 + "角焊缝的扭矩:  " + textField_24.getText() + System.getProperty("line.separator")+ s2 + "角焊缝的面积:  " + textField_57.getText() + System.getProperty("line.separator") + s1;
			}
			if (textField_25.getText() != null) {
				outPutTxt += "角焊缝连接的计算参数3: "+ System.getProperty("line.separator") + s2 + "对接接头中为连接件的较小厚度:  " + textField_25.getText() + System.getProperty("line.separator") + s2 + "焊缝的截面模量: "
						+ textField_26.getText() + System.getProperty("line.separator") + s2 + "焊缝的截面面积矩:  " + textField_27.getText() + System.getProperty("line.separator")+ s2 + "焊缝的截面惯性矩:  " + textField_28.getText() + System.getProperty("line.separator") + s1;
			}
			if (textField_29.getText() != null) {
				outPutTxt += "计算结果: " + System.getProperty("line.separator") + s2 + "垂直于焊缝长度方向的应力: " + textField_29.getText()  + System.getProperty("line.separator") + s2 + "平行于焊缝长度方向的应力: "
						+ textField_30.getText()  + System.getProperty("line.separator") + s2 + "侧面角焊缝的强度(三面围焊): " + textField_32.getText()  + System.getProperty("line.separator") + s2 + "正面角焊缝所承担的内力: "
						+ textField_31.getText() + System.getProperty("line.separator") + s2 + "角钢肢背承受的轴力: " + textField_33.getText() + System.getProperty("line.separator") + s2 + "肢尖承受的轴力: "
						+ textField_34.getText() + System.getProperty("line.separator") + s2 + "角钢端部产生的轴心力: " + textField_41.getText() + System.getProperty("line.separator") + s2 + "弯矩M产生的应力: " + textField_42.getText()
						+ System.getProperty("line.separator") + s2 + "A点垂直于焊缝方向的应力: " + textField_43.getText() + System.getProperty("line.separator") + s2 + "剪力Ny在A点处产生平行于焊缝长度方向的应力: " + textField_44.getText()
						+ System.getProperty("line.separator") + s2 + "焊缝的强度计算式: " + textField_45.getText()
						+ System.getProperty("line.separator") + s2 + "最大弯曲应力发生在翼缘焊缝的最外纤维处的应力: " + textField_46.getText()
						+ System.getProperty("line.separator") + s2 + "腹板焊缝承受两种应力的共同作用的弯曲应力: " + textField_47.getText() + System.getProperty("line.separator") + s2 + "腹板焊缝承受两种应力的共同作用的剪应力: " + textField_48.getText() 
						+ System.getProperty("line.separator") + s2 + "角钢肢背计算长度: " + textField_39.getText()
						+ System.getProperty("line.separator") + s2 + "角钢肢尖计算长度: " + textField_40.getText()
						+ System.getProperty("line.separator") + s2 + "有效截面的任一点上所受切线方向的剪应力: " + textField_49.getText()
						+ System.getProperty("line.separator") + s2 + "在扭矩T作用下，A点（或点）的应力: " + textField_50.getText()
						+ System.getProperty("line.separator") + s2 + "A点引起的应力: " + textField_51.getText()
						+ System.getProperty("line.separator") + s2 + "垂直于焊缝长度方向的应力: " + textField_52.getText()
						+ System.getProperty("line.separator") + s2 + "A点的应力满足的强度条件: " + textField_53.getText()
						+ System.getProperty("line.separator") + s2 + "轴心力作用的对接焊缝应力: " + textField_54.getText()
						+ System.getProperty("line.separator") + s2 + "轴心力作用的对接焊缝的正应力: " + textField_55.getText() + System.getProperty("line.separator")+ s2 + "轴心力作用的对接焊缝的剪应力: " + textField_56.getText() + System.getProperty("line.separator") + s1;
			}
//			if(highStrength.)
			if (outPutTxt.length() == 7) {
				JOptionPane.showConfirmDialog(null, "内容为空！");
			} else {
				Filewriter.printToTxt(outPutTxt);
			}
		}
	}

}
