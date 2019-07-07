package ctgu.awt.frame.load.component;

import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import ctgu.awt.frame.load.Load;


/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：加载进度条
 * 
 * @Package: test.progressBar
 * @author: 拉布拉多
 * @date: 2019年6月29日 下午5:15:34
 */

public class LoadBar extends JPanel {
	private Vector<Load> obs = new Vector<Load>();
	private static final int MIN_PROGRESS = 0;
	private static final int MAX_PROGRESS = 100;
	private Timer timer = new Timer();
	

	private static int currentProgress = MIN_PROGRESS;

	public LoadBar(Load load) {
		obs.add(load);
		// 创建一个进度条
		final JProgressBar progressBar = new JProgressBar();
		progressBar.setSize(530, 33);
		progressBar.setPreferredSize(new Dimension(530, 30));
		// 设置进度的 最小值 和 最大值
		progressBar.setMinimum(MIN_PROGRESS);
		progressBar.setMaximum(MAX_PROGRESS);

		// 设置当前进度值
		progressBar.setValue(currentProgress);

		// 绘制百分比文本（进度条中间显示的百分数）
		progressBar.setStringPainted(true);

		// 添加进度改变通知
//		progressBar.addChangeListener(new ChangeListener() {
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				System.out.println(
//						"当前进度值: " + progressBar.getValue() + "; " + "进度百分比: " + progressBar.getPercentComplete());
//			}
//		});

		// 添加到内容面板
		add(progressBar);

//		java.util.Timer timer = new java.util.Timer();
//		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				currentProgress++;
				progressBar.setValue(currentProgress);
				if (currentProgress == MAX_PROGRESS) {
					System.out.println("stop...");
					for (Load object : obs) {
						object.update();
					}
					timer.cancel();
//					Thread.sleep(50);
				}
			}
		}, 500, 30);// 半秒后执行，每50ms执行一次
	}
}
