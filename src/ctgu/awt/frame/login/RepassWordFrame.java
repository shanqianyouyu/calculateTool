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

public class RepassWordFrame extends JFrame implements WindowListener {

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

	public RepassWordFrame() {
		db = new Captcha();
	}

	private void mainView() {
		this.setTitle("修改密码界面");
		int width = 600;
		int height = 500;
		this.setBounds(800, 200, width, height);
		this.addWindowListener(this);
		// 获取图片
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("user.png"));
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("write.png"));
		// 修改密码框图片
		acc = new JLabel(icon1);
		icon1.setImage(icon1.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		acc.setIcon(icon1);
		pas = new JLabel(icon2);
		icon2.setImage(icon2.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		pas.setIcon(icon2);
		// 修改密码框图片
		accField = new JTextField();
		pasField = new JPasswordField();
		// 验证码框
		Field = new JTextField();
		// 验证码
		icon = new ImageIcon(db.draw());
		jIcon = new JLabel(icon);
		// 修改密码按钮
		jrepass = new JButton("修改密码");

		// 设置布局
		this.setLayout(null);
		// 设置长宽
		width = width / 3 - 10;
		height = height / 6 - 10;

		acc.setBounds(width - 20, height + 30, 60, 80);
		pas.setBounds(width - 5, height + 70, 40, 100);
		accField.setBounds(width + 40, height + 50, 200, 40);
		pasField.setBounds(width + 40, height + 100, 200, 40);

		Field.setBounds(width - 10, height + 160, 150, 40);
		jIcon.setBounds(width + 160, height + 160, 80, 40);

		jrepass.setBounds(width - 10, height + 210, 250, 30);

		add(acc);
		add(pas);
		add(accField);
		add(pasField);
		add(jrepass);
		add(Field);
		add(jIcon);
		// 添加修改密码监听
		jrepass.addActionListener(new jrepassLisenter(this));
		// 设置页面可见
		this.setResizable(false);
		jIcon.addMouseListener(new Change());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		RepassWordFrame d = new RepassWordFrame();
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
