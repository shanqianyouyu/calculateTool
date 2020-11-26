package ctgu.awt.frame.homepage.calFrame.weld;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

import ctgu.Entity.WeldAngleCal;
import ctgu.Entity.WeldCal;
import ctgu.Entity.Square.SquareEnity;
import ctgu.Entity.weld.WeldAngleEntity;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.Filewriter;
import ctgu.awt.util.Tool;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class WeldFrameAngle extends FatherFrame implements ActionListener, ItemListener{

	private JFrame frame;

	private boolean seb;
	private JTextField textField_3;
	private double wt3;
	private JTextField textField_4;
	private double wt4;
	private JTextField textField_5;
	private double wt5;
	private JTextField textField_6;
	private double wt6;
	private double wt7;
	private double wt8;
	private JTextField textField_9;
	private double wt9;
	private JTextField textField_10;
	private double wt10;
	private JTextField textField_11;
	private double wt11;
	private JTextField textField_12;
	private double wt12;
	private JTextField textField_13;
	private double wt13;
	private JTextField textField_14;
	private double wt14;
	private JTextField textField_15;
	private double wt15;
	
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	JRadioButton radioButton_2;
	JRadioButton radioButton_3;
	JRadioButton radioButton_4;
	JRadioButton radioButton_5;
	
	public double R1;
	public double R2;
	public double R3;
	
	//轴力，剪力，弯矩
	public double WM;
	public double WN;
	public double WV;
	
	//角焊缝强度设计值
	public double Wffw;
	
	//增大系数
	public double B1;
	
	//截面模量，惯性矩，角焊缝有效截面面积
	public double Waf;
	public double WIW;
	public double WWFX;
	
	//应力计算结果
	public double WON;
	public double WOM;
	public double WOMAX;
	public double WTMAX;
	public double QJ;
	
	public double se;
	
	String w1;
	String w2;
	String w3;
	String w4;
	String w5;
	String w6;
	String w7;
	String w8;
	
	private JLabel picture1 = null;
	
	// 打印
	private String outPutTxt = "";

	// 保存
	private WeldAngleEntity weldAngleEntity = null;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeldAngleEntity we = new WeldAngleEntity();
					WeldFrameAngle window = new WeldFrameAngle(we);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WeldFrameAngle(WeldAngleEntity WE) {
		weldAngleEntity = WE;
		setTitle("抱杆计算");
		System.out.println("初始化成功...");
		initSquare(WE);
		setResizable(false);
		setVisible(true);
	}

	/**
	 * Create the application.
	 */
	private void initSquare(WeldAngleEntity WE) {
		setTitle("常用直角焊缝计算");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 100, 1010, 757);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);// 居中
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"焊缝受力示意图（受弯矩,剪力,轴力）", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(14, 13, 304, 311);
		Icon icon1 = new ImageIcon(this.getClass().getResource("f3.png"));
		// ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 240, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
		picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(14, 24, 276, 274);
		panel.add(picture1);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"截面信息", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(14, 337, 304, 134);
		getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("<html><body>输入多个截面信息变量<br/>（焊缝的几何尺寸）</body></html>");
		btnNewButton.setActionCommand("输入多个截面信息变量");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(27, 39, 240, 62);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"焊缝受力", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(14, 484, 304, 134);
		getContentPane().add(panel_2);
		
		JLabel label_2 = new JLabel("弯矩M:");
		label_2.setBounds(14, 27, 120, 18);
		panel_2.add(label_2);
		
		textField_3 = new JTextField("0");
		textField_3.setText(weldAngleEntity.WM == null ? "0" : String.valueOf(weldAngleEntity.WM));
		textField_3.setColumns(10);
		textField_3.setBounds(148, 24, 86, 24);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField("0");
		textField_4.setText(weldAngleEntity.WN == null ? "0" : String.valueOf(weldAngleEntity.WN));
		textField_4.setColumns(10);
		textField_4.setBounds(148, 61, 86, 24);
		panel_2.add(textField_4);
		
		JLabel label_4 = new JLabel("轴力N:");
		label_4.setBounds(14, 64, 154, 18);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("剪力V:");
		label_5.setBounds(14, 101, 154, 18);
		panel_2.add(label_5);
		
		textField_5 = new JTextField("0");
		textField_5.setText(weldAngleEntity.WV == null ? "0" : String.valueOf(weldAngleEntity.WV));
		textField_5.setColumns(10);
		textField_5.setBounds(148, 98, 86, 24);
		panel_2.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("N*mm");
		lblNewLabel.setBounds(248, 27, 42, 18);
		panel_2.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("N");
		label_1.setBounds(248, 64, 42, 18);
		panel_2.add(label_1);
		
		JLabel label_3 = new JLabel("N");
		label_3.setBounds(248, 101, 42, 18);
		panel_2.add(label_3);
		
		JButton button = new JButton("保存");
		button.setActionCommand("保存");
		button.addActionListener(this);
		button.setBounds(87, 658, 113, 27);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("打印");
		button_1.setActionCommand("打印");
		button_1.addActionListener(this);
		button_1.setBounds(430, 658, 113, 27);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("计算");
		button_2.setActionCommand("计算");
		button_2.addActionListener(this);
		button_2.setBounds(807, 658, 113, 27);
		getContentPane().add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
						"钢材类型", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(332, 23, 324, 74);
		getContentPane().add(panel_3);
		
		radioButton = new JRadioButton("Q345");
		radioButton.setBounds(67, 24, 96, 27);
		panel_3.add(radioButton);
		
		radioButton_1 = new JRadioButton("Q235");
		radioButton_1.setBounds(169, 24, 119, 27);
		panel_3.add(radioButton_1);
		
		radioButton.setActionCommand("Q345");
		radioButton_1.setActionCommand("Q235");
		radioButton.addActionListener(this);
		radioButton_1.addActionListener(this);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"材质属性", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(330, 120, 326, 142);
		getContentPane().add(panel_4);
		
		JLabel label_6 = new JLabel("<html><body>角焊缝强度设计值f<sub>f</sub><sup>w</sup>:</body></html>");
		label_6.setBounds(14, 17, 154, 34);
		panel_4.add(label_6);
		
		textField_6 = new JTextField("0");
		textField_6.setText(weldAngleEntity.Wffw == null ? "0" : String.valueOf(weldAngleEntity.Wffw));
		textField_6.setColumns(10);
		textField_6.setBounds(182, 24, 86, 24);
		panel_4.add(textField_6);
		
		JLabel label_7 = new JLabel("<html><body>正面角焊缝强度增大系数:β<sub>f</sub>=1.22</body></html>");
		label_7.setBounds(14, 64, 254, 24);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("<html><body>直接承受动力荷载结构中的角焊缝:β<sub>f</sub>=1.0</body></html>");
		label_8.setBounds(14, 101, 298, 28);
		panel_4.add(label_8);
		
		JLabel label_16 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_16.setBounds(282, 17, 42, 28);
		panel_4.add(label_16);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(253,253,241));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
												"角焊缝计算截面特性", TitledBorder.LEADING,
												TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(332, 414, 326, 142);
		getContentPane().add(panel_5);
		
		JLabel label_9 = new JLabel("<html><body>角焊缝有效截面面积A<sub>f</sub>:</body></html>");
		label_9.setBounds(14, 27, 186, 24);
		panel_5.add(label_9);
		
		textField_9 = new JTextField("0");
		textField_9.setText(weldAngleEntity.Waf == null ? "0" : String.valueOf(weldAngleEntity.Waf));
		textField_9.setColumns(10);
		textField_9.setBounds(198, 26, 86, 24);
		panel_5.add(textField_9);
		
		textField_10 = new JTextField("0");
		textField_10.setText(weldAngleEntity.WIW == null ? "0" : String.valueOf(weldAngleEntity.WIW));
		textField_10.setColumns(10);
		textField_10.setBounds(182, 61, 86, 24);
		panel_5.add(textField_10);
		
		JLabel label_10 = new JLabel("<html><body>惯性矩I<sub>w</sub>:</body></html>");
		label_10.setBounds(14, 64, 154, 24);
		panel_5.add(label_10);
		
		JLabel label_11 = new JLabel("<html><body>截面模量W<sub>fx</sub>:</body></html>");
		label_11.setBounds(14, 101, 154, 21);
		panel_5.add(label_11);
		
		textField_11 = new JTextField("0");
		textField_11.setText(weldAngleEntity.WWFX == null ? "0" : String.valueOf(weldAngleEntity.WWFX));
		textField_11.setColumns(10);
		textField_11.setBounds(182, 98, 86, 24);
		panel_5.add(textField_11);
		
		JLabel label_17 = new JLabel("<html><body>mm<sup>2</sup></body></html>");
		label_17.setBounds(298, 23, 42, 28);
		panel_5.add(label_17);
		
		JLabel label_18 = new JLabel("<html><body>mm<sup>4</sup></body></html>");
		label_18.setBounds(282, 57, 42, 28);
		panel_5.add(label_18);
		
		JLabel label_19 = new JLabel("<html><body>mm<sup>3</sup></body></html>");
		label_19.setBounds(282, 94, 42, 28);
		panel_5.add(label_19);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(253,253,241));
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
														"角焊缝计算各应力值", TitledBorder.LEADING,
														TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(670, 23, 320, 214);
		getContentPane().add(panel_6);
		
		JLabel label_12 = new JLabel("<html><body>拉力作用下应力σ<sub>N</sub>:</body></html>");
		label_12.setBounds(14, 27, 164, 21);
		panel_6.add(label_12);
		
		textField_12 = new JTextField("0");
		textField_12.setText(weldAngleEntity.WON == null ? "0" : String.valueOf(weldAngleEntity.WON));
		textField_12.setColumns(10);
		textField_12.setBounds(182, 24, 86, 24);
		panel_6.add(textField_12);
		
		textField_13 = new JTextField("0");
		textField_13.setText(weldAngleEntity.WOM == null ? "0" : String.valueOf(weldAngleEntity.WOM));
		textField_13.setColumns(10);
		textField_13.setBounds(182, 64, 86, 24);
		panel_6.add(textField_13);
		
		JLabel label_13 = new JLabel("<html><body>剪应力σ<sub>M</sub>:</body></html>");
		label_13.setBounds(14, 64, 154, 21);
		panel_6.add(label_13);
		
		JLabel label_14 = new JLabel("<html><body>弯矩作用下应力σ<sub>max</sub>:</body></html>");
		label_14.setBounds(14, 101, 164, 33);
		panel_6.add(label_14);
		
		textField_14 = new JTextField("0");
		textField_14.setText(weldAngleEntity.WOMAX == null ? "0" : String.valueOf(weldAngleEntity.WOMAX));
		textField_14.setColumns(10);
		textField_14.setBounds(182, 104, 86, 24);
		panel_6.add(textField_14);
		
		textField_15 = new JTextField("0");
		textField_15.setText(weldAngleEntity.WTMAX == null ? "0" : String.valueOf(weldAngleEntity.WTMAX));
		textField_15.setColumns(10);
		textField_15.setBounds(182, 141, 86, 24);
		panel_6.add(textField_15);
		
		JLabel label_15 = new JLabel("<html><body>正应力τ<sub>max</sub>:</body></html>");
		label_15.setBounds(14, 142, 154, 24);
		panel_6.add(label_15);
		
		JLabel label = new JLabel("角焊缝强度计算值f:");
		label.setBounds(14, 181, 154, 18);
		panel_6.add(label);
		
		textField = new JTextField("0");
		textField.setText(weldAngleEntity.QJ == null ? "0" : String.valueOf(weldAngleEntity.QJ));
		textField.setColumns(10);
		textField.setBounds(182, 178, 86, 24);
		panel_6.add(textField);
		
		JLabel label_20 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_20.setBounds(278, 20, 42, 28);
		panel_6.add(label_20);
		
		JLabel label_21 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_21.setBounds(278, 61, 42, 28);
		panel_6.add(label_21);
		
		JLabel label_22 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_22.setBounds(278, 101, 42, 27);
		panel_6.add(label_22);
		
		JLabel label_23 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_23.setBounds(278, 141, 42, 21);
		panel_6.add(label_23);
		
		JLabel label_24 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_24.setBounds(278, 173, 42, 28);
		panel_6.add(label_24);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(253,253,241));
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"验算结果", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(670, 250, 320, 74);
		getContentPane().add(panel_7);
		
		radioButton_2 = new JRadioButton("通过(true)");
		radioButton_2.setBounds(26, 25, 127, 27);
		radioButton_2.setEnabled(false);
		panel_7.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("未通过（false）");
		radioButton_3.setEnabled(false);
		radioButton_3.setBounds(159, 25, 151, 27);
		panel_7.add(radioButton_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"焊缝的强度增大系数", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(332, 275, 324, 126);
		getContentPane().add(panel_8);
		
		radioButton_4 = new JRadioButton("正面角焊缝");
		radioButton_4.setBounds(35, 34, 191, 27);
		panel_8.add(radioButton_4);
		
		radioButton_5 = new JRadioButton("直接承受动力荷载结构中的角焊缝");
		radioButton_5.setBounds(36, 66, 278, 27);
		panel_8.add(radioButton_5);
		
		radioButton_4.setActionCommand("正面角焊缝");
		radioButton_5.setActionCommand("直接承受动力荷载结构中的角焊缝");
		radioButton_4.addActionListener(this);
		radioButton_5.addActionListener(this);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		WeldFrameN wN = new WeldFrameN();
		if (e.getActionCommand().equals("输入多个截面信息变量")) {
			JOptionPane.showMessageDialog(null, "请输入连续不断的焊脚尺寸和焊缝计算长度", "提示",JOptionPane.WARNING_MESSAGE); 
		     wN.setVisible(true);
		}
		
		
		if (e.getActionCommand().equals("Q345")) {
			Wffw = 200;
			w1 = String.valueOf(Wffw);
			textField_6.setText(w1);
			radioButton_1.setSelected(false);
		}
		if (e.getActionCommand().equals("Q235")) {
			Wffw = 160;
			w1 = String.valueOf(Wffw);
			textField_6.setText(w1);
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
		//|| Double.valueOf(textField_3.getText().trim()) == 0 || Double.valueOf(textField_4.getText().trim()) == 0
		//|| Double.valueOf(textField_5.getText().trim()) == 0 || Double.valueOf(textField_6.getText().trim()) == 0
		if(e.getActionCommand().equals("计算")) {
			if(!textField_3.getText().trim().matches("^[0.0-9.0]+$") || !textField_4.getText().trim().matches("^[0.0-9.0]+$") ||
					!textField_5.getText().trim().matches("^[0.0-9.0]+$") || !textField_6.getText().trim().matches("^[0.0-9.0]+$")
					)
			 {
				JOptionPane.showMessageDialog(null,"输入不合法","ERROR",JOptionPane.ERROR_MESSAGE);
			} else{
				//轴力，剪力，弯矩
				WM = Double.valueOf(textField_3.getText().trim());
				WN = Double.valueOf(textField_4.getText().trim());
				WV = Double.valueOf(textField_5.getText().trim());
				
				WeldAngleCal weld = new WeldAngleCal(WM, WN, WV, Wffw, Weldn.R1, Weldn.R2, Weldn.R3,B1);
				
				Waf = Tool.forMat(weld.setAngleS());
				WIW = Tool.forMat(weld.setGuanX());
				WWFX = Tool.forMat(weld.setJMML());
				
				WON = Tool.forMat(weld.setLF());
				WOM = Tool.forMat(weld.setWF());
				WOMAX = Tool.forMat(weld.setZYL());
				WTMAX = Tool.forMat(weld.setJYL());
				QJ = Tool.forMat(weld.setYS());
				
				if(QJ<=Wffw){
					radioButton_2.setEnabled(true);
					radioButton_2.setSelected(true);
					se = 1;
				}else{
					radioButton_3.setEnabled(true);
					radioButton_3.setSelected(true);
					se = 0;
				}
				//
				textField_9.setText(String.format("%.2f", Waf));
				textField_10.setText(String.format("%.2f", WIW));
				textField_11.setText(String.format("%.2f", WWFX));
				textField_12.setText(String.format("%.2f", WON));
				textField_13.setText(String.format("%.2f", WOM));
				textField_14.setText(String.format("%.2f", WOMAX));
				textField_15.setText(String.format("%.2f", WTMAX));
				textField.setText(String.format("%.2f", QJ));
			}
		}
		if(e.getActionCommand().equals("保存")) {
			weldAngleEntity.WM = WM;
			weldAngleEntity.WN = WN;
			weldAngleEntity.WV = WV;
			weldAngleEntity.B1 = B1;
			weldAngleEntity.Wffw = Wffw;
			weldAngleEntity.Waf = Waf;
			weldAngleEntity.WIW = WIW;
			weldAngleEntity.WWFX = WWFX;;
			weldAngleEntity.WON = WON;
			weldAngleEntity.WOMAX = WOMAX;
			weldAngleEntity.WTMAX = WTMAX;
			weldAngleEntity.WOM = WOM;
			weldAngleEntity.QJ = QJ;
		    weldAngleEntity.SE = se;
			AnalysisXML.frameToXMl(weldAngleEntity);
		}
		
		if(e.getActionCommand().equals("打印")) {
			String s1 = "  ";
			String s2 = "      ";
			outPutTxt = "常用直角焊缝计算: " + System.getProperty("line.separator") + s1;
			if (textField_3.getText() != null) {
				outPutTxt += "焊缝受力: " + System.getProperty("line.separator") + s2 + "弯矩:  " + textField_3.getText()
				+ System.getProperty("line.separator") + s2 + "轴力:  " + textField_4.getText()
				+ System.getProperty("line.separator") + s2 + "剪力:  " + textField_5.getText()
				+ System.getProperty("line.separator") + s1;
						
			}
			if (textField_6.getText() != null) {
				outPutTxt += "材质属性: " + System.getProperty("line.separator") + s2 + "角焊缝强度设计值:  " + textField_6.getText()
				+ System.getProperty("line.separator") + s1;		
			}
			if (textField_9.getText() != null) {
				outPutTxt += "计算截面属性:" + System.getProperty("line.separator") + s2 + "被吊构件的质量: " + textField_9.getText()
				+ System.getProperty("line.separator") + s2 + "惯性矩: " + textField_10.getText()
				+ System.getProperty("line.separator") + s2 + "截面模量: " + textField_11.getText()
				+ System.getProperty("line.separator") + s1;		
			}
			if (textField_12.getText() != null) {
				outPutTxt += "计算各应力值: " + System.getProperty("line.separator") + s2 + "拉力作用下应力:  " + textField_12.getText()
				+ System.getProperty("line.separator") + s2 + "剪应力: " + textField_13.getText()
				+ System.getProperty("line.separator") + s2 + "弯矩作用下应力: " + textField_14.getText()
				+ System.getProperty("line.separator") + s2 + "正应力: " + textField_15.getText()
				+ System.getProperty("line.separator") + s2 + "角焊缝强度计算值: " + textField.getText()
				+ System.getProperty("line.separator") + s1;
			}
			outPutTxt += "验算: " + System.getProperty("line.separator") + s1 + se;
			// if(highStrength.)
			if (outPutTxt.length() == 7) {
				JOptionPane.showConfirmDialog(null, "内容为空！");
			} else {
				Filewriter.printToTxt(outPutTxt);
			}
		}
		
	}
}
