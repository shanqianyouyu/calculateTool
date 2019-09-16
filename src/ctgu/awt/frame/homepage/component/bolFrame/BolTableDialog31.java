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
 * @date: 2019年9月12日 上午11:24:18
 */

public class BolTableDialog31 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BolTableDialog31 dialog = new BolTableDialog31();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BolTableDialog31() {
		setBounds(100, 100, 1087, 697);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		String table = "<html><table style=\"text-align: center;font-size:11px;\" border=\"1\" cellpadding=\"10px\" cellspacing=\"0\">\r\n"
				+ "            <tr>\r\n" + "                <th>名称</th>\r\n"
				+ "                <th colspan=\"3\">位置和方向</th>\r\n"
				+ "                <th>最大允许距离(取较小者)d<sub>max</sub></th>\r\n"
				+ "                <th>最小允许距离d<sub>min</sub></th>\r\n" + "            </tr>\r\n"
				+ "            <tr>\r\n" + "                <th rowspan=\"5\">中心间距</th>\r\n"
				+ "                <th colspan=\"3\">外排垂直内力方向或顺内力方向(p=1)</th>\r\n"
				+ "                <td>8d<sub>0</sub>或12t</td>\r\n"
				+ "                <td rowspan=\"5\">3d<sub>0</sub></td>\r\n" + "            </tr>\r\n"
				+ "            <tr>\r\n" + "                <th rowspan=\"3\">中间排</th>\r\n"
				+ "                <th colspan=\"2\">垂直内力方向(p=2)</th>\r\n"
				+ "                <td>16d<sub>0</sub>或24t</td>\r\n" + "            </tr>\r\n" + "            <tr>\r\n"
				+ "                <th rowspan=\"2\">顺内力方向</th>\r\n" + "                <th>构件受压(p=3)</th>\r\n"
				+ "                <td>12d<sub>0</sub>或18t</td>\r\n" + "            </tr>\r\n" + "            <tr>\r\n"
				+ "                <th>构件受拉(p=4)</th>\r\n" + "                <td>16d<sub>0</sub>或24t</td>\r\n"
				+ "            </tr>\r\n" + "            <tr>\r\n"
				+ "                <th colspan=\"3\">沿对角线方向(p=5)</th>\r\n" + "                <td><b>-</b></td>\r\n"
				+ "            </tr>\r\n" + "            <tr>\r\n"
				+ "                <th rowspan=\"4\">中心至构件边缘距离</th>\r\n"
				+ "                <th colspan=\"3\">顺内力方向(p=6)</th>\r\n"
				+ "                <td rowspan=\"4\">4d<sub>0</sub>或8t</td>\r\n"
				+ "                <td>2d<sub>0</sub></td>\r\n" + "            </tr>\r\n" + "            <tr>\r\n"
				+ "                <th rowspan=\"3\">垂直方向内力</th>\r\n"
				+ "                <th colspan=\"2\">剪切边或手工气割边(p=7)</th>\r\n"
				+ "                <td rowspan=\"2\">1.5d<sub>0</sub></td>\r\n" + "            </tr>\r\n"
				+ "            <tr>\r\n" + "                <th rowspan=\"2\">扎制边，自动气割或锯割边</th>\r\n"
				+ "                <th>高强螺栓(p=8)</th>\r\n" + "                \r\n" + "            </tr>\r\n"
				+ "            <tr>\r\n" + "                <th>其他螺栓或铆钉(p=9)</th>\r\n"
				+ "                <td>1.2d<sub>0</sub></td>\r\n" + "            </tr>\r\n" + "        </table></html>";
		{
			JLabel label = new JLabel("螺栓最大最小允许距离");
			label.setFont(new Font("微软雅黑", Font.BOLD, 28));
			label.setBounds(14, 13, 520, 51);
			contentPanel.add(label);
		}

		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 1062, 571);
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(table);
		lblNewLabel.setBounds(0, 13, 1099, 551);
		panel.add(lblNewLabel);
		{
			JLabel lbldt = new JLabel("注: 1.d0为螺栓的孔径，t为外层较薄板件的厚度");
			lbldt.setBounds(0, 547, 478, 18);
			panel.add(lbldt);
			lbldt.setFont(new Font("宋体", Font.BOLD, 15));
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(-1, 613, 1073, 37);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
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
}
