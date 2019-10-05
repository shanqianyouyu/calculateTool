package ctgu.awt.frame.homepage.calFrame;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class TestJFrame extends FatherFrame {

	private String name = "1231";

	public TestJFrame() {
		setBounds(500, 500, 1294, 800);
		setVisible(true);
		setTitle("测试窗口");
		add(new JLabel(name));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
}
