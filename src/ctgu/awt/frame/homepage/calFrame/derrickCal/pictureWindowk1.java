package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class pictureWindowk1 extends JFrame{
	/**
	 * 
	 */
	private JFrame jpicture; 
	private JLabel pic = new JLabel("", JLabel.LEFT);
	private JPanel picJpanel = new JPanel();
//	private JPanel picJpanel2 = new JPanel();
	JPanel picture = new JPanel();
	private static String Name = "";
	
	// 没输入名字
		public pictureWindowk1() {
			this(Name);
			// String name = "请输入名字!";
		}

		public pictureWindowk1(String name2) {
			initSquare(name2);
			jpicture.setVisible(true);
			jpicture.setResizable(false);

		}

		private void initSquare(String name2) {
			jpicture = new JFrame(name2);
			jpicture.setSize(790, 470);
			jpicture.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 关闭等功能
			jpicture.dispose();
			jpicture.setLayout(null);
			jpicture.setLocationRelativeTo(null);// 居中	
			picJpanel.setBounds(40, 0, 700, 400);
			
			picJpanel.setVisible(true);
			//加载图片
			ImageIcon image = new ImageIcon(this.getClass().getResource("7.png"));
			image.setImage(image.getImage().getScaledInstance(-60, 250, Image.SCALE_DEFAULT));
			pic.setIcon(image);
//			picJpanel2.add("Center", pic);
			picJpanel.add(pic);
			jpicture.add(picJpanel);
		}
}
