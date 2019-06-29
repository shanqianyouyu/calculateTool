package ctgu.awt.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
//import entity.Config;
//import main.calFrame.FatherTabbedPane;
//import main.item.Default;
//import main.item.derrickCal.Square;

import ctgu.awt.entity.Config;
import ctgu.awt.main.calFrame.FatherTabbedPane;
import ctgu.awt.main.component.TopMenu;

/**
 * @author Chase
 */

/*
 * 打开程序： 提示行：“开始您的计算” 分页为一页 新建计算窗口： 存一个窗口记录进入 Config.calFrame 打开界面
 * 存一个列表记录进入Config.calJpanel
 */
public class index extends JFrame {
	static {
		try {
			// 设置边框样式为强立体半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			// 引入apple的皮肤包
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			System.out.println("皮肤软件抛出异常");
		}
	}

	private JPanel contentPane;
	FatherTabbedPane tabbedPane = new FatherTabbedPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public index() {
		setTitle("抱杆程序计算");
		// 窗体大小设置
		setBounds(100, 100, 1294, 800);
		this.setMinimumSize(new Dimension(500, 770));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		// 生成顶部的菜单栏
		TopMenu topMenu = new TopMenu();
		// 生成head盒子 jpanel默认流式布局
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(topMenu);
		// 添加到整体border布局的North位置
		contentPane.add(top, BorderLayout.NORTH);
		// 设置默认选项卡 从 0 开始
		tabbedPane.setSelectedIndex(0);
		// 添加到整体border布局的center位置
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		Config.fatherTabbedPane = tabbedPane;
		setContentPane(contentPane);
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
