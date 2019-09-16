package ctgu.awt.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JPanel;

import ctgu.awt.entity.Config;
import ctgu.awt.entity.PageBean;
import ctgu.awt.frame.homepage.item.Default;

/*
 * pagebean由此发出，传入MainScrollPane中
 * 
 * 面板默认的数值是 1 ，随着计算次数的变化，依次增多，不存在持久化特性
 * 
 * 
 * 
 */
public class PageService {
	/*
	 * 1.获取页面传递的当前页码pagecode
	 * 
	 * 2.给定pagesize的值
	 * 
	 * 3.使用pagecode和pagesize调用service方法得到pagebean
	 * 
	 * 4.传递给窗体
	 * 
	 * 
	 * 1.得到pagecode
	 * 
	 * 参数不存在，pagecode=1
	 * 
	 * 存在，转化为int
	 */

	// 获取当前页值
	public static PageBean getPageBean(int n) {// 从 0 开始
		// 取出所有的items
		TreeMap<Integer, JPanel> calJpanels = Config.calJpanel;
		// 所有的窗口数量
		int size = calJpanels.size();
		System.out.println("PageService(总数量):" + size);
		// 取当页PageBean
		PageBean pageBean = new PageBean();
		// 所有的窗口数量
		pageBean.setTotalRecord(size);
		// 当前页数
		pageBean.setPageCode(n);
		// 每页记录数
		pageBean.setPageSize(8);

		int i = 1, start = n * 8 + 1, end = (n + 1) * 8 < size ? (n + 1) * 8 : size;
		List<Default> list = new ArrayList();

		// 取出适合的列表
		for (Entry<Integer, JPanel> entry : calJpanels.entrySet()) {

			if (i >= start && i <= end) {
				list.add((Default) entry.getValue());
			} else if (i > end) {
				break;

			}
			i++;
		}
		pageBean.setBeanList(list);
		return pageBean;
	}
}
