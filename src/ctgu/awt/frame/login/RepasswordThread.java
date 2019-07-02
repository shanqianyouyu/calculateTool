package ctgu.awt.frame.login;

import javax.swing.JOptionPane;



public class RepasswordThread extends Thread {
	private UserMsg usmg;

	public RepasswordThread(UserMsg usmg) {
		// TODO Auto-generated constructor stub
		this.usmg = usmg;
	}

	// 修改事件
	// @Override
	public void start() {
		// TODO Auto-generated method stub
		boolean[] result = usmg.repassword();
		boolean pass = result[0];
		boolean[] result1 = usmg.readUserPass();
		boolean user = result[0];

		// 修改成功判断״̬
		if (user == true) {
			if (pass == true)
				JOptionPane.showMessageDialog(null, "修改成功", "提示", JOptionPane.ERROR_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "修改失败", "提示", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "用户不存在", "提示", JOptionPane.ERROR_MESSAGE);
		}
	}
}
