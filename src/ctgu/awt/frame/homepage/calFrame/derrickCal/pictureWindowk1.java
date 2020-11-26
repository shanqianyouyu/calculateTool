package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JButton;

public class pictureWindowk1 extends JFrame{
	/**
	 * 
	 */
	private JFrame jpicture; 
//	private JPanel picJpanel2 = new JPanel();
	JPanel picture = new JPanel();
	private static String Name = "";
	private final JPanel panel = new JPanel();
	private final JButton button = new JButton("<html><body>由换算长细比λ<sub>0x</sub>查表得φ1</body></html>");
	private final JLabel label = new JLabel("New label");
	private final JButton button_1 = new JButton("<html><body>由单肢长细比λ<sub>2</sub>查表得φ2</body></html>");
	private final JLabel label_1 = new JLabel("New label");
	private final JButton button_2 = new JButton("<html><body>由斜缀条长细比λ<sub>x</sub>查表得φ3</body></html>");
	private final JLabel label_2 = new JLabel("New label");
	
	// 没输入名字
		public pictureWindowk1() {
			this(Name);
			// String name = "请输入名字!";
		}

		public pictureWindowk1(String name2) {
			initSquare(name2);
			jpicture.setVisible(true);
			jpicture.setResizable(false);
			jpicture.getContentPane().setLayout(null);
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
															"吊装数据", TitledBorder.LEADING,
															TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(0, 13, 364, 133);
			
			jpicture.getContentPane().add(panel);
			button.setActionCommand("k1");
			button.setBounds(14, 23, 224, 27);
			
			panel.add(button);
			label.setBounds(252, 27, 72, 18);
			
			panel.add(label);
			button_1.setActionCommand("k2");
			button_1.setBounds(14, 58, 224, 27);
			
			panel.add(button_1);
			label_1.setBounds(252, 62, 72, 18);
			
			panel.add(label_1);
			button_2.setActionCommand("k3");
			button_2.setBounds(14, 93, 234, 27);
			
			panel.add(button_2);
			label_2.setBounds(252, 97, 72, 18);
			
			panel.add(label_2);

		}

		private void initSquare(String name2) {
			jpicture = new JFrame(name2);
			jpicture.setSize(790, 470);
			jpicture.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 关闭等功能
			jpicture.dispose();
			jpicture.setLocationRelativeTo(null);
			//加载图片
			ImageIcon image = new ImageIcon(this.getClass().getResource("7.png"));
			image.setImage(image.getImage().getScaledInstance(-60, 250, Image.SCALE_DEFAULT));
		}
}
