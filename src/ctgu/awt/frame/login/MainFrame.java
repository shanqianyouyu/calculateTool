package ctgu.awt.frame.login;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class MainFrame extends JFrame implements WindowListener {

	private static final long serialVersionUID = 4223018726246644075L;
	static {
		try {
			// 设置边框样式为强立体半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			// 引入apple的皮肤包
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("皮肤软件抛出异常");
		}
	}
	public JLabel jIcon, acc, pas, topicture;
	public JTextField accField, pasField, Field;
	public Icon icon;
	public JButton jSure, jRegist, jrepass;
	public Captcha db;

	public MainFrame() {
		db = new Captcha();
	}

	private void mainView() {
		this.setTitle("登录界面");
		int width = 600;
		int height = 500;
		this.setBounds(800, 200, width, height);
		this.addWindowListener(this);
		// 获取图片
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("user.png"));
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("pass.png"));
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("pad.jpg"));
		// 登录密码框图片
		acc = new JLabel(icon1);
		icon1.setImage(icon1.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		acc.setIcon(icon1);
		pas = new JLabel(icon2);
		icon2.setImage(icon2.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		pas.setIcon(icon2);
		// 图片
		topicture = new JLabel(icon3);
		icon3.setImage(icon3.getImage().getScaledInstance(250, 70, Image.SCALE_DEFAULT));
		topicture.setIcon(icon3);
		// 登陆密码框图片
		accField = new JTextField();
		pasField = new JPasswordField();
		// 验证码框
		Field = new JTextField();
		// 验证码
		icon = new ImageIcon(db.draw());
		jIcon = new JLabel(icon);
		// 登录注册按钮
		jSure = new JButton("登录");
		jRegist = new JButton("注册");
		jrepass = new JButton("修改密码");

		// 设置布局
		this.setLayout(null);
		// 设置长宽
		width = width / 3 - 10;
		height = height / 6 - 10;

		topicture.setBounds(width - 20, height, 260, 70);
		acc.setBounds(width - 20, height + 70, 60, 80);
		pas.setBounds(width - 15, height + 110, 40, 100);
		accField.setBounds(width + 40, height + 90, 200, 40);
		pasField.setBounds(width + 40, height + 140, 200, 40);

		jSure.setBounds(width, height + 210, 240, 30);

		add(topicture);
		add(acc);
		add(pas);
		add(accField);
		add(pasField);
		add(jSure);
		// 添加登录监听
		jSure.addActionListener(new jSureLisenter(this));
		// 设置页面可见
		this.setResizable(false);
		jIcon.addMouseListener(new Change());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MainFrame d = new MainFrame();
		d.mainView();
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		;
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	class Change implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			// 获取验证码
			icon = new ImageIcon(db.draw());
			jIcon.setIcon(icon);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
	}
}
