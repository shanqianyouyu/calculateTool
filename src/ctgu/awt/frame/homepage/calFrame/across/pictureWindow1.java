package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class pictureWindow1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static {
		try {
			// 设置边框样式为强立体半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			// 引入apple的皮肤包
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			// UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			// UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		} catch (Exception e) {
			// TODO exception
			System.out.println("皮肤软件抛出异常");
		}
	}
	private JFrame jpicture; 
	private JLabel pic = new JLabel("", JLabel.LEFT);
	private JPanel picJpanel = new JPanel();
//	private JPanel picJpanel2 = new JPanel();
	JPanel picture = new JPanel();
	private static String Name = "";
	
	// 没输入名字
		public pictureWindow1() {
			this(Name);
			// String name = "请输入名字!";
		}

		public pictureWindow1(String name2) {
			initSquare(name2);
			jpicture.setVisible(true);
			jpicture.setResizable(false);

		}

		private void initSquare(String name2) {
			jpicture = new JFrame(name2);
			jpicture.setSize(790, 470);
			jpicture.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// 关闭等功能
			jpicture.dispose();
			jpicture.setLayout(null);
			jpicture.setLocationRelativeTo(null);// 居中	
			picJpanel.setBounds(0, 0, 785, 465);
			
			picJpanel.setVisible(true);
			//加载图片
			ImageIcon image = new ImageIcon(this.getClass().getResource("3.png"));
			image.setImage(image.getImage().getScaledInstance(-40, 380, Image.SCALE_DEFAULT));
			pic.setIcon(image);
//			picJpanel2.add("Center", pic);
			picJpanel.add(pic);
			jpicture.add(picJpanel);
		}
}
