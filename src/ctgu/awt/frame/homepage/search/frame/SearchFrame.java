package ctgu.awt.frame.homepage.search.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.frame.homepage.search.frame
 * @author: 拉布拉多
 * @date: 2019年9月3日 下午4:59:30
 */

public class SearchFrame extends JFrame {

	private JPanel contentPane;
	private JTextField yearText;
	private JTextField mouthText;
	private JTextField dayText;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1023, 143);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel year = new JLabel("年");
		year.setFont(new Font("宋体", Font.BOLD, 23));
		year.setBounds(200, 51, 33, 41);
		panel.add(year);

		JLabel mouth = new JLabel("月");
		mouth.setFont(new Font("宋体", Font.BOLD, 23));
		mouth.setBounds(340, 51, 33, 41);
		panel.add(mouth);

		JLabel day = new JLabel("日");
		day.setFont(new Font("宋体", Font.BOLD, 23));
		day.setBounds(481, 51, 33, 41);
		panel.add(day);

		JButton search = new JButton("搜索");
		// 搜索事件
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		search.setFont(new Font("宋体", Font.PLAIN, 23));
		search.setBounds(629, 54, 114, 35);
		panel.add(search);

		yearText = new JTextField();
		yearText.setBounds(75, 51, 111, 36);
		panel.add(yearText);
		yearText.setColumns(10);

		mouthText = new JTextField();
		mouthText.setColumns(10);
		mouthText.setBounds(226, 51, 111, 36);
		panel.add(mouthText);

		dayText = new JTextField();
		dayText.setColumns(10);
		dayText.setBounds(364, 51, 111, 36);
		panel.add(dayText);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 166, 999, 455);
		contentPane.add(scrollPane);
	}
}
