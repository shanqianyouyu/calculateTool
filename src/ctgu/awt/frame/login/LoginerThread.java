package ctgu.awt.frame.login;

import javax.swing.JOptionPane;

import ctgu.awt.frame.homepage.calFrame.derrickCal.AbusoluteSquare;

public class LoginerThread {

	private UserMsg usmg;

	public LoginerThread(UserMsg usmg) {
		this.usmg = usmg;
	}

	// 登录事件
//	@Override
	public boolean start() {
		boolean[] result = usmg.readUserMsg();
		boolean user = result[0];
		boolean pass = result[1];
		// 登录成功判断״̬
		if (user == false) {
			JOptionPane.showMessageDialog(null, "用户不存在", "提示", JOptionPane.ERROR_MESSAGE);
			return false;
		} else if (user == true && pass == false) {
			JOptionPane.showMessageDialog(null, "密码错误", "提示", JOptionPane.ERROR_MESSAGE);
			return false;
		} else if (user == true && pass == true) {
			System.out.println("登录成功");
//			new AbusoluteSquare("正方形抱杆");
			
			return true;
		}
		return false;
	}
}
