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

import org.omg.CORBA.PRIVATE_MEMBER;

import ctgu.Entity.WeldObliqueCal;
import ctgu.Entity.weld.WeldAngleEntity;
import ctgu.Entity.weld.WeldObliqueEntity;
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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class WeldFrameOblique extends FatherFrame implements ActionListener, ItemListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	public double HF;
	public double HE;
	public double LW;
	public double O1;
	
	public double FZ;
	
	public double Wffw;
	
	//其他参数
	public double B1 = 1.0;	
	
	public double OT;
	public double OM = 0.0;
	public double OMAX;
	public double JF1 = 0.0;
	public double ZF1;
	public double F3;
	
	public double se;
	
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	JRadioButton radioButton_2;
	JRadioButton radioButton_3;
		
	private JLabel picture1 = null;
	
	// 打印
	private String outPutTxt = "";
	
	//保存
	private WeldObliqueEntity weldObliqueEntity = null;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeldObliqueEntity weo = new WeldObliqueEntity();
					WeldFrameOblique frame = new WeldFrameOblique(weo);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public WeldFrameOblique(WeldObliqueEntity WEO) {
		weldObliqueEntity = WEO;
		setTitle("抱杆计算");
		System.out.println("初始化成功...");
		initSquare(WEO);
		setResizable(false);
		setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	private void initSquare(WeldObliqueEntity WEO) {
		setTitle("斜角角焊缝");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 100, 1180, 707);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);// 居中
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"示意图", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(14, 0, 424, 373);
		Icon icon1 = new ImageIcon(this.getClass().getResource("angle4.png"));
		// ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 360, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
		picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(14, 13, 396, 347);
		panel.add(picture1);
		getContentPane().add(panel);
		contentPane.add(panel);
		
		JButton button = new JButton("保存");
		button.setActionCommand("保存");
		button.addActionListener(this);
		button.setBounds(148, 583, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("打印");
		button_1.setActionCommand("打印");
		button_1.addActionListener(this);
		button_1.setBounds(505, 583, 113, 27);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("计算");
		button_2.setActionCommand("计算");
		button_2.addActionListener(this);
		button_2.setBounds(852, 583, 113, 27);
		contentPane.add(button_2);
		
		JLabel lblNewLabel = new JLabel("<html><body>两焊脚边夹角a（60<sup>。</sup> ≤ a ≤ 135 	<sup>。</sup>）（规定）</body></html>");
		lblNewLabel.setBounds(14, 360, 378, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"角焊缝截面信息", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(452, 23, 379, 183);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("<html><body>焊脚尺寸h<sub>f</sub>:</body></html>");
		label.setBounds(14, 28, 120, 21);
		panel_1.add(label);
		
		textField = new JTextField("0");
		textField.setText(weldObliqueEntity.HF == null ? "0" : String.valueOf(weldObliqueEntity.HF));
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				textField_1.setText(String.format("%.2f", 0.7*Double.valueOf(textField.getText().trim())));
			}
		});
		textField.setColumns(10);
		textField.setBounds(219, 25, 86, 24);
		panel_1.add(textField);
		
		textField_1 = new JTextField("0");
		textField_1.setText(weldObliqueEntity.HE == null ? "0" : String.valueOf(weldObliqueEntity.HE));
		textField_1.setColumns(10);
		textField_1.setBounds(274, 62, 68, 24);
		panel_1.add(textField_1);
		
		JLabel label_1 = new JLabel("<html><body>直角角焊缝的有效厚度h<sub>e</sub>(不用输入):</body></html>");
		label_1.setBounds(14, 65, 250, 24);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("<html><body>焊缝的有效计算长度l<sub>w</sub>:</body></html>");
		label_2.setBounds(14, 102, 181, 21);
		panel_1.add(label_2);
		
		textField_2 = new JTextField("0");
		textField_2.setText(weldObliqueEntity.LW == null ? "0" : String.valueOf(weldObliqueEntity.LW));
		textField_2.setColumns(10);
		textField_2.setBounds(219, 99, 86, 24);
		panel_1.add(textField_2);
		
		JLabel label_6 = new JLabel("<html><body>轴力与水平方向夹角Θ:</body></html>");
		label_6.setBounds(17, 136, 178, 18);
		panel_1.add(label_6);
		
		textField_4 = new JTextField("0");
		textField_4.setText(weldObliqueEntity.O1 == null ? "0" : String.valueOf(weldObliqueEntity.O1));
		textField_4.setColumns(10);
		textField_4.setBounds(219, 133, 86, 24);
		panel_1.add(textField_4);
		
		JLabel label_14 = new JLabel("mm");
		label_14.setBounds(311, 28, 42, 18);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("mm");
		label_15.setBounds(311, 102, 42, 18);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("mm");
		label_16.setBounds(348, 65, 17, 18);
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_17.setBounds(311, 132, 42, 18);
		panel_1.add(label_17);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"焊缝受力", TitledBorder.LEADING,
								TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(14, 413, 394, 140);
		contentPane.add(panel_2);
		
		JLabel label_3 = new JLabel("弯矩: M = 0");
		label_3.setBounds(14, 30, 254, 18);
		panel_2.add(label_3);
		
		textField_3 = new JTextField("0");
		textField_3.setText(weldObliqueEntity.FZ == null ? "0" : String.valueOf(weldObliqueEntity.FZ));
		textField_3.setColumns(10);
		textField_3.setBounds(182, 61, 86, 24);
		panel_2.add(textField_3);
		
		JLabel label_4 = new JLabel("轴力N:");
		label_4.setBounds(14, 64, 154, 18);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("剪力: V = 0");
		label_5.setBounds(14, 106, 154, 18);
		panel_2.add(label_5);
		
		JLabel label_13 = new JLabel("N");
		label_13.setBounds(282, 64, 42, 18);
		panel_2.add(label_13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
										"钢材类型", TitledBorder.LEADING,
										TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(452, 210, 379, 82);
		contentPane.add(panel_3);
		
		radioButton = new JRadioButton("Q345");
		radioButton.setBounds(89, 25, 86, 27);
		panel_3.add(radioButton);
		
		radioButton_1 = new JRadioButton("Q235");
		radioButton_1.setBounds(199, 25, 109, 27);
		panel_3.add(radioButton_1);
		
		radioButton.setActionCommand("Q345");
		radioButton_1.setActionCommand("Q235");
		radioButton.addActionListener(this);
		radioButton_1.addActionListener(this);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(253,253,241));
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
																		"角焊缝计算各应力值", TitledBorder.LEADING,
																		TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(452, 305, 379, 241);
		contentPane.add(panel_4);
		
		JLabel label_7 = new JLabel("<html><body>轴力作用下应力σ<sub>⊥ </sub>:</body></html>");
		label_7.setBounds(36, 66, 163, 24);
		panel_4.add(label_7);
		
		textField_5 = new JTextField("0");
		textField_5.setText(weldObliqueEntity.OT == null ? "0" : String.valueOf(weldObliqueEntity.OT));
		textField_5.setColumns(10);
		textField_5.setBounds(233, 63, 86, 24);
		panel_4.add(textField_5);
		
		JLabel label_8 = new JLabel("剪应力应力分力1和弯矩作用下应力均为0");
		label_8.setBounds(36, 97, 295, 30);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("<html><body>剪应力应力分力τ<sub>max</sub>:</body></html>");
		label_9.setBounds(36, 135, 183, 30);
		panel_4.add(label_9);
		
		textField_7 = new JTextField("0");
		textField_7.setText(weldObliqueEntity.ZF1 == null ? "0" : String.valueOf(weldObliqueEntity.ZF1));
		textField_7.setColumns(10);
		textField_7.setBounds(233, 137, 86, 24);
		panel_4.add(textField_7);
		
		textField_8 = new JTextField("0");
		textField_8.setText(weldObliqueEntity.OMAX == null ? "0" : String.valueOf(weldObliqueEntity.OMAX));
		textField_8.setColumns(10);
		textField_8.setBounds(233, 171, 86, 24);
		panel_4.add(textField_8);
		
		JLabel label_10 = new JLabel("<html><body>正应力σ<sub>max</sub>:</body></html>");
		label_10.setBounds(36, 169, 183, 30);
		panel_4.add(label_10);
		
		JLabel label_11 = new JLabel("角焊缝强度计算值f:");
		label_11.setBounds(36, 207, 183, 18);
		panel_4.add(label_11);
		
		textField_9 = new JTextField("0");
		textField_9.setText(weldObliqueEntity.F3 == null ? "0" : String.valueOf(weldObliqueEntity.F3));
		textField_9.setColumns(10);
		textField_9.setBounds(233, 204, 86, 24);
		panel_4.add(textField_9);
		
		JLabel label_12 = new JLabel("<html><body>角焊缝强度设计值f<sub>f</sub><sup>w</sup>:</body></html>");
		label_12.setBounds(36, 26, 183, 30);
		panel_4.add(label_12);
		
		textField_10 = new JTextField("0");
		textField_10.setText(weldObliqueEntity.Wffw == null ? "0" : String.valueOf(weldObliqueEntity.Wffw));
		textField_10.setColumns(10);
		textField_10.setBounds(233, 31, 86, 24);
		panel_4.add(textField_10);
		
		JLabel label_18 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_18.setBounds(323, 26, 42, 28);
		panel_4.add(label_18);
		
		JLabel label_19 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_19.setBounds(323, 200, 42, 28);
		panel_4.add(label_19);
		
		JLabel label_20 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_20.setBounds(323, 68, 42, 22);
		panel_4.add(label_20);
		
		JLabel label_21 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_21.setBounds(323, 134, 42, 24);
		panel_4.add(label_21);
		
		JLabel label_22 = new JLabel("<html><body>N/mm<sup>2</sup></body></html>");
		label_22.setBounds(323, 171, 42, 21);
		panel_4.add(label_22);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(253,253,241));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
												"验算结果", TitledBorder.LEADING,
												TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(845, 23, 315, 74);
		contentPane.add(panel_5);
		
		radioButton_2 = new JRadioButton("通过(true)");
		radioButton_2.setBounds(26, 25, 122, 27);
		radioButton_2.setEnabled(false);
		panel_5.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("未通过（false）");
		radioButton_3.setBounds(154, 25, 151, 27);
		radioButton_3.setEnabled(false);
		panel_5.add(radioButton_3);
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Q345")) {
			Wffw = 200;
			textField_10.setText(String.valueOf(Wffw));
			radioButton_1.setSelected(false);
		}
		if (e.getActionCommand().equals("Q235")) {
			Wffw = 160;
			textField_10.setText(String.valueOf(Wffw));
			radioButton.setSelected(false);
		}
		//|| Double.valueOf(textField.getText().trim()) == 0 ||
		//Double.valueOf(textField_1.getText().trim()) == 0 || Double.valueOf(textField_2.getText().trim()) == 0 || Double.valueOf(textField_3.getText().trim()) == 0 || Double.valueOf(textField_4.getText().trim()) == 0
		//|| Double.valueOf(textField_10.getText().trim()) == 0
		if(e.getActionCommand().equals("计算")) {
			if(!textField.getText().trim().matches("^[0.0-9.0]+$") || !textField_1.getText().trim().matches("^[0.0-9.0]+$") ||
					!textField_2.getText().trim().matches("^[0.0-9.0]+$") || !textField_3.getText().trim().matches("^[0.0-9.0]+$") ||
							!textField_4.getText().trim().matches("^[0.0-9.0]+$")|| !textField_10.getText().trim().matches("^[0.0-9.0]+$"))
			 {
				JOptionPane.showMessageDialog(null,"输入不合法或者输入为0","ERROR",JOptionPane.ERROR_MESSAGE);
			} else{
				HF = Double.valueOf(textField.getText().trim());
				HE = Double.valueOf(textField_1.getText().trim());
				LW = Double.valueOf(textField_2.getText().trim());
				O1 = Double.valueOf(textField_4.getText().trim());
				FZ = Double.valueOf(textField_3.getText().trim());
				
				WeldObliqueCal woc = new WeldObliqueCal(HF,HE,LW,O1,FZ,Wffw);
				
				
				OT = woc.setZZF();
				OMAX = woc.setOMAX();
				ZF1 = woc.setJYL2();
				F3 = woc.setJJZ();
				
				if(F3<=Wffw){
					radioButton_2.setEnabled(true);
					radioButton_2.setSelected(true);
				}else{
					radioButton_3.setEnabled(true);
					radioButton_3.setSelected(true);
				}
				
				//
				textField_5.setText(String.format("%.2f", OT));
				textField_7.setText(String.format("%.2f", ZF1));
				textField_8.setText(String.format("%.2f", OMAX));
				textField_9.setText(String.format("%.2f", F3));
			}
		}
		if(e.getActionCommand().equals("保存")) {
			weldObliqueEntity.HF = HF;
			weldObliqueEntity.HE = HE;
			weldObliqueEntity.LW = LW;
			weldObliqueEntity.O1 = O1;
			weldObliqueEntity.FZ = FZ;
			weldObliqueEntity.Wffw = Wffw;
			weldObliqueEntity.B1 = B1;
			weldObliqueEntity.OT = OT;;
			weldObliqueEntity.OM = OM;
			weldObliqueEntity.JF1 = JF1;
			weldObliqueEntity.ZF1 = ZF1;
			weldObliqueEntity.F3 = F3;
			AnalysisXML.frameToXMl(weldObliqueEntity);
		}
		
		if(e.getActionCommand().equals("打印")) {
			String s1 = "  ";
			String s2 = "      ";
			outPutTxt = "斜焊缝计算: " + System.getProperty("line.separator") + s1;
			if (textField_3.getText() != null) {
				outPutTxt += "焊缝受力: " + System.getProperty("line.separator") + s2 + "轴力:  " + textField_3.getText()
				+ System.getProperty("line.separator") + s2 + "弯矩:  " + 0.0
				+ System.getProperty("line.separator") + s2 + "剪力:  " + 0.0
				+ System.getProperty("line.separator") + s1;
						
			}
			if (textField.getText() != null) {
				outPutTxt += "截面信息: " + System.getProperty("line.separator") + s2 + "焊脚尺寸:  " + textField.getText()
				+ System.getProperty("line.separator") + s2 + "直角角焊缝的有效厚度:  " + textField_1.getText()
				+ System.getProperty("line.separator") + s2 + "焊缝的有效计算长度:  " + textField_2.getText()
				+ System.getProperty("line.separator") + s2 + "轴力与水平方向夹角:  " + textField_4.getText()
				+ System.getProperty("line.separator") + s1;		
			}
			if (textField_10.getText() != null) {
				outPutTxt += "材质属性: " + System.getProperty("line.separator") + s2 + "角焊缝强度设计值:  " + textField_10.getText()
				+ System.getProperty("line.separator") + s1;		
			}
			if (textField_5.getText() != null) {
				outPutTxt += "计算各应力值: " + System.getProperty("line.separator") + s2 + "轴力作用下应力:  " + textField_5.getText()
				+ System.getProperty("line.separator") + s2 + "弯矩作用下应力: " + 0.0
				+ System.getProperty("line.separator") + s2 + "剪应力应力分力1: " + 0.0
				+ System.getProperty("line.separator") + s2 + "剪应力应力分力2: " + textField_7.getText()
				+ System.getProperty("line.separator") + s2 + "正应力: " + textField_8.getText()
				+ System.getProperty("line.separator") + s2 + "角焊缝强度计算值: " + textField_9.getText()
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
