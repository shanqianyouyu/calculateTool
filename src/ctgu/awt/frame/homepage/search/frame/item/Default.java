package ctgu.awt.frame.homepage.search.frame.item;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ctgu.awt.frame.homepage.component.handlerlistener.ToolMenuHandlerListener;
import ctgu.awt.frame.homepage.search.service.AnalysisXML;
import ctgu.awt.util.ResponseCode;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：默认条目
 * 
 * @Package: ctgu.awt.frame.homepage.search.frame.item
 * @author: 拉布拉多
 */

public class Default extends JPanel {
	public String Id;
	private String Time;

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
		StringBuffer buffer = new StringBuffer(id);
		buffer.insert(4, ":");
		buffer.insert(2, ":");
		buffer.insert(0, "时间：");
		// 设置窗体的id
		jLabel1.setText(buffer.toString());
	}

	/*
	 * 一项默认三列
	 * 
	 * 从左到右一次三个
	 * 
	 * jLabel1 id
	 * 
	 * jLabel2 项名
	 * 
	 * jPanel 放置两个按钮
	 */
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JPanel jPanel;
	private String Name;
	protected JButton editBtn = new JButton("打开");
	protected JButton deleteBtn = new JButton("删除");

	private void init() {
		// 设置字体
		Font f = new Font("楷体", Font.PLAIN, 25);

		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel2.setFont(f);

		jPanel = new JPanel(new GridLayout(1, 2));

		jPanel.add(editBtn);
		jPanel.add(deleteBtn);

	}

	public Default() {
		// 默认组件
		init();
		setBounds(10, 10, 20, 30);
		setLayout(initLayout());
		add(jLabel1);
		add(jLabel2);
		add(jPanel);
		setName("");
		setVisible(true);

		// 添加编辑事件
//		editBtn.addActionListener(
//				new ToolMenuHandlerListener(Name, AnalysisXML.domTOEntity("20190907170359", new HighStrength())));

		// 添加删除事件
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = AnalysisXML.deleteDom(getTime());
				if (result == ResponseCode.OK) {
					JOptionPane.showConfirmDialog(null, "删除成功!");
				} else if (result == ResponseCode.ParseExp) {
					JOptionPane.showConfirmDialog(null, "您删除的窗口不存在!");
				}
			}
		});

	}

	private GridLayout initLayout() {
		// 每一条数据项分成一行三列
		return new GridLayout(1, 3);
	}

	public void setName(String name) {
		if (name.trim().equals("")) {
			name = "名字为空";
		}
		jLabel2.setText(name);
	}

	public void setEditListener(ToolMenuHandlerListener handlerListener) {
		editBtn.addActionListener(handlerListener);
	}

}
