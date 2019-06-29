package qmx.awt.service;

import java.util.Hashtable;

import javax.swing.JPanel;

public class ItemService {

	// 构造器私有化
	private ItemService() {
	}

	private static Hashtable<String, JPanel> calTable = new Hashtable<String, JPanel>();

	public static Hashtable<String, JPanel> getItemService() {
		return calTable;
	}

}
