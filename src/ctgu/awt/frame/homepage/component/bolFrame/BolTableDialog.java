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
 * @Package: ctgu.awt.frame.homepage.component
 * @author: 拉布拉多
 * @date: 2019年7月7日 下午6:47:01
 */

public class BolTableDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	
//	public static void main(String[] args) {
//		try {
//			BolTableDialog dialog = new BolTableDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	private  BolTableDialog() {
		setTitle("一个高强度螺栓的拉力");
		setBounds(100, 100, 905, 486);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		URL imgUrl = HomePageFrame.class.getClassLoader().getResource("boltable1.png");
		ImageIcon img = new ImageIcon(imgUrl);

		JLabel lblNewLabel = new JLabel(img, JLabel.CENTER);
		lblNewLabel.setBounds(14, 70, 850, 319);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblPkn = new JLabel("一个高强度螺栓的拉力 P(KN)");
			lblPkn.setFont(new Font("宋体", Font.BOLD, 30));
			lblPkn.setBounds(238, 13, 457, 50);
			contentPanel.add(lblPkn);
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
	private static BolTableDialog bolTableDialog = null;
	public static BolTableDialog getInstance() {
		if(bolTableDialog == null ) {
			bolTableDialog = new BolTableDialog();
		}
		return bolTableDialog;
	}

}
