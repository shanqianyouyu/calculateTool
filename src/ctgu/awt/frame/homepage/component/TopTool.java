package ctgu.awt.frame.homepage.component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import ctgu.awt.frame.homepage.component.handlerlistener.ToolMenuHandlerListener;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：工具栏
 * 
 * @Package: ctgu.awt.main.component
 * @author: 拉布拉多
 * @date: 2019年6月29日 下午11:43:58
 */

public class TopTool extends JToolBar {

	// 正方形抱杆
	private JButton DerrickSquareBtn = new JButton(new ImageIcon(this.getClass().getResource("derrickSquare.png")));
	private JButton btn1 = new JButton(new ImageIcon(this.getClass().getResource("1.png")));
	private JButton btn2 = new JButton(new ImageIcon(this.getClass().getResource("2.png")));
	private JButton btn3 = new JButton();
	private JButton btn4 = new JButton();

	public TopTool() {
		// 设置绘制边框
		setBorderPainted(true);
		// 添加按钮的事件
		init();
		// 添加分隔符
//		addSeparator();
		// 是否可拖动
		setFloatable(false);
		setOrientation(SwingConstants.HORIZONTAL);
		add(DerrickSquareBtn);
		add(btn1);
		add(btn2);
	}

	private void init() {
		DerrickSquareBtn.addActionListener(new ToolMenuHandlerListener("正方形抱杆"));
	}
}
