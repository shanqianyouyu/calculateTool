package ctgu.awt.frame.homepage.component;

import javax.swing.JScrollPane;

public class MainScrollPane extends JScrollPane {

	public MainScrollPane() {
		System.out.println("MainScrollPane : 第一次加载");
	}

	public MainScrollPane(int numPage) {
		try {
			this.setViewportView(Items.getItems(numPage));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
