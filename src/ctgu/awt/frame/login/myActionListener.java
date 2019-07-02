package ctgu.awt.frame.login;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class myActionListener {

	public JTextField accField;
	public JTextField pasField;
	public Captcha db;
	public JTextField field;
	public JLabel jl;
	public Icon icon;
	public RepassWordFrame J1;
	String loginStr;
	String registStr;
	String capStr;
	String enterStr;
	boolean loginState;
	boolean registState;
	boolean capState;

	public myActionListener(RepassWordFrame demoC) {
		// TODO Auto-generated constructor stub
		this.accField = demoC.accField;
		this.pasField = demoC.pasField;
		this.db = demoC.db;
		this.field = demoC.Field;
		this.J1 = demoC;
		this.jl = demoC.jIcon;
		this.icon = demoC.icon;
	}

	public void detail() {
		// TODO Auto-generated method stub
		// 获取用户名
		loginStr = accField.getText();
		// 获取密码
		registStr = pasField.getText();
		// 获取验证码
		capStr = db.getCaptcha();
		// 获取框内值
		String enterStr = field.getText();
		// 设置用户名״̬
		loginState = Regex.phoneNumber(loginStr);
		// 设置密码״̬
		registState = Regex.passwordNumber(registStr);
		// 设置验证码
		capState = capStr.equalsIgnoreCase(enterStr);
		if (registState == false) {
			JOptionPane.showMessageDialog(null, "密码为8位字符或者数字且不含非法字符", "提示", JOptionPane.ERROR_MESSAGE);
			System.out.println("密码为8位字符或者数字");
			icon = new ImageIcon(new Captcha().draw());
			jl.setIcon(icon);
			return;
		} else if (capState == false) {
			JOptionPane.showMessageDialog(null, "验证码错误", "提示", JOptionPane.ERROR_MESSAGE);
			// 画验证码
			icon = new ImageIcon(new Captcha().draw());
			jl.setIcon(icon);
			return;
		}

	}

}
