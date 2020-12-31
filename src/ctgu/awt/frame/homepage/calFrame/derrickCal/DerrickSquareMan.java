package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ctgu.Entity.SquareDerrickManCal;
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
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class DerrickSquareMan extends FatherFrame implements ActionListener, ItemListener {

	private JPanel contentPane;

	private SquareDerrickManCal derrickSquareManEnity = null;

	private JLabel picture1 = null;
	private JLabel picture2 = null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public double L;
	public double G;
	public double a;
	public double b;
	public double A;
	
	
	public double P;
	public double K;
	public double R;
	public double T;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SquareDerrickManCal des = new SquareDerrickManCal(); 
					DerrickSquareMan frame = new DerrickSquareMan(des);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DerrickSquareMan(SquareDerrickManCal des) {
		derrickSquareManEnity = des;
		setTitle("人字抱杆计算");
		System.out.println("初始化成功...");
		initSquare(derrickSquareManEnity);
		setResizable(false);
		setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	private void initSquare(SquareDerrickManCal des) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"锁脚绳示意图", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));
		Icon icon1 = new ImageIcon(this.getClass().getResource("w5.png"));
		// ImageIcon image = new ImageIcon();
		Image image = ((ImageIcon) icon1).getImage();
		image = image.getScaledInstance(-1, 321, Image.SCALE_DEFAULT);
		((ImageIcon) icon1).setImage(image);
		picture1 = new JLabel(icon1, JLabel.CENTER);
		picture1.setBounds(18, 23, 370, 290);
		panel.setBounds(14, 13, 402, 326);
		contentPane.add(panel);
		panel.add(picture1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),

				"工况参数", TitledBorder.LEADING,

				TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel_1.setBounds(14, 352, 402, 211);
		contentPane.add(panel_1);

		JLabel label = new JLabel("<html><body>单抱杆长度L:</body></html>");
		label.setBounds(14, 31, 154, 24);
		panel_1.add(label);

		textField = new JTextField("0");
		textField.setColumns(10);
		textField.setBounds(182, 28, 86, 24);
		panel_1.add(textField);

		JLabel label_1 = new JLabel("mm");
		label_1.setBounds(282, 31, 39, 18);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("根开距离A:");
		label_2.setBounds(14, 95, 154, 18);
		panel_1.add(label_2);

		textField_1 = new JTextField("0");
		textField_1.setColumns(10);
		textField_1.setBounds(182, 62, 86, 24);
		panel_1.add(textField_1);

		JLabel label_17 = new JLabel("kg");
		label_17.setBounds(282, 65, 39, 18);
		panel_1.add(label_17);

		JLabel label_26 = new JLabel("<html><body>吊重G:</body></html>");
		label_26.setBounds(14, 65, 120, 21);
		panel_1.add(label_26);

		textField_2 = new JTextField("0");
		textField_2.setColumns(10);
		textField_2.setBounds(182, 92, 86, 24);
		panel_1.add(textField_2);

		JLabel label_27 = new JLabel("<html><body>mm</body></html>");
		label_27.setBounds(282, 84, 39, 32);
		panel_1.add(label_27);

		JLabel label_28 = new JLabel("<html><body>抱杆倾斜角a:</body></html>");
		label_28.setBounds(14, 128, 154, 24);
		panel_1.add(label_28);

		textField_15 = new JTextField("0");
		textField_15.setColumns(10);
		textField_15.setBounds(182, 129, 86, 24);
		panel_1.add(textField_15);

		textField_16 = new JTextField("0");
		textField_16.setColumns(10);
		textField_16.setBounds(182, 162, 86, 24);
		panel_1.add(textField_16);
		
		JLabel label_49 = new JLabel("<html><body>抱杆倾斜角b:</body></html>");
		label_49.setBounds(14, 165, 154, 21);
		panel_1.add(label_49);
		
		JLabel label_13 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_13.setBounds(279, 124, 42, 18);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("<html><body><sup>。</sup></body></html>");
		label_14.setBounds(279, 159, 42, 18);
		panel_1.add(label_14);

		JButton button = new JButton("下载到桌面");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SquareDerrickManCal des = derrickSquareManEnity;
				String outPutTxt = "";
				String s1 = "  ";
				String s2 = "      ";
				outPutTxt += "人字抱杆计算" + System.getProperty("line.separator") + s1;
				StringBuffer sb = new StringBuffer(outPutTxt);
				sb.append("工况参数:" + System.getProperty("line.separator") + s2 + "单抱杆长度: " + des.L + " mm"
						+ System.getProperty("line.separator") + s2 + "吊重: " + des.G+ " kg"
						+ System.getProperty("line.separator") + s2 + "根开距离: " + des.A+ " mm"
						+ System.getProperty("line.separator") + s2 + "抱杆倾斜角a: " + des.a+ " °"
						+ System.getProperty("line.separator") + s2 + "抱杆倾斜角b: " + des.b+ " °"
						+ System.getProperty("line.separator") + s1);
						
				sb.append("力的计算结果:" + System.getProperty("line.separator") + s2 + "封绳张力: " + des.P+ " kgf"
						+ System.getProperty("line.separator") + s2 + "单锁脚绳张力: " + des.K+ " kgf"
						+ System.getProperty("line.separator") + s2 + "单根抱杆轴拉力: " + des.R+ " kgf"
						+ System.getProperty("line.separator") + s2 + "拉线张力: " + des.T+ " kgf"
						+ System.getProperty("line.separator") + s1);
						
				outPutTxt = sb.toString();
				if (outPutTxt.length() == 8) {
					JOptionPane.showConfirmDialog(null, "内容为空！");
				} else {
					Filewriter.printToTxt(outPutTxt);
				}
			}
		});
		button.setBounds(745, 580, 167, 27);
		contentPane.add(button);

		JButton button_1 = new JButton("保存到历史纪录");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalysisXML.frameToXMl(des);
			}
		});
		button_1.setBounds(513, 580, 203, 27);
		contentPane.add(button_1);

		JButton button_2 = new JButton("计算");
		button_2.setActionCommand("计算");
		button_2.addActionListener(this);
		button_2.setBounds(516, 530, 113, 27);
		contentPane.add(button_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
		
						"封绳示意图", TitledBorder.LEADING,
		
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		Icon icon2 = new ImageIcon(this.getClass().getResource("w6.png"));
		// ImageIcon image = new ImageIcon();
		Image image1 = ((ImageIcon) icon2).getImage();
		image1 = image1.getScaledInstance(-1, 321, Image.SCALE_DEFAULT);
		((ImageIcon) icon2).setImage(image1);
		picture2 = new JLabel(icon2, JLabel.CENTER);
		picture2.setBounds(18, 23, 415, 290);
		panel_2.setBounds(516, 13, 447, 326);
		contentPane.add(panel_2);
		panel_2.add(picture2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(253,253,241));
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
		
						"力的计算结果", TitledBorder.LEADING,
		
						TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(516, 352, 447, 165);
		contentPane.add(panel_3);
		
		JLabel label_3 = new JLabel("<html><body>封绳张力P:</body></html>");
		label_3.setBounds(89, 30, 154, 24);
		panel_3.add(label_3);
		
		textField_3 = new JTextField("0");
		textField_3.setColumns(10);
		textField_3.setBounds(257, 27, 86, 24);
		panel_3.add(textField_3);
		
		JLabel label_4 = new JLabel("kgf");
		label_4.setBounds(357, 30, 39, 18);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("单根抱杆轴拉力R:");
		label_5.setBounds(89, 94, 154, 18);
		panel_3.add(label_5);
		
		textField_4 = new JTextField("0");
		textField_4.setColumns(10);
		textField_4.setBounds(257, 61, 86, 24);
		panel_3.add(textField_4);
		
		JLabel label_6 = new JLabel("kgf");
		label_6.setBounds(357, 64, 39, 18);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("<html><body>单锁脚绳张力K:</body></html>");
		label_7.setBounds(89, 64, 120, 21);
		panel_3.add(label_7);
		
		textField_5 = new JTextField("0");
		textField_5.setColumns(10);
		textField_5.setBounds(257, 91, 86, 24);
		panel_3.add(textField_5);
		
		JLabel label_8 = new JLabel("<html><body>kgf</body></html>");
		label_8.setBounds(357, 83, 39, 32);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("<html><body>拉线张力T:</body></html>");
		label_9.setBounds(89, 122, 154, 24);
		panel_3.add(label_9);
		
		textField_6 = new JTextField("0");
		textField_6.setColumns(10);
		textField_6.setBounds(257, 123, 86, 24);
		panel_3.add(textField_6);
		
		JLabel label_10 = new JLabel("<html><body>kgf</body></html>");
		label_10.setBounds(357, 116, 39, 32);
		panel_3.add(label_10);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("计算")) {
			if(!textField.getText().trim().matches("^[0.0-9.0]+$") || !textField_1.getText().trim().matches("^[0.0-9.0]+$") ||
					!textField_2.getText().trim().matches("^[0.0-9.0]+$") || !textField_16.getText().trim().matches("^[0.0-9.0]+$")
					|| !textField_15.getText().trim().matches("^[0.0-9.0]+$"))
			 {
				JOptionPane.showMessageDialog(null,"输入不合法","ERROR",JOptionPane.ERROR_MESSAGE);
			}else{
				//轴力，剪力，弯矩
				L = Double.valueOf(textField.getText().trim());
				G = Double.valueOf(textField_1.getText().trim());
				A = Double.valueOf(textField_2.getText().trim());
				a = Double.valueOf(textField_15.getText().trim());
				b = Double.valueOf(textField_16.getText().trim());
				
//				SquareDerrickManCal sm = new SquareDerrickManCal(L,G,A,a,b);
				derrickSquareManEnity = new SquareDerrickManCal(L,G,A,a,b);
				
				P = derrickSquareManEnity.fengshen();
				K = derrickSquareManEnity.dansuo();
				R = derrickSquareManEnity.dangen();
				T = derrickSquareManEnity.laxian();
				
				textField_3.setText(String.format("%.2f", P));
				textField_4.setText(String.format("%.2f", K));
				textField_5.setText(String.format("%.2f", R));
				textField_6.setText(String.format("%.2f", T));
			}
			}
	}
}
