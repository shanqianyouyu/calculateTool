package ctgu.awt.frame.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jrepassLisenter extends myActionListener implements ActionListener {

	public jrepassLisenter(RepassWordFrame demoC) {
		super(demoC);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.detail();
		// 修改全部步骤判断
		if (loginState && registState && capState) {
			new RepasswordThread(new UserMsg(loginStr, registStr)).start();
		}
	}

}
