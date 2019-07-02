package ctgu.awt.frame.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jSureLisenter extends myActionlistenerLogin implements ActionListener {

	public jSureLisenter(MainFrame demoC) {
		super(demoC);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.detail();
		// 全部步骤判断
		if (loginState && registState) {
			LoginerThread LoginerThread = new LoginerThread(new UserMsg(loginStr, registStr));
			if (LoginerThread.start()) {
				J1.dispose();
			}
		}
	}
}
