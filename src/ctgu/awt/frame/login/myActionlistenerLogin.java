package ctgu.awt.frame.login;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class myActionlistenerLogin {

	public  JTextField accField;
	public JTextField pasField;
	public Captcha db;
	public JTextField field;
	public JLabel jl;
	public Icon icon;
	public MainFrame J1;
	String loginStr;
	String registStr;
	String capStr;
	String enterStr;
	boolean loginState;
	boolean registState;
	boolean capState;
	public myActionlistenerLogin(MainFrame demoC) {
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
				//获取用户名
				 loginStr = accField.getText();
				//获取密码
				 registStr = pasField.getText();
				//获取验证码
				 capStr = db.getCaptcha();
				//获取框内值
				String enterStr = field.getText();
				//设置用户名״̬
				loginState = true;
				//设置密码״̬
				registState = true;		

	}
}
