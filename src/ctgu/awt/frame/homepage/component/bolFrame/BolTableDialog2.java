package ctgu.awt.frame.homepage.component.bolFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.awt.frame.homepage.HomePageFrame;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.component.bolFrame
 * @author: 拉布拉多
 * @date: 2019年7月7日 下午7:15:11
 */

public class BolTableDialog2 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BolTableDialog2 dialog = new BolTableDialog2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	private BolTableDialog2() {
		setTitle("摩擦面的抗滑移系数");
		setBounds(100, 100, 1109, 640);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			URL imgUrl = HomePageFrame.class.getClassLoader().getResource("boltable2.png");
			ImageIcon img = new ImageIcon(imgUrl);
			JLabel label = new JLabel(img, JLabel.CENTER);
			label.setBounds(0, 63, 1092, 493);
			contentPanel.add(label);
		}
		{
			JLabel lblgb = new JLabel("注: 本表为钢结构设计规范(GB50017-2003)");
			lblgb.setFont(new Font("微软雅黑", Font.BOLD, 26));
			lblgb.setBounds(0, 13, 570, 37);
			contentPanel.add(lblgb);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
//			{
//				JButton okButton = new JButton("OK");
//				okButton.setActionCommand("OK");
//				buttonPane.add(okButton);
//				getRootPane().setDefaultButton(okButton);
//			}
			{
				JButton cancelButton = new JButton("关闭");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private static BolTableDialog2 bolTableDialog = null;

	public static BolTableDialog2 getInstance() {
		if (bolTableDialog == null) {
			bolTableDialog = new BolTableDialog2();
		}
		return bolTableDialog;
	}

}
