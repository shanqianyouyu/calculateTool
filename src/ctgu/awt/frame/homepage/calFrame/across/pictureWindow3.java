package ctgu.awt.frame.homepage.calFrame.across;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
 
public class pictureWindow3 extends JFrame{
	static {
		try {
			// 设置边框样式为强立体半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			// 引入apple的皮肤包
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			// UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			// UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		} catch (Exception e) {
			// TODO exception
			System.out.println("皮肤软件抛出异常");
		}
	}
	
	public pictureWindow3(String name) {
		setVisible(true);
		System.out.println("初始化成功...");
		initNewFrame(name);
		setResizable(false);

	}
	
	private void initNewFrame(String name) {
		setTitle(name);
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 关闭等功能
		setLayout(null);
		setLocationRelativeTo(null);// 居中
		JPanel new1 = new JPanel();
		new1.setOpaque(false);
		new1.setLayout(null);
		
		new1.setBounds(10, 50, 800, 350);
		JLabel jLabeltank1 = new JLabel("跨越架的中心应与展放的导（地）线重合，架顶宽度应符合下列规定:");
		JLabel jLabeltank2 = new JLabel("(1)  停电线路时，宽度应超过展放的导（地）线中心各1.5m.");
		JLabel jLabeltank3 = new JLabel("(2)  不停电架线时，宽度应超过展放的导（地）线中心各2m.");
		JLabel jLabeltank4 = new JLabel("(3)  如果三相导线同时时按采用一组跨越架时，其架顶宽度应超过两边线各1.5~2m.");
		JLabel jLabeltank5 = new JLabel("(4)  架顶两侧应装设外伸羊角撑杆.");
		
		jLabeltank1.setBounds(34, 20, 750, 40);
		jLabeltank2.setBounds(50, 60, 750, 40);
		jLabeltank3.setBounds(50, 100, 750, 40);
		jLabeltank4.setBounds(50, 140, 750, 40);
		jLabeltank5.setBounds(50, 180, 750, 40);
		new1.add(jLabeltank1);
		new1.add(jLabeltank2);
		new1.add(jLabeltank3);
		new1.add(jLabeltank4);
		new1.add(jLabeltank5);
		
		new1.setVisible(true);
		add(new1);
	}

	public static void setUIFont()
	{
		Font f = new Font("宋体",Font.PLAIN,20);
		String   names[]={ "Label", "CheckBox", "PopupMenu","MenuItem", "CheckBoxMenuItem",
				"JRadioButtonMenuItem","ComboBox", "Button", "Tree", "ScrollPane",
				"TabbedPane", "EditorPane", "TitledBorder", "Menu", "TextArea",
				"OptionPane", "MenuBar", "ToolBar", "ToggleButton", "ToolTip",
				"ProgressBar", "TableHeader", "Panel", "List", "ColorChooser",
				"PasswordField","TextField", "Table", "Label", "Viewport",
				"RadioButtonMenuItem","RadioButton", "DesktopPane", "InternalFrame"
		}; 
		for (String item : names) {
			 UIManager.put(item+ ".font",f); 
		}
	}
    
} 