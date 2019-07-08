package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class pictureWindow2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame jpicture; 
	private static String Name = "";
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
	// 没输入名字
		public pictureWindow2() {
			this(Name);
			// String name = "请输入名字!";
		}

		public pictureWindow2(String name2) {
			initSquare(name2);
			jpicture.setVisible(true);
			jpicture.setResizable(false);

		}

		private void initSquare(String name2) {
			JLabel pic = new JLabel();
			JPanel picJpanel = new JPanel();
			jpicture = new JFrame(name2);
			jpicture.setSize(860, 500);
			jpicture.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// 关闭等功能
			jpicture.dispose();
			jpicture.setLayout(null);
			jpicture.setLocationRelativeTo(null);// 居中	
			
			
			//加载图片
			picJpanel.setBounds(0, 0, 810, 495);
			ImageIcon image = new ImageIcon(this.getClass().getResource("4.png"));
			image.setImage(image.getImage().getScaledInstance(-10, 400, Image.SCALE_DEFAULT));
			pic.setIcon(image);
			picJpanel.add(pic);
			jpicture.add(picJpanel);
		}
}
