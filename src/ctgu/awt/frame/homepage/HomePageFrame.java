package ctgu.awt.frame.homepage;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherTabbedPane;
import ctgu.awt.frame.homepage.component.TopMenu;
import ctgu.awt.frame.homepage.component.TopTool;

/**
 * @author Chase
 */

/*
 * 打开程序： 提示行：“开始您的计算” 分页为一页 新建计算窗口： 存一个窗口记录进入 Config.calFrame 打开界面
 * 存一个列表记录进入Config.calJpanel
 */
public class HomePageFrame extends JFrame {
	
	static {
		try {
			// 设置边框样式为强立体半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			// 引入apple的皮肤包
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("皮肤软件抛出异常");
		}
	}

	private JPanel contentPane;
	FatherTabbedPane tabbedPane = new FatherTabbedPane();

	public static void main(String[] args) {
		HomePageFrame homePageFrame = new HomePageFrame();
		homePageFrame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public HomePageFrame() {
		setTitle("抱杆程序计算");
		// 窗体大小设置
		setBounds(100, 100, 1294, 870);
		this.setMinimumSize(new Dimension(500, 770));
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		// 生成顶部的菜单栏
		TopMenu topMenu = new TopMenu();
		// 生成顶部的工具栏
		TopTool topTool = new TopTool();
		// 生成head盒子 jpanel默认流式布局
		JPanel top = new JPanel(new GridLayout(2, 1));

		top.add(topMenu);
		top.add(topTool);
		// 添加到整体border布局的North位置
		contentPane.add(top, BorderLayout.NORTH);
		// 设置默认选项卡 从 0 开始
		tabbedPane.setSelectedIndex(0);
		// 添加到整体border布局的center位置
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		Config.fatherTabbedPane = tabbedPane;
		setContentPane(contentPane);

		/*
		 * 添加系统托盘
		 */
		if (SystemTray.isSupported()) {
			// 获取当前平台的系统托盘
			SystemTray tray = SystemTray.getSystemTray();

			URL imgUrl = HomePageFrame.class.getClassLoader().getResource("tray.png");
			// 加载一个图片用于托盘图标的显示
			Image image = Toolkit.getDefaultToolkit().getImage(imgUrl);

			// 创建点击图标时的弹出菜单
			PopupMenu popupMenu = new PopupMenu();

			MenuItem openItem = new MenuItem("open");
			MenuItem exitItem = new MenuItem("exit");

			openItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(true);
					setAlwaysOnTop(true);
					setAlwaysOnTop(false);
				}
			});
			exitItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 点击退出菜单时退出程序
					System.exit(0);
				}
			});

			popupMenu.add(openItem);
			popupMenu.add(exitItem);

			// 创建一个托盘图标
			TrayIcon trayIcon = new TrayIcon(image, "抱杆程序计算", popupMenu);

			// 托盘图标自适应尺寸
			trayIcon.setImageAutoSize(true);

			trayIcon.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("托盘图标被右键点击");
				}
			});
			trayIcon.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					switch (e.getButton()) {
					case MouseEvent.BUTTON1: {
						setVisible(true);
						setAlwaysOnTop(true);
						setAlwaysOnTop(false);
//						System.out.println("托盘图标被鼠标左键被点击");
						break;
					}
					case MouseEvent.BUTTON2: {
						System.out.println("托盘图标被鼠标中键被点击");
						break;
					}
					case MouseEvent.BUTTON3: {
						System.out.println("托盘图标被鼠标右键被点击");
						break;
					}
					default: {
						break;
					}
					}
				}
			});

			// 添加托盘图标到系统托盘
			try {
				tray.add(trayIcon);
			} catch (AWTException e) {
				e.printStackTrace();
			}

		} else {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		// 添加面板切换监听事件
		tabbedPane.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// 取中当前选中的数据页
				int numPage = tabbedPane.getSelectedIndex();
				// 切换
				if (tabbedPane.update(numPage)) {
					System.out.println("切换成功!");
				} else {
					System.out.println("切换失败!");
				}
				System.out.println("当前选中的选项卡: " + numPage);
			}
		});

		// 创建一个线程刷新选项卡，每一秒刷新一次
		Runnable runnable = new Runnable() {
			public void run() {
				// 删除空白页
				int size = Config.calJpanel.size();
				int count = tabbedPane.getTabCount();
				if (count * 8 - size >= 8 && count != 1) {
					System.out.println(count - 1);
					tabbedPane.remove(count - 1);
				}
//				System.out.println(tabbedPane.getSelectedIndex());
				// 刷新当前页面
				tabbedPane.update(tabbedPane.getSelectedIndex());
			}
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);

	}

}
