package ctgu.awt.frame.homepage.calFrame.weld;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.sun.webkit.event.WCChangeEvent;

import ctgu.Entity.WeldSectionCal;
import ctgu.Entity.weld.WeldAngleEntity;
import ctgu.Entity.weld.WeldObliqueEntity;
import ctgu.Entity.weld.WeldSectionEntity;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class WeldFrameSection extends FatherFrame implements ActionListener, ItemListener {

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

	public double X1;
	public double X2;
	public double Y;
	public double HE;

	public double V1;
	public double T1;

	public double Wffw;

	public double B1;

	public double AF;
	public double IFX;
	public double IFY;
	public double JF;

	public double FV;
	public double TF;
	public double OF;
	public double F1;

	public double se;

	JRadioButton radioButton;
	JRadioButton radioButton_1;
	JRadioButton radioButton_2;
	JRadioButton radioButton_3;
	JRadioButton radioButton_4;
	JRadioButton radioButton_5;

	JButton button;
	JButton button_1;
	JButton button_2;

	private JLabel picture1 = null;

	// 打印
	private String outPutTxt = "";

	// 保存
	private WeldSectionEntity weldSectionEntity = null;
	private JTextField textField_14;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeldSectionEntity weldSectionEntity = new WeldSectionEntity();
					WeldFrameSection frame = new WeldFrameSection(weldSectionEntity);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WeldFrameSection(WeldSectionEntity WES) {
		weldSectionEntity = WES;
		setTitle("工字型和H形截面梁角焊缝连接");
		System.out.println("初始化成功...");
		initSquare(WES);
		setResizable(false);
		setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	private void initSquare(WeldSectionEntity WES) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 100, 1190, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);// 居中

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"工字形示意图", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(14, 13, 470, 297);
		Icon icon1 = new ImageIcon(this.getClass().getResource("y1.png"));
		// ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 248, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
		picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(5, 14, 455, 271);
		panel.add(picture1);
		getContentPane().add(panel);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"焊缝截面信息", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(14, 337, 438, 171);
		contentPane.add(panel_1);

		JLabel label = new JLabel("焊缝长度x1:");
		label.setBounds(79, 29, 120, 18);
		panel_1.add(label);

		textField = new JTextField("0");
		textField.setText(weldSectionEntity.X1 == null ? "0" : String.valueOf(weldSectionEntity.X1));
		textField.setColumns(10);
		textField.setBounds(247, 26, 86, 24);
		panel_1.add(textField);

		textField_1 = new JTextField("0");
		textField.setText(weldSectionEntity.X2 == null ? "0" : String.valueOf(weldSectionEntity.X2));
		textField_1.setColumns(10);
		textField_1.setBounds(247, 63, 86, 24);
		panel_1.add(textField_1);

		JLabel label_1 = new JLabel("焊缝长度X2:");
		label_1.setBounds(79, 66, 154, 18);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("焊缝长度Y:");
		label_2.setBounds(79, 103, 154, 18);
		panel_1.add(label_2);

		textField_2 = new JTextField("0");
		textField_2.setText(weldSectionEntity.Y == null ? "0" : String.valueOf(weldSectionEntity.Y));
		textField_2.setColumns(10);
		textField_2.setBounds(247, 100, 86, 24);
		panel_1.add(textField_2);

		JLabel label_3 = new JLabel("<html><body>直角角焊缝的焊脚尺寸:</body></html>");
		label_3.setBounds(79, 137, 189, 21);
		panel_1.add(label_3);

		textField_3 = new JTextField("0");
		textField_3.setText(weldSectionEntity.HE == null ? "0" : String.valueOf(weldSectionEntity.HE));
		textField_3.setColumns(10);
		textField_3.setBounds(282, 134, 86, 24);
		panel_1.add(textField_3);

		label_16 = new JLabel("mm");
		label_16.setBounds(339, 29, 42, 18);
		panel_1.add(label_16);

		label_17 = new JLabel("mm");
		label_17.setBounds(339, 66, 42, 18);
		panel_1.add(label_17);

		label_18 = new JLabel("mm");
		label_18.setBounds(339, 103, 42, 18);
		panel_1.add(label_18);

		label_19 = new JLabel("mm");
		label_19.setBounds(371, 137, 42, 18);
		panel_1.add(label_19);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"焊缝受力", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(492, 13, 320, 140);
		contentPane.add(panel_2);

		JLabel label_4 = new JLabel("剪力V:");
		label_4.setBounds(14, 27, 154, 18);
		panel_2.add(label_4);

		textField_4 = new JTextField("0");
		textField_4.setText(weldSectionEntity.V1 == null ? "0" : String.valueOf(weldSectionEntity.V1));
		textField_4.setColumns(10);
		textField_4.setBounds(182, 61, 86, 24);
		panel_2.add(textField_4);

		JLabel label_5 = new JLabel("<html><body>拉力T<sub>1</sub>:</body></html>");
		label_5.setBounds(14, 64, 154, 24);
		panel_2.add(label_5);

		JLabel label_6 = new JLabel("轴力: N = 0");
		label_6.setBounds(14, 106, 154, 18);
		panel_2.add(label_6);

		textField_5 = new JTextField("0");
		textField_5.setText(weldSectionEntity.T1 == null ? "0" : String.valueOf(weldSectionEntity.T1));
		textField_5.setColumns(10);
		textField_5.setBounds(182, 24, 86, 24);
		panel_2.add(textField_5);

		label_20 = new JLabel("N");
		label_20.setBounds(278, 27, 42, 18);
		panel_2.add(label_20);

		label_21 = new JLabel("<html><body>N/mm</body></html>");
		label_21.setBounds(278, 58, 42, 28);
		panel_2.add(label_21);

		button = new JButton("保存到历史纪录");
		button.setActionCommand("保存1");
		button.addActionListener(this);
		button.setBounds(988, 550, 162, 27);
		contentPane.add(button);

		button_1 = new JButton("下载到桌面");
		button_1.setActionCommand("打印1");
		button_1.addActionListener(this);
		button_1.setBounds(834, 550, 140, 27);
		contentPane.add(button_1);

		button_2 = new JButton("计算");
		button_2.setActionCommand("计算");
		button_2.addActionListener(this);
		button_2.setBounds(834, 510, 113, 27);
		contentPane.add(button_2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"钢材类型", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(492, 171, 326, 82);
		contentPane.add(panel_3);

		radioButton = new JRadioButton("Q345");
		radioButton.setBounds(55, 25, 96, 27);
		panel_3.add(radioButton);

		radioButton_1 = new JRadioButton("Q235");
		radioButton_1.setBounds(177, 25, 124, 27);
		panel_3.add(radioButton_1);

		radioButton.setActionCommand("Q345");
		radioButton_1.setActionCommand("Q235");
		radioButton.addActionListener(this);
		radioButton_1.addActionListener(this);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"焊缝截面特性", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(824, 13, 326, 216);
		contentPane.add(panel_4);

		JLabel label_7 = new JLabel("<html><body>角焊缝有效截面面积A<sub>f</sub>:</body></html>");
		label_7.setBounds(14, 63, 186, 21);
		panel_4.add(label_7);

		textField_6 = new JTextField("0");
		textField_6.setText(weldSectionEntity.AF == null ? "0" : String.valueOf(weldSectionEntity.AF));
		textField_6.setColumns(10);
		textField_6.setBounds(192, 60, 86, 24);
		panel_4.add(textField_6);

		textField_7 = new JTextField("0");
		textField_7.setText(weldSectionEntity.IFX == null ? "0" : String.valueOf(weldSectionEntity.IFX));
		textField_7.setColumns(10);
		textField_7.setBounds(182, 97, 86, 24);
		panel_4.add(textField_7);

		JLabel label_8 = new JLabel("<html><body>对x轴惯性矩I<sub>fX</sub>:</body></html>");
		label_8.setBounds(14, 100, 154, 21);
		panel_4.add(label_8);

		JLabel label_9 = new JLabel("<html><body>对y轴惯性矩I<sub>fy</sub>:</body></html>");
		label_9.setBounds(14, 130, 154, 35);
		panel_4.add(label_9);

		textField_8 = new JTextField("0");
		textField_8.setText(weldSectionEntity.IFY == null ? "0" : String.valueOf(weldSectionEntity.IFY));
		textField_8.setColumns(10);
		textField_8.setBounds(182, 134, 86, 24);
		panel_4.add(textField_8);

		JLabel label_10 = new JLabel("<html><body>极惯性矩J<sub>f</sub>:</body></html>");
		label_10.setBounds(14, 171, 154, 28);
		panel_4.add(label_10);

		textField_9 = new JTextField("0");
		textField_9.setText(weldSectionEntity.JF == null ? "0" : String.valueOf(weldSectionEntity.JF));
		textField_9.setColumns(10);
		textField_9.setBounds(182, 175, 86, 24);
		panel_4.add(textField_9);

		textField_14 = new JTextField("0");
		textField_14.setText(weldSectionEntity.Wffw == null ? "0" : String.valueOf(weldSectionEntity.Wffw));
		textField_14.setColumns(10);
		textField_14.setBounds(182, 29, 86, 24);
		panel_4.add(textField_14);

		JLabel label_15 = new JLabel("<html><body>角焊缝强度设计值f<sub>f</sub><sup>w</sup>:</body></html>");
		label_15.setBounds(14, 25, 154, 29);
		panel_4.add(label_15);

		label_22 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_22.setBounds(282, 25, 42, 28);
		panel_4.add(label_22);

		label_23 = new JLabel("<html><body>mm<sup>2</sup></body></html>");
		label_23.setBounds(282, 56, 42, 28);
		panel_4.add(label_23);

		label_24 = new JLabel("<html><body>mm<sup>4</sup></body></html>");
		label_24.setBounds(282, 93, 42, 28);
		panel_4.add(label_24);

		label_25 = new JLabel("<html><body>mm<sup>4</sup></body></html>");
		label_25.setBounds(282, 130, 42, 28);
		panel_4.add(label_25);

		label_26 = new JLabel("<html><body>mm<sup>4</sup></body></html>");
		label_26.setBounds(282, 171, 42, 28);
		panel_4.add(label_26);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(253, 253, 241));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"焊缝计算各应力值", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(824, 231, 346, 171);
		contentPane.add(panel_5);

		JLabel label_11 = new JLabel("<html><body>剪力作用下应力σ<sub>v</sub><sup>f</sup>:</body></html>");
		label_11.setBounds(14, 27, 183, 35);
		panel_5.add(label_11);

		textField_10 = new JTextField("0");
		textField_10.setText(weldSectionEntity.FV == null ? "0" : String.valueOf(weldSectionEntity.FV));
		textField_10.setColumns(10);
		textField_10.setBounds(211, 32, 86, 24);
		panel_5.add(textField_10);

		textField_11 = new JTextField("0");
		textField_11.setText(weldSectionEntity.TF == null ? "0" : String.valueOf(weldSectionEntity.TF));
		textField_11.setColumns(10);
		textField_11.setBounds(221, 68, 86, 24);
		panel_5.add(textField_11);

		JLabel label_12 = new JLabel("<html><body>拉矩作用最大应力分力τ<sub>f</sub><sup>τ</sup>:</body></html>");
		label_12.setBounds(14, 61, 201, 35);
		panel_5.add(label_12);

		JLabel label_13 = new JLabel("<html><body>拉矩作用最大应力分力σ<sub>f</sub><sup>τ</sup>:</body></html>");
		label_13.setBounds(14, 98, 201, 28);
		panel_5.add(label_13);

		textField_12 = new JTextField("0");
		textField_12.setText(weldSectionEntity.OF == null ? "0" : String.valueOf(weldSectionEntity.OF));
		textField_12.setColumns(10);
		textField_12.setBounds(221, 102, 86, 24);
		panel_5.add(textField_12);

		textField_13 = new JTextField("0");
		textField_13.setText(weldSectionEntity.F1 == null ? "0" : String.valueOf(weldSectionEntity.F1));
		textField_13.setColumns(10);
		textField_13.setBounds(211, 132, 86, 24);
		panel_5.add(textField_13);

		JLabel label_14 = new JLabel("最大应力处的焊缝强度f:");
		label_14.setBounds(14, 135, 183, 18);
		panel_5.add(label_14);

		label_27 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_27.setBounds(304, 125, 42, 28);
		panel_5.add(label_27);

		label_28 = new JLabel("N");
		label_28.setBounds(304, 35, 28, 18);
		panel_5.add(label_28);

		label_29 = new JLabel("N");
		label_29.setBounds(314, 71, 18, 18);
		panel_5.add(label_29);

		label_30 = new JLabel("N");
		label_30.setBounds(314, 105, 18, 18);
		panel_5.add(label_30);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(253, 253, 241));
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"验算结果", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(824, 415, 346, 82);
		contentPane.add(panel_6);

		radioButton_2 = new JRadioButton("通过(true)");
		radioButton_2.setEnabled(false);
		radioButton_2.setBounds(39, 31, 121, 27);
		panel_6.add(radioButton_2);

		radioButton_3 = new JRadioButton("未通过（false）");
		radioButton_3.setEnabled(false);
		radioButton_3.setBounds(166, 31, 151, 27);
		panel_6.add(radioButton_3);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"焊缝的强度增大系数", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(488, 266, 324, 126);
		contentPane.add(panel_7);

		radioButton_4 = new JRadioButton("正面角焊缝");
		radioButton_4.setActionCommand("正面角焊缝");
		radioButton_4.setBounds(35, 34, 191, 27);
		panel_7.add(radioButton_4);

		radioButton_5 = new JRadioButton("直接承受动力荷载结构中的角焊缝");
		radioButton_5.setActionCommand("直接承受动力荷载结构中的角焊缝");
		radioButton_5.setBounds(36, 66, 278, 27);
		panel_7.add(radioButton_5);

		radioButton_4.setActionCommand("正面角焊缝");
		radioButton_5.setActionCommand("直接承受动力荷载结构中的角焊缝");
		radioButton_4.addActionListener(this);
		radioButton_5.addActionListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("保存1")) {
			weldSectionEntity.X1 = X1;
			weldSectionEntity.X2 = X2;
			weldSectionEntity.Y = Y;
			weldSectionEntity.HE = HE;
			weldSectionEntity.V1 = V1;
			weldSectionEntity.T1 = T1;
			weldSectionEntity.Wffw = Wffw;
			weldSectionEntity.B1 = B1;
			weldSectionEntity.AF = AF;
			weldSectionEntity.IFX = IFX;
			weldSectionEntity.IFY = IFY;
			weldSectionEntity.JF = JF;
			weldSectionEntity.FV = FV;
			weldSectionEntity.TF = TF;
			weldSectionEntity.OF = OF;
			weldSectionEntity.F1 = F1;
			AnalysisXML.frameToXMl(weldSectionEntity);
		}

		if (e.getActionCommand().equals("打印1")) {
			String s1 = "  ";
			String s2 = "      ";
			outPutTxt = "工字形和H形焊缝计算: " + System.getProperty("line.separator") + s1;
			if (textField.getText() != null) {
				outPutTxt += "截面信息: " + System.getProperty("line.separator") + s2 + "焊缝长度X1:  " + textField.getText()
						+ " mm" + System.getProperty("line.separator") + s2 + "焊缝长度X2:  " + textField_1.getText()
						+ " mm" + System.getProperty("line.separator") + s2 + "焊缝长度Y:  " + textField_2.getText() + " mm"
						+ System.getProperty("line.separator") + s2 + "直角角焊缝的焊脚尺寸:  " + textField_3.getText() + " mm"
						+ System.getProperty("line.separator") + s1;
			}
			if (textField_4.getText() != null) {
				outPutTxt += "焊缝受力: " + System.getProperty("line.separator") + s2 + "剪力:  " + textField_5.getText()
						+ " N" + System.getProperty("line.separator") + s2 + "拉力:  " + textField_4.getText() + " N/mm"
						+ System.getProperty("line.separator") + s1;
			}
			if (textField_6.getText() != null) {
				outPutTxt += "材质及其他参数:" + System.getProperty("line.separator") + s2 + "角焊缝强度设计值: "
						+ textField_14.getText() + " N/mm²" + System.getProperty("line.separator") + s2 + "角焊缝有效截面面积: "
						+ textField_6.getText() + " mm²" + System.getProperty("line.separator") + s2 + "对x轴惯性矩: "
						+ textField_7.getText() + " mm⁴" + System.getProperty("line.separator") + s2 + "对y轴惯性矩: "
						+ textField_8.getText() + " mm⁴" + System.getProperty("line.separator") + s2 + "极惯性矩: "
						+ textField_9.getText() + " mm⁴" + System.getProperty("line.separator") + s1;
			}
			if (textField_10.getText() != null) {
				outPutTxt += "计算各应力值: " + System.getProperty("line.separator") + s2 + "剪力作用下应力:  "
						+ textField_10.getText() + " N" + System.getProperty("line.separator") + s2 + "拉矩作用最大应力分力: "
						+ textField_11.getText() + " N" + System.getProperty("line.separator") + s2 + "拉矩作用最大应力分力: "
						+ textField_12.getText() + " N" + System.getProperty("line.separator") + s2 + "最大应力处的焊缝强度: "
						+ textField_13.getText() + " N/mm²" + System.getProperty("line.separator") + s1;
			}
			// if(highStrength.)
			if (outPutTxt.length() == 7) {
				JOptionPane.showConfirmDialog(null, "内容为空！");
			} else {
				Filewriter.printToTxt(outPutTxt);
			}
		}
		if (e.getActionCommand().equals("Q345")) {
			Wffw = 200;
			textField_14.setText(String.valueOf(Wffw));
			radioButton_1.setSelected(false);
		}
		if (e.getActionCommand().equals("Q235")) {
			Wffw = 160;
			textField_14.setText(String.valueOf(Wffw));
			radioButton.setSelected(false);
		}

		if (e.getActionCommand().equals("正面角焊缝")) {
			B1 = 1.22;
			radioButton_5.setSelected(false);
		}
		if (e.getActionCommand().equals("直接承受动力荷载结构中的角焊缝")) {
			B1 = 1.0;
			radioButton_4.setSelected(false);
		}
