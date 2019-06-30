package ctgu.awt.frame.homepage.component.handlerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import ctgu.awt.service.FrameFactory;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：抽离出菜单栏的点击事件，方便利用观察者模式
 * 
 * @Package: ctgu.awt.frame.homepage.component.handlerlistener
 * @author: 拉布拉多
 * @date: 2019年6月30日 下午2:09:23
 */

public class ToolMenuHandlerListener implements ActionListener {

	// 菜单栏的
	private JMenuItem item = null;

	// 快捷键
	private String name = null;

	public ToolMenuHandlerListener(JMenuItem e) {
		item = e;
	}

	public ToolMenuHandlerListener(String n) {
		name = n;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (item != null) {
			FrameFactory.createFrame(item.getText());
		} else {
			FrameFactory.createFrame(name);
		}
	}

}
