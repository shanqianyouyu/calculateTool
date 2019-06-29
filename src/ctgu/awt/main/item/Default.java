package ctgu.awt.main.item;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ctgu.awt.entity.Config;


public class Default extends JPanel {
	public Integer Id;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
		// 设置窗体的id
		jLabel1.setText(String.valueOf(id));
	}

	/*
	 * 一项默认三列
	 * 
	 * 从左到右一次三个
	 * 
	 * jLabel1 id
	 * 
	 * jLabel2 项名
	 * 
	 * jPanel 放置两个按钮
	 */
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JPanel jPanel;
	private String Name;
	protected JButton editBtn = new JButton("编辑");
	protected JButton deleteBtn = new JButton("删除");

	private void init() {
		// 设置字体
		Font f = new Font("楷体", Font.PLAIN, 25);

		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel2.setFont(f);

		jPanel = new JPanel(new GridLayout(1, 2));

		jPanel.add(editBtn);
		jPanel.add(deleteBtn);

	}

	public Default() {
		// 默认组件
		init();
		setLayout(initLayout());
		add(jLabel1);
		add(jLabel2);
		add(jPanel);
		setName("");
		setVisible(true);

		// 添加编辑事件
		editBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("重现: " + Id);
				Config.calFrames.get(Id).setVisible(true);
			}
		});
		
		

		// 添加删除事件
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sizeOld = Config.calJpanel.size();
				System.out.println("删除" + Id);
				Config.calJpanel.remove(Id);
			}
		});

	}

	private GridLayout initLayout() {
		// 每一条数据项分成一行三列
		return new GridLayout(1, 3);
	}

	public void setName(String name) {
		if (name.trim().equals("")) {
			name = "名字为空";
		}

		jLabel2.setText(name);
	}

}