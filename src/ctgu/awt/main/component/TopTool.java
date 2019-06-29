package ctgu.awt.main.component;

import java.awt.Button;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：抱杆快捷方式
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
		// 添加分隔符
//		addSeparator();
		// 是否可拖动
		setFloatable(true);

		setOrientation(SwingConstants.HORIZONTAL);
		add(DerrickSquareBtn);
		add(btn1);
		add(btn2);

	}
}
