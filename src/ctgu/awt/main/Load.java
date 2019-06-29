package ctgu.awt.main;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.awt.main.component.LoadBar;
import ctgu.awt.main.load.LoadObs;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：加载动画
 * 
 * @Package: qmx.awt.main
 * @author: 拉布拉多
 * @date: 2019年6月29日 下午4:33:06
 */

public class Load extends JFrame implements LoadObs {
	private JPanel contentPane;

	public Load() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(621, 441);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// 设置边框
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBounds(30, 78, 530, 189);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel logo = new JLabel();
		logo.setBounds(0, 0, 530, 189);
		// 设置logo
		ImageIcon ico = new ImageIcon(this.getClass().getResource("image.png"));
		ico.setImage(ico.getImage().getScaledInstance(530, 189, Image.SCALE_DEFAULT));
		logo.setIcon(ico);
		panel.add(logo);
		JPanel text = new JPanel();
		text.setBounds(30, 298, 72, 40);
		contentPane.add(text);
		JLabel label = new JLabel("加载中 . . .");
		text.add(label);
		LoadBar loadBar = new LoadBar(this);
		loadBar.setBounds(30, 341, 530, 40);
		contentPane.add(loadBar);
	}

	public static void main(String[] args) {
		Load load = new Load();
		load.setVisible(true);
	}

	@Override
	public void update() {
		this.setVisible(false);
	}
}
