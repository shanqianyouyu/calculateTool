package ctgu.awt.frame.homepage.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ctgu.awt.frame.homepage.component.handlerlistener.ToolMenuHandlerListener;
import ctgu.awt.util.filewriter;

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

	/*
	 * 三级计算菜单
	 * 
	 * 抱杆：test按钮
	 */
	private JMenuItem test = new JMenuItem("测试生成新窗口");
	private JMenuItem squre = new JMenuItem("正方形抱杆");

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

		/*
		 * 三级菜单添加
		 * 
		 * 抱杆下做一个测试 file1 :test
		 * 
		 * 
		 * 
		 */
		file1.add(test);
		file1.add(squre);

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
				filewriter.fileChooser();
			}
		});

		// test按钮的点击的
		test.addActionListener(new ToolMenuHandlerListener(test));
		// 正方形抱杆的点击
		squre.addActionListener(new ToolMenuHandlerListener(squre));

	}
}
