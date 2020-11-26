package ctgu.awt.entity;

import java.awt.Color;
import java.util.Comparator;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ctgu.awt.frame.homepage.calFrame.FatherFrame;
import ctgu.awt.frame.homepage.calFrame.FatherTabbedPane;
import ctgu.awt.util.Util;

//用来记录一共有多少个窗体
public class Config {
	// 递增id生成器
	public static Util id = new Util();

	// 表示是否删除最后一页的标志
	public static boolean flat = false;

	// 控制面板
	public static FatherTabbedPane fatherTabbedPane = new FatherTabbedPane();

	// 每进行一次计算，后台就记录一个窗口
	public static TreeMap<Integer, FatherFrame> calFrames = new TreeMap<Integer, FatherFrame>(
			(obj1, obj2) -> obj2.compareTo(obj1));

	// 每进行一次计算，主页面就存入一个窗口
	public static TreeMap<Integer, JPanel> calJpanel = new TreeMap<Integer, JPanel>(new Comparator<Integer>() {
		public int compare(Integer obj1, Integer obj2) {
			// 降序排序
			return obj2.compareTo(obj1);
		}
	});

	// 窗体默认颜色
	public static Color ResColor = new Color(253, 253, 241);

	/*
	 * 后台记录
	 */
	// 添加窗口
	public static void addFrame(Integer s, FatherFrame jf) {
		calFrames.put(s, jf);
	}

	// 删除窗口
	public static void deleteFrame(Integer s, JFrame jf) {
		calFrames.remove(s, jf);
	}

	/*
	 * 主页
	 */
	// 添加计算窗口
	public static void addPanel(Integer s, JPanel jp) {
		calJpanel.put(s, jp);
	}

	// 删除计算窗口
	public static void deletePanel(Integer s) {
		calJpanel.remove(s);
	}
}
