package ctgu.awt.frame.homepage.component.anchor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.component.anchor
 * @author: 拉布拉多
 * @date: 2019年9月16日 上午10:38:35
 */

public class Table3 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Table3 dialog = new Table3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Table3() {
		setLocationRelativeTo(null);
		setTitle("表三：∅230×1600钢管地锚（K=2）斜向的（α=45°）容许抗拔力(kN)");
		setBounds(100, 100, 684, 789);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel(Table.table3);
			label.setBounds(62, 13, 618, 717);
			contentPanel.add(label);
		}
	}

}
