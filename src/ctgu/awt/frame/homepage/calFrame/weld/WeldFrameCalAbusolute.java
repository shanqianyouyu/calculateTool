package ctgu.awt.frame.homepage.calFrame.weld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;

public class WeldFrameCalAbusolute extends FatherFrame implements ActionListener, FocusListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int i = 0;
	// private JFrame jfSquare;
	private JLabel picture1 = null;
	JPanel picture = new JPanel();
	ImageIcon image = new ImageIcon(this.getClass().getResource("1.png"));
	private static String Name = "";

	// 没输入名字
	public WeldFrameCalAbusolute() {
		this(Name);
		// String name = "请输入名字!";
	}

	public WeldFrameCalAbusolute(String name2) {
		initSquare(name2);
		setVisible(true);
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


	private void initleft(JPanel left) {
		// TODO Auto-generated method stub

	}
	
	private void initmiddle(JPanel middle) {
		// TODO Auto-generated method stub

	}

	private void initright1(JPanel right1) {
		// TODO Auto-generated method stub

	}

	private void initright(JPanel right) {
		// TODO Auto-generated method stub

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

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
