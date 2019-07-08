package ctgu.awt.frame.homepage.calFrame.derrickCal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class square {
	private JFrame jfSquare;
	private static String Name = "请输入名字!";

	// 没输入名字
	public square() {
		this(Name);
//		String name = "请输入名字!";
	}

	public square(String name2) {
		initSquare(name2);
		jfSquare.setVisible(true);
		
	}
	
	private void initSquare(String name){
		jfSquare = new JFrame(name);
		jfSquare.setSize(900, 550);// 窗体默认大小
		jfSquare.setMinimumSize(new Dimension(280, 100));
		jfSquare.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// 关闭等功能
		jfSquare.dispose();
		jfSquare.setLocationRelativeTo(null);// 居中
		   
		// 设置布局
		GridBagLayout layout = new GridBagLayout();
		jfSquare.setLayout(layout);
		
		//加载布局管理器
	    GridBagConstraints squareall = new GridBagConstraints();
	    squareall.fill = GridBagConstraints.BOTH;
		
		JPanel SquareMain = new JPanel();
		JPanel SquareBtn = new JPanel();

		//添加面板
		jfSquare.add(SquareMain);
		jfSquare.add(SquareBtn);

		//设置组件随窗口属性
		squareall.gridwidth = 0;
		squareall.weightx = 1;
		squareall.weighty = 1;
		layout.setConstraints(SquareMain,squareall);

		squareall.gridwidth = 0;
		squareall.weightx = 1;
		squareall.weighty = 1;
		layout.setConstraints(SquareBtn, squareall);
//
		// 上部主体布局
		initSquareMain(SquareMain);
		// 下部按钮布局
		initSquareBtn(SquareBtn);
	}

	private void initSquareBtn(JPanel squareBtn) {
		squareBtn.setLayout(new GridLayout(1, 3, 240, 130));
		squareBtn.setBorder(new EmptyBorder(20, 40, 20, 40));
		JButton square_btn1 = new JButton("计算");
		square_btn1.setSize(50, 50);
		JButton square_btn2 = new JButton("保存");
		JButton square_btn3 = new JButton("打印");

		squareBtn.add(square_btn1);
		squareBtn.add(square_btn2);
		squareBtn.add(square_btn3);		
	}

	private void initSquareMain(JPanel SquareMain) {

         // 设置布局
		GridBagLayout layout = new GridBagLayout();
		SquareMain.setLayout(layout);
		GridBagConstraints square_all1 = new GridBagConstraints();
		square_all1.fill = GridBagConstraints.BOTH;

		JPanel left = new JPanel();
		JPanel middle = new JPanel();
		JPanel right = new JPanel();

		SquareMain.add(left);
		SquareMain.add(middle);
		SquareMain.add(right);

		square_all1.gridwidth = 1;
		square_all1.weightx = 1;
		square_all1.weighty = 1;
		layout.setConstraints(left, square_all1);

		square_all1.gridwidth = 2;
		square_all1.weightx = 1;	
		square_all1.weighty = 1;
		square_all1.insets = new Insets(0, 10, 0, 0);
		layout.setConstraints(middle, square_all1);
//
		square_all1.gridwidth = 3;
		square_all1.weightx = 1;
		square_all1.weighty = 1;
		square_all1.insets = new Insets(0, 10, 0, 10);
		layout.setConstraints(right, square_all1);
		
		left.setBackground(Color.RED);
		middle.setBackground(Color.YELLOW);
		right.setBackground(Color.blue);

		initSquareLeft(left);
		initSquareMedium(middle);
		initSquareRight(right);
		
	}

	private void initSquareRight(JPanel right) {
		// TODO Auto-generated method stub
		
	}

	private void initSquareMedium(JPanel middle) {
		// TODO Auto-generated method stub
		
	}

	private void initSquareLeft(JPanel left) {
		
		
	}
}
