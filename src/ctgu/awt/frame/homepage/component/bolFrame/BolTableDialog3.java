package ctgu.awt.frame.homepage.component.bolFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctgu.awt.frame.homepage.HomePageFrame;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.component.bolFrame
 * @author: 拉布拉多
 * @date: 2019年7月7日 下午7:29:32
 */

public class BolTableDialog3 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BolTableDialog3 dialog = new BolTableDialog3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	private BolTableDialog3() {

		setBounds(100, 100, 1155, 782);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			URL imgUrl = HomePageFrame.class.getClassLoader().getResource("boltable3.png");
			ImageIcon img = new ImageIcon(imgUrl);
			JLabel lblNewLabel = new JLabel(img, JLabel.CENTER);
			lblNewLabel.setBounds(0, 69, 1121, 593);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel label = new JLabel("螺栓最大最小允许距离");
			label.setFont(new Font("微软雅黑", Font.BOLD, 28));
			label.setBounds(14, 13, 520, 51);
			contentPanel.add(label);
		}
		{
			JLabel lbldt = new JLabel("注: 1.d0为螺栓的孔径，t为外层较薄板件的厚度");
			lbldt.setFont(new Font("宋体", Font.BOLD, 15));
			lbldt.setBounds(10, 675, 478, 18);
			contentPanel.add(lbldt);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
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

	private static BolTableDialog3 bolTableDialog = null;

	public static BolTableDialog3 getIntance() {
		if (bolTableDialog == null) {
			bolTableDialog = new BolTableDialog3();
		}
		return bolTableDialog;
	}
}
