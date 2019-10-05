package ctgu.awt.frame.homepage.search.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import ctgu.awt.frame.homepage.search.service.AnalysisXML;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.search.frame
 * @author: 拉布拉多
 */

public class SearchFrame extends JFrame {

	private JPanel contentPane;
	private JTextField yearText;
	private JTextField mouthText;
	private JTextField dayText;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFrame frame = new SearchFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchFrame() {
		setResizable(false);
		setTitle("历史记录");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1066, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 0, 1040, 143);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel year = new JLabel("年");
		year.setFont(new Font("宋体", Font.BOLD, 23));
		year.setBounds(139, 49, 33, 41);
		panel.add(year);

		JLabel mouth = new JLabel("月");
		mouth.setFont(new Font("宋体", Font.BOLD, 23));
		mouth.setBounds(279, 49, 33, 41);
		panel.add(mouth);

		JLabel day = new JLabel("日");
		day.setFont(new Font("宋体", Font.BOLD, 23));
		day.setBounds(420, 49, 33, 41);
		panel.add(day);

		JButton search = new JButton("搜索");
		// 搜索事件
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int year, mouth, day;
				try {
					year = Integer.parseInt(yearText.getText());
					mouth = Integer.parseInt(mouthText.getText());
					day = Integer.parseInt(dayText.getText());
				} catch (NumberFormatException e1) {
					JOptionPane.showConfirmDialog(null, "日期不合法!");
					return;
				}
				if (mouth < 1 || mouth > 12 || day < 1 || day > 31 || yearText.getText().length() != 4) {
					JOptionPane.showConfirmDialog(null, "日期不合法!");
					return;
				}
				DecimalFormat df = new DecimalFormat("00");
				String time = String.valueOf(year) + df.format(mouth) + df.format(day);
				try {
					JScrollPane scrollPane_1 = new JScrollPane(ViewPortView.getItems(time));
					scrollPane.setViewportView(scrollPane_1);
				} catch (NullPointerException e2) {
					JOptionPane.showConfirmDialog(null, "该时间内无记录!");
				}
			}
		});
		search.setFont(new Font("宋体", Font.PLAIN, 23));
		search.setBounds(483, 52, 114, 35);
		panel.add(search);

		yearText = new JTextField();
		yearText.setBounds(14, 49, 111, 36);
		panel.add(yearText);
		yearText.setColumns(10);

		mouthText = new JTextField();
		mouthText.setColumns(10);
		mouthText.setBounds(165, 49, 111, 36);
		panel.add(mouthText);

		dayText = new JTextField();
		dayText.setColumns(10);
		dayText.setBounds(303, 49, 111, 36);
		panel.add(dayText);
		JButton deleteAll = new JButton("全部删除");
		deleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(deleteAll, "确认删除?", "确认", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (result == JOptionPane.OK_OPTION) {
					AnalysisXML.deleteAllDoms();
				}

			}
		});
		deleteAll.setFont(new Font("宋体", Font.PLAIN, 23));
		deleteAll.setBounds(791, 52, 163, 35);
		panel.add(deleteAll);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(656, 0, 10, 143);
		panel.add(panel_1);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 166, 1040, 570);
		contentPane.add(scrollPane);
	}
}
