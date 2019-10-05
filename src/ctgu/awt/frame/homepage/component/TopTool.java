package ctgu.awt.frame.homepage.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import ctgu.awt.frame.homepage.component.handlerlistener.ToolMenuHandlerListener;
import ctgu.awt.frame.login.RepassWordFrame;

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
	private JButton bolBtn = new JButton(new ImageIcon(this.getClass().getResource("bol.png")));
	private JButton updatePassword = new JButton(new ImageIcon(this.getClass().getResource("password.png")));
	private JButton acrossBtn = new JButton(new ImageIcon(this.getClass().getResource("across.png")));
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
		add(bolBtn);
		add(acrossBtn);
		add(updatePassword);
		;
	}

	private void init() {
		// 注册工具栏的点击事件
		DerrickSquareBtn.addActionListener(new ToolMenuHandlerListener("抱杆计算"));
		bolBtn.addActionListener(new ToolMenuHandlerListener("螺栓计算"));
		acrossBtn.addActionListener(new ToolMenuHandlerListener("跨越架计算"));
		updatePassword.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RepassWordFrame frame = new RepassWordFrame();
//				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
	}

}
