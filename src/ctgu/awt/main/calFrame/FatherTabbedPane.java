package ctgu.awt.main.calFrame;

import javax.swing.JTabbedPane;

import ctgu.awt.main.component.MainScrollPane;


/*
 *  默认的为一页
 *  
 *  第一次生成的界面
 */
public class FatherTabbedPane extends JTabbedPane {

	public FatherTabbedPane() {
		MainScrollPane mainScrollPane = new MainScrollPane();
		// 添加选项卡
		add("1", mainScrollPane);
		// 生成滚动窗口，存放每次的计算结果
		setComponentAt(0, mainScrollPane);

	}

	/*
	 * 更改的是MianScrollPane内容
	 */
	public boolean update(int numPage) {
		try {
			MainScrollPane mainScrollPane = new MainScrollPane(numPage);
			/*
			 * 更改某一页的组件内容
			 * 
			 * @param int 要修改的页数
			 * 
			 * @param Compoent 要修改为的组件
			 */
			setComponentAt(numPage, mainScrollPane);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
