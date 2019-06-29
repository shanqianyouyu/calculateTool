package ctgu.awt.main.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
//import entity.PageBean;
//import main.item.Default;
//import service.PageService;

import ctgu.awt.entity.PageBean;
import ctgu.awt.main.item.Default;
import ctgu.awt.service.PageService;

public class Items extends JPanel {
	// 单例模式
	// 构造器私有化
	private Items() {
	}

//	private static Items items = new Items();
	// 存放所有生成的窗口
//	private static List<Default> list = new ArrayList<Default>();

	// 获取所有的计算窗体
	public static Items getItems(int numPage) {

		// 创建8行1列的网格布局
		GridLayout layout = new GridLayout(8, 1);

		// 设置竖直间隙
		layout.setVgap(10);
		Items items = new Items();
		// 添加布局到 Items中
		items.setLayout(layout);
		List<Default> list = new ArrayList<Default>();
		// 保证对象唯一
		// 取出numPage页的数据
		PageBean pagebean = PageService.getPageBean(numPage);
		list = pagebean.getBeanList();
		System.out.println("该页的数据量: " + list.size());
		// 将该数据添加到Items中
		for (JPanel jp : list) {
			jp.setPreferredSize(new Dimension(0, 60));// 高度为60，宽度自适应
			jp.setBackground(new Color(240, 240, 240));
			items.add(jp);
		}
		return items;
	}

	// 添加一个

	// 删除一个

	// 每次发生变更都会重新绘制MainScrollPane

}
