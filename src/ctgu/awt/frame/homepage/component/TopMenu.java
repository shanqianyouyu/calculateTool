package ctgu.awt.frame.homepage.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ctgu.awt.frame.homepage.component.handlerlistener.ToolMenuHandlerListener;
import ctgu.awt.frame.homepage.search.frame.SearchFrame;
import ctgu.awt.util.Filewriter;

/**
 * 主页的顶部菜单栏
 * 
 * @author chase
 *
 */
public class TopMenu extends JMenuBar {

	// 主菜单
	/*
	 * 一级菜单 计算 查询 下载 帮助
	 */
	private JMenu File = new JMenu("计算(J)");// 计算
	private JMenu edit = new JMenu("查询(C)");// 查询
	private JMenu download = new JMenu("下载(X)");// 下载
	private JMenu help = new JMenu("帮助(H)");// 帮助

	/*
	 * 二级菜单
	 * 
	 * 说明书，标准
	 * 
	 */
	private JMenu file1 = new JMenu("抱杆计算");
	private JMenu file2 = new JMenu("工器具计算");
	private JMenu file3 = new JMenu("螺栓计算");
	private JMenu file4 = new JMenu("焊缝计算");
	private JMenu file5 = new JMenu("地锚计算");
	private JMenu file6 = new JMenu("跨越架计算");
	private JMenuItem download1 = new JMenuItem("说明书");
	private JMenuItem download2 = new JMenuItem("标准参数");

	private JMenuItem history = new JMenuItem("保存记录");

	/*
	 * 三级计算菜单
	 * 
	 * 抱杆：test按钮
	 */
	private JMenuItem bol = new JMenuItem("螺栓计算");
	private JMenuItem across = new JMenuItem("跨越架计算");
	private JMenuItem anchor = new JMenuItem("地锚计算");
	private JMenuItem weld = new JMenuItem("常用直角焊缝计算");
	private JMenuItem weld1 = new JMenuItem("工字形焊缝计算");
	private JMenuItem weld2 = new JMenuItem("对接焊缝计算");
	private JMenuItem weld3 = new JMenuItem("斜焊缝计算");
	private JMenuItem Derrick = new JMenuItem("正方形格构抱杆计算");
	private JMenuItem DerrickSteel = new JMenuItem("钢管抱杆计算");
	private JMenuItem DerrickMan = new JMenuItem("人字抱杆计算");

	public TopMenu() {
		init();
		addAction();
		// 一级菜单加组件
		this.add(File);
		this.add(edit);
		this.add(download);
		this.add(help);

		/*
		 * 二级菜单添加
		 * 
		 * 计算（File）：抱杆计算，工器具计算，螺栓计算，焊缝计算，地锚计算，跨越架计算
		 * 
		 * 下载(download)：说明书，标准参数
		 * 
		 */
		File.add(file1);
		File.add(file2);
		File.add(file3);
		File.add(file4);
		File.add(file5);
		File.add(file6);
		download.add(download1);
		download.add(download2);
		edit.add(history);

		/*
		 * 三级菜单添加
		 * 
		 * 抱杆下做一个测试 file1 :test
		 * 
		 * 
		 * 
		 */
		file1.add(Derrick);
		file1.add(DerrickSteel);
		file1.add(DerrickMan);
		file3.add(bol);
		file4.add(weld);
		file4.add(weld1);
		file4.add(weld2);
		file4.add(weld3);
		file5.add(anchor);
		file6.add(across);

	}

	// 修改一些样式
	private void init() {
		// 设置字体样式
		Font f = new Font("楷体", Font.PLAIN, 20);
		// 为组件添加字体样式
		File.setFont(f);
		edit.setFont(f);
		download.setFont(f);
		download1.setFont(f);
		help.setFont(f);
	}

	// 添加一些点击事件
	private void addAction() {
		download1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Filewriter.fileChooser();
			}
		});

		// 正方形格构抱杆的点击
		Derrick.addActionListener(new ToolMenuHandlerListener(Derrick));
		// 钢管抱杆的点击
		DerrickSteel.addActionListener(new ToolMenuHandlerListener(DerrickSteel));
		// 人字抱杆的点击
		DerrickMan.addActionListener(new ToolMenuHandlerListener(DerrickMan));
		// 螺栓计算
		bol.addActionListener(new ToolMenuHandlerListener(bol));
		// 直角焊缝计算
		weld.addActionListener(new ToolMenuHandlerListener(weld));
		// 工字型焊缝计算
		weld1.addActionListener(new ToolMenuHandlerListener(weld1));
		// 对接焊缝计算
		weld2.addActionListener(new ToolMenuHandlerListener(weld2));
		// 斜焊缝计算
		weld3.addActionListener(new ToolMenuHandlerListener(weld3));
		// 地锚计算
		anchor.addActionListener(new ToolMenuHandlerListener(anchor));
		// 跨越架计算
		across.addActionListener(new ToolMenuHandlerListener(across));

		history.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SearchFrame frame = new SearchFrame();
				frame.setVisible(true);
			}
		});

	}
}