//		Double.valueOf(textField.getText().trim()) == 0 || Double.valueOf(textField_1.getText().trim()) ==0 || Double.valueOf(textField_2.getText().trim()) ==0 || Double.valueOf(textField_3.getText().trim()) ==0||
//		Double.valueOf(textField_4.getText().trim()) == 0 || Double.valueOf(textField_5.getText().trim()) ==0
		if (e.getActionCommand().equals("计算")) {
			if (!textField.getText().trim().matches("^[0.0-9.0]+$")
					|| !textField_1.getText().trim().matches("^[0.0-9.0]+$")
					|| !textField_2.getText().trim().matches("^[0.0-9.0]+$")
					|| !textField_3.getText().trim().matches("^[0.0-9.0]+$")
					|| !textField_4.getText().trim().matches("^[0.0-9.0]+$")
					|| !textField_5.getText().trim().matches("^[0.0-9.0]+$")) {
				JOptionPane.showMessageDialog(null, "输入不合法或者有为输入为0", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				X1 = Double.valueOf(textField.getText().trim());
				X2 = Double.valueOf(textField_1.getText().trim());
				Y = Double.valueOf(textField_2.getText().trim());
				HE = Double.valueOf(textField_3.getText().trim());
				V1 = Double.valueOf(textField_4.getText().trim());
				T1 = Double.valueOf(textField_5.getText().trim());

				WeldSectionCal wc = new WeldSectionCal(X1, X2, Y, HE, V1, T1, Wffw, B1);

				AF = wc.setAs();
				IFX = wc.setXXJ();
				IFY = wc.setYXJ();
				JF = wc.setJXJ();
				FV = wc.setOFV();
				TF = wc.setTFO();
				OF = wc.setOFT();
				F1 = wc.setF1();

				if (F1 <= Wffw) {
					radioButton_2.setEnabled(true);
					radioButton_2.setSelected(true);
				} else {
					radioButton_3.setEnabled(true);
					radioButton_3.setSelected(true);
				}

				textField_6.setText(String.format("%.2f", AF));
				textField_7.setText(String.format("%.2f", IFX));
				textField_8.setText(String.format("%.2f", IFY));
				textField_9.setText(String.format("%.2f", JF));
				textField_10.setText(String.format("%.2f", FV));
				textField_11.setText(String.format("%.2f", TF));
				textField_12.setText(String.format("%.2f", OF));
				textField_13.setText(String.format("%.2f", F1));
			}

		}

	}
}
