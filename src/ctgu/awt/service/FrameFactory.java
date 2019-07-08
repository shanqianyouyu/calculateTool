package ctgu.awt.service;

import ctgu.awt.entity.Config;
import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.calFrame.TestJFrame;
import ctgu.awt.frame.homepage.calFrame.across.AcrossFrameCalAbusolute;
import ctgu.awt.frame.homepage.calFrame.bol.BolFrame;
import ctgu.awt.frame.homepage.calFrame.derrickCal.AbusoluteSquare;
import ctgu.awt.frame.homepage.component.MainScrollPane;
import ctgu.awt.frame.homepage.item.Default;
import ctgu.awt.frame.homepage.item.acrossCal.Across;
import ctgu.awt.frame.homepage.item.bolCal.Bol;
import ctgu.awt.frame.homepage.item.derrickCal.Square;
import ctgu.awt.util.Util;

/**
 * 
 * @author 拉布拉多
 *
 */
public class FrameFactory {
	private static boolean flat = true;

	public static void createFrame(String name) {
		// 获取当前选项卡的数量
		int tabSizeOld = Config.fatherTabbedPane.getTabCount();
		// 获取主页总项目数
		int sizeOld = Config.calJpanel.size();

		// 生成递增且唯一id
		Util util = Config.id;
		Integer id = util.addId();

		// 生成的窗口
		FatherFrame frame = null;
		// 生成的条目
		Default jPanel = null;

		if (name.equals("测试生成新窗口")) {
			// 创建测试窗口
			frame = new TestJFrame();
			// 生成唯一窗口id
			frame.setId(id);
			jPanel = new Default();
			jPanel.setId(id);
			jPanel.setName(name);
//			System.out.println("FrameFactory(生成的id): " + id);
		} else if (name.equals("正方形抱杆")) {
			frame = new AbusoluteSquare();
			frame.setId(id);
			jPanel = new Square();
			jPanel.setId(id);
			jPanel.setName(name);
		} else if (name.equals("螺栓计算")) {
			frame = new BolFrame();
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new Bol();
			jPanel.setId(id);
			jPanel.setName(name);

		} else if (name.equals("跨越架计算")) {
			frame = new AcrossFrameCalAbusolute();
			frame.setVisible(true);
			frame.setId(id);
			jPanel = new Across();
			jPanel.setId(id);
			jPanel.setName(name);
		}

		// 将窗口记录到后台
		Config.addFrame(frame.getId(), frame);
		Config.addPanel(jPanel.getId(), jPanel);
//		System.out.println("FrameFactory (总数据量)" + Config.calJpanel.size());
		/*
		 * 如果达到边界则增加面板的页数
		 * 
		 * 达到边界就提醒不要继续增加了
		 */

		if (flat == false) {
			Config.fatherTabbedPane.addTab(String.valueOf(tabSizeOld + 1), new MainScrollPane(1));
			flat = true;
		}

		if ((sizeOld + 1) % 8 == 0) {
			flat = false;
		}
	}
}
