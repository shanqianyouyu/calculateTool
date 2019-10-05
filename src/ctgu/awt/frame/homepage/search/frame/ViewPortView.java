package ctgu.awt.frame.homepage.search.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

import ctgu.awt.frame.homepage.search.frame.item.Default;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.frame.homepage.search.service.FrameUtil;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：滚动窗口中的内容
 * 
 * @Package: ctgu.awt.frame.homepage.search.frame
 * @author: 拉布拉多
 */

public class ViewPortView extends JPanel {

	// 获取所有的计算窗体
	public static ViewPortView getItems(String time) {
		// 获得需要时间的所有窗口
		List<Default> list = FrameUtil.itemsToFrames(AnalysisXML.getDayItem(AnalysisXML.getChildsItem(time), time));
		int MAX_COUNT = list.size() > 8 ? list.size() : 8;
		// 创建8行1列的网格布局
		GridLayout layout = new GridLayout(MAX_COUNT, 1);
		// 设置竖直间隙
		layout.setVgap(10);
		ViewPortView portView = new ViewPortView();
		// 添加布局到 Items中
		portView.setLayout(layout);
		// 将该数据添加到Items中
		for (JPanel jp : list) {
			jp.setPreferredSize(new Dimension(0, 60));// 高度为60，宽度自适应
			jp.setBackground(new Color(240, 240, 240));
			portView.add(jp);
		}
		return portView;
	}
}
