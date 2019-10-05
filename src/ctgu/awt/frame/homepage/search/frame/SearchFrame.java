package ctgu.awt.frame.homepage.search.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

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
		panel.setBounds(10, 0, 1040, 143);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel year = new JLabel("年");
		year.setFont(new Font("宋体", Font.BOLD, 23));
		year.setBounds(287, 50, 33, 41);
		panel.add(year);

		JLabel mouth = new JLabel("月");
		mouth.setFont(new Font("宋体", Font.BOLD, 23));
		mouth.setBounds(427, 50, 33, 41);
		panel.add(mouth);

		JLabel day = new JLabel("日");
		day.setFont(new Font("宋体", Font.BOLD, 23));
		day.setBounds(568, 50, 33, 41);
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
		search.setBounds(716, 53, 114, 35);
		panel.add(search);

		yearText = new JTextField();
		yearText.setBounds(162, 50, 111, 36);
		panel.add(yearText);
		yearText.setColumns(10);

		mouthText = new JTextField();
		mouthText.setColumns(10);
		mouthText.setBounds(313, 50, 111, 36);
		panel.add(mouthText);

		dayText = new JTextField();
		dayText.setColumns(10);
		dayText.setBounds(451, 50, 111, 36);
		panel.add(dayText);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 166, 1040, 570);
		contentPane.add(scrollPane);
	}
}
