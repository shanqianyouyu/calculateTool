package ctgu.awt.main.calFrame;

import javax.swing.JFrame;

/*
 * 所有的计算窗体均继承于此
 */
public class FatherFrame extends JFrame {

	private Integer Id;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}
	
}
